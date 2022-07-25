package com.atif.spatify
import com.google.gson.annotations.SerializedName

data class Song (
    @SerializedName("song_uuid") val songUuid: String,
    @SerializedName("song_name") val songName: String,
    @SerializedName("song_duration") val songDuration: Int,
    @SerializedName("song_track_number") val songTrackNumber: Int,
    @SerializedName("song_artists") val songArtists: List<String>
) {
    override fun toString(): String {
        return "Song UUID, $songUuid" + "\n" +
                "Song name: $songName" + "\n" +
                "Song duration: $songDuration" + "\n" +
                "Song track number: $songTrackNumber" + "\n" +
                "Song artists: $songArtists"
    }
}