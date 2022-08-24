import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';
import react from 'react';
import SongsScreen from './assets/screens/SongsScreen';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';
import AlbumsScreen from './assets/screens/AlbumsScreen';

const Stack = createNativeStackNavigator();

export default function App() {
  return (
    <>
      <StatusBar style="auto" />
      <NavigationContainer>
        <Stack.Navigator>
          {/* <Stack.Screen name="SongsScreen" component={SongsScreen} /> */}
          <Stack.Screen name="AlbumsScreen" component={AlbumsScreen} />
        </Stack.Navigator>
      </NavigationContainer>
    </>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
