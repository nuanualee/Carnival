package com.example.music_carnival.AddProfile.ExistingProfile;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.music_carnival.AddProfile.ExistingLoginActivity;
import com.example.music_carnival.ProfileAct.ProfileActCollection;
import com.example.music_carnival.R;

public class ExsitingProfileActivity extends AppCompatActivity {


    //for our existing users, however we are not
    //really focusing on existing users
    ProfileActCollection profileActCollection = new ProfileActCollection();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exsiting_profile);


    }


    public void handleSelection(View view) {
        String resourceId = getResources().getResourceEntryName(view.getId());
        int currentArrayIndex = profileActCollection.searchAnimalById(resourceId);
        Log.d("meow", "The pressed image is   " + currentArrayIndex);
        sendAnimalToDone(currentArrayIndex);
    }

    public void sendAnimalToDone(int i){
        Intent intent = new Intent(this, ExistingLoginActivity.class);
        intent.putExtra("index", i);
        startActivity(intent);

    }
}