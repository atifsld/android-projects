package com.atif.spatify.service

import com.atif.spatify.data.Album
import com.atif.spatify.data.AlbumCredit
import com.atif.spatify.data.Song

object SpatifyService {
    private val albums = mutableMapOf<String, Album>()

    fun getAlbums(): List<Album> {
        val albumList: MutableList<Album> = mutableListOf()
        if (albums.isEmpty()) {
            populateAlbums()
        }
        for (album in albums) {
            albumList.add(album.value)
        }
        return albumList.sortedWith(compareBy { it.albumName })
    }

    fun getAlbum(albumUuid: String): Album? {
        if (albums.isEmpty()) {
            populateAlbums()
        }
        return albums[albumUuid]
    }

    fun getCreditListForAlbum(albumUuid: String): List<AlbumCredit> {
        if (albums.isEmpty()) {
            populateAlbums()
        }
        return albums[albumUuid]!!.albumCredits

    }

    fun getSongsInAlbum(albumUuid: String): List<Song> {
        if (albums.isEmpty()) {
            populateAlbums()
        }
        return albums[albumUuid]!!.albumSongs
    }

    fun getSongs(): List<Song> {
        val songList: MutableList<Song> = mutableListOf()
        if (albums.isEmpty()) {
            populateAlbums()
        }
        for (album in albums) {
            for (song in album.value.albumSongs) {
                songList.add(song)
            }
        }
        return songList.sortedWith(compareBy { it.songName })
    }

    fun getSong(songUuid: String): Song? {
        for (album in albums) {
            for (song in album.value.albumSongs) {
                if (song.id == songUuid) {
                    return song
                }
            }
        }
        return null
    }

    private fun populateAlbums() {
        albums["5583e514-cf7b-4214-8397-dfd7e10dfb33"] = Album(
            id = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
            albumArtists = "The Velvet Underground",
            albumDescription = "White Light/White Heat contains a distorted, feedback-driven, and roughly recorded sound, which is regarded as influential; it foreshadowed the start of punk rock and the no wave genre. The Social Distortion album White Light, White Heat, White Trash would be named after White Light/White Heat.",
            albumArtUrl = "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
            albumSpotifyUrl = "https://open.spotify.com/album/0HHmJpwOXXRJu9HI9iQiEO?si=Z8BDHkGyRdWEN3LHyyz_ZQ",
            albumGeniusUrl = "https://genius.com/albums/The-velvet-underground/White-light-white-heat",
            albumWikipediaUrl = "https://en.wikipedia.org/wiki/White_Light/White_Heat",
            albumCredits = listOf(
                AlbumCredit(
                    id = "",
                    creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    creditName = "Andy Warhol",
                    creditContribution = "Cover [Cover Concept]",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "",
                    creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    creditName = "Acy R. Lehman",
                    creditContribution = "Design [Cover]",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "",
                    creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    creditName = "Val Valentin",
                    creditContribution = "Engineer [Director Of]",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "",
                    creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    creditName = "Gary Kellgren",
                    creditContribution = "Engineer [Recording]",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "",
                    creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    creditName = "Maureen Tucker",
                    creditContribution = "Percussion",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "",
                    creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    creditName = "Billy Name",
                    creditContribution = "Photography By [Cover]",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "",
                    creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    creditName = "Mario Annibali",
                    creditContribution = "Photography By [Liner]",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "",
                    creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    creditName = "Tom Wilson",
                    creditContribution = "Producer",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "",
                    creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    creditName = "Sterling Morrison",
                    creditContribution = "Vocals, Guitar, Bass Guitar",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "",
                    creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    creditName = "John Cale",
                    creditContribution = "Vocals, Viola [Electric], Organ, Bass Guitar",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "",
                    creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    creditName = "Tom Wilson",
                    creditContribution = "Producer",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                )
            ),
            albumLabel = "Verve Records",
            albumName = "White Light/White Heat",
            albumSongs = listOf(
                Song(
                    id = "667df405-d8b6-484b-b084-9910fefbea5e",
                    songAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    songArtists = "The Velvet Underground",
                    songAlbumArtUrl = "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/0Evhu0dKCkIuEn88Pmb9mj?si=15d43ff31b3d4f70",
                    songDuration = "2:47",
                    songName = "White Light/White Heat",
                    songTrackNumber = 1
                ),
                Song(
                    id = "cfef36fd-9750-4a6b-a052-c0e3496b9041",
                    songAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    songArtists = "The Velvet Underground",
                    songAlbumArtUrl = "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/6xst1yRHJ2IkMQE0ebeU11?si=fd9394ec484c4077",
                    songDuration = "8:19",
                    songName = "The Gift",
                    songTrackNumber = 2
                ),
                Song(
                    id = "1b5b722d-56c0-4e3d-9136-fb7da944eec5",
                    songAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    songArtists = "The Velvet Underground",
                    songAlbumArtUrl = "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/00bScuvzFpyRMGWlgfu5sp?si=bfebbef11d71466c",
                    songDuration = "4:56",
                    songName = "Lady Godiva's Operation",
                    songTrackNumber = 3
                ),
                Song(
                    id = "089b2d86-e32d-4ebd-8ceb-1acc5c4f322f",
                    songAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    songArtists = "The Velvet Underground",
                    songAlbumArtUrl = "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/23LNLIpFwrcHAVpN3fx9cT?si=9f4015cba1cd4f0f",
                    songDuration = "2:05",
                    songName = "Here She Comes Now",
                    songTrackNumber = 4
                ),
                Song(
                    id = "ebb8356e-fd88-4e8d-a3db-180d0de547e5",
                    songAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    songArtists = "The Velvet Underground",
                    songAlbumArtUrl = "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/2Kvh9rYfJ7oczyCJZdzVPm?si=c302c35ba25d4385",
                    songDuration = "4:38",
                    songName = "I Heard Her Call My Name",
                    songTrackNumber = 5
                ),
                Song(
                    id = "bb2c6582-bcf1-47a0-9bbc-b97dcbbecab1",
                    songAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    songArtists = "The Velvet Underground",
                    songAlbumArtUrl = "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/3lwKNjchZuU5ZCVZVXwj5Y?si=b2b98edb3d0342da",
                    songDuration = "17:30",
                    songName = "Sister Ray",
                    songTrackNumber = 6
                )
            ),
            albumTags = "Avantgarde, Experimental, Noise, Art Rock",
            albumYear = 1968
        )
        albums["2080f161-c553-408d-9724-9c1e2f1b8c87"] = Album(
            id = "2080f161-c553-408d-9724-9c1e2f1b8c87",
            albumArtists = "Miles Davis",
            albumDescription = "Kind of Blue is a studio album by American jazz trumpeter, composer, and bandleader Miles Davis. It was recorded on March 2 and April 22, 1959, at Columbia's 30th Street Studio in New York City, and released on August 17 of that year by Columbia Records.",
            albumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
            albumSpotifyUrl = "https://open.spotify.com/album/1weenld61qoidwYuZ1GESA?si=CsrQI5dKSi6-9StJndQYKw",
            albumGeniusUrl = null,
            albumWikipediaUrl = "https://en.wikipedia.org/wiki/Kind_of_Blue",
            albumCredits = listOf(
                AlbumCredit(
                    id = "",
                    creditAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    creditName = "Julian Adderly",
                    creditContribution = "Alto Saxophone",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "",
                    creditAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    creditName = "Paul Chambers",
                    creditContribution = "Bass",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "",
                    creditAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    creditName = "Drums",
                    creditContribution = "James Cobb",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "",
                    creditAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    creditName = "Liner Notes",
                    creditContribution = "Bill Evans",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "",
                    creditAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    creditName = "Piano",
                    creditContribution = "Bill Evans",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "",
                    creditAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    creditName = "Tenor Saxophone",
                    creditContribution = "John Coltrane",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "",
                    creditAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    creditName = "Wyn Kelly",
                    creditContribution = "Piano",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "",
                    creditAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    creditName = "Trumpet",
                    creditContribution = "Miles Davis",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "",
                    creditAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    creditName = "Written-By",
                    creditContribution = "M. Davis",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                )
            ),
            albumLabel = "Columbia",
            albumName = "Kind Of Blue",
            albumSongs = listOf(
                Song(
                    id = "b165dfab-68e3-4cca-babb-ddf875687afb",
                    songAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    songArtists = "Miles Davis",
                    songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/7q3kkfAVpmcZ8g6JUThi3o?si=00879984be2a48ce",
                    songDuration = "9:22",
                    songName = "So What",
                    songTrackNumber = 1
                ),
                Song(
                    id = "8f6f58e2-ac95-4c8b-ad03-76ce0ad06412",
                    songAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    songArtists = "Miles Davis",
                    songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/3NvYPUNu6nwQgN31UnoDbn?si=9a415adfcd4f43e3",
                    songDuration = "9:46",
                    songName = "Freddie Freeloader",
                    songTrackNumber = 2
                ),
                Song(
                    id = "aa58a275-cd40-4986-8d1a-593d40b7a934",
                    songAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    songArtists = "Miles Davis",
                    songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/6bP4GyrKNbcKPMDqWJqpxI?si=2219ad5973fc4cab",
                    songDuration = "5:37",
                    songName = "Blue In Green",
                    songTrackNumber = 3
                ),
                Song(
                    id = "d3d6ca38-cf1b-4151-9937-dd35cff2a336",
                    songAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    songArtists = "Miles Davis",
                    songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/0TUa7gBg7LJH6B8dkNVioU?si=d23c31e6e9e24c5c",
                    songDuration = "11:32",
                    songName = "All Blues",
                    songTrackNumber = 4
                ),
                Song(
                    id = "4a6dfd30-ed2f-4cc3-9809-c2918f11e928",
                    songAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    songArtists = "Miles Davis",
                    songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/3R3fcrKaeBr3U6s9R2belr?si=c7688a94b60e49f3",
                    songDuration = "9:26",
                    songName = "Flamenco Sketches",
                    songTrackNumber = 5
                )
            ),
            albumTags = "Modal",
            albumYear = 1959
        )

        albums["06e00675-980b-4435-be2e-5ec17d942865"] = Album(
            id = "06e00675-980b-4435-be2e-5ec17d942865",
            albumArtists = "Herbie Hancock",
            albumDescription = "Head Hunters by Herbie Hancock is among the best and most influential jazz-funk albums in jazz history. Recorded and released in the last quarter of 1973, it featured electric synthesizers, elements of funk music and Hancock’s trademark Fender Rhodes,",
            albumArtUrl = "https://upload.wikimedia.org/wikipedia/en/5/54/Herbie-Hancock-Head-Hunters.png",
            albumSpotifyUrl = "https://open.spotify.com/album/5fmIolILp5NAtNYiRPjhzA?si=LYzXH1bVQPOS-4lvYcIhgw",
            albumGeniusUrl = null,
            albumWikipediaUrl = "https://en.wikipedia.org/wiki/Head_Hunters",
            albumCredits = listOf(
                AlbumCredit(
                    id = "",
                    creditAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                    creditName = "Victor Moscoco",
                    creditContribution = "Design [Cover]",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "",
                    creditAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                    creditName = "Fred Catero",
                    creditContribution = "Engineer [Recording]",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "",
                    creditAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                    creditName = "Bennie Maupin",
                    creditContribution = "Soprano Saxophone/Tenor Saxophone",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "",
                    creditAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                    creditName = "David Rubinson",
                    creditContribution = "Producer",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "",
                    creditAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                    creditName = "Herbie Hancock",
                    creditContribution = "Synthesizer, Electric Piano, Clavinet",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "",
                    creditAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                    creditName = "Paul Jackson",
                    creditContribution = "Electric Bass",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "",
                    creditAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                    creditName = "Harvey Mason",
                    creditContribution = "Drums [Yamaha]",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "",
                    creditAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                    creditName = "Bill Summers",
                    creditContribution = "Conga, Shekere, Tambourine",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "",
                    creditAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                    creditName = "Waldo Bascom",
                    creditContribution = "Photography By",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                )
            ),
            albumLabel = "Columbia",
            albumName = "Head Hunters",
            albumSongs = listOf(
                Song(
                    id = "2a53544d-18cd-4737-a0a1-c0c38b19d1eb",
                    songAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                    songArtists = "Herbie Hancock",
                    songAlbumArtUrl = "https://upload.wikimedia.org/wikipedia/en/5/54/Herbie-Hancock-Head-Hunters.png",
                    songSpotifyUrl = "https://open.spotify.com/track/4Ce66JznW8QbeyTdSzdGwR?si=46bd038005e2438e",
                    songDuration = "15:41",
                    songName = "Chameleon",
                    songTrackNumber = 1
                ),
                Song(
                    id = "baa36752-1c21-4d34-9062-4da237b10cbc",
                    songAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                    songArtists = "Herbie Hancock",
                    songAlbumArtUrl = "https://upload.wikimedia.org/wikipedia/en/5/54/Herbie-Hancock-Head-Hunters.png",
                    songSpotifyUrl = "https://open.spotify.com/track/2zQl59dZMzwhrmeSBEgiXY?si=6a4afcdd21204ba5",
                    songDuration = "6:28",
                    songName = "Watermelon Man",
                    songTrackNumber = 2
                ),
                Song(
                    id = "76bdb16a-0906-47fd-aae2-10720ccd2f93",
                    songAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                    songArtists = "Herbie Hancock",
                    songAlbumArtUrl = "https://upload.wikimedia.org/wikipedia/en/5/54/Herbie-Hancock-Head-Hunters.png",
                    songSpotifyUrl = "https://open.spotify.com/track/4WyVRn3L2uXnSUkY762gqN?si=c387e41f38204a3e",
                    songDuration = "10:15",
                    songName = "Sly",
                    songTrackNumber = 3
                ),
                Song(
                    id = "76bdb16a-0906-47fd-aae2-10720ccd2f93",
                    songAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                    songArtists = "Herbie Hancock",
                    songAlbumArtUrl = "https://upload.wikimedia.org/wikipedia/en/5/54/Herbie-Hancock-Head-Hunters.png",
                    songSpotifyUrl = "https://open.spotify.com/track/6c0ziyel6ZMTQ37vKRooGZ?si=9502b7ddd6b84d9a",
                    songDuration = "9:09",
                    songName = "Vein Meter",
                    songTrackNumber = 4
                )
            ),
            albumTags = "Jazz, Jazz-Funk",
            albumYear = 1973
        )
    }
}
