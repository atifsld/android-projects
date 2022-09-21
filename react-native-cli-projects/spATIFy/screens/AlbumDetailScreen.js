import { View, ScrollView, Text, Image, StyleSheet, FlatList, Pressable, Linking, Share, Alert } from "react-native";
import SongListTile from "../components/SongListTile";
import AlbumCreditTile from "../components/AlbumCreditTile";
import IconButton from "../components/IconButton";
import React, { useEffect, useCallback, useLayoutEffect, useState } from "react";
import FontAwesome from 'react-native-vector-icons/FontAwesome'
import MaterialIcons from 'react-native-vector-icons/MaterialIcons'
import { addFavorite, removeFavorite } from "../store/redux/actions";
import { useSelector, useDispatch } from "react-redux"

function AlbumDetailScreen({ route, navigation }) {
    const album = route.params.album;
    const [link, setLink] = useState('')
    const dispatch = useDispatch()
    const songs = useSelector(state => state.songs)
    const albumCredits = useSelector(state => state.albumCredits)
    const favorites = useSelector(state => state.favoriteSongs)

    const removeFromFavorites = song => dispatch(removeFavorite(song))

    const handleRemoveFavorite = song => {
        removeFromFavorites(song)
        console.log("Removed ", song.songName, " from favorites.")
    }
    
    const addToFavorites = song => dispatch(addFavorite(song))
    
    const handleAddFavorite = song => {
        addToFavorites(song)
        console.log("Added " , song.songName, " to favorites.")
    }
    
    const ifInFavorites = song => {
        return (favorites.filter(item => item.id === song.id).length > 0)
    }
    
    const albumShare = async() => {
        try {
            const result = await Share.share({
                message: "Check out the weekly recommendation " + album.albumName + " by " + album.albumArtists +  " on spATIFy!"
            })
            if(result.action === Share.sharedAction) {
                if(result.activityType) {
                    console.log("albumShare(): Shared with an activity")
                } else {
                    console.log("albumShare(): Shared successfully")
                }
            } else if (result.action === Share.dismissedAction) {
                console.log("albumShare(): Share dismissed")
            }
        } catch(error) {
            alert(error.message)
        }
    }

    function onPress() {
        albumShare()
    }

    useEffect(() => {
        handlePress()
      }, [link]
    );
    
    useLayoutEffect(() => {
        navigation.setOptions({
            title: album.albumName,
            headerRight: () => {
                return <IconButton 
                    onPress={onPress}
                    name={"share-social"}
                    size={24}
                    color={"white"}
                />
            }
        })
    }, [album, navigation, onPress])

    function renderAlbumCredit(itemData) {
        return <AlbumCreditTile albumCredit={itemData.item}/>
    }

    function returnSong(song) {
        return <SongListTile 
            key={song.id} 
            song={song}
            isFavorite={ifInFavorites(song)}
            onFavoriteClick={() =>
                ifInFavorites(song) ? handleRemoveFavorite(song) : handleAddFavorite(song)
            }  />
    }

    function getSongsInAlbum(albumId) {
        return songs.filter((song) => song.songAlbumId === albumId)
    }

    const handlePress = useCallback(async () => {
        if(link==='')
            return
        const supported = await Linking.canOpenURL(link);
        if (supported) {
          await Linking.openURL(link);
        } else {
          Alert.alert(`Don't know how to open this URL: ${link}`);
        }
        setLink('')
      }, [link]);

    return (
        <ScrollView>
            <View style={styles.container}>
                <View style={styles.albumHeader}>
                    <View style={styles.albumHeaderImageView}>
                        <Image style = {styles.albumArt}
                            source={{uri: album.albumArtUrl}}/>
                    </View>
                    <View style={styles.albumHeaderTextView}>
                        <Text numberOfLines={1} style={styles.albumNameText}>{album.albumName}</Text>
                        <Text numberOfLines={1} style={styles.albumArtistsText}>{album.albumArtists}</Text>
                        <Text numberOfLines={1} style={styles.albumYearText}>{album.albumYear}</Text>
                    </View>
                </View>
                <View style={styles.linksView}>
                    {album.albumWikipediaUrl !== null && 
                        <Pressable 
                            disable={album.albumWikipediaUrl === null}
                            style={styles.linkPressable} 
                            onPress={() => setLink(album.albumWikipediaUrl)}>
                            <FontAwesome name="wikipedia-w" size={30} color="black"/>
                        </Pressable>
                    }
                    {album.albumSpotifyUrl !== null && 
                        <Pressable 
                            disable={album.albumSpotifyUrl === null}
                            style={styles.linkPressable} 
                            onPress={() => setLink(album.albumSpotifyUrl)}>
                            <FontAwesome name="spotify" size={30} color="black"/>
                        </Pressable>
                    }
                    {album.albumGeniusUrl !== null && 
                        <Pressable 
                            disable={album.albumGeniusUrl === null}
                            style={styles.linkPressable} 
                            onPress={() => setLink(album.albumGeniusUrl)}>
                            <MaterialIcons name="queue-music" size={30} color="black"/>
                        </Pressable>
                    }
                
                </View>
                <View>    
                    <Text style={styles.descriptionTitleText}>Description</Text>
                    <Text style={styles.descriptionText}>{album.albumDescription}</Text>
                </View>
                <Text style={styles.tracklistText}>Tracklist</Text>
                <View style={styles.albumTracklistView}>
                    {getSongsInAlbum(album.id).map((song) => returnSong(song))}
                </View>
                <View style={styles.albumCreditsView}>
                    <Text style={styles.albumCreditsText}>Credits</Text>
                </View>
                <FlatList
                    horizontal={true}
                    data={albumCredits}
                    keyExtractor={(albumCredit) => albumCredit.id}
                    renderItem = {renderAlbumCredit} />
                <View style={styles.albumLabelView}>
                    <Text style={styles.albumLabelText}>{album.albumYear} {album.albumLabel}</Text>
                </View>
            </View>
        </ScrollView>
    )
}

const styles = StyleSheet.create({
    container: {
        justifyContent: 'center',
        flex: 1,
        margin: 8
    },
    albumHeader: {
        flexDirection: 'row',
        paddingVertical: 8,
        paddingBottom: 16,
        paddingHorizontal: 8
    },
    albumHeaderImageView: {

    },
    albumHeaderTextView: {
        padding: 16
    },
    albumArt: {
        height: 128,
        width: 128
    },
    albumNameText: {
        width: 220,
        fontSize: 24,
        color: 'black',
        fontWeight: 'bold',
        numberOfLines: 1,
        ellipsizeMode: 'tail'
    },
    albumArtistsText: {
        width: 220,
        fontSize: 22,
        color: 'black',
        fontWeight: 'bold',
        numberOfLines: 1,
        ellipsizeMode: 'tail'
    },
    albumYearText: {
        width: 220,
        fontSize: 20,
        color: 'black',
        numberOfLines: 1,
        ellipsizeMode: 'tail'
    },
    linksView: {
        borderTopColor: "#ccc",
        borderTopWidth: 1,
        paddingVertical: 16,
        flexDirection: 'row',
        justifyContent: 'space-evenly'
    },
    linkPressable: {

    },
    descriptionTitleText: {
        borderTopColor: '#ccc',
        borderTopWidth: 1,
        paddingTop: 8,
        paddingBottom: 8,
        fontSize: 24,
        color: 'black',
        fontWeight: 'bold',
        paddingHorizontal: 8
    },
    descriptionText: {
        fontSize: 14,
        color: 'black',
        fontWeight: '500',
        paddingVertical: 8,
        paddingHorizontal: 8
    },
    albumTracklistView: {
        paddingVertical: 8
    },
    tracklistText: {
        borderTopColor: '#ccc',
        borderTopWidth: 1,
        paddingTop: 8,
        paddingBottom: 8,
        fontSize: 24,
        color: 'black',
        fontWeight: 'bold',
        paddingHorizontal: 8
    },
    albumCreditsView: {
        paddingHorizontal: 8
    },
    albumCreditsText: {
        borderTopColor: '#ccc',
        borderTopWidth: 1,
        paddingTop: 16,
        paddingBottom: 8,
        fontSize: 24,
        color: 'black',
        fontWeight: 'bold'
    },
    albumLabelText: {
        color: 'black',
        paddingTop: 8,
        paddingBottom: 8,
        fontSize: 18,
        fontWeight: 'bold',
        paddingHorizontal: 8
    }
})


export default AlbumDetailScreen;
