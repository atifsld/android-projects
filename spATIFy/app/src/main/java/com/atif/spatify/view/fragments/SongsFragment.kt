package com.atif.spatify.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.atif.spatify.R
import com.atif.spatify.SpatifyApplication
import com.atif.spatify.view.adapter.SongViewAdapter
import com.atif.spatify.view.viewmodel.SpatifyViewModel
import com.atif.spatify.view.viewmodel.SpatifyViewModelFactory

class SongsFragment : Fragment() {

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
    ): View {
        val view = inflater.inflate(R.layout.fragment_songs, container, false)
        val songRecyclerView = view!!.findViewById<RecyclerView>(R.id.recycler_view_songs)
        songRecyclerView.layoutManager = LinearLayoutManager(activity)
        val adapter = SongViewAdapter(context, spatifyViewModel)
        songRecyclerView.adapter = adapter
        spatifyViewModel.allSongs.observe(viewLifecycleOwner) { songs ->
            songs?.let {
                adapter.updateList(it)
            }
        }

        return view
    }
}