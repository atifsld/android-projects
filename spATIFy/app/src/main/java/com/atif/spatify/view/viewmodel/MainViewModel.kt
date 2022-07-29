package com.atif.spatify.view.viewmodel

//import androidx.lifecycle.LiveData
//import androidx.lifecycle.MutableLiveData
//import androidx.lifecycle.ViewModel
//import com.atif.spatify.data.Album
//import com.atif.spatify.data.Song
//import com.atif.spatify.service.SpatifyService

//class MainViewModel(private val repository: AlbumRepository): ViewModel() {
//    private val _albums = MutableLiveData<List<Album>>()
//    val albums: LiveData<List<Album>>
//        get() = _albums
//
//
//    suspend fun getAlbums() {
//        val albums = repository.getAlbums()
//        _albums.value = albums
//    }
//
//    fun getSongs(): List<Song> {
//        return spatifyService.getSongs()
//    }
//}