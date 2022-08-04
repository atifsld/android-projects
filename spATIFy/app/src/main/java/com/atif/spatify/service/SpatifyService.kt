package com.atif.spatify.service

import androidx.fragment.app.viewModels
import com.atif.spatify.SpatifyApplication
import com.atif.spatify.data.Album
import com.atif.spatify.data.AlbumCredit
import com.atif.spatify.data.Song
import com.atif.spatify.view.viewmodel.SpatifyViewModel
import com.atif.spatify.view.viewmodel.SpatifyViewModelFactory

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


    private fun populateAlbums() {
        albums["5583e514-cf7b-4214-8397-dfd7e10dfb33"] = Album(
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
        albums["2080f161-c553-408d-9724-9c1e2f1b8c87"] = Album(
            id = "2080f161-c553-408d-9724-9c1e2f1b8c87",
            albumArtists = "Miles Davis",
            albumDescription = "Kind of Blue is a studio album by American jazz trumpeter, composer, and bandleader Miles Davis. It was recorded on March 2 and April 22, 1959, at Columbia's 30th Street Studio in New York City, and released on August 17 of that year by Columbia Records.",
            albumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
            albumSpotifyUrl = "https://open.spotify.com/album/1weenld61qoidwYuZ1GESA?si=CsrQI5dKSi6-9StJndQYKw",
            albumGeniusUrl = null,
            albumWikipediaUrl = "https://en.wikipedia.org/wiki/Kind_of_Blue",
            albumLabel = "Columbia",
            albumName = "Kind Of Blue",
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
            albumLabel = "Columbia",
            albumName = "Head Hunters",
            albumTags = "Jazz, Jazz-Funk",
            albumYear = 1973
        )
    }

    fun addSongs(spatifyViewModel: SpatifyViewModel) {
        spatifyViewModel.insertSong(
            Song(
                id = "667df405-d8b6-484b-b084-9910fefbea5e",
                songAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                songArtists = "The Velvet Underground",
                songAlbumArtUrl = "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
                songSpotifyUrl = "https://open.spotify.com/track/0Evhu0dKCkIuEn88Pmb9mj?si=15d43ff31b3d4f70",
                songDuration = "2:47",
                songName = "White Light/White Heat",
                songTrackNumber = 1,
                songIsFavorite = false
            )
        )
        spatifyViewModel.insertSong(
            Song(
                id = "cfef36fd-9750-4a6b-a052-c0e3496b9041",
                songAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                songArtists = "The Velvet Underground",
                songAlbumArtUrl = "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
                songSpotifyUrl = "https://open.spotify.com/track/6xst1yRHJ2IkMQE0ebeU11?si=fd9394ec484c4077",
                songDuration = "8:19",
                songName = "The Gift",
                songTrackNumber = 2,
                songIsFavorite = false
            )
        )
        spatifyViewModel.insertSong(
            Song(
                id = "1b5b722d-56c0-4e3d-9136-fb7da944eec5",
                songAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                songArtists = "The Velvet Underground",
                songAlbumArtUrl = "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
                songSpotifyUrl = "https://open.spotify.com/track/00bScuvzFpyRMGWlgfu5sp?si=bfebbef11d71466c",
                songDuration = "4:56",
                songName = "Lady Godiva's Operation",
                songTrackNumber = 3,
                songIsFavorite = false
            )
        )
        spatifyViewModel.insertSong(
            Song(
                id = "089b2d86-e32d-4ebd-8ceb-1acc5c4f322f",
                songAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                songArtists = "The Velvet Underground",
                songAlbumArtUrl = "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
                songSpotifyUrl = "https://open.spotify.com/track/23LNLIpFwrcHAVpN3fx9cT?si=9f4015cba1cd4f0f",
                songDuration = "2:05",
                songName = "Here She Comes Now",
                songTrackNumber = 4,
                songIsFavorite = false
            )
        )
        spatifyViewModel.insertSong(
            Song(
                id = "ebb8356e-fd88-4e8d-a3db-180d0de547e5",
                songAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                songArtists = "The Velvet Underground",
                songAlbumArtUrl = "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
                songSpotifyUrl = "https://open.spotify.com/track/2Kvh9rYfJ7oczyCJZdzVPm?si=c302c35ba25d4385",
                songDuration = "4:38",
                songName = "I Heard Her Call My Name",
                songTrackNumber = 5,
                songIsFavorite = false
            )
        )
        spatifyViewModel.insertSong(
            Song(
                id = "bb2c6582-bcf1-47a0-9bbc-b97dcbbecab1",
                songAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                songArtists = "The Velvet Underground",
                songAlbumArtUrl = "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
                songSpotifyUrl = "https://open.spotify.com/track/3lwKNjchZuU5ZCVZVXwj5Y?si=b2b98edb3d0342da",
                songDuration = "17:30",
                songName = "Sister Ray",
                songTrackNumber = 6,
                songIsFavorite = false
            )
        )
        spatifyViewModel.insertSong(
            Song(
                id = "b165dfab-68e3-4cca-babb-ddf875687afb",
                songAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                songArtists = "Miles Davis",
                songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                songSpotifyUrl = "https://open.spotify.com/track/7q3kkfAVpmcZ8g6JUThi3o?si=00879984be2a48ce",
                songDuration = "9:22",
                songName = "So What",
                songTrackNumber = 1,
                songIsFavorite = false
            )
        )
        spatifyViewModel.insertSong(
            Song(
                id = "8f6f58e2-ac95-4c8b-ad03-76ce0ad06412",
                songAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                songArtists = "Miles Davis",
                songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                songSpotifyUrl = "https://open.spotify.com/track/3NvYPUNu6nwQgN31UnoDbn?si=9a415adfcd4f43e3",
                songDuration = "9:46",
                songName = "Freddie Freeloader",
                songTrackNumber = 2,
                songIsFavorite = false
            )
        )
        spatifyViewModel.insertSong(
            Song(
                id = "aa58a275-cd40-4986-8d1a-593d40b7a934",
                songAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                songArtists = "Miles Davis",
                songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                songSpotifyUrl = "https://open.spotify.com/track/6bP4GyrKNbcKPMDqWJqpxI?si=2219ad5973fc4cab",
                songDuration = "5:37",
                songName = "Blue In Green",
                songTrackNumber = 3,
                songIsFavorite = false
            )
        )
        spatifyViewModel.insertSong(
            Song(
                id = "d3d6ca38-cf1b-4151-9937-dd35cff2a336",
                songAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                songArtists = "Miles Davis",
                songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                songSpotifyUrl = "https://open.spotify.com/track/0TUa7gBg7LJH6B8dkNVioU?si=d23c31e6e9e24c5c",
                songDuration = "11:32",
                songName = "All Blues",
                songTrackNumber = 4,
                songIsFavorite = false
            )
        )
        spatifyViewModel.insertSong(
            Song(
                id = "4a6dfd30-ed2f-4cc3-9809-c2918f11e928",
                songAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                songArtists = "Miles Davis",
                songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                songSpotifyUrl = "https://open.spotify.com/track/3R3fcrKaeBr3U6s9R2belr?si=c7688a94b60e49f3",
                songDuration = "9:26",
                songName = "Flamenco Sketches",
                songTrackNumber = 5,
                songIsFavorite = false
            )
        )
        spatifyViewModel.insertSong(
            Song(
                id = "b165dfab-68e3-4cca-babb-ddf875687afb",
                songAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                songArtists = "Miles Davis",
                songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                songSpotifyUrl = "https://open.spotify.com/track/7q3kkfAVpmcZ8g6JUThi3o?si=00879984be2a48ce",
                songDuration = "9:22",
                songName = "So What",
                songTrackNumber = 1,
                songIsFavorite = false
            )
        )
        spatifyViewModel.insertSong(
            Song(
                id = "8f6f58e2-ac95-4c8b-ad03-76ce0ad06412",
                songAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                songArtists = "Miles Davis",
                songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                songSpotifyUrl = "https://open.spotify.com/track/3NvYPUNu6nwQgN31UnoDbn?si=9a415adfcd4f43e3",
                songDuration = "9:46",
                songName = "Freddie Freeloader",
                songTrackNumber = 2,
                songIsFavorite = false
            )
        )
        spatifyViewModel.insertSong(
            Song(
                id = "aa58a275-cd40-4986-8d1a-593d40b7a934",
                songAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                songArtists = "Miles Davis",
                songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                songSpotifyUrl = "https://open.spotify.com/track/6bP4GyrKNbcKPMDqWJqpxI?si=2219ad5973fc4cab",
                songDuration = "5:37",
                songName = "Blue In Green",
                songTrackNumber = 3,
                songIsFavorite = false
            )
        )
        spatifyViewModel.insertSong(
            Song(
                id = "d3d6ca38-cf1b-4151-9937-dd35cff2a336",
                songAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                songArtists = "Miles Davis",
                songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                songSpotifyUrl = "https://open.spotify.com/track/0TUa7gBg7LJH6B8dkNVioU?si=d23c31e6e9e24c5c",
                songDuration = "11:32",
                songName = "All Blues",
                songTrackNumber = 4,
                songIsFavorite = false
            )
        )
        spatifyViewModel.insertSong(
            Song(
                id = "4a6dfd30-ed2f-4cc3-9809-c2918f11e928",
                songAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                songArtists = "Miles Davis",
                songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                songSpotifyUrl = "https://open.spotify.com/track/3R3fcrKaeBr3U6s9R2belr?si=c7688a94b60e49f3",
                songDuration = "9:26",
                songName = "Flamenco Sketches",
                songTrackNumber = 5,
                songIsFavorite = false
            )
        )
        spatifyViewModel.insertSong(
            Song(
                id = "2a53544d-18cd-4737-a0a1-c0c38b19d1eb",
                songAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                songArtists = "Herbie Hancock",
                songAlbumArtUrl = "https://upload.wikimedia.org/wikipedia/en/5/54/Herbie-Hancock-Head-Hunters.png",
                songSpotifyUrl = "https://open.spotify.com/track/4Ce66JznW8QbeyTdSzdGwR?si=46bd038005e2438e",
                songDuration = "15:41",
                songName = "Chameleon",
                songTrackNumber = 1,
                songIsFavorite = false
            )
        )
        spatifyViewModel.insertSong(
            Song(
                id = "baa36752-1c21-4d34-9062-4da237b10cbc",
                songAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                songArtists = "Herbie Hancock",
                songAlbumArtUrl = "https://upload.wikimedia.org/wikipedia/en/5/54/Herbie-Hancock-Head-Hunters.png",
                songSpotifyUrl = "https://open.spotify.com/track/2zQl59dZMzwhrmeSBEgiXY?si=6a4afcdd21204ba5",
                songDuration = "6:28",
                songName = "Watermelon Man",
                songTrackNumber = 2,
                songIsFavorite = false
            )
        )
        spatifyViewModel.insertSong(
            Song(
                id = "76bdb16a-0906-47fd-aae2-10720ccd2f93",
                songAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                songArtists = "Herbie Hancock",
                songAlbumArtUrl = "https://upload.wikimedia.org/wikipedia/en/5/54/Herbie-Hancock-Head-Hunters.png",
                songSpotifyUrl = "https://open.spotify.com/track/4WyVRn3L2uXnSUkY762gqN?si=c387e41f38204a3e",
                songDuration = "10:15",
                songName = "Sly",
                songTrackNumber = 3,
                songIsFavorite = false
            )
        )
        spatifyViewModel.insertSong(
            Song(
                id = "76bdb16a-0906-47fd-aae2-10720ccd2f93",
                songAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                songArtists = "Herbie Hancock",
                songAlbumArtUrl = "https://upload.wikimedia.org/wikipedia/en/5/54/Herbie-Hancock-Head-Hunters.png",
                songSpotifyUrl = "https://open.spotify.com/track/6c0ziyel6ZMTQ37vKRooGZ?si=9502b7ddd6b84d9a",
                songDuration = "9:09",
                songName = "Vein Meter",
                songTrackNumber = 4,
                songIsFavorite = false
            )
        )
    }

    fun addAlbumCredits(spatifyViewModel: SpatifyViewModel) {
        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "d775bdd0-b602-45a0-9056-0f49e5d31b22",
                creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                creditName = "Andy Warhol",
                creditContribution = "Cover [Cover Concept]",
                creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
            )
        )
        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "bc288071-4c1a-41ed-9a60-570804da7402",
                creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                creditName = "Acy R. Lehman",
                creditContribution = "Design [Cover]",
                creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
            )
        )
        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "f134dccd-dcdd-40ff-bd92-0f2036efefad",
                creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                creditName = "Val Valentin",
                creditContribution = "Engineer [Director Of]",
                creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
            )
        )
        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "7505d591-1531-48ca-927f-8498cf1ca604",
                creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                creditName = "Gary Kellgren",
                creditContribution = "Engineer [Recording]",
                creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
            )
        )
        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "5a2afcc1-d9d0-44f9-92c8-d1090cc2f8a3",
                creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                creditName = "Maureen Tucker",
                creditContribution = "Percussion",
                creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
            )
        )
        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "b3c879db-23ac-4382-bcd2-b6402c4afba4",
                creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                creditName = "Billy Name",
                creditContribution = "Photography By [Cover]",
                creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
            )
        )
        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "e23a170e-f93c-4cd1-96f0-135fcc6a2272",
                creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                creditName = "Mario Annibali",
                creditContribution = "Photography By [Liner]",
                creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
            )
        )
        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "e90700f4-105a-440a-9818-e34044e9af47",
                creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                creditName = "Tom Wilson",
                creditContribution = "Producer",
                creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
            )
        )
        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "8606b118-1178-4a6b-aa7f-4a6e5b7266dd",
                creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                creditName = "Sterling Morrison",
                creditContribution = "Vocals, Guitar, Bass Guitar",
                creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
            )
        )
        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "f2232125-0244-4b32-ba66-28296e3340c2",
                creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                creditName = "John Cale",
                creditContribution = "Vocals, Viola [Electric], Organ, Bass Guitar",
                creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
            )
        )
        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "3c9df880-cbe4-4e03-b76d-2ce429bfdbe1",
                creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                creditName = "Tom Wilson",
                creditContribution = "Producer",
                creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
            )
        )

        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "768294b6-eee9-4257-8d2f-b1ddce109f50",
                creditAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                creditName = "Julian Adderly",
                creditContribution = "Alto Saxophone",
                creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
            )
        )

        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "e865d407-d5d0-45bd-9dab-9026bb8fe559",
                creditAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                creditName = "Paul Chambers",
                creditContribution = "Bass",
                creditImageUrl = "https://i.discogs.com/G3V3okWAe3oiwSXQA1ijuWLONqHXDhlmGg7hWN8V6jw/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI1OTc3/OC0xNjEwMTc1MDgz/LTE1NzYuanBlZw.jpeg"
            )
        )

        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "e7e839ce-315d-4f82-9c81-882f89a6551f",
                creditAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                creditName = "Drums",
                creditContribution = "James Cobb",
                creditImageUrl = "https://i.discogs.com/B-azWw9MEvd_2ZOVbpBXc4TH3pilr_wIndWlDh5jDMY/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI1MjMx/MS0xNjQzODMxNzcx/LTQ0MzUuanBlZw.jpeg"
            )
        )

        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "ca60f3f3-687c-4f02-a92b-6f83ef058b8a",
                creditAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                creditName = "Liner Notes",
                creditContribution = "Bill Evans",
                creditImageUrl = "https://i.discogs.com/lIuzUoUyZbmwdVfCLOiMVpja8Qtfni4yJkv2PmasCIA/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI1MjMx/MC0xNjM3NTQ5NDM4/LTk1NTMuanBlZw.jpeg"
            )
        )

        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "3ce3335f-ab30-4d93-aba8-c8361d96a71d",
                creditAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                creditName = "Piano",
                creditContribution = "Bill Evans",
                creditImageUrl = "https://i.discogs.com/lIuzUoUyZbmwdVfCLOiMVpja8Qtfni4yJkv2PmasCIA/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI1MjMx/MC0xNjM3NTQ5NDM4/LTk1NTMuanBlZw.jpeg"
            )
        )

        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "1e269f42-6de7-46da-8544-877f9663ce11",
                creditAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                creditName = "Tenor Saxophone",
                creditContribution = "John Coltrane",
                creditImageUrl = "https://i.discogs.com/MIlw5bt2eU0KOgO2LDKlpoL-YWz7onKm-XNyHiqfrkQ/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTk3NTQ1/LTE0NTE0ODkwOTQt/Nzk1Mi5qcGVn.jpeg"
            )
        )

        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "a269c4ec-fb4e-4428-beb7-68569136a7da",
                creditAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                creditName = "Wynton Kelly",
                creditContribution = "Piano",
                creditImageUrl = "https://i.discogs.com/3-kjprBhwYcvzz8vkviPN0YXy5N5TDQ3uj_fZdyprJk/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI1MjMw/OC0xMTA3NzY2Mzg2/LmpwZw.jpeg"
            )
        )

        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "3f15c771-01cc-40eb-84dc-2920bdc35269",
                creditAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                creditName = "Trumpet",
                creditContribution = "Miles Davis",
                creditImageUrl = "https://i.discogs.com/yltaZJsmNzRCpXqtq3dekVIuHjnu_BTh35d5tH1McgU/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTIzNzU1/LTEzOTQzODczNDMt/NDUwMC5qcGVn.jpeg"
            )
        )

        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "3f15c771-01cc-40eb-84dc-2920bdc35269",
                creditAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                creditName = "Written-By",
                creditContribution = "M. Davis",
                creditImageUrl = "https://i.discogs.com/yltaZJsmNzRCpXqtq3dekVIuHjnu_BTh35d5tH1McgU/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTIzNzU1/LTEzOTQzODczNDMt/NDUwMC5qcGVn.jpeg"
            )
        )

        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "116054db-e7c3-4746-9419-01d823155866",
                creditAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                creditName = "Victor Moscoco",
                creditContribution = "Design [Cover]",
                creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
            )
        )

        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "08cb7fe4-0cd9-4f9b-94c7-7111db5fe8ce",
                creditAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                creditName = "Fred Catero",
                creditContribution = "Engineer [Recording]",
                creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
            )
        )

        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "4e5ecb6d-445e-4c71-b6d0-37f6e9e8feab",
                creditAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                creditName = "Bennie Maupin",
                creditContribution = "Soprano Saxophone/Tenor Saxophone",
                creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
            )
        )

        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "6a6e9358-d2e7-4c21-943d-ee1500a77549",
                creditAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                creditName = "David Rubinson",
                creditContribution = "Producer",
                creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
            )
        )

        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "7cec7334-2ec8-40b8-a314-d5ebc8b2b495",
                creditAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                creditName = "Herbie Hancock",
                creditContribution = "Synthesizer, Electric Piano, Clavinet",
                creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
            )
        )

        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "0a45bab1-8563-49eb-be85-88aaca1cc079",
                creditAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                creditName = "Paul Jackson",
                creditContribution = "Electric Bass",
                creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
            )
        )

        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "0a45bab1-8563-49eb-be85-88aaca1cc079",
                creditAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                creditName = "Harvey Mason",
                creditContribution = "Drums [Yamaha]",
                creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
            )
        )

        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "91e61a00-b659-48d3-9fb6-2c3f41aae016",
                creditAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                creditName = "Bill Summers",
                creditContribution = "Conga, Shekere, Tambourine",
                creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
            )
        )

        spatifyViewModel.insertAlbumCredit(
            AlbumCredit(
                id = "71f0807e-924f-481f-b398-6d7842e04059",
                creditAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                creditName = "Waldo Bascom",
                creditContribution = "Photography By",
                creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
            )
        )
    }

    fun addAlbums(spatifyViewModel: SpatifyViewModel) {
        spatifyViewModel.insertAlbum(
            Album(
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
        )
        spatifyViewModel.insertAlbum(
            Album(
                id = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                albumArtists = "Miles Davis",
                albumDescription = "Kind of Blue is a studio album by American jazz trumpeter, composer, and bandleader Miles Davis. It was recorded on March 2 and April 22, 1959, at Columbia's 30th Street Studio in New York City, and released on August 17 of that year by Columbia Records.",
                albumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                albumSpotifyUrl = "https://open.spotify.com/album/1weenld61qoidwYuZ1GESA?si=CsrQI5dKSi6-9StJndQYKw",
                albumGeniusUrl = null,
                albumWikipediaUrl = "https://en.wikipedia.org/wiki/Kind_of_Blue",
                albumLabel = "Columbia",
                albumName = "Kind Of Blue",
                albumTags = "Modal",
                albumYear = 1959
            )
        )
        spatifyViewModel.insertAlbum(
            Album(
                id = "06e00675-980b-4435-be2e-5ec17d942865",
                albumArtists = "Herbie Hancock",
                albumDescription = "Head Hunters by Herbie Hancock is among the best and most influential jazz-funk albums in jazz history. Recorded and released in the last quarter of 1973, it featured electric synthesizers, elements of funk music and Hancock’s trademark Fender Rhodes,",
                albumArtUrl = "https://upload.wikimedia.org/wikipedia/en/5/54/Herbie-Hancock-Head-Hunters.png",
                albumSpotifyUrl = "https://open.spotify.com/album/5fmIolILp5NAtNYiRPjhzA?si=LYzXH1bVQPOS-4lvYcIhgw",
                albumGeniusUrl = null,
                albumWikipediaUrl = "https://en.wikipedia.org/wiki/Head_Hunters",
                albumLabel = "Columbia",
                albumName = "Head Hunters",
                albumTags = "Jazz, Jazz-Funk",
                albumYear = 1973
            )
        )
    }


}
