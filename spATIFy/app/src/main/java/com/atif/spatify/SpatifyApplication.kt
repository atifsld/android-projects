package com.atif.spatify

import android.app.Application
import com.atif.spatify.repository.AlbumCreditRepository
import com.atif.spatify.repository.AlbumRepository
import com.atif.spatify.repository.SongRepository

class SpatifyApplication : Application() {
    val spatifyDatabase by lazy { SpatifyRoomDatabase.getDatabase(this) }
    val albumRepository by lazy { AlbumRepository(spatifyDatabase.albumDao()) }
    val songRepository by lazy { SongRepository(spatifyDatabase.songDao()) }
    val albumCreditRepository by lazy { AlbumCreditRepository(spatifyDatabase.albumCreditDao()) }
}