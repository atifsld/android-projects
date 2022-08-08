package com.atif.spatify.dao

import com.atif.spatify.entity.Song
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface SongDao {
    @Query("SELECT * FROM song ORDER BY song_name ASC")
    fun getAlphabetizedSongs(): LiveData<List<Song>>

    @Query("SELECT * FROM song WHERE id= :id")
    fun getSong(id: String) : Song

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(song: Song)

    @Query("SELECT * FROM song WHERE song_album_id= :id")
    fun getSongsFromAlbum(id: String) : LiveData<List<Song>>

    @Query("SELECT * FROM song WHERE song_is_favorite=1 ORDER BY song_name ASC")
    fun getFavoriteAlphabetizedSongs(): LiveData<List<Song>>

    @Query ("UPDATE song SET song_is_favorite=1 WHERE id= :id")
    fun addSongToFavorites(id: String)

    @Query("UPDATE song SET song_is_favorite=0 WHERE id= :id")
    fun removeSongFromFavorites(id: String)
}