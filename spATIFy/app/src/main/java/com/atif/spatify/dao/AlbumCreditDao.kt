package com.atif.spatify.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.atif.spatify.data.AlbumCredit
import com.atif.spatify.data.Song

@Dao
interface AlbumCreditDao {

    @Query("SELECT * FROM albumcredit WHERE id= :id")
    abstract fun getCredit(id: String) : AlbumCredit

    @Query("SELECT * FROM albumcredit WHERE credit_album_id= :id")
    abstract fun getCreditsForAlbum(id: String) : LiveData<List<AlbumCredit>>
}