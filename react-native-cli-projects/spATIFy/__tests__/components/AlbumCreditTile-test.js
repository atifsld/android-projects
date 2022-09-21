import 'react-native'
import React from 'react'
import renderer from 'react-test-renderer'
import AlbumCreditTile from '../../components/AlbumCreditTile'

const sampleAlbumCredit = {
    "id": "bc288071-4c1a-41ed-9a60-570804da7402",
    "creditAlbumId": "5583e514-cf7b-4214-8397-dfd7e10dfb33",
    "creditName": "Acy R. Lehman",
    "creditContribution": "Design [Cover]",
    "creditImageUrl": "https://i.discogs.com/PkmqjHCGbJZSl6SEgXoi6W1yRGhdEbf9K9Gnugw64hE/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTUwNDY5/OC0xMzE4NzYxOTM0/LmpwZWc.jpeg"
}

test('test album credit tile', () => {
    const tree = renderer.create(<AlbumCreditTile albumCredit={sampleAlbumCredit} />).toJSON();
    expect(tree).toMatchSnapshot();
})