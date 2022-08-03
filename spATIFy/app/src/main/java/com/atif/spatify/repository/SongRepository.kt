package com.atif.spatify.repository

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import androidx.room.Query
import com.atif.spatify.dao.SongDao
import com.atif.spatify.data.AlbumCredit
import com.atif.spatify.data.Song

class SongRepository (private val songDao: SongDao){

    val allSongs: LiveData<List<Song>> = songDao.getAlphabetizedSongs() as LiveData<List<Song>>

    fun getSong(id: String): Song {
        return songDao.getSong(id)
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(song: Song) {
        songDao.insert(song)
    }

    fun getSongsFromAlbum(id: String): LiveData<List<Song>> {
        return songDao.getSongsFromAlbum(id)
    }

    fun addSongToFavorites(id: String) {
        songDao.addSongToFavorites(id)
    }

    fun getFavoriteAlphabetizedSongs(): LiveData<List<Song>> {
        return songDao.getFavoriteAlphabetizedSongs()
    }
    fun removeSongFromFavorites(id: String) {
        songDao.removeSongFromFavorites(id)
    }
}