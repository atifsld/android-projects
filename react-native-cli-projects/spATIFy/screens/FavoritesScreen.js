import React from "react"
import { Text, View, StyleSheet, FlatList } from "react-native"
import SongListTile from "../components/SongListTile";
import { getSongs, removeFavorite } from "../store/redux/actions";
import { useSelector, useDispatch } from "react-redux"
import { useEffect } from "react";

function FavoritesScreen () {
    function returnSong(itemData) {
        return <SongListTile 
            song={itemData.item}
            isFavorite={ifInFavorites(itemData.item)}
            onFavoriteClick={ () => handleRemoveFavorite(itemData.item) }/>
    }

    const dispatch = useDispatch()
    const favorites = useSelector(state => state.favoriteSongs)
    
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
            data={favorites}
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

export default FavoritesScreen