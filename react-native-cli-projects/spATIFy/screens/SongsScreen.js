import React, {useEffect, useState} from "react";
import DUMMYDATA from "../mockdata/dummy-data";
import SongListTile from "../components/SongListTile";
import { View, FlatList, TextInput } from "react-native";
import { StyleSheet } from "react-native";

function returnSong(itemData) {
    return <SongListTile song={itemData.item}/>
}

function SongsScreen ({navigation}) {
    const [filteredData, setFilteredData] = useState([])
    const [masterData, setMasterData] = useState([])
    const [search, setSearch] = useState('')

    useEffect(() => {
        fetchData()
        return () => {}
    }, [])
    
    const fetchData = () => {
        setFilteredData(DUMMYDATA.SONGS)
        setMasterData(DUMMYDATA.SONGS)
    }

    const searchFilter = (text) => {
        if(text) {
            const newData = masterData.filter((song) => {
                const songData = song.name? song.name.toUpperCase():''.toUpperCase()
                const textData = text.toUpperCase
                return itemData.indexOf(textData)>-1
            })
            setFilteredData(newData)
            setSearch(text)
        } else {
            setFilteredData(masterData)
            setSearch(text)
        }
    }
    return <View>
        <TextInput
            style = {styles.textInputStyle}
            value = {search}
            placeholder = "Search"
            underlineColorAndroid="transparent"
            onChangeText = {(text)=>searchFilter(text)}/>
        <FlatList
            data={DUMMYDATA.SONGS}
            keyExtractor={(item) => item.id}
            renderItem={returnSong}
        />
        </View>
}

const styles = StyleSheet.create({
    textInputStyle: {
        height: 50,
        borderWidth: 1,
        margin: 5,
        borderColor: '#009688',
        backgroundColor: 'white'
    },
    songsScreen: {
        marginTop: 16,
        padding: 16,
        width: '100%'
    }
})

export default SongsScreen