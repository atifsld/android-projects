import { StatusBar } from 'expo-status-bar';
import { useState } from 'react';
import { StyleSheet, TextInput, Text, View, Button, FlatList } from 'react-native';

export default function App() {
  const [enteredTodo, setEnteredTodo] = useState('')
  const [todos, setTodos] = useState([])

  function todoInputHandler(enteredText) {
    console.log("Input: ", enteredText)
    setEnteredTodo(enteredText)
  }

  function addTodoHandler() {
    console.log("New todo: ", enteredTodo)
    setTodos(todos => [
      ...todos,
      {text: enteredTodo, key: Math.random().toString}
    ])
  }

  return (
    <View style={styles.container}>
      <View style={styles.inputSection}>
        <TextInput
          style={styles.inputText}
          placeholder="Your task to do!"
          onChangeText={todoInputHandler} />
        <Button
          style={styles.inputButton}
          title='Add'
          onPress={addTodoHandler} />
      </View>
      <View style={styles.todoSection}>
        <FlatList
          data={courseGoals}
          renderItem={(itemData) => {
            return (
              <View>
                <Text style={styles.todoItem}>{itemData.item.text}.</Text>
              </View>
            )
          }}
          />
        {/* <ScrollView>
        {todos.map((todo) => <View><Text style={styles.todoItem} key={todo}>{todo}</Text></View>)}
        </ScrollView> */}
      </View>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  inputSection: {
    paddingTop: 64,
    flexDirection: 'row',
    flex: 1,
    paddingBottom: 30,
    borderBottomColor: '#ccc',
    borderBottomWidth: 2
  },
  todoSection: {
    flex: 10
  },
  inputText: {
    width: '70%'
  },
  inputButton: {
    justifyContent: 'center',
    alignItems: 'center'
  },
  todoItem: {
    margin: 8,
    padding: 8,
    borderRadius: 6,
    backgroundColor: '#5E08CC',
    color: 'white'
  }
});
