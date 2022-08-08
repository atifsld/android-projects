package com.atif.spatify.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.atif.spatify.R
import com.atif.spatify.SpatifyApplication
import com.atif.spatify.databinding.FragmentFavortiesBinding
import com.atif.spatify.view.adapter.SongViewAdapter
import com.atif.spatify.view.viewmodel.SpatifyViewModel
import com.atif.spatify.view.viewmodel.SpatifyViewModelFactory


class FavoritesFragment : Fragment(R.layout.fragment_favorties) {

    private lateinit var binding:FragmentFavortiesBinding

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
        return inflater.inflate(R.layout.fragment_favorties, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentFavortiesBinding.bind(view)
        val songRecyclerView = binding.recyclerViewSongs
        songRecyclerView.layoutManager = LinearLayoutManager(activity)
        val adapter = SongViewAdapter(context, spatifyViewModel)
        songRecyclerView.adapter = adapter
        spatifyViewModel.getFavoriteAlphabetizedSongs().observe(viewLifecycleOwner) { songs ->
            songs?.let {
                adapter.updateList(it)
            }
        }
    }
}