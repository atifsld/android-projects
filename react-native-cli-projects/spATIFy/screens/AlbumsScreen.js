import DUMMYDATA from "../mockdata/dummy-data";
import AlbumGridTile from "../components/AlbumGridTile";
import { View, FlatList } from "react-native";
import { StyleSheet } from "react-native";
import React from "react";
function AlbumsScreen ({navigation}) {

    function returnAlbum(itemData) {
        function onPress() {
            navigation.navigate('AlbumDetailScreen', {
                album: itemData.item
            })
        }
    
        return (
            <AlbumGridTile 
            album={itemData.item} onPress={onPress}/>
        )
    }

    return <View style={styles.albumsScreen}>
        <FlatList
            data={DUMMYDATA.ALBUMS}
            keyExtractor={(item) => item.id}
            renderItem={returnAlbum}
            numColumns = {2}
        />
        </View>
}

const styles = StyleSheet.create({
    albumsScreen: {
        marginTop: 16,
        width: '100%'
    }
})

export default AlbumsScreen