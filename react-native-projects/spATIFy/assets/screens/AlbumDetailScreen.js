import DUMMYDATA from "../mockdata/dummy-data";
import { View, ScrollView, Text, Image, StyleSheet, FlatList } from "react-native";
import SongListTile from "../components/SongListTile";
import AlbumCreditTile from "../components/AlbumCreditTile";

function AlbumDetailScreen({ route }) {
    const album = route.params.album;

    function renderAlbumCredit(itemData) {
        return <AlbumCreditTile albumCredit={itemData.item}/>
    }

    function returnSong(song) {
        return <SongListTile key={song.id} song={song}/>
    }

    function getSongsInAlbum(albumId) {
        return DUMMYDATA.SONGS.filter((song) => song.songAlbumId === albumId)
    }

    function getCreditsInAlbum(albumId) {
        return DUMMYDATA.ALBUMCREDITS.filter((albumCredit) => albumCredit.creditAlbumId === albumId)
    }

    return (
        <ScrollView>
            <View style={styles.container}>
                <View style={styles.albumHeader}>
                    <View style={styles.albumHeaderImageView}>
                        <Image style = {styles.albumArt}
                            source={{uri: album.albumArtUrl}}/>
                    </View>
                    <View style={styles.albumHeaderText}>
                        <Text style={styles.albumNameText}>{album.albumName}</Text>
                        <Text style={styles.albumArtistsText}>{album.albumArtists}</Text>
                        <Text style={styles.albumYearText}>{album.albumYear}</Text>
                    </View>
                </View>
                <View>    
                    <Text style={styles.descriptionTitleText}>Description</Text>
                    <Text style={styles.descriptionText}>{album.albumDescription}</Text>
                </View>
                <Text style={styles.tracklistText}>Tracklist</Text>
                <View>
                    {getSongsInAlbum(album.id).map((song) => returnSong(song))}
                </View>
                <View style={styles.albumCreditsView}>
                    <Text style={styles.albumCreditsText}>Credits</Text>
                </View>
                <FlatList
                    horizontal={true}
                    data={getCreditsInAlbum(album.id)}
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
        margin: 8,
        padding: 8
    },
    albumHeader: {
        flexDirection: 'row'
    },
    albumHeaderImageView: {

    },
    albumHeaderText: {
        padding: 16
    },
    albumArt: {
        height: 128,
        width: 128
    },
    albumNameText: {
        fontSize: 24,
        fontWeight: 'bold'
    },
    albumArtistsText: {
        fontSize: 22,
        fontWeight: 'bold'
    },
    albumYearText: {
        fontSize: 20
    },
    descriptionTitleText: {
        paddingTop: 16,
        paddingBottom: 8,
        fontSize: 24,
        fontWeight: 'bold'
    },
    descriptionText: {
        fontSize: 14
    },
    tracklistText: {
        paddingTop: 16,
        paddingBottom: 8,
        fontSize: 24,
        fontWeight: 'bold'
    },
    albumCreditsView: {

    },
    albumCreditsText: {
        paddingTop: 16,
        paddingBottom: 8,
        fontSize: 24,
        fontWeight: 'bold'
    },
    albumLabelText: {
        paddingTop: 16,
        paddingBottom: 8,
        fontSize: 18,
        fontWeight: 'bold'
    }
})


export default AlbumDetailScreen;
