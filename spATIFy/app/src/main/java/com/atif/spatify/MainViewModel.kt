package com.atif.spatify

import androidx.lifecycle.ViewModel

class MainViewModel(val spatifyService: SpatifyService): ViewModel() {
    fun getAlbums(): List<Album> {
        return spatifyService.getAlbums()
    }

    fun getSongs(): List<Song> {
        return spatifyService.getSongs()
    }
}