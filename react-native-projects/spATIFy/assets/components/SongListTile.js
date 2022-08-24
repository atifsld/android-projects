import react from "react";
import { View, Image, Text } from "react-native";
import { StyleSheet } from "react-native";

function SongListTile(song) {
    function logContents(song) {
        console.log("Tile receives:", song.song)
        console.log("song.songName:", song.song.songName)
    }
    return (
        <View style={styles.songCardView}>
            <View style={styles.songImageView}>
                <Image style = {styles.albumArt}
                    source={{uri: song.song.songAlbumArtUrl}}
                />
             </View>
             <View style={styles.songTextView}>
                <Text style={styles.songNameView}>{song.song.songName}</Text>
                <Text style={styles.songArtistsView}>{song.song.songArtists}</Text>
                <Text style={styles.songDurationView}>{song.song.songDuration}</Text>
             </View>
        </View>
    )
}

const styles = StyleSheet.create({
    songCardView: {
        flex: 1,
        flexDirection: 'row',
        margin: 12,
        height: 100,
        backgroundColor: "#03DAC6",
        elevation: 8,
        borderRadius: 8
    },
    albumArt: {
        height: 90,
        width: 90,
        borderRadius: 6
    },
    songImageView: {
        padding: 8,
        elevation: 12
    },
    songTextView: {
        padding: 8
    },
    songNameView: {
        fontSize: 20,
        fontWeight: 'bold'
    },
    songArtistsView: {
        fontSize: 16,
        fontWeight: 'bold'
    },
    songDurationView: {
        fontSize: 16
    }

})

export default SongListTile;