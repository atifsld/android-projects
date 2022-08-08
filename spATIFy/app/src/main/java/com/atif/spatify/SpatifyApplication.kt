package com.atif.spatify

import android.app.Application
import com.atif.spatify.repository.AlbumCreditRepository
import com.atif.spatify.repository.AlbumRepository
import com.atif.spatify.repository.SongRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class SpatifyApplication : Application() {


    var dataPopulated = false

        get() = field
        set(value) {
            field = value
        }

    val applicationScope = CoroutineScope(SupervisorJob())


    val spatifyDatabase by lazy { SpatifyRoomDatabase.getDatabase(this) }
    val albumRepository by lazy { AlbumRepository(spatifyDatabase.albumDao()) }
    val songRepository by lazy { SongRepository(spatifyDatabase.songDao()) }
    val albumCreditRepository by lazy { AlbumCreditRepository(spatifyDatabase.albumCreditDao()) }
}