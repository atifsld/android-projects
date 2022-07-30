package com.atif.spatify.data
import com.google.gson.annotations.SerializedName

data class Song (
    @SerializedName("song_uuid") val songUuid: String,
    @SerializedName("song_name") val songName: String,
    @SerializedName("song_duration") val songDuration: String,
    @SerializedName("song_track_number") val songTrackNumber: Int,
    @SerializedName("song_artists") val songArtists: List<String>,
    @SerializedName("song_album_art_url") val songAlbumArtUrl: String,
    @SerializedName("song_spotify_url") val songSpotifyUrl: String?
) {
    override fun toString(): String {
        return "Song UUID, $songUuid" + "\n" +
                "Song name: $songName" + "\n" +
                "Song duration: $songDuration" + "\n" +
                "Song track number: $songTrackNumber" + "\n" +
                "Song album art URL: $songAlbumArtUrl" + "\n" +
                "Song artists: $songArtists"
    }

    fun getCommaSeparatedArtists(): String {
        return songArtists.joinToString ( separator = ", " )
    }

    fun createShareString(): String {
        return if (songArtists.size == 1) "Check out $songName by ${songArtists[0]} on Spatify."
        else "Check out $songName by ${songArtists[0]} and others on Spatify."
    }

}