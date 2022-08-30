import React from 'react';
import { useState } from 'react';
import {
  Pressable,
  SafeAreaView,
  ScrollView,
  StatusBar,
  StyleSheet,
  Text,
  Button,
  useColorScheme,
  View,
} from 'react-native';

import AsyncStorage from '@react-native-async-storage/async-storage';

import {
  Colors,
  DebugInstructions,
  Header,
  LearnMoreLinks,
  ReloadInstructions,
} from 'react-native/Libraries/NewAppScreen';

const storeData = async (key, value) => {
  try {
    const man = {
      nose: 1,
      tail: {big: "3", small: 4},
      cows: []
    }
    // await AsyncStorage.setItem(key, JSON.stringify(man).toString())
    await AsyncStorage.setItem(key, value)
    console.log("setItem() executed")
  } catch (e) {
    console.log("error in saving")
  }
  console.log("storeData finished execution")
}

const getData = async (key) => {
  try {
    const value = await AsyncStorage.getItem(key)
    if(value !== null) {
      console.log("Value is ", value)
    }
  } catch(e) {
      console.log("error in getting data")
  }
  console.log("getData finished execution")
}

function onPressSave() {
  storeData("name", "atif")
}

function onPressLog() {
  getData("name")
}

const App = () => {
  const [text, setText] = useState('')
  return (
    <Pressable>
      <Button
        title='Save' onPress = {onPressSave}>
        </Button>
        <Button
        title='Log!' onPress = {onPressLog}>
        </Button>
    </Pressable>
  );
};

const styles = StyleSheet.create({
  sectionContainer: {
    marginTop: 32,
    paddingHorizontal: 24,
  },
  sectionTitle: {
    fontSize: 24,
    fontWeight: '600',
  },
  sectionDescription: {
    marginTop: 8,
    fontSize: 18,
    fontWeight: '400',
  },
  highlight: {
    fontWeight: '700',
  },
});

export default App;
