import {Text, View, Image, StyleSheet} from "react-native"
import React from "react"

import Ionicons from 'react-native-vector-icons/Ionicons'


function AboutUsScreeen() {
    const DESCRIPTION_TEXT = "Spatify was created to be a catalogue of the world's best music - every album listed is curated by celebrated musicologists and reviewers and is updated on a weekly basis."

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
                    <Ionicons name="mail" size={24} color="white" />
                    <Text style={styles.emailText}>atif.mohd.sld@gmail.com</Text>
                </View>
                <View style={styles.phoneView}>
                    <Ionicons name="phone-portrait-outline" size={24} color="white" />
                    <Text style={styles.phoneText}>+91 73560 15305</Text>
                </View>
                <View style={styles.githubView}>
                    <Ionicons name="logo-github" size={24} color="white" />
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
        padding: 32,
        justifyContent: 'space-between',
        backgroundColor: '#03c7b4'
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
        color: "white"
    },
    contactDetailsView: {

    },
    titleView: {
        paddingBottom: 12
    },
    titleText: {
        color: "white",
        fontSize: 20
    },
    emailView: {
        flexDirection: 'row',
        paddingVertical: 4
    },
    emailText: {
        color: "white"
        
    },
    phoneView: {
        flexDirection: 'row',
        paddingVertical: 4
    },
    phoneText: {
        color: "white"
        
    },
    githubView: {
        flexDirection: 'row',
        paddingVertical: 4
    },
    githubText: {
        color: "white"
        
    },
    versionView: {
        justifyContent: 'center'
    },
    versionText: {
        color: "white"
    }
})

export default AboutUsScreeen