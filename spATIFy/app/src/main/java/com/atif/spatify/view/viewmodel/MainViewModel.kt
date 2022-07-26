package com.atif.spatify.view.viewmodel

import androidx.lifecycle.ViewModel
import com.atif.spatify.data.Album
import com.atif.spatify.data.Song
import com.atif.spatify.service.SpatifyService

class MainViewModel(val spatifyService: SpatifyService): ViewModel() {
    fun getAlbums(): List<Album> {
        return spatifyService.getAlbums()
    }

    fun getSongs(): List<Song> {
        return spatifyService.getSongs()
    }
}