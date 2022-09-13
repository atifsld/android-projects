import React, { useEffect } from "react"
import { Text, View, StyleSheet, FlatList } from "react-native"
import SongListTile from "../components/SongListTile";
import { getSongs, removeFavorite } from "../store/redux/actions";
import { useSelector, useDispatch } from "react-redux"

function FavoritesScreen () {
    const NO_FAVORITES_MESSAGE = "Oops, you don't seem to have any favorites. Add songs to your favorites to view them here."
    function returnSong(itemData) {
        return <SongListTile 
            song={itemData.item}
            isFavorite={ifInFavorites(itemData.item)}
            onFavoriteClick={ () => handleRemoveFavorite(itemData.item) }/>
    }

    const dispatch = useDispatch()
    const favorites = useSelector(state => state.favoriteSongs)
    const removeFromFavorites = song => dispatch(removeFavorite(song))
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
    
    return (
        <View style={styles.favoritesScreen}>
            {favorites.length > 0 &&
                <FlatList
                    data={favorites}
                    keyExtractor={(item) => item.id}
                    renderItem={returnSong}
                />
            }  
            {favorites.length <= 0 &&
                <View style={styles.noFavoritesView}>
                    <Text style={styles.noFavoritesText}>{NO_FAVORITES_MESSAGE}</Text>
                </View>
            }     
        </View>
    )
}

const styles = StyleSheet.create({
    favoritesScreen: {
        marginVertical: 16,
        paddingHorizontal: 8,
        width: '100%',
        flex: 1
    },
    noFavoritesView: {
        height: 100,
        flex: 1,
        paddingTop:'33%',
        paddingHorizontal: '5%'
    },
    noFavoritesText: {
        color: '#000',
        fontWeight: '500',
        textAlign: 'center'
    }
})

export default FavoritesScreen