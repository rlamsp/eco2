import { configureStore } from "@reduxjs/toolkit";
import { authSlice } from "./user/userSlice";
import { feedSlice } from "./mainFeed/feedSlice";
import { commentSlice } from "./mainFeed/commentSlice";

export const store = configureStore({
  reducer: {
    user: authSlice.reducer,
    feed: feedSlice.reducer,
    comment: commentSlice.reducer,
  },
});