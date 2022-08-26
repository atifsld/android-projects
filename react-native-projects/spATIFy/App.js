import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';
import react from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';
import { createDrawerNavigator } from '@react-navigation/drawer';

import SongsScreen from './assets/screens/SongsScreen';
import AlbumsScreen from './assets/screens/AlbumsScreen';
import AlbumDetailScreen from './assets/screens/AlbumDetailScreen';
import FavoritesScreen from './assets/screens/FavoritesScreen';
import { Ionicons, MaterialIcons } from '@expo/vector-icons'

const Stack = createNativeStackNavigator();
const Drawer = createDrawerNavigator();

function DrawerNavigator () {
  return <Drawer.Navigator>
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
          <MaterialIcons name="favorite" color={color} size={size} />
        )
      }}
    />
  </Drawer.Navigator>
}

export default function App() {
  return (
    <>
      <StatusBar style="light" />
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
    </>
  );
}
