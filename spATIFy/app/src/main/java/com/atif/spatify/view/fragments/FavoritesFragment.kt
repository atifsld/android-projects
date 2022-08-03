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

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FavortiesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FavoritesFragment : Fragment() {
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
        val view = inflater.inflate(R.layout.fragment_favorties, container, false)
        val songRecyclerView = view!!.findViewById<RecyclerView>(R.id.recycler_view_songs)
        songRecyclerView.layoutManager = LinearLayoutManager(activity)
        val adapter = SongViewAdapter(context, spatifyViewModel)
        songRecyclerView.adapter = adapter
        spatifyViewModel.getFavoriteAlphabetizedSongs().observe(viewLifecycleOwner) { songs ->
            songs?.let {
                adapter.updateList(it)
            }
        }
        return view
    }
}