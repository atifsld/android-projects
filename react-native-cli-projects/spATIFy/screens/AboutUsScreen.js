import {Text, View, Image, StyleSheet} from "react-native"
import React from "react"

import Ionicons from 'react-native-vector-icons/Ionicons'


const TEXT_COLOR = "#0387b4"

function AboutUsScreeen() {
    const DESCRIPTION_TEXT = "Spatify was created to be a catalogue of the world's best music - every week, a selection of 4 albums is listed from celebrated music critiques and musicologists."
    
    return (
        <View style={styles.aboutUsView}>
            <View style={styles.iconView}>
                <Image
                    style = {styles.appIcon}
                    source={require("../images/logo.png")}
                />
            </View>
            <View style={styles.descriptionView}>
                <Text style={styles.descriptionText}>{DESCRIPTION_TEXT}</Text>
            </View>
            <View style={styles.contactDetailsView}>        
                <View style={styles.titleView}>
                    <Text style={styles.titleText}>Reach out to us!</Text>
                </View>
                <View style={styles.emailView}>
                    <Ionicons name="mail" size={24} color={TEXT_COLOR} />
                    <Text style={styles.emailText}>atif.mohd.sld@gmail.com</Text>
                </View>
                <View style={styles.phoneView}>
                    <Ionicons name="phone-portrait-outline" size={24} color={TEXT_COLOR} />
                    <Text style={styles.phoneText}>+91 73560 15305</Text>
                </View>
                <View style={styles.githubView}>
                    <Ionicons name="logo-github" size={24} color={TEXT_COLOR} />
                    <Text style={styles.githubText}>atifsld</Text>
                </View>
            </View>
            <View style={styles.versionView}>
                <Text style={styles.versionText}>Version 1.0</Text>
            </View>
        </View>
    )
}

const styles = StyleSheet.create({
    aboutUsView: {
        flex: 1,
        padding: 26,
        justifyContent: 'space-between',
        backgroundColor: 'white'
    },
    appIcon: {
        height: 128,
        width: 128,
        alignSelf: 'center',
        elevation: 4,
        shadowColor: '#02645b',
        shadowOpacity: 0.25,
        shadowOffset: {width: 0, height: 2},
        shadowRadius: 8
    },
    iconView: {
        paddingTop: 32
    },
    descriptionView: {
    },
    descriptionText: {
        fontSize: 20,
        color: TEXT_COLOR
    },
    contactDetailsView: {

    },
    titleView: {
        paddingBottom: 12
    },
    titleText: {
        color: "black",
        fontSize: 20
    },
    emailView: {
        flexDirection: 'row',
        paddingVertical: 4
    },
    emailText: {
        color: TEXT_COLOR,
        paddingLeft: 10        
    },
    phoneView: {
        flexDirection: 'row',
        paddingVertical: 4
    },
    phoneText: {
        color: TEXT_COLOR,
        paddingLeft: 10
    },
    githubView: {
        flexDirection: 'row',
        paddingVertical: 4
    },
    githubText: {
        color: TEXT_COLOR,
        paddingLeft: 10        
    },
    versionView: {
        justifyContent: 'center'
    },
    versionText: {
        color: "black"
    }
})

export default AboutUsScreeen