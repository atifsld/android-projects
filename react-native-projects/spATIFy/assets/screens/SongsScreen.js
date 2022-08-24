import SONGS from "../mockdata/dummy-data";
import SongListTile from "../components/SongListTile";
import { View, FlatList, Text } from "react-native";
import { StyleSheet } from "react-native";

function returnSong(itemData) {
    console.log("itemData: ", itemData.item)
    return <SongListTile song={itemData.item}/>
}

function SongsScreen () {
    return <View>
        <FlatList
            data={SONGS}
            keyExtractor={(item) => item.id}
            renderItem={returnSong}
        />
        </View>
}

const styles = StyleSheet.create({
    songsScreen: {
        padding: 16,
        width: '100%'
    }
})

export default SongsScreen