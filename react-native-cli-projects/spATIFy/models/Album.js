class Album {
    constructor(
        id, 
        albumName, 
        albumDescription, 
        albumArtUrl, 
        albumSpotifyUrl, 
        albumWikipediaUrl, 
        albumGeniusUrl, 
        albumArtists, 
        albumLabel, 
        albumTags, 
        albumYear) {
            this.id = id
            this.albumName = albumName
            this.albumDescription = albumDescription
            this.albumArtUrl = albumArtUrl
            this.albumSpotifyUrl = albumSpotifyUrl
            this.albumWikipediaUrl = albumWikipediaUrl
            this.albumGeniusUrl = albumGeniusUrl
            this.albumArtists = albumArtists
            this.albumLabel = albumLabel
            this.albumTags = albumTags
            this.albumYear = albumYear
    }
}

export default Album;