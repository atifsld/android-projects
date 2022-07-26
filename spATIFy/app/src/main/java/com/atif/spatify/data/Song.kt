package com.atif.spatify.data
import com.google.gson.annotations.SerializedName

data class Song (
    @SerializedName("song_uuid") val songUuid: String,
    @SerializedName("song_name") val songName: String,
    @SerializedName("song_duration") val songDuration: Int,
    @SerializedName("song_track_number") val songTrackNumber: Int,
    @SerializedName("song_artists") val songArtists: List<String>,
    @SerializedName("song_album_art_url") val songAlbumArtUrl: String
) {
    override fun toString(): String {
        return "Song UUID, $songUuid" + "\n" +
                "Song name: $songName" + "\n" +
                "Song duration: $songDuration" + "\n" +
                "Song track number: $songTrackNumber" + "\n" +
                "Song album art URL: $songAlbumArtUrl" + "\n" +
                "Song artists: $songArtists"
    }
}