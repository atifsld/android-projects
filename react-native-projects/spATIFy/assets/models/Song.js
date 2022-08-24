class Song {
    constructor(id, 
        songAlbumId, 
        songArtists, 
        songAlbumArtUrl, 
        songSpotifyUrl, 
        songDuration, 
        songName, 
        songTrackNumber,
        songIsFavorite) {
            this.id = id
            this.songAlbumId = songAlbumId
            this.songArtists = songArtists
            this.songAlbumArtUrl = songAlbumArtUrl
            this.songSpotifyUrl = songSpotifyUrl
            this.songDuration = songDuration
            this.songName = songName
            this.songTrackNumber = songTrackNumber
            this.songIsFavorite = songIsFavorite
    }
}

export default Song;