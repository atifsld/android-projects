package com.atif.spatify.view.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.room.Query
import com.atif.spatify.data.Album
import com.atif.spatify.data.AlbumCredit
import com.atif.spatify.data.Song
import com.atif.spatify.repository.AlbumCreditRepository
import com.atif.spatify.repository.AlbumRepository
import com.atif.spatify.repository.SongRepository
import kotlinx.coroutines.launch

class SpatifyViewModel(
    private val albumRepository: AlbumRepository,
    private val songRepository: SongRepository,
    private val albumCreditRepository: AlbumCreditRepository
) : ViewModel() {
    val allAlbums: LiveData<List<Album>> = albumRepository.allAlbums

    val allSongs: LiveData<List<Song>> = songRepository.allSongs


    fun insertAlbum(album: Album) = viewModelScope.launch {
        albumRepository.insert(album)
    }

    fun insertSong(song: Song) = viewModelScope.launch {
        songRepository.insert(song)
    }

    fun insertAlbumCredit(albumCredit: AlbumCredit) = viewModelScope.launch{
        albumCreditRepository.insert(albumCredit)
    }

    fun getSong(id: String): Song {
        return songRepository.getSong(id)
    }

    fun getFavoriteAlphabetizedSongs(): LiveData<List<Song>> {
        return songRepository.getFavoriteAlphabetizedSongs()
    }

    fun getSongsFromAlbum(id: String): LiveData<List<Song>>{
        return songRepository.getSongsFromAlbum(id)
    }

    fun getCreditsForAlbum(id: String): LiveData<List<AlbumCredit>> {
        return albumCreditRepository.getCreditsForAlbum(id)
    }

    fun getAlbum(id: String): Album {
        return albumRepository.getAlbum(id)
    }


    fun addSongToFavorites(id: String) {
        songRepository.addSongToFavorites(id)
    }

    fun removeSongFromFavorites(id: String) {
        songRepository.addSongToFavorites(id)
    }
}

class SpatifyViewModelFactory(
    private val albumRepository: AlbumRepository,
    private val songRepository: SongRepository,
    private val albumCreditRepository: AlbumCreditRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SpatifyViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return SpatifyViewModel(albumRepository, songRepository, albumCreditRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}