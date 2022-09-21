import 'react-native'
import React from 'react'
import renderer from 'react-test-renderer'
import SongListTile from '../../components/SongListTile'

const sampleSong = {
    "id": "d3d6ca38-cf1b-4151-9937-dd35cff2a336",
    "songAlbumId": "2080f161-c553-408d-9724-9c1e2f1b8c87",
    "songArtists": "Miles Davis",
    "songAlbumArtUrl": "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
    "songSpotifyUrl": "https://open.spotify.com/track/0TUa7gBg7LJH6B8dkNVioU?si=d23c31e6e9e24c5c",
    "songDuration": "11:32",
    "songName": "All Blues",
    "songTrackNumber": 4, 
    "songIsFavorite": false
}

function findSongDetail (tree, element, expectedValue) {
    if(element == 'songName') {
        const songName = tree.children[0].children[1].children[0].children[0]
        return (songName === expectedValue) 
    } else if (element == 'songArtists') {
        const songArtists = tree.children[0].children[1].children[1].children[0]
        return (songArtists === expectedValue)
    } else if (element == 'songDuration') {
        const songDuration = tree.children[0].children[1].children[2].children[0]
        return (songDuration === expectedValue)
    } else {
        return false;
    }
}

test('test song list tile', () => {
    const tree = renderer.create(<SongListTile song={sampleSong} />).toJSON();
    expect(tree).toMatchSnapshot();
})

test('test song tile has correct name', () => {
    const tree = renderer.create(<SongListTile song={sampleSong} />).toJSON();
    expect(findSongDetail(tree, 'songName', 'All Blues')).toBeTruthy()
})

test('test song tile has correct artists', () => {
    const tree = renderer.create(<SongListTile song={sampleSong} />).toJSON();
    expect(findSongDetail(tree, 'songArtists', 'Miles Davis')).toBeTruthy()
})

test('test song tile has correct duration', () => {
    const tree = renderer.create(<SongListTile song={sampleSong} />).toJSON();
    expect(findSongDetail(tree, 'songDuration', '11:32')).toBeTruthy()
})