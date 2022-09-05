import DUMMYDATA from "../mockdata/dummy-data";
import AlbumGridTile from "../components/AlbumGridTile";
import { View, FlatList } from "react-native";
import { StyleSheet } from "react-native";
import React from "react";
import { getAlbumCredits, getAlbums } from "../store/redux/actions";
import { useSelector, useDispatch } from "react-redux"
import { useEffect } from "react";

function AlbumsScreen ({navigation}) {

    const dispatch = useDispatch()
    const albums = useSelector(state => state.albums)
    const albumCredits = useSelector(state => state.albumCredits)

    useEffect(() => {
        dispatch(getAlbums())
    }, [])

    useEffect(() => {
        dispatch(getAlbumCredits())
    }, [])

    function getCreditsInAlbum(albumId) {
        return albumCredits.filter((albumCredit) => albumCredit.creditAlbumId === albumId)
    }

    function returnAlbum(itemData) {
        function onPress() {
            navigation.navigate('AlbumDetailScreen', {
                album: itemData.item,
                albumCredits: getCreditsInAlbum(itemData.item.id)
            })
        }
    
        return (
            <AlbumGridTile 
                album={itemData.item}
                onPress={onPress}
            />
        )
    }

    return <View style={styles.albumsScreen}>
        <FlatList
            data={albums}
            keyExtractor={(item) => item.id}
            renderItem={returnAlbum}
            numColumns = {2}
        />
        </View>
}

const styles = StyleSheet.create({
    albumsScreen: {
        marginVertical: 16,
        paddingHorizontal: 8,
        width: '100%'
    }
})

export default AlbumsScreen