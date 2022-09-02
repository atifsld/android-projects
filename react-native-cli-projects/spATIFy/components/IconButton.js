import { Pressable } from "react-native";
import React from "react";
import Ionicons from 'react-native-vector-icons/Ionicons';

function IconButton ({onPress, name, size, color}) {
    return <Pressable onPress={onPress}>
        <Ionicons name={name} size={size} color={color}/>
    </Pressable>
}

export default IconButton