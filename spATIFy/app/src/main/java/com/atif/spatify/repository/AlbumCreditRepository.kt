package com.atif.spatify.repository

import androidx.lifecycle.LiveData
import com.atif.spatify.dao.AlbumCreditDao
import com.atif.spatify.data.AlbumCredit

class AlbumCreditRepository (private val albumCreditDao: AlbumCreditDao){

    fun getCredit(id: String): AlbumCredit {
        return albumCreditDao.getCredit(id)
    }

    fun getCreditsForAlbum(id: String): LiveData<List<AlbumCredit>> {
        return albumCreditDao.getCreditsForAlbum(id)
    }
}