// import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';
import React from 'react';
// import { NavigationContainer } from '@react-navigation/native';
// import { createNativeStackNavigator } from '@react-navigation/native-stack';
// import { createDrawerNavigator } from '@react-navigation/drawer';

import SongsScreen from './screens/SongsScreen';
import AlbumsScreen from './screens/AlbumsScreen';
import AlbumDetailScreen from './screens/AlbumDetailScreen';
import FavoritesScreen from './screens/FavoritesScreen';
import AboutUsScreeen from './screens/AboutUsScreen';
// import { Ionicons, MaterialIcons } from '@expo/vector-icons'

// const Stack = createNativeStackNavigator();
// const Drawer = createDrawerNavigator();

// function DrawerNavigator () {
//   return <Drawer.Navigator
//     screenOptions={{
//     headerStyle: {backgroundColor: '#6200EE'},
//     headerTintColor: 'white'
//   }}>
//     <Drawer.Screen 
//       name="AlbumsScreen" 
//       component={AlbumsScreen} 
//       options={{
//         title:  'Albums',
//         drawerIcon:({color, size}) => (
//           <Ionicons name="albums" color={color} size={size} />
//         )
//       }}
//     />
//     <Drawer.Screen 
//       name="SongsScreen" 
//       component={SongsScreen} 
//       options={{
//         title:  'Songs',
//         drawerIcon:({color, size}) => (
//           <Ionicons name="list" color={color} size={size} />
//         )
//       }}
//     />
//     <Drawer.Screen 
//       name="FavoritesScreen" 
//       component={FavoritesScreen} 
//       options={{
//         title:  'Favorites',
//         drawerIcon:({color, size}) => (
//           <MaterialIcons name="favorite" color={color} size={size} />
//         )
//       }}
//     />
//     <Drawer.Screen 
//       name="AboutUsScreen" 
//       component={AboutUsScreeen} 
//       options={{
//         title:  'About Us',
//         drawerIcon:({color, size}) => (
//           <MaterialIcons name="contact-support" color={color} size={size} />
//         )
//       }}
//     />
//   </Drawer.Navigator>
// }

export default function App() {
  return (
    <AlbumsScreen/>
    // <>
    //   <StatusBar style="light" />
    //   <NavigationContainer>
    //     <Stack.Navigator
    //       screenOptions={{
    //         headerStyle: {backgroundColor: '#6200EE'},
    //         headerTintColor: 'white'
    //       }}
    //     >
    //       <Stack.Screen 
    //         name="DrawerNavigator" 
    //         component={DrawerNavigator} 
    //         options={{
    //           headerShown: false
    //         }}
    //       />
    //       <Stack.Screen 
    //         name="AlbumDetailScreen" 
    //         component={AlbumDetailScreen} />
    //     </Stack.Navigator>
    //   </NavigationContainer>
    // </>
  );
}
