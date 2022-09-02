import React from "react";
import { View, Image, Text, Pressable } from "react-native";
import { StyleSheet } from "react-native";

function SongListTile(song) {
    return (
        <Pressable android_ripple={{color: '#ccc'}}>
            <View style={styles.songCardView}>
                <View style={styles.songImageView}>
                    <Image style = {styles.albumArt}
                        source={{uri: song.song.songAlbumArtUrl}}/>
                </View>
                <View style={styles.songTextView}>
                    <Text style={styles.songNameView}>{song.song.songName}</Text>
                    <Text style={styles.songArtistsView}>{song.song.songArtists}</Text>
                    <Text style={styles.songDurationView}>{song.song.songDuration}</Text>
                </View>
            </View>
        </Pressable>
    )
}

const styles = StyleSheet.create({
    songCardView: {
        flex: 1,
        flexDirection: 'row',
        margin: 8,
        height: 100,
        backgroundColor: "#03DAC6",
        elevation: 8,
        borderRadius: 8,
        shadowColor: 'black',
        shadowOpacity: 0.25,
        shadowOffset: {width: 0, height: 2},
        shadowRadius: 8
    },
    albumArt: {
        height: 90,
        width: 90,
        borderRadius: 6
    },
    songImageView: {
        padding: 5,
        elevation: 12
    },
    songTextView: {
        padding: 8
    },
    songNameView: {
        fontSize: 20,
        color: 'black',
        fontWeight: 'bold'
    },
    songArtistsView: {
        fontSize: 16,
        color: 'black',
        fontWeight: 'bold'
    },
    songDurationView: {
        fontSize: 16,
        color: 'black'
    }

})

export default SongListTile;