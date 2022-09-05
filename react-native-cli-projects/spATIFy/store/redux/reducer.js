import { GET_SONGS, GET_ALBUMS, GET_ALBUMCREDITS, ADD_TO_FAVORITES, REMOVE_FROM_FAVORITES } from "./actions";

const initialState = {
    songs: [],
    albums: [],
    albumCredits: [],
    favoriteSongs: []
}

const spatifyReducer = (state = initialState, action) => {
    switch(action.type) {
        case GET_SONGS:
            return {...state, songs: action.payload}
        case GET_ALBUMS:
            return {...state, albums: action.payload}
        case GET_ALBUMCREDITS:
            return {...state, albumCredits: action.payload}
        case ADD_TO_FAVORITES:
            return { ...state, favoriteSongs: [...state.favoriteSongs, action.payload]}
        case REMOVE_FROM_FAVORITES:
            return { ...state, favoriteSongs: state.favoriteSongs.filter(song => song.id !== action.payload.id)}
        default:
            return state
    }
}

export default spatifyReducer