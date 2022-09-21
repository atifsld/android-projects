import 'react-native'
import React from 'react'
import renderer from 'react-test-renderer'
import AlbumGridTile from '../../components/AlbumGridTile'

const sampleAlbum = {
    "id": "06e00675-980b-4435-be2e-5ec17d942865",
    "albumName": "Head Hunters",
    "albumDescription": "Head Hunters by Herbie Hancock is among the best and most influential jazz-funk albums in jazz history. Recorded and released in the last quarter of 1973, it featured electric synthesizers, elements of funk music and Hancock’s trademark Fender Rhodes,",
    "albumArtUrl": "https://upload.wikimedia.org/wikipedia/en/5/54/Herbie-Hancock-Head-Hunters.png",
    "albumSpotifyUrl": "https://open.spotify.com/album/5fmIolILp5NAtNYiRPjhzA?si=LYzXH1bVQPOS-4lvYcIhgw",
    "albumWikipediaUrl": "https://en.wikipedia.org/wiki/Head_Hunters",
    "albumGeniusUrl": null,
    "albumArtists": "Herbie Hancock",
    "albumLabel": "Columbia",
    "albumTags": "Jazz, Jazz-Funk",
    "albumYear": 1973
}

test('test album grid tile', () => {
    const tree = renderer.create(<AlbumGridTile album={sampleAlbum} />).toJSON();
    expect(tree).toMatchSnapshot();
})