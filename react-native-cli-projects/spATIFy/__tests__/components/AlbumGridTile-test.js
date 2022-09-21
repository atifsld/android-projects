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

function findAlbumDetail (tree, element, expectedValue) {
    console.warn(tree.children[0].children[1].children[0])
    if(element == 'albumName') {
        const albumName = tree.children[0].children[1].children[0].children[0]
        return (albumName === expectedValue) 
    } else if (element == 'albumArtists') {
        const albumArtists = tree.children[0].children[1].children[1].children[0]
        return (albumArtists === expectedValue)
    } else if (element == 'albumYear') {
        const albumYear = tree.children[0].children[1].children[2].children[0]
        return (albumYear == expectedValue)
    } else {
        return false;
    }
}

test('test album grid tile', () => {
    const tree = renderer.create(<AlbumGridTile album={sampleAlbum} />).toJSON();
    expect(tree).toMatchSnapshot();
})

test('test album has the correct name', () => {
    const tree = renderer.create(<AlbumGridTile album={sampleAlbum} />).toJSON();
    expect(findAlbumDetail(tree, 'albumName', 'Head Hunters')).toBeTruthy()
})

test('test album has the correct artists', () => {
    const tree = renderer.create(<AlbumGridTile album={sampleAlbum} />).toJSON();
    expect(findAlbumDetail(tree, 'albumArtists', 'Herbie Hancock')).toBeTruthy()
})

test('test album has the correct year', () => {
    const tree = renderer.create(<AlbumGridTile album={sampleAlbum} />).toJSON();
    expect(findAlbumDetail(tree, 'albumYear', 1973)).toBeTruthy()
})