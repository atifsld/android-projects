package com.atif.spatify

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.atif.spatify.dao.AlbumCreditDao
import com.atif.spatify.dao.AlbumDao
import com.atif.spatify.dao.SongDao
import com.atif.spatify.data.Album
import com.atif.spatify.data.AlbumCredit
import com.atif.spatify.data.Song
import kotlinx.coroutines.CoroutineScope

@Database(
    entities = [Album::class, Song::class, AlbumCredit::class],
    version = 1,
    exportSchema = false
)
abstract class SpatifyRoomDatabase : RoomDatabase() {
    abstract fun albumDao(): AlbumDao
    abstract fun songDao(): SongDao
    abstract fun albumCreditDao(): AlbumCreditDao

    companion object {

        @Volatile
        private var INSTANCE: SpatifyRoomDatabase? = null

        fun getAlbumDatabase(
            context: Context,
            scope: CoroutineScope
        ): SpatifyRoomDatabase {
            return INSTANCE ?: synchronized(this) {

                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    SpatifyRoomDatabase::class.java,
                    "spatify_database"
                ).allowMainThreadQueries()
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}