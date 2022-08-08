package com.atif.spatify.service

import com.atif.spatify.entity.Album
import com.atif.spatify.entity.AlbumCredit
import com.atif.spatify.entity.Song
import com.atif.spatify.view.viewmodel.SpatifyViewModel

object SpatifyService {

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
