package com.atif.spatify

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import com.atif.spatify.dao.AlbumDao
import com.atif.spatify.entity.Album
import com.google.common.truth.Truth.assertThat
import junit.framework.TestCase
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Before
import org.junit.Test

class SpatifyRoomDatabaseTest: TestCase() {
    private lateinit var db: SpatifyRoomDatabase
    private lateinit var dao: AlbumDao

    @Before
    public override fun setUp() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(context, SpatifyRoomDatabase::class.java).build()
        dao = db.albumDao()
    }

    @After
    fun closeDb() {
        db.close()
    }

    @Test
    fun writeAndReadTest() = runBlocking{
        val album = Album(
            id = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
            albumArtists = "The Velvet Underground",
            albumDescription = "White Light/White Heat contains a distorted, feedback-driven, and roughly recorded sound, which is regarded as influential; it foreshadowed the start of punk rock and the no wave genre. The Social Distortion album White Light, White Heat, White Trash would be named after White Light/White Heat.",
            albumArtUrl = "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
            albumSpotifyUrl = "https://open.spotify.com/album/0HHmJpwOXXRJu9HI9iQiEO?si=Z8BDHkGyRdWEN3LHyyz_ZQ",
            albumGeniusUrl = "https://genius.com/albums/The-velvet-underground/White-light-white-heat",
            albumWikipediaUrl = "https://en.wikipedia.org/wiki/White_Light/White_Heat",
            albumLabel = "Verve Records",
            albumName = "White Light/White Heat",
            albumTags = "Avantgarde, Experimental, Noise, Art Rock",
            albumYear = 1968
        )
        dao.insert(album)
        val albums = dao.getAlphabetizedAlbums().value
        assertThat(albums!!.contains(album)).isTrue()
    }
}