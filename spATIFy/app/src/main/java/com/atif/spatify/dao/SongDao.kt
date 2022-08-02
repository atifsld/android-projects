package com.atif.spatify.dao

import com.atif.spatify.data.Song
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.atif.spatify.data.Album

@Dao
interface SongDao {
    @Query("SELECT * FROM song ORDER BY song_name ASC")
    fun getAlphabetizedSongs(): LiveData<List<Song>>

    @Query("SELECT * FROM song WHERE song_album_id= :id")
    abstract fun getSong(id: String) : Song

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(song: Song)

    @Query("SELECT * FROM song WHERE song_album_id= :id")
    abstract fun getSongsFromAlbum(id: String) : LiveData<List<Song>>
}