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

public class ContempDanceWallActivity extends AppCompatActivity {
    ImageButton backButton;

    private int drawable;
    private int currentIndex = -1;
    DoneCollection doneCollection = new DoneCollection();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contemp_dance_wall);

        //pass video url name and description from videoObject to videoAdapter
        final ViewPager2 viewPager2 = findViewById(R.id.viewPager);
        List<VideoObject> videoObjects = new ArrayList<>();

        Bundle bundle = this.getIntent().getExtras(); //receiving Extras from Animal
        if (bundle != null) {
            currentIndex = bundle.getInt("pfp");
            Log.d("bark", "we received: " + currentIndex);
            int i = bundle.getInt("pfp");
            displayAnimalBasedOnIndex(currentIndex);
        }


        backButton = findViewById(R.id.btnBack);
        //   Log.d("temasek", "Clicked on back button");
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContempDanceWallActivity.this, SelectionDanceWallActivity.class);
                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);

                intent.putExtra("pfp", i);
                startActivity(intent);
            }
        });



        //ADDING INTO ARRAY
        VideoObject videoObject1 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/yt1s.com%20-%20JP%20Saxe%20ft%20Julia%20Michaels%20%20If%20The%20World%20Was%20Ending%20%20Choreography%20by%20Erica%20Klein_Trim.mp4?alt=media&token=212f6d89-9289-43df-84ae-f53075f3d32a",
                "If The World Was Ending",
                "It's been a year now, think I've figured out how",
                "TimMilgram",
                R.drawable.pfp_alpaca);
        videoObjects.add(videoObject1);

        VideoObject videoObject2 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/yt1s.com%20-%20Lyrical%20Jazz%20Lover%20%20Taylor%20Swift%20Choreography%20Soo_Trim.mp4?alt=media&token=c0e9dd51-1063-43e4-8051-663792dfa804",
                "Lover",
                "Taylor Swift is perfect in every possible way!",
                "GNIDanceCompany",
                R.drawable.pfp_elephant);
        videoObjects.add(videoObject2);

        VideoObject videoObject3 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Lewis%20Capaldi%20-%20Someone%20You%20Loved%20_%20HuaiEn%20Choreography_Trim.mp4?alt=media&token=bb0619ed-1426-4243-a152-b3024b54bd92",
                "Someone You Loved",
                "Doing fine without you.... I guess... Hope you're doing fine :)",
                "SOULBEATS",
                R.drawable.pfp_monkey);
        videoObjects.add(videoObject3);

        VideoObject videoObject4 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/yt1s.com%20-%20HARRY%20STYLES%20%20Adore%20You%20%20Kyle%20Hanagami%20Choreography_Trim.mp4?alt=media&token=049d1472-74b0-4439-9d4b-05619e0a116e",
                "Adore You",
                "THE WAY HE LOOKS AT HER I-",
                "KYLE",
                R.drawable.pfp_giraffe);
        videoObjects.add(videoObject4);

        VideoObject videoObject5 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/yt1s.com%20-Love%20Me%20Like%20You%20Do%20%20Ellie%20Goulding%20%20Jay%20Kim%20Choreography_v720P_Trim.mp4?alt=media&token=faf5bf3b-a127-4110-a60e-31acbf4ec30e",
                "Love Me Like You Do",
                "What are you waiting for :33333",
                "1MILLION",
                R.drawable.pfp_bear);
        videoObjects.add(videoObject5);

        VideoObject videoObject6 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/yt1s.com%20-Hozier%20%20Take%20Me%20To%20Church%20%20Choreography%20by%20Jemma%20Lee%20%20Prepix%20Studio%20Class_v720P_Trim.mp4?alt=media&token=beaf178f-630b-47ae-a6b3-48507b49e5e0",
                "Take Me To Church",
                "Only heaven I'll be sent to ",
                "JemmaLee",
                R.drawable.pfp_pug);
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