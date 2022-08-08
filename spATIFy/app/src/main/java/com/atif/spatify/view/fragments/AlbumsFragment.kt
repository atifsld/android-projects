package com.atif.spatify.view.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.datastore.DataStore
import androidx.datastore.preferences.Preferences
import androidx.datastore.preferences.createDataStore
import androidx.datastore.preferences.edit
import androidx.datastore.preferences.preferencesKey
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.atif.spatify.R
import com.atif.spatify.SpatifyApplication
import com.atif.spatify.service.SpatifyService
import com.atif.spatify.view.adapter.AlbumViewAdapter
import com.atif.spatify.view.viewmodel.SpatifyViewModel
import com.atif.spatify.view.viewmodel.SpatifyViewModelFactory
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

class AlbumsFragment : Fragment() {
    private lateinit var datastore: DataStore<Preferences>

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

        datastore = requireContext().createDataStore(name = "settings")

        lifecycleScope.launch {
            if (readFromDataStore("isPopulated") == "true") {
                Log.i("TAG", "isDataPopulated: true")
            } else {
                Log.i("TAG", "isDataPopulated: not true")
                SpatifyService.addAlbums(spatifyViewModel)
                SpatifyService.addSongs(spatifyViewModel)
                SpatifyService.addAlbumCredits(spatifyViewModel)
                saveToDataStore("isPopulated", "true")
            }
        }
        return view
    }

    private suspend fun saveToDataStore(key:String, value: String) {
        val dataStoreKey = preferencesKey<String>(key)
        datastore.edit { settings ->
            settings[dataStoreKey] = value
        }
    }

    private suspend fun readFromDataStore(key:String): String? {
        val dataStoreKey = preferencesKey<String>(key)
        val preferences = datastore.data.first()
        return preferences[dataStoreKey]
    }
}