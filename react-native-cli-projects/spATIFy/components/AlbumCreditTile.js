import React from "react";
import { View, Image, Text } from "react-native";
import { StyleSheet } from "react-native";

function AlbumCreditTile({albumCredit}) {
    return (
        <View style={styles.creditCardView}>
            <View style={styles.creditImageView}>
                <Image style = {styles.creditImage}
                    source={{uri: albumCredit.creditImageUrl}}/>
            </View>
            <View style={styles.creditTextView}>
                <Text numberOfLines={1} style={styles.creditNameText}>{albumCredit.creditName}</Text>
                <Text numberOfLines={1} style={styles.creditContributionText}>{albumCredit.creditContribution}</Text>
            </View>
        </View>
    )
}

const styles = StyleSheet.create({
    creditCardView: {
        flex: 1,
        margin: 8,
        height: 220,
        width: 150,
        backgroundColor: "#64FFDA",
        elevation: 8,
        borderRadius: 8,
        shadowColor: 'black',
        shadowOpacity: 0.25,
        shadowOffset: {width: 0, height: 2},
        shadowRadius: 8
    },
    creditImage: {
        height: 140,
        width: 140,
        borderRadius: 6
    },
    creditImageView: {
        padding: 5,
        elevation: 12,
        alignItems: 'center'
    },
    creditTextView: {
        padding: 8,
        height: 40
    },
    creditNameText: {
        fontSize: 20,
        color: 'black',
        fontWeight: 'bold'
    },
    creditContributionText: {
        fontSize: 16,
        color: 'black',
        fontWeight: 'bold'
    }

})

export default AlbumCreditTile;