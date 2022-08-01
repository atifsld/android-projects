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
        if (albums.size == 0) {
            populateAlbums()
        }
        return albums[albumUuid]!!.albumSongs
    }

    fun getSongs(): List<Song> {
        val songList: MutableList<Song> = mutableListOf()
        if (albums.size == 0) {
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
                if (song.songUuid == songUuid) {
                    return song;
                }
            }
        }
        return null;
    }

    private fun populateAlbums() {
        albums["5583e514-cf7b-4214-8397-dfd7e10dfb33"] = Album(
            albumUuid = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
            albumArtists = listOf("The Velvet Underground"),
            albumDescription = "White Light/White Heat contains a distorted, feedback-driven, and roughly recorded sound, which is regarded as influential; it foreshadowed the start of punk rock and the no wave genre. The Social Distortion album White Light, White Heat, White Trash would be named after White Light/White Heat.",
            albumArtUrl = "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
            albumSpotifyUrl = "https://open.spotify.com/album/0HHmJpwOXXRJu9HI9iQiEO?si=Z8BDHkGyRdWEN3LHyyz_ZQ",
            albumGeniusUrl = "https://genius.com/albums/The-velvet-underground/White-light-white-heat",
            albumWikipediaUrl = "https://en.wikipedia.org/wiki/White_Light/White_Heat",
            albumCredits = listOf(
                AlbumCredit(
                    creditName = "Andy Warhol",
                    creditContribution = "Cover [Cover Concept]"
                ),
                AlbumCredit(
                    creditName = "Acy R. Lehman",
                    creditContribution = "Design [Cover]"
                ),
                AlbumCredit(
                    creditName = "Val Valentin",
                    creditContribution = "Engineer [Director Of]"
                ),
                AlbumCredit(
                    creditName = "Gary Kellgren",
                    creditContribution = "Engineer [Recording]"
                ),
                AlbumCredit(
                    creditName = "Maureen Tucker",
                    creditContribution = "Percussion"
                ),
                AlbumCredit(
                    creditName = "Billy Name",
                    creditContribution = "Photography By [Cover]"
                ),
                AlbumCredit(
                    creditName = "Mario Annibali",
                    creditContribution = "Photography By [Liner]"
                ),
                AlbumCredit(
                    creditName = "Tom Wilson",
                    creditContribution = "Producer"
                ),
                AlbumCredit(
                    creditName = "Sterling Morrison",
                    creditContribution = "Vocals, Guitar, Bass Guitar"
                ),
                AlbumCredit(
                    creditName = "John Cale",
                    creditContribution = "Vocals, Viola [Electric], Organ, Bass Guitar"
                ),
                AlbumCredit(
                    creditName = "Tom Wilson",
                    creditContribution = "Producer"
                )
            ),
            albumLabel = "Verve Records",
            albumName = "White Light/White Heat",
            albumSongs = listOf(
                Song(
                    songUuid = "667df405-d8b6-484b-b084-9910fefbea5e",
                    songArtists = listOf("The Velvet Underground"),
                    songAlbumArtUrl = "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/0Evhu0dKCkIuEn88Pmb9mj?si=15d43ff31b3d4f70",
                    songDuration = "2:47",
                    songName = "White Light/White Heat",
                    songTrackNumber = 1
                ),
                Song(
                    songUuid = "cfef36fd-9750-4a6b-a052-c0e3496b9041",
                    songArtists = listOf("The Velvet Underground"),
                    songAlbumArtUrl = "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/6xst1yRHJ2IkMQE0ebeU11?si=fd9394ec484c4077",
                    songDuration = "8:19",
                    songName = "The Gift",
                    songTrackNumber = 2
                ),
                Song(
                    songUuid = "1b5b722d-56c0-4e3d-9136-fb7da944eec5",
                    songArtists = listOf("The Velvet Underground"),
                    songAlbumArtUrl = "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/00bScuvzFpyRMGWlgfu5sp?si=bfebbef11d71466c",
                    songDuration = "4:56",
                    songName = "Lady Godiva's Operation",
                    songTrackNumber = 3
                ),
                Song(
                    songUuid = "089b2d86-e32d-4ebd-8ceb-1acc5c4f322f",
                    songArtists = listOf("The Velvet Underground"),
                    songAlbumArtUrl = "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/23LNLIpFwrcHAVpN3fx9cT?si=9f4015cba1cd4f0f",
                    songDuration = "2:05",
                    songName = "Here She Comes Now",
                    songTrackNumber = 4
                ),
                Song(
                    songUuid = "ebb8356e-fd88-4e8d-a3db-180d0de547e5",
                    songArtists = listOf("The Velvet Underground"),
                    songAlbumArtUrl = "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/2Kvh9rYfJ7oczyCJZdzVPm?si=c302c35ba25d4385",
                    songDuration = "4:38",
                    songName = "I Heard Her Call My Name",
                    songTrackNumber = 5
                ),
                Song(
                    songUuid = "bb2c6582-bcf1-47a0-9bbc-b97dcbbecab1",
                    songArtists = listOf("The Velvet Underground"),
                    songAlbumArtUrl = "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/3lwKNjchZuU5ZCVZVXwj5Y?si=b2b98edb3d0342da",
                    songDuration = "17:30",
                    songName = "Sister Ray",
                    songTrackNumber = 6
                )
            ),
            albumTags = listOf("Avantgarde", "Experimental", "Noise", "Art Rock"),
            albumYear = 1968
        )
        albums["2080f161-c553-408d-9724-9c1e2f1b8c87"] = Album(
            albumUuid = "2080f161-c553-408d-9724-9c1e2f1b8c87",
            albumArtists = listOf("Miles Davis"),
            albumDescription = "Kind of Blue is a studio album by American jazz trumpeter, composer, and bandleader Miles Davis. It was recorded on March 2 and April 22, 1959, at Columbia's 30th Street Studio in New York City, and released on August 17 of that year by Columbia Records.",
            albumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
            albumSpotifyUrl = "https://open.spotify.com/album/1weenld61qoidwYuZ1GESA?si=CsrQI5dKSi6-9StJndQYKw",
            albumGeniusUrl = null,
            albumWikipediaUrl = "https://en.wikipedia.org/wiki/Kind_of_Blue",
            albumCredits = listOf(
                AlbumCredit(
                    creditName = "Julian Adderly",
                    creditContribution = "Alto Saxophone",
                ),
                AlbumCredit(
                    creditName = "Paul Chambers",
                    creditContribution = "Bass"
                ),
                AlbumCredit(
                    creditName = "Drums",
                    creditContribution = "James Cobb"
                ),
                AlbumCredit(
                    creditName = "Liner Notes",
                    creditContribution = "Bill Evans"
                ),
                AlbumCredit(
                    creditName = "Piano",
                    creditContribution = "Bill Evans"
                ),
                AlbumCredit(
                    creditName = "Tenor Saxophone",
                    creditContribution = "John Coltrane"
                ),
                AlbumCredit(
                    creditName = "Wyn Kelly",
                    creditContribution = "Piano"
                ),
                AlbumCredit(
                    creditName = "Trumpet",
                    creditContribution = "Miles Davis"
                ),
                AlbumCredit(
                    creditName = "Written-By",
                    creditContribution = "M. Davis"
                )
            ),
            albumLabel = "Columbia",
            albumName = "Kind Of Blue",
            albumSongs = listOf(
                Song(
                    songUuid = "b165dfab-68e3-4cca-babb-ddf875687afb",
                    songArtists = listOf("Miles Davis"),
                    songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/7q3kkfAVpmcZ8g6JUThi3o?si=00879984be2a48ce",
                    songDuration = "9:22",
                    songName = "So What",
                    songTrackNumber = 1
                ),
                Song(
                    songUuid = "8f6f58e2-ac95-4c8b-ad03-76ce0ad06412",
                    songArtists = listOf("Miles Davis"),
                    songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/3NvYPUNu6nwQgN31UnoDbn?si=9a415adfcd4f43e3",
                    songDuration = "9:46",
                    songName = "Freddie Freeloader",
                    songTrackNumber = 2
                ),
                Song(
                    songUuid = "aa58a275-cd40-4986-8d1a-593d40b7a934",
                    songArtists = listOf("Miles Davis"),
                    songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/6bP4GyrKNbcKPMDqWJqpxI?si=2219ad5973fc4cab",
                    songDuration = "5:37",
                    songName = "Blue In Green",
                    songTrackNumber = 3
                ),
                Song(
                    songUuid = "d3d6ca38-cf1b-4151-9937-dd35cff2a336",
                    songArtists = listOf("Miles Davis"),
                    songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/0TUa7gBg7LJH6B8dkNVioU?si=d23c31e6e9e24c5c",
                    songDuration = "11:32",
                    songName = "All Blues",
                    songTrackNumber = 4
                ),
                Song(
                    songUuid = "4a6dfd30-ed2f-4cc3-9809-c2918f11e928",
                    songArtists = listOf("Miles Davis"),
                    songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/3R3fcrKaeBr3U6s9R2belr?si=c7688a94b60e49f3",
                    songDuration = "9:26",
                    songName = "Flamenco Sketches",
                    songTrackNumber = 5
                )
            ),
            albumTags = listOf("Modal"),
            albumYear = 1959
        )

        albums["06e00675-980b-4435-be2e-5ec17d942865"] = Album(
            albumUuid = "06e00675-980b-4435-be2e-5ec17d942865",
            albumArtists = listOf("Herbie Hancock"),
            albumDescription = "" +
                    "Head Hunters by Herbie Hancock is among the best and most influential jazz-funk albums in jazz history. Recorded and released in the last quarter of 1973, it featured electric synthesizers, elements of funk music and Hancock’s trademark Fender Rhodes,",
            albumArtUrl = "https://upload.wikimedia.org/wikipedia/en/5/54/Herbie-Hancock-Head-Hunters.png",
            albumSpotifyUrl = "https://open.spotify.com/album/5fmIolILp5NAtNYiRPjhzA?si=LYzXH1bVQPOS-4lvYcIhgw",
            albumGeniusUrl = null,
            albumWikipediaUrl = "https://en.wikipedia.org/wiki/Head_Hunters",
            albumCredits = listOf(
                AlbumCredit(
                    creditName = "Victor Moscoco",
                    creditContribution = "Design [Cover]",
                ),
                AlbumCredit(
                    creditName = "Fred Catero",
                    creditContribution = "Engineer [Recording]"
                ),
                AlbumCredit(
                    creditName = "Bennie Maupin",
                    creditContribution = "Soprano Saxophone/Tenor Saxophone"
                ),
                AlbumCredit(
                    creditName = "David Rubinson",
                    creditContribution = "Producer"
                ),
                AlbumCredit(
                    creditName = "Herbie Hancock",
                    creditContribution = "Synthesizer, Electric Piano, Clavinet"
                ),
                AlbumCredit(
                    creditName = "Paul Jackson",
                    creditContribution = "Electric Bass"
                ),
                AlbumCredit(
                    creditName = "Harvey Mason",
                    creditContribution = "Drums [Yamaha]"
                ),
                AlbumCredit(
                    creditName = "Bill Summers",
                    creditContribution = "Conga, Shekere, Tambourine"
                ),
                AlbumCredit(
                    creditName = "Waldo Bascom",
                    creditContribution = "Photography By"
                )
            ),
            albumLabel = "Columbia",
            albumName = "Head Hunters",
            albumSongs = listOf(
                Song(
                    songUuid = "2a53544d-18cd-4737-a0a1-c0c38b19d1eb",
                    songArtists = listOf("Head Hunters"),
                    songAlbumArtUrl = "https://upload.wikimedia.org/wikipedia/en/5/54/Herbie-Hancock-Head-Hunters.png",
                    songSpotifyUrl = "https://open.spotify.com/track/4Ce66JznW8QbeyTdSzdGwR?si=46bd038005e2438e",
                    songDuration = "15:41",
                    songName = "Chameleon",
                    songTrackNumber = 1
                ),
                Song(
                    songUuid = "baa36752-1c21-4d34-9062-4da237b10cbc",
                    songArtists = listOf("Head Hunters"),
                    songAlbumArtUrl = "https://upload.wikimedia.org/wikipedia/en/5/54/Herbie-Hancock-Head-Hunters.png",
                    songSpotifyUrl = "https://open.spotify.com/track/2zQl59dZMzwhrmeSBEgiXY?si=6a4afcdd21204ba5",
                    songDuration = "6:28",
                    songName = "Watermelon Man",
                    songTrackNumber = 2
                ),
                Song(
                    songUuid = "76bdb16a-0906-47fd-aae2-10720ccd2f93",
                    songArtists = listOf("Head Hunters"),
                    songAlbumArtUrl = "https://upload.wikimedia.org/wikipedia/en/5/54/Herbie-Hancock-Head-Hunters.png",
                    songSpotifyUrl = "https://open.spotify.com/track/4WyVRn3L2uXnSUkY762gqN?si=c387e41f38204a3e",
                    songDuration = "10:15",
                    songName = "Sly",
                    songTrackNumber = 3
                ),
                Song(
                    songUuid = "76bdb16a-0906-47fd-aae2-10720ccd2f93",
                    songArtists = listOf("Head Hunters"),
                    songAlbumArtUrl = "https://upload.wikimedia.org/wikipedia/en/5/54/Herbie-Hancock-Head-Hunters.png",
                    songSpotifyUrl = "https://open.spotify.com/track/6c0ziyel6ZMTQ37vKRooGZ?si=9502b7ddd6b84d9a",
                    songDuration = "9:09",
                    songName = "Vein Meter",
                    songTrackNumber = 4
                )
            ),
            albumTags = listOf("Jazz", "Jazz-Funk"),
            albumYear = 1973
        )
    }
}
