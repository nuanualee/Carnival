package com.example.music_carnival.Page.Moments.DanceWall;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.music_carnival.AddDone.Done;
import com.example.music_carnival.AddDone.DoneCollection;
import com.example.music_carnival.Page.Moments.DanceWall.Genres.AltIndieDanceWallActivity;
import com.example.music_carnival.Page.Moments.DanceWall.Genres.ContempDanceWallActivity;
import com.example.music_carnival.Page.Moments.DanceWall.Genres.DElecDanceWallActivity;
import com.example.music_carnival.Page.Moments.DanceWall.Genres.HHDanceWallActivity;
import com.example.music_carnival.Page.Moments.DanceWall.Genres.JPopDanceWallActivity;
import com.example.music_carnival.Page.Moments.DanceWall.Genres.KPopDanceWallActivity;
import com.example.music_carnival.Page.Moments.DanceWall.Genres.RBSoulDanceWallActivity;
import com.example.music_carnival.Page.Moments.MomentsPackage.Moments;
import com.example.music_carnival.R;

public class SelectionDanceWallActivity extends AppCompatActivity {

    Animation animSlide, animRotate;
    ImageButton cd_hiphop, cd_dance, cd_rbsoul, cd_altindie, cd_jpop, cd_kpop, cd_contemp, cd_rap;
    ImageView coverOne, coverTwo, coverThree, coverFour, coverFive, coverSix, coverSeven, coverEight;
    View dynamicbg;

    ImageButton backButton;

    private int drawable;
    private int currentIndex = -1;
    DoneCollection doneCollection = new DoneCollection();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_dance_wall);

        //need it for my bundle to set profile picture
        //otherwise it the activity will stop....
        Bundle bundle = this.getIntent().getExtras(); //receiving Extras from Animal
        if (bundle != null) {
            currentIndex = bundle.getInt("pfp");
            Log.d("bark", "we received: " + currentIndex);
            int i = bundle.getInt("pfp");
            displayAnimalBasedOnIndex(currentIndex);
        }


        dynamicbg = findViewById(R.id.dynamicbg);
        animSlide = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_right);

        backButton = findViewById(R.id.btnBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectionDanceWallActivity.this, Moments.class);
                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);

                intent.putExtra("pfp", i);

                startActivity(intent);
            }
        });


        cd_hiphop = findViewById(R.id.cd_hiphop);
        coverOne = findViewById(R.id.coverOne);
        coverOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SelectionDanceWallActivity.this, "HIP-HOP!", Toast.LENGTH_SHORT).show();


                cd_hiphop.startAnimation(animSlide);


                Intent intent = new Intent(SelectionDanceWallActivity.this, HHDanceWallActivity.class);
                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);
                intent.putExtra("pfp", i);


                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        cd_dance = findViewById(R.id.cd_danceElec);
        coverTwo = findViewById(R.id.coverTwo);
        coverTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SelectionDanceWallActivity.this, "DANCE/ELECTRONIC!", Toast.LENGTH_SHORT).show();

                cd_dance.startAnimation(animSlide);

                Intent intent = new Intent(SelectionDanceWallActivity.this, DElecDanceWallActivity.class);

                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);

                intent.putExtra("pfp", i);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        cd_rbsoul = findViewById(R.id.cd_rbsoul);
        coverThree = findViewById(R.id.coverThree);
        cd_rbsoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SelectionDanceWallActivity.this, "R&B/SOUL!", Toast.LENGTH_SHORT).show();

                cd_rbsoul.startAnimation(animSlide);

                Intent intent = new Intent(SelectionDanceWallActivity.this, RBSoulDanceWallActivity.class);
                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);

                intent.putExtra("pfp", i);
                startActivity(intent);
                overridePendingTransition(0, 0);

            }
        });


        cd_altindie = findViewById(R.id.cd_altIndie);
        coverFour = findViewById(R.id.coverFour);
        cd_altindie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SelectionDanceWallActivity.this, "ALTERNATIVE/INDIE!", Toast.LENGTH_SHORT).show();

                cd_altindie.startAnimation(animSlide);
                Intent intent = new Intent(SelectionDanceWallActivity.this, AltIndieDanceWallActivity.class);
                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);

                intent.putExtra("pfp", i);
                startActivity(intent);
                overridePendingTransition(0, 0);

            }
        });


        cd_jpop = findViewById(R.id.cd_jpop);
        coverFive = findViewById(R.id.coverFive);
        cd_jpop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SelectionDanceWallActivity.this, "J-POP!", Toast.LENGTH_SHORT).show();

                cd_jpop.startAnimation(animSlide);
                Intent intent = new Intent(SelectionDanceWallActivity.this, JPopDanceWallActivity.class);
                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);

                intent.putExtra("pfp", i);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });


        cd_kpop = findViewById(R.id.cd_kpop);
        coverSix = findViewById(R.id.coverSix);
        cd_kpop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SelectionDanceWallActivity.this, "K-POP!", Toast.LENGTH_SHORT).show();


                cd_kpop.startAnimation(animSlide);

                Intent intent = new Intent(SelectionDanceWallActivity.this, KPopDanceWallActivity.class);
                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);

                intent.putExtra("pfp", i);
                startActivity(intent);
                overridePendingTransition(0, 0);

            }
        });


        cd_contemp = findViewById(R.id.cd_contemp);
        coverSeven = findViewById(R.id.coverSeven);
        cd_contemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SelectionDanceWallActivity.this, "CONTEMPORARY", Toast.LENGTH_SHORT).show();

                cd_contemp.startAnimation(animSlide);

                Intent intent = new Intent(SelectionDanceWallActivity.this, ContempDanceWallActivity.class);
                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);

                intent.putExtra("pfp", i);
                startActivity(intent);
                overridePendingTransition(0, 0);

            }
        });

        cd_rap = findViewById(R.id.cd_rap);
        coverEight = findViewById(R.id.coverEight);
        cd_rap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SelectionDanceWallActivity.this, "RAP!", Toast.LENGTH_SHORT).show();


                cd_rap.startAnimation(animSlide);

            }
        });
        rotateAnimation();
    }

    //method created to be called
    private void rotateAnimation() {

        animRotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
        cd_hiphop.startAnimation(animRotate);
        cd_dance.startAnimation(animRotate);
        cd_rbsoul.startAnimation(animRotate);
        cd_altindie.startAnimation(animRotate);
        cd_jpop.startAnimation(animRotate);
        cd_kpop.startAnimation(animRotate);
        cd_contemp.startAnimation(animRotate);
        cd_rap.startAnimation(animRotate);
    }

    public void displayAnimalBasedOnIndex(int selectedIndex) {
        Done done = doneCollection.getCurrentAnimal(selectedIndex);
        drawable = done.getDrawable();
        Log.d("temasek", "You clicked on animal : " + drawable);

        ImageView iCoverArt = findViewById(R.id.pfpSelectionActivity);
        iCoverArt.setImageResource(drawable);
    }

}