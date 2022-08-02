package com.atif.spatify.repository

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.atif.spatify.dao.AlbumCreditDao
import com.atif.spatify.data.Album
import com.atif.spatify.data.AlbumCredit

class AlbumCreditRepository (private val albumCreditDao: AlbumCreditDao){

    fun getCredit(id: String): AlbumCredit {
        return albumCreditDao.getCredit(id)
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(albumCredit: AlbumCredit) {
        albumCreditDao.insert(albumCredit)
    }

    fun getCreditsForAlbum(id: String): LiveData<List<AlbumCredit>> {
        return albumCreditDao.getCreditsForAlbum(id)
    }
}