import DUMMYDATA from "../../mockdata/dummy-data";

export const ADD_TO_FAVORITES = "ADD_TO_FAVORITES"
export const REMOVE_FROM_FAVORITES = "REMOVE_FROM_FAVORITES"
export const GET_SONGS = "GET_SONGS"
export const GET_ALBUMS = "GET_ALBUMS"
export const GET_ALBUMCREDITS = "GET_ALBUMCREDITS"

export const getSongs = () => {
    return {
        type: GET_SONGS,
        payload: DUMMYDATA.SONGS
    }
}

export const getAlbums = () => {
    return {
        type: GET_ALBUMS,
        payload: DUMMYDATA.ALBUMS
    }
}

export const getAlbumCredits = () => {
    return {
        type: GET_ALBUMCREDITS,
        payload: DUMMYDATA.ALBUMCREDITS
    }
}

export const addFavorite = song => dispatch => {
    dispatch({
        type: ADD_TO_FAVORITES,
        payload: song
    })
}

export const removeFavorite = song => dispatch => {
    dispatch({
        type: REMOVE_FROM_FAVORITES,
        payload: song
    })
}