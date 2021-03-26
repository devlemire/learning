import { createAction, createReducer } from '@reduxjs/toolkit'
const storePrefix = "USER/"

const SET_USER = createAction(`${storePrefix}/SET_USER`)

const initialState = { user: undefined, userFetched: false }

const auth = createReducer(initialState, (builder) => {
  builder
    .addCase(SET_USER, (state, { payload }) => {
      state.user = payload
    })
})

export default auth