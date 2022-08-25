import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';
import react from 'react';
import SongsScreen from './assets/screens/SongsScreen';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';
import AlbumsScreen from './assets/screens/AlbumsScreen';
import AlbumDetailScreen from './assets/screens/AlbumDetailScreen';

const Stack = createNativeStackNavigator();

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
          {/* <Stack.Screen name="SongsScreen" component={SongsScreen} options={{
              title:  'Songs',
            }}/> */}
          <Stack.Screen 
            name="AlbumsScreen" 
            component={AlbumsScreen} 
            options={{
              title:  'Albums',
            }}/>
          <Stack.Screen 
            name="AlbumDetailScreen" 
            component={AlbumDetailScreen} />
        </Stack.Navigator>
      </NavigationContainer>
    </>
  );
}
