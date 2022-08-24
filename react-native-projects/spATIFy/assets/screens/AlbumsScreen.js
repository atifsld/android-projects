import DUMMYDATA from "../mockdata/dummy-data";
import AlbumGridTile from "../components/AlbumGridTile";
import { View, FlatList } from "react-native";
import { StyleSheet } from "react-native";


function AlbumsScreen ({navigation}) {

    function returnAlbum(itemData) {
        function onPress() {
            navigation.navigate('AlbumDetailScreen')
        }
    
        return (
            <AlbumGridTile 
            album={itemData.item} onPress={onPress}/>
        )
    }

    return <View>
        <FlatList
            data={DUMMYDATA.ALBUMS}
            keyExtractor={(item) => item.id}
            renderItem={returnAlbum.bind()}
            numColumns = {2}
        />
        </View>
}

const styles = StyleSheet.create({
    albumsScreen: {
        padding: 16,
        width: '100%'
    }
})

export default AlbumsScreen