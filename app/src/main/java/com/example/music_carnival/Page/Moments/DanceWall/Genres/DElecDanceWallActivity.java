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

public class DElecDanceWallActivity extends AppCompatActivity {
    ImageButton backButton;

    private int drawable;
    private int currentIndex = -1;
    DoneCollection doneCollection = new DoneCollection();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_elec_dance_wall);


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
                Intent intent = new Intent(DElecDanceWallActivity.this, SelectionDanceWallActivity.class);
                currentIndex = bundle.getInt("index");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("index");
                displayAnimalBasedOnIndex(currentIndex);

                intent.putExtra("index", i);
                startActivity(intent);
            }
        });



        //ADDING INTO ARRAY
        VideoObject videoObject1 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/yt1s.com%20-%20I%20Took%20A%20Pill%20In%20Ibiza%20SeeB%20Remix%20%20Mike%20Posner%20%20Lia%20Kim%20Choreography%20(1)_Trim.mp4?alt=media&token=5751e04b-7484-4212-bce3-9da5ef920192",
                "I Took A Pill In Ibiza (SeeB Remix)",
                "Right here in Ibiza yeah!",
                "1MILLION",
                R.drawable.pfp_cat);
        videoObjects.add(videoObject1);

        VideoObject videoObject2 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/yt1s.com%20-%20Calvin%20Harris%20Feat%20Dua%20Lipa%20%20One%20Kiss%20%20Phil%20Wright%20Choreography%20%20Ig%20philwright_Trim.mp4?alt=media&token=26ae01d7-a30f-4ead-9694-30abc1e7b6cf",
                "One Kiss",
                "One Kiss is all it takes~",
                "PhilWright",
                R.drawable.pfp_elephant);
        videoObjects.add(videoObject2);

        VideoObject videoObject3 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/yt1s.com%20-%20BUN%20UP%20THE%20DANCE%20%20Dillon%20Francis%20Skrillex%20%20Yeji%20Kim%20Choreography%20%20Dance_Trim.mp4?alt=media&token=e665053f-ece0-4e68-ae18-850c1ded1cd4",
                "BUN UP THE DANCE",
                "Get ready with your hair tied up in a BUN B)",
                "YejiKim",
                R.drawable.pfp_giraffe);
        videoObjects.add(videoObject3);

        VideoObject videoObject4 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/yt1s.com%20-All%20For%20Love%20by%20Tungevaag%20%20Raaban%20%20Choreography%20by%20Mayee%20Chen%2019_v720P_Trim.mp4?alt=media&token=928718c8-8754-4d36-86aa-6f2f433ae525",
                "All For Love",
                "Is love worth all your efforts?",
                "Triple8",
                R.drawable.pfp_giraffe);
        videoObjects.add(videoObject4);

        VideoObject videoObject5 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/yt1s.com%20-%20Alan%20Walker%20%20IS%C3%81K%20%20Sorry%20%20Learners%20Class_Trim.mp4?alt=media&token=39c9e476-98e3-4565-88da-a5d612eeda6f",
                "Sorry",
                "Sorry not Sorry!",
                "1MILLION",
                R.drawable.pfp_cat);
        videoObjects.add(videoObject5);

        VideoObject videoObject6 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/yt1s.com%20-%20All%20We%20Know%20%20The%20Chainsmokers%20ft%20Phoebe%20Ryan%20%20Junsun%20Yoo%20Choreography_v720P_Trim.mp4?alt=media&token=98db4842-2d87-41c9-bac0-7588b5336620",
                "All We Know",
                "We keep wasting colors",
                "1MILLION",
                R.drawable.pfp_cat);
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