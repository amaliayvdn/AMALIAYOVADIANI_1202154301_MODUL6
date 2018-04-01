package com.example.android.amaliayovadiani_1202154301_modul6;

import com.google.firebase.database.IgnoreExtraProperties;


@IgnoreExtraProperties
public class user {
    public String username;
    public String email;

    public user () {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public user(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
