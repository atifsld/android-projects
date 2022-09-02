import React from "react";
import DUMMYDATA from "../mockdata/dummy-data";
import SongListTile from "../components/SongListTile";
import { View, FlatList } from "react-native";
import { StyleSheet } from "react-native";

function returnSong(itemData) {
    return <SongListTile song={itemData.item}/>
}

function SongsScreen () {
    return <View>
        <FlatList
            data={DUMMYDATA.SONGS}
            keyExtractor={(item) => item.id}
            renderItem={returnSong}
        />
        </View>
}

const styles = StyleSheet.create({
    songsScreen: {
        marginTop: 16,
        padding: 16,
        width: '100%'
    }
})

export default SongsScreen