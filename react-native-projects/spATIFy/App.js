import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';
import react from 'react';
import SongsScreen from './assets/screens/SongsScreen';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';
import { createDrawerNavigator } from '@react-navigation/drawer';
import AlbumsScreen from './assets/screens/AlbumsScreen';
import AlbumDetailScreen from './assets/screens/AlbumDetailScreen';


const Stack = createNativeStackNavigator();
const Drawer = createDrawerNavigator();

function DrawerNavigator () {
  return <Drawer.Navigator>
      <Drawer.Screen 
        name="AlbumsScreen" 
        component={AlbumsScreen} 
        options={{
          title:  'Albums'
        }}
      />
      <Drawer.Screen 
          name="SongsScreen" 
          component={SongsScreen} 
          options={{
            title:  'Songs'
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
