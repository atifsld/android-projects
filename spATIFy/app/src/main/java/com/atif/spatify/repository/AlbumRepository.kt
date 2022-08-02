package com.atif.spatify.repository

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.atif.spatify.dao.AlbumDao
import com.atif.spatify.data.Album

class AlbumRepository(private val albumDao: AlbumDao) {

    val allAlbums: LiveData<List<Album>> = albumDao.getAlphabetizedAlbums() as LiveData<List<Album>>

    fun getAlbum(id: String): Album {
        return albumDao.getAlbum(id)
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(album: Album) {
        albumDao.insert(album)
    }
}