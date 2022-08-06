package com.atif.spatify.service

import com.atif.spatify.entity.Album
import com.atif.spatify.entity.AlbumCredit
import com.atif.spatify.entity.Song
import com.google.common.truth.Truth.assertThat
import org.junit.Test

internal class SpatifyDataGeneratorTest {

    @Test
    fun getAlbumCredits() {
        val albumCredits = SpatifyDataGenerator.getAlbumCredits()
        assertThat(albumCredits.isNotEmpty()).isTrue()
        assertThat(albumCredits[0] is AlbumCredit).isTrue()
    }

    @Test
    fun getAlbums() {
        val albums = SpatifyDataGenerator.getAlbums()
        assertThat(albums.isNotEmpty()).isTrue()
        assertThat(albums[0] is Album).isTrue()
    }

    @Test
    fun getSongs() {
        val songs = SpatifyDataGenerator.getSongs()
        assertThat(songs.isNotEmpty()).isTrue()
        assertThat(songs[0] is Song).isTrue()
    }
}