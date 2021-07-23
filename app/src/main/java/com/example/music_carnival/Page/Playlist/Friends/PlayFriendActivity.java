package com.example.music_carnival.Page.Playlist.Friends;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.music_carnival.R;

public class PlayFriendActivity extends AppCompatActivity {

   FriendsCollection friendsCollection = new FriendsCollection();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_friend);

        Intent intent = getIntent();

        if (intent.getExtras() != null) {
            Bundle friendData = this.getIntent().getExtras();
            int currentIndex = friendData.getInt("index");
            Log.d("temasek", "We receieved: " + currentIndex);
            displaySongBasedOnIndex(currentIndex);
        }
    }

    private void displaySongBasedOnIndex(int currentIndex) {


    }
}