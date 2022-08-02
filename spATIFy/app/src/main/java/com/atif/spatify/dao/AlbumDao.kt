package com.atif.spatify.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.atif.spatify.data.Album

@Dao
interface AlbumDao {
    @Query("SELECT * FROM album ORDER BY album_name ASC")
    fun getAlphabetizedAlbums(): LiveData<List<Album>>

    @Query("SELECT * FROM album WHERE id= :id")
    abstract fun getAlbum(id: String) : Album

}