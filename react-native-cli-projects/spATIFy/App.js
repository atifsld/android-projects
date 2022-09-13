import 'react-native-gesture-handler';
import { StatusBar } from 'react-native';
import React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';
import { createDrawerNavigator } from '@react-navigation/drawer';
import SongsScreen from './screens/SongsScreen';
import AlbumsScreen from './screens/AlbumsScreen';
import AlbumDetailScreen from './screens/AlbumDetailScreen';
import FavoritesScreen from './screens/FavoritesScreen';
import AboutUsScreeen from './screens/AboutUsScreen';
import Ionicons from 'react-native-vector-icons/Ionicons'
import {Provider} from 'react-redux'
import {store, persistor} from './store/redux/store';
import { PersistGate } from 'redux-persist/integration/react'

const Stack = createNativeStackNavigator();
const Drawer = createDrawerNavigator();

function DrawerNavigator () {
  return <Drawer.Navigator
    screenOptions={{
    headerStyle: {backgroundColor: '#6200EE'},
    headerTintColor: 'white'
  }}>
    <Drawer.Screen 
      name="AlbumsScreen" 
      component={AlbumsScreen} 
      options={{
        title:  'Albums',
        drawerIcon:({color, size}) => (
          <Ionicons name="albums" color={color} size={size} />
        )
      }}
    />
    <Drawer.Screen 
      name="SongsScreen" 
      component={SongsScreen} 
      options={{
        title:  'Songs',
        drawerIcon:({color, size}) => (
          <Ionicons name="list" color={color} size={size} />
        )
      }}
    />
    <Drawer.Screen 
      name="FavoritesScreen" 
      component={FavoritesScreen} 
      options={{
        title:  'Favorites',
        drawerIcon:({color, size}) => (
          <Ionicons name="star" color={color} size={size} />
        )
      }}
    />
    <Drawer.Screen 
      name="AboutUsScreen" 
      component={AboutUsScreeen} 
      options={{
        title:  'About Us',
        drawerIcon:({color, size}) => (
          <Ionicons name="md-information-circle" color={color} size={size} />
        )
      }}
    />
  </Drawer.Navigator>
}

export default function App() {
  return (
    <Provider store={store}>
      <PersistGate loading={null} persistor={persistor}>
        <StatusBar 
          backgroundColor="#6200EE"
          barStyle={"light-content"}/>
        <NavigationContainer>
          <Stack.Navigator
            screenOptions={{
              headerStyle: {backgroundColor: '#6200EE'},
              headerTintColor: 'white'
            }}
          >
            <Stack.Screen 
              name="DrawerNavigator" 
              component={DrawerNavigator} 
              options={{
                headerShown: false
              }}
            />
            <Stack.Screen 
              name="AlbumDetailScreen" 
              component={AlbumDetailScreen} />
          </Stack.Navigator>
        </NavigationContainer>
      </PersistGate>
    </Provider>
  );
}