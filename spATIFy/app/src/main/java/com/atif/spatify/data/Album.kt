package com.atif.spatify.data

import com.google.gson.annotations.SerializedName

data class Album (
    @SerializedName("album_uuid") val albumUuid: String,
    @SerializedName("album_name") val albumName: String,
    @SerializedName("album_art_url") val albumArtUrl: String,
    @SerializedName("album_artists") val albumArtists: List<String>,
    @SerializedName("album_credits") val albumCredits: List<AlbumCredit>,
    @SerializedName("album_songs") val albumSongs: List<Song>,
    @SerializedName("album_label") val albumLabel: String,
    @SerializedName("album_tags") val albumTags: List<String>,
    @SerializedName("album_year") val albumYear: Int
) {
    override fun toString(): String {
        return "Album UUID: $albumUuid" + "\n" +
                "Album name: $albumName" + "\n" +
                "Album art URL: $albumArtUrl" + "\n" +
                "Album artist: $albumArtists" + "\n" +
                "Album credits: $albumCredits" + "\n" +
                "Album songs: $albumSongs" + "\n" +
                "Album label: $albumLabel" + "\n" +
                "Album tags: $albumTags" + "\n" +
                "Album year: $albumYear"
    }
}