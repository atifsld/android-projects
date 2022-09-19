import React from "react";
import { View, Image, Text, Pressable, StyleSheet } from "react-native";
import IconButton from "./IconButton";

function SongListTile({song, onFavoriteClick, isFavorite}) {

    return (
        <Pressable android_ripple={{color: '#ccc'}}>
            <View style={styles.songCardView}>
                <View style={styles.songImageView}>
                    <Image style = {styles.albumArt}
                        source={{uri: song.songAlbumArtUrl}}/>
                </View>
                <View style={styles.songTextView}>
                    <Text numberOfLines={1} style={styles.songNameText}>{song.songName}</Text>
                    <Text numberOfLines={1} style={styles.songArtistsText}>{song.songArtists}</Text>
                    <Text numberOfLines={1} style={styles.songDurationText}>{song.songDuration}</Text>
                </View>
                <View style={styles.favoriteButtonView}>
                    {isFavorite &&
                    <IconButton
                        name="star"
                        onPress={onFavoriteClick}
                        size={28}
                        color="white"
                        />
                    }
                    {(isFavorite === false) &&
                    <IconButton
                        name="star-outline"
                        onPress={onFavoriteClick}
                        size={28}
                        color="white"
                        />
                    }

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
        width: 200,
        padding: 8
    },
    songNameText: {
        width: '100%',
        ellipsizeMode: 'tail',
        fontSize: 19,
        color: 'black',
        fontWeight: 'bold'
    },
    songArtistsText: {
        width: '80%',
        numberOfLines: 1,
        ellipsizeMode: 'tail',
        fontSize: 16,
        color: 'black',
        fontWeight: 'bold'
    },
    songDurationText: {
        width: '80%',
        numberOfLines: 1,
        ellipsizeMode: 'tail',
        fontSize: 16,
        color: 'black'
    },
    favoriteButtonView: {
        alignSelf: 'center',
        paddingHorizontal: 20
    }
})

export default SongListTile;