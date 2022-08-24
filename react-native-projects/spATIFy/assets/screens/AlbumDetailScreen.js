import DUMMYDATA from "../mockdata/dummy-data";
import { View, Text } from "react-native";
import { StyleSheet } from "react-native";
import { FlatList } from "react-native";
import SongListTile from "../components/SongListTile";

function AlbumDetailScreen({ route }) {
    const album = route.params.album;

    function returnSong(itemData) {
        return <SongListTile song={itemData.item}/>
    }

    function getSongsInAlbum(albumId) {
        return DUMMYDATA.SONGS.filter((song) => song.songAlbumId === albumId)
    }

    return (
        <View style={styles.container}>
            <Text>Album ID: {album.id} </Text>
            <Text>Songs: </Text>
            <FlatList
                data={getSongsInAlbum(album.id)}
                keyExtractor={(song) => song.id}
                renderItem={returnSong}
            >
                
            </FlatList>
            {DUMMYDATA.SONGS
                .map((song) => {
                    <Text>song.songName</Text>
                })
            }
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        justifyContent: 'center',
        flex: 1,
        margin: 8,
        padding: 8
    }
})


export default AlbumDetailScreen;
