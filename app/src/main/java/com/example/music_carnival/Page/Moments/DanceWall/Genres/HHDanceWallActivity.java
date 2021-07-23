package com.example.music_carnival.Page.Moments.DanceWall.Genres;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.music_carnival.AddDone.Done;
import com.example.music_carnival.AddDone.DoneCollection;
import com.example.music_carnival.Page.Moments.DanceWall.SelectionDanceWallActivity;
import com.example.music_carnival.Page.Moments.DanceWall.VideoAdapter;
import com.example.music_carnival.Page.Moments.DanceWall.VideoObject;
import com.example.music_carnival.R;

import java.util.ArrayList;
import java.util.List;

public class HHDanceWallActivity extends AppCompatActivity {

    ImageButton backButton;

    private int drawable;
    private int currentIndex = -1;
    DoneCollection doneCollection = new DoneCollection();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dance_wall);

        //pass video url name and description from videoObject to videoAdapter
        final ViewPager2 viewPager2 = findViewById(R.id.viewPager);
        List<VideoObject> videoObjects = new ArrayList<>();


        Bundle bundle = this.getIntent().getExtras(); //receiving Extras from Animal
        if (bundle != null) {
            currentIndex = bundle.getInt("index");
            Log.d("bark", "we received: " + currentIndex);
            int i = bundle.getInt("index");
            displayAnimalBasedOnIndex(currentIndex);
        }



        backButton = findViewById(R.id.btnBack);
        //   Log.d("temasek", "Clicked on back button");
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HHDanceWallActivity.this, SelectionDanceWallActivity.class);
                currentIndex = bundle.getInt("index");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("index");
                displayAnimalBasedOnIndex(currentIndex);

                intent.putExtra("index", i);
                startActivity(intent);
            }
        });



        //ADDING INTO ARRAY
        VideoObject videoObject1 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/7poejp.mp4?alt=media&token=948af3b0-3378-4223-9a6a-81cdc3cf2fa5",
                "Watermelon Sugar",
                "Anyone fancy a watermelon this summer?",
                "wreckOP",
                R.drawable.pfp_fox);
        videoObjects.add(videoObject1);

        VideoObject videoObject2 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/yt1s.com%20-%20Justin%20Bieber%20%20Peaches%20%20Ara%20Cho%20Choreography_Trim.mp4?alt=media&token=b8c5e7d1-b017-4f52-be58-aa025bece3ad",
                "Peaches",
                "I got my peaches out in Georgia, wbu?",
                "1MILLION",
                R.drawable.pfp_elephant);
        videoObjects.add(videoObject2);

        VideoObject videoObject3 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/yt1s.com%20-%20Drake%20%20One%20Dance%20ft%20Wizkid%20Kyla%20%20JILLIN%20choreography%20%20Prepix%20Dance%20Studio.mp4?alt=media&token=d9d8e869-82a2-4280-bbb5-4bef08cbe54b",
                "One Dance",
                "All I need is One Dance...",
                "Prepix",
                R.drawable.pfp_giraffe);
        videoObjects.add(videoObject3);

        VideoObject videoObject4 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Post%20Malone%20-%20Circles%20_%20Kyo%20Choreography_Trim.mp4?alt=media&token=f0748a66-cff2-4848-b4a3-ffaf3a437dd9",
                "Circles",
                "Run away run away run away",
                "1MILLION",
                R.drawable.pfp_cat);
        videoObjects.add(videoObject4);

        VideoObject videoObject5 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/yt1s.com%20-SONE%20Choreo%20Class%20%20Sunflower%20%20%20Post%20Malone%20Swae%20Lee%20%20Justjerk%20Dance%20Academy_v720P_Trim.mp4?alt=media&token=bf9e0e88-e731-43cf-8a9f-8a18265f3d82",
                "Sunflower",
                "Sunflowers face each other when they cannot find the sun :)",
                "JustJerk",
                R.drawable.pfp_goat);
        videoObjects.add(videoObject5);

        VideoObject videoObject6 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/yt1s.com%20-%20Arizona%20Zervas%20%20ROXANNE%20%20Hojuneed%20%20Mull%20choreography_Trim.mp4?alt=media&token=ba3ac9d7-6653-4261-82a9-71d2f776e1ed",
                "ROXANNE",
                "All WE wanna do is party all night~~",
                "MOVEDance",
                R.drawable.pfp_fawn);
        videoObjects.add(videoObject6);


        //set adapter for viewpager2, arguement passed in and constructor needs to be created
        viewPager2.setAdapter(new VideoAdapter(videoObjects));

        //go to FIREBASE STORAGE

    }

    public void displayAnimalBasedOnIndex(int selectedIndex) {
        Done done = doneCollection.getCurrentAnimal(selectedIndex);
        drawable = done.getDrawable();
        Log.d("temasek", "You clicked on animal : " + drawable);

        ImageView iCoverArt = findViewById(R.id.pfpDanceWallActivity);
        iCoverArt.setImageResource(drawable);
    }
}