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

public class AltIndieDanceWallActivity extends AppCompatActivity {
    ImageButton backButton;

    private int drawable;
    private int currentIndex = -1;
    DoneCollection doneCollection = new DoneCollection();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alt_indie_dance_wall);

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
                Intent intent = new Intent(AltIndieDanceWallActivity.this, SelectionDanceWallActivity.class);
                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);

                intent.putExtra("pfp", i);
                startActivity(intent);
            }
        });



        //ADDING INTO ARRAY
        VideoObject videoObject1 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/yt1s.com%20-%2024K%20Magic%20%20Bruno%20Mars%20%20Junsun%20Yoo%20Choreography_Trim.mp4?alt=media&token=360085f4-1806-4345-9f2e-9cf919043b7b",
                "24K Magic",
                "Wearing cuban links coz I don't mix",
                "1MILLION",
                R.drawable.pfp_cat);
        videoObjects.add(videoObject1);

        VideoObject videoObject2 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/yt1s.com%20-%20Giveon%20%20Heartbreak%20Anniversary%20Choreography%20TAE%20WAN_v720P_Trim.mp4?alt=media&token=19f31c79-8647-484a-857f-4b773d5d7e96",
                "Heartbreak Anniversary",
                "Do you ever think of me?",
                "EDanceStudio",
                R.drawable.pfp_elephant);
        videoObjects.add(videoObject2);


        VideoObject videoObject3 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/yt1s.com%20-%20Little%20Talks%20%20Of%20Monsters%20And%20Men%20%20Chris%20Martin%20Choreography%20%20310XT%20Films%20%20URBAN%20DANCE%20CAMP_v720P_Trim.mp4?alt=media&token=dfec835c-0c3d-4b5c-a5d7-bd9edd00f65a",
                "Little Talks",
                "Past. Present. Future. We'll meet again soon",
                "URBANDANCECAMP",
                R.drawable.pfp_giraffe);
        videoObjects.add(videoObject3);


        VideoObject videoObject4 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Boy_Girl%20Dance%20Duet%20-%20Moral%20of%20the%20Story%20-%20Ashe%20feat.%20Niall%20Horan%20-%20Audio%20swap_Trim.mp4?alt=media&token=a5d9fa2e-5e5d-4be6-838d-e21125eacc07",
                "Moral of The Story",
                "Some mistakes get made that's alright that's ok!",
                "zaynsenergyjuice",
                R.drawable.pfp_giraffe);
        videoObjects.add(videoObject4);

        VideoObject videoObject5 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/yt1s.com%20-%20Thunder%20%20Imagine%20Dragons%20%20Lia%20Kim%20Choreography_Trim.mp4?alt=media&token=813c480d-704b-44f2-a9b3-68c740f2065c",
                "Thunder",
                "If your hair stands up, you know a thunder is near you. Better RUN!",
                "1MILLION",
                R.drawable.pfp_cat);
        videoObjects.add(videoObject5);


        VideoObject videoObject6 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/yt1s.com%20-%20MARSHMELLO%20%20HAPPIER%20Dance%20%20Matt%20Steffanina%20%20Bailey%20Choreography_Trim.mp4?alt=media&token=1b167e43-60d0-4c55-a3ba-a9899d0d565f",
                "Happier",
                "Believe in yourself. The world has endless possibilities",
                "MattSteffanina",
                R.drawable.pfp_giraffe);
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