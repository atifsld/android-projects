package com.atif.spatify.repository

import androidx.lifecycle.LiveData
import com.atif.spatify.dao.SongDao
import com.atif.spatify.data.Song

class SongRepository (private val songDao: SongDao){

    val allSongs: LiveData<List<Song>> = songDao.getAlphabetizedSongs() as LiveData<List<Song>>

    fun getSong(id: String): Song {
        return songDao.getSong(id)
    }

    fun getSongsFromAlbum(id: String): LiveData<List<Song>> {
        return songDao.getSongsFromAlbum(id)
    }
}