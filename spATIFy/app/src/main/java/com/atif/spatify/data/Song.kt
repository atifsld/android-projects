package com.atif.spatify.data
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "song")
data class Song (
    @PrimaryKey val id: String,
    @ColumnInfo(name = "song_name") val songName: String,
    @ColumnInfo(name = "song_duration") val songDuration: String,
    @ColumnInfo(name = "song_track_number") val songTrackNumber: Int,
    @ColumnInfo(name = "song_artists") val songArtists: String,
    @ColumnInfo(name = "song_album_id") val songAlbumId: String,
    @ColumnInfo(name = "song_album_art_url") val songAlbumArtUrl: String,
    @ColumnInfo(name = "song_spotify_url") val songSpotifyUrl: String?
) {
    override fun toString(): String {
        return "Song UUID, $id" + "\n" +
                "Song name: $songName" + "\n" +
                "Song duration: $songDuration" + "\n" +
                "Song album ID: $songAlbumId" + "\n" +
                "Song track number: $songTrackNumber" + "\n" +
                "Song album art URL: $songAlbumArtUrl" + "\n" +
                "Song artists: $songArtists"
    }

    fun createShareString(): String {
        return "Check out $songName by $songArtists on Spatify."
    }

}