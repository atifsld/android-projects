import React, { useEffect } from "react";
import DUMMYDATA from "../mockdata/dummy-data";
import SongListTile from "../components/SongListTile";
import { View, FlatList } from "react-native";
import { StyleSheet } from "react-native";
import { getSongs, addFavorite, removeFavorite } from "../store/redux/actions";
import { useSelector, useDispatch } from "react-redux"

function SongsScreen () {
    function returnSong(itemData) {
        return <SongListTile 
            song={itemData.item}
            isFavorite={ifInFavorites(itemData.item)}
            onFavoriteClick={() => 
                ifInFavorites(itemData.item) ? handleRemoveFavorite(itemData.item) : handleAddFavorite(itemData.item)
            }/>
    }
    
    const dispatch = useDispatch()
    const songs = useSelector(state => state.songs)
    const favorites = useSelector(state => state.favoriteSongs)
    
    const addToFavorites = song => dispatch(addFavorite(song))
    const removeFromFavorites = song => dispatch(removeFavorite(song))
    
    const handleAddFavorite = song => {
        addToFavorites(song)
        console.log("Added " , song.songName, " to favorites.")
    }
    
    const handleRemoveFavorite = song => {
        removeFromFavorites(song)
        console.log("Removed ", song.songName, " from favorites.")
    }
    
    const ifInFavorites = song => {
        return (favorites.filter(item => item.id === song.id).length > 0)
    }
    
    useEffect(() => {
        dispatch(getSongs())
    }, [])
    
    return <View>
        <FlatList
            data={songs}
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