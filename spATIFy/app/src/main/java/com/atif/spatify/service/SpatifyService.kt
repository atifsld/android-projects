package com.atif.spatify.service

import androidx.fragment.app.viewModels
import com.atif.spatify.SpatifyApplication
import com.atif.spatify.data.Album
import com.atif.spatify.data.AlbumCredit
import com.atif.spatify.data.Song
import com.atif.spatify.view.viewmodel.SpatifyViewModel
import com.atif.spatify.view.viewmodel.SpatifyViewModelFactory

object SpatifyService {
    private val albums = mutableMapOf<String, Album>()

    fun addSongs(spatifyViewModel: SpatifyViewModel) {
        val generatedSongs: List<Song> = SpatifyDataGenerator.getSongs()
        generatedSongs.forEach {
            spatifyViewModel.insertSong(it)
        }
    }

    fun addAlbumCredits(spatifyViewModel: SpatifyViewModel) {
        val generatedAlbumCredits: List<AlbumCredit> = SpatifyDataGenerator.getAlbumCredits()
        generatedAlbumCredits.forEach {
            spatifyViewModel.insertAlbumCredit(it)
        }
    }

    fun addAlbums(spatifyViewModel: SpatifyViewModel) {
        val generatedAlbums: List<Album> = SpatifyDataGenerator.getAlbums()
        generatedAlbums.forEach {
            spatifyViewModel.insertAlbum(it)
        }
    }
}
