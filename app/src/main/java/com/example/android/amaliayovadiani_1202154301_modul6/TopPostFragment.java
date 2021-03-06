package com.example.android.amaliayovadiani_1202154301_modul6;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class TopPostFragment extends PostListFragment {
    public TopPostFragment() {}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        // [START my_top_posts_query]
        // My top posts by number of stars
        String myUserId = getUid();
        Query myTopPostsQuery = databaseReference.child("user-posts").child(myUserId)
                .orderByChild("starCount");
        // [END my_top_posts_query]
        return myTopPostsQuery;
    }
}

