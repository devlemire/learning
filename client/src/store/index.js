import { configureStore } from '@reduxjs/toolkit'

//Reducers
import auth from './auth'

const store = configureStore({ reducer: { auth }})

export default store;