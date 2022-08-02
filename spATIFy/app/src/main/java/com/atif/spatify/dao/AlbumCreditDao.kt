package com.atif.spatify.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.atif.spatify.data.Song

@Dao
interface AlbumCreditDao {
    @Query("SELECT * FROM albumcredit ORDER BY credit_name ASC")
    fun getAlphabetizedCredits(): LiveData<List<Song>>

    @Query("SELECT * FROM albumcredit WHERE id= :id")
    abstract fun getCredit(id: String) : Song

    @Query("SELECT * FROM albumcredit WHERE credit_album_id= :id")
    abstract fun getCreditsForAlbum(id: String) : Song
}