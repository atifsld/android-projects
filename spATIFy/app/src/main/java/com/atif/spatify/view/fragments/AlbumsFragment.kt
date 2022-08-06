package com.atif.spatify.view.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.atif.spatify.R
import com.atif.spatify.SpatifyApplication
import com.atif.spatify.service.SpatifyService
import com.atif.spatify.view.adapter.AlbumViewAdapter
import com.atif.spatify.view.viewmodel.SpatifyViewModel
import com.atif.spatify.view.viewmodel.SpatifyViewModelFactory
import androidx.fragment.app.viewModels

/**
 * A simple [Fragment] subclass.
 * Use the [AlbumsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AlbumsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private val spatifyViewModel: SpatifyViewModel by viewModels {
        SpatifyViewModelFactory(
            (context?.applicationContext as SpatifyApplication).albumRepository,
            (context?.applicationContext as SpatifyApplication).songRepository,
            (context?.applicationContext as SpatifyApplication).albumCreditRepository
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_albums, container, false)

        val albumRecyclerView = view.findViewById<RecyclerView>(R.id.recycler_view_albums)

        albumRecyclerView.layoutManager = GridLayoutManager(activity, 2)

        val adapter = AlbumViewAdapter(context)

        albumRecyclerView.adapter = adapter

        spatifyViewModel.allAlbums.observe(viewLifecycleOwner) { albums ->
            albums?.let {
                adapter.updateList(it)
            }
        }

        if((context?.applicationContext as SpatifyApplication).dataPopulated == false) {
            Log.i("Tag", "Data not populated, calling SpatifyService.")
            SpatifyService.addAlbums(spatifyViewModel)
            SpatifyService.addSongs(spatifyViewModel)
            SpatifyService.addAlbumCredits(spatifyViewModel)
            (context?.applicationContext as SpatifyApplication).dataPopulated = true

        }


        return view
    }
}