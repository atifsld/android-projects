package com.atif.spatify.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.atif.spatify.entity.AlbumCredit

@Dao
interface AlbumCreditDao {

    @Query("SELECT * FROM albumcredit WHERE id= :id")
    abstract fun getCredit(id: String) : AlbumCredit

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(albumCredit: AlbumCredit)

    @Query("SELECT * FROM albumcredit WHERE credit_album_id= :id")
    abstract fun getCreditsForAlbum(id: String) : LiveData<List<AlbumCredit>>
}