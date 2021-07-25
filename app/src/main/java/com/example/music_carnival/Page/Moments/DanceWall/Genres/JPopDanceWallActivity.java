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

public class JPopDanceWallActivity extends AppCompatActivity {
    ImageButton backButton;

    private int drawable;
    private int currentIndex = -1;
    DoneCollection doneCollection = new DoneCollection();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_j_pop_dance_wall);


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
                Intent intent = new Intent(JPopDanceWallActivity.this, SelectionDanceWallActivity.class);
                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);

                intent.putExtra("pfp", i);
                startActivity(intent);
            }
        });



        //ADDING INTO ARRAY
        VideoObject videoObject1 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/yt1s.com%20-%20NiziU%EB%8B%88%EC%A5%AC%20%20Take%20a%20picture%20%E8%B8%8A%E3%81%A3%E3%81%A6%E3%81%BF%E3%81%9FDance%20cover_v720P_Trim.mp4?alt=media&token=2fc9a80a-6cb9-4eed-9e7e-4273458948f3",
                "Take a Picture",
                "はい、チーズ",
                "ChegoChannel",
                R.drawable.pfp_seal);
        videoObjects.add(videoObject1);

        VideoObject videoObject2 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/%E3%83%89%E3%83%A9%E3%82%A4%E3%83%95%E3%83%A9%E3%83%AF%E3%83%BC%20-%20%E5%84%AA%E9%87%8C%E3%80%90%E8%B8%8A%E3%81%A3%E3%81%A6%E3%81%BF%E3%81%9F%E3%80%91_Trim.mp4?alt=media&token=bdb0d0cb-acb8-4a7a-b297-eb9f03498668",
                "Dry Flower",
                "いいなー",
                "TeamTT",
                R.drawable.pfp_goat);
        videoObjects.add(videoObject2);

        VideoObject videoObject3 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/%E3%80%90%E8%B8%8A%E3%81%A3%E3%81%A6%E3%81%BF%E3%81%9F%E3%80%91TWICE%20%E3%80%8CPerfect%20World%E3%80%8DDance%20Cover_kii_Trim.mp4?alt=media&token=bbb9766c-3e08-4e60-a197-5f5d80856747",
                "Perfect World",
                "今回はTWICEの 「Perfect World」の1番を踊ってみました。",
                "Kii-POP",
                R.drawable.pfp_alpaca);
        videoObjects.add(videoObject3);

        VideoObject videoObject4 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/yt1s.com%20-%20NEW%E3%83%88%E3%83%AA%E3%82%B3%202019%E5%B9%B4%20BEST%20DOME%20TOUR_v720P_Trim.mp4?alt=media&token=c9f7a0a5-30ca-4ff6-ab5f-26fdf52a287d",
                "Toriko",
                "この歌体育祭で好きな人が踊ってたバカ可愛かった",
                "Nissy",
                R.drawable.pfp_cat);
        videoObjects.add(videoObject4);

        VideoObject videoObject5 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/%E3%80%90%E3%83%97%E3%83%AD%E3%83%80%E3%83%B3%E3%82%B5%E3%83%BC%E3%81%8C%E8%B8%8A%E3%81%A3%E3%81%A6%E3%81%BF%E3%81%9F%E3%80%91napori%20-%20Vaundy%20_%20YDK%20Apartment_Trim.mp4?alt=media&token=0af8b0e4-4506-4de7-84b9-87a4ae8d6272",
                "napori",
                "今日も最高やった～‼もっかい見よ～っと",
                "YDKApartment",
                R.drawable.pfp_pug);
        videoObjects.add(videoObject5);

        VideoObject videoObject6 = new VideoObject("https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/%E3%80%90%E3%83%97%E3%83%AD%E3%83%80%E3%83%B3%E3%82%B5%E3%83%BC%E3%81%8C%E8%B8%8A%E3%81%A3%E3%81%A6%E3%81%BF%E3%81%9F%E3%80%91%E8%B8%8A%20-%20Ado%20_%20YDK%20Apartment_Trim.mp4?alt=media&token=1d5e55c0-e7a7-4e50-af3a-63985548f542",
                "踊",
                "スキル爆発",
                "YDKApartment",
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