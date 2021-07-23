package com.example.music_carnival.ProfileAct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.music_carnival.AddDone.AddProfileDone;
import com.example.music_carnival.R;

public class ProfileActivity extends AppCompatActivity {

    ProfileActCollection profileActCollection = new ProfileActCollection();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Bundle btnData = this.getIntent().getExtras(); //receiving Extras from AddProfile
        int i = btnData.getInt("index");
        Log.d("temasek", "we received: " + i);
    }



    public void handleSelection(View view) {
        String resourceId = getResources().getResourceEntryName(view.getId());
        int currentArrayIndex = profileActCollection.searchAnimalById(resourceId);
        Log.d("meow", "The pressed image is   " + currentArrayIndex);
        sendAnimalToDone(currentArrayIndex);
    }

    public void sendAnimalToDone(int i){
        Intent intent = new Intent(this, AddProfileDone.class);
        intent.putExtra("index", i);
        startActivity(intent);

    }
}