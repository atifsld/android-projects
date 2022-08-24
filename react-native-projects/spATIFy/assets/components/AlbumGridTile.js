import react from "react";
import { View, Image, Text, Pressable } from "react-native";
import { StyleSheet } from "react-native";

function AlbumGridTile(album) {
    return (
        <Pressable android_ripple={{color: '#ccc'}}>
            <View style={styles.albumCardView}>
                <View style={styles.albumImageView}>
                    <Image style = {styles.albumArt}
                        source={{uri: album.album.albumArtUrl}}/>
                </View>
                <View style={styles.albumTextView}>
                    <Text numberOfLines={1} style={styles.albumNameView}>{album.album.albumName}</Text>
                    <Text numberOfLines={1} style={styles.albumArtistsView}>{album.album.albumArtists}</Text>
                    <Text numberOfLines={1} style={styles.albumYearView}>{album.album.albumYear}</Text>
                </View>
            </View>
        </Pressable>
    )
}

const styles = StyleSheet.create({
    albumCardView: {
        flex: 1,
        margin: 16,
        height: 250,
        width: 160,
        backgroundColor: "#64FFDA",
        elevation: 8,
        borderRadius: 8,
        shadowColor: 'black',
        shadowOpacity: 0.25,
        shadowOffset: {width: 0, height: 2},
        shadowRadius: 8
    },
    albumArt: {
        height: 150,
        width: 150,
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