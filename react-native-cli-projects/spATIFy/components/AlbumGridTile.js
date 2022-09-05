import React from "react";
import { View, Image, Text, Pressable } from "react-native";
import { StyleSheet } from "react-native";

function AlbumGridTile({album, onPress}) {
    return (
        <Pressable 
            android_ripple={{color: '#ccc'}}
            onPress={onPress}>
            <View style={styles.albumCardView}>
                <View style={styles.albumImageView}>
                    <Image style = {styles.albumArt}
                        source={{uri: album.albumArtUrl}}/>
                </View>
                <View style={styles.albumTextView}>
                    <Text numberOfLines={1} style={styles.albumNameText}>{album.albumName}</Text>
                    <Text numberOfLines={1} style={styles.albumArtistsText}>{album.albumArtists}</Text>
                    <Text numberOfLines={1} style={styles.albumYearText}>{album.albumYear}</Text>
                </View>
            </View>
        </Pressable>
    )
}

const styles = StyleSheet.create({
    albumCardView: {
        justifyContent: 'center',
        flex: 1,
        margin: 8,
        height: 260,
        width: 170,
        backgroundColor: "#03DAC6",
        elevation: 8,
        borderRadius: 8,
        shadowColor: 'black',
        shadowOpacity: 0.25,
        shadowOffset: {width: 0, height: 2},
        shadowRadius: 8
    },
    albumArt: {
        height: 160,
        width: 160,
        padding: 5,
        borderRadius: 6
    },
    albumImageView: {
        padding: 5,
        elevation: 12
    },
    albumTextView: {
        padding: 8
    },
    albumNameText: {
        paddingHorizontal: 5,
        width: 150,
        fontSize: 20,
        color: 'black',
        fontWeight: 'bold',
        numberOfLines: 1,
        ellipsizeMode: 'tail'
    },
    albumArtistsText: {
        paddingHorizontal: 5,
        width: 150,
        fontSize: 16,
        color: 'black',
        fontWeight: 'bold'
    },
    albumYearText: {
        paddingHorizontal: 5,
        width: 150,
        fontSize: 16,
        color: 'black',
        numberOfLines: 1,
        ellipsizeMode: 'tail'
    }
})

export default AlbumGridTile;