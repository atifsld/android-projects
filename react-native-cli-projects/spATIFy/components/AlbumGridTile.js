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
                    <Text numberOfLines={1} style={styles.albumNameView}>{album.albumName}</Text>
                    <Text numberOfLines={1} style={styles.albumArtistsView}>{album.albumArtists}</Text>
                    <Text numberOfLines={1} style={styles.albumYearView}>{album.albumYear}</Text>
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
        height: 270,
        width: 180,
        backgroundColor: "#03DAC6",
        elevation: 8,
        borderRadius: 8,
        shadowColor: 'black',
        shadowOpacity: 0.25,
        shadowOffset: {width: 0, height: 2},
        shadowRadius: 8
    },
    albumArt: {
        height: 170,
        width: 170,
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
    albumNameView: {
        paddingHorizontal: 5,
        width: 150,
        fontSize: 20,
        fontWeight: 'bold',
        numberOfLines: 1,
        ellipsizeMode: 'tail'
    },
    albumArtistsView: {
        paddingHorizontal: 5,
        width: 150,
        fontSize: 16,
        fontWeight: 'bold'
    },
    albumYearView: {
        paddingHorizontal: 5,
        width: 150,
        fontSize: 16,
        numberOfLines: 1,
        ellipsizeMode: 'tail'
    }
})

export default AlbumGridTile;