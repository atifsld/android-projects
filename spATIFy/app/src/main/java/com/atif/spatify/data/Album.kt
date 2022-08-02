package com.atif.spatify.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName="album")
data class Album(
    @PrimaryKey val id: String,
    @ColumnInfo(name = "album_name") val albumName: String,
    @ColumnInfo(name = "album_description") val albumDescription: String,
    @ColumnInfo(name = "album_art_url") val albumArtUrl: String,
    @ColumnInfo(name = "album_spotify_url") val albumSpotifyUrl: String?,
    @ColumnInfo(name = "album_wikipedia_url") val albumWikipediaUrl: String?,
    @ColumnInfo(name = "album_genius_url") val albumGeniusUrl: String?,
    @ColumnInfo(name = "album_artists") val albumArtists: String,
    @ColumnInfo(name = "album_credits") val albumCredits: List<AlbumCredit>,
    @ColumnInfo(name = "album_songs") val albumSongs: List<Song>,
    @ColumnInfo(name = "album_label") val albumLabel: String,
    @ColumnInfo(name = "album_tags") val albumTags: String,
    @ColumnInfo(name = "album_year") val albumYear: Int
) {
    override fun toString(): String {
        return "Album UUID: $id" + "\n" +
                "Album name: $albumName" + "\n" +
                "Album description: $albumDescription" + "\n" +
                "Album art URL: $albumArtUrl" + "\n" +
                "Album Spotify URL: $albumSpotifyUrl" + "\n" +
                "Album Genius URL: $albumGeniusUrl" + "\n" +
                "Album Wikipedia URL: $albumWikipediaUrl" + "\n" +
                "Album artist: $albumArtists" + "\n" +
                "Album credits: $albumCredits" + "\n" +
                "Album songs: $albumSongs" + "\n" +
                "Album label: $albumLabel" + "\n" +
                "Album tags: $albumTags" + "\n" +
                "Album year: $albumYear"
    }

    fun createShareString(): String {
        return "Check out $albumName by $albumArtists on Spatify. Link: https://www.spatify.com/$id"
    }
}