import { configureStore } from "@reduxjs/toolkit"
import AsyncStorage from "@react-native-async-storage/async-storage"
import spatifyReducer from "./reducer"
import { persistStore, persistReducer } from 'redux-persist'

const persistConfig = {
    key: 'root',
    storage: AsyncStorage,
    whitelist: ['favoriteSongs']
}

const persistedReducer = persistReducer(persistConfig, spatifyReducer)

export const store = configureStore({
    reducer: persistedReducer,
    middleware: getDefaultMiddleware => 
        getDefaultMiddleware({
            serializableCheck: false
        })
})

export const persistor = persistStore(store)