package com.example.music_carnival.Page.SplashScreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.music_carnival.AddProfile.AddProfile;
import com.example.music_carnival.R;

public class SplashScreenActivity extends AppCompatActivity {

    private static final int SPLASH_TIME_OUT = 3500;


    Animation osuAnimation, topAnimation, middleAnimation;

    ImageView first_osu, second_osu, third_osu, fourth_osu, fifth_osu;
    ImageView carnivalLogo;
    TextView textCarnival, byMe;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        osuAnimation = AnimationUtils.loadAnimation(this, R.anim.osu_animation);
        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        middleAnimation = AnimationUtils.loadAnimation(this, R.anim.middle_animation);

        carnivalLogo = findViewById(R.id.carnivalLogo);
        textCarnival = findViewById(R.id.textCarnival);
        byMe = findViewById(R.id.byMe);



        carnivalLogo.setAnimation(middleAnimation);
        textCarnival.setAnimation(topAnimation);
        byMe.setAnimation(topAnimation);


        //splash screen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenActivity.this, AddProfile.class);
                startActivity(intent);
                finish();

            }
        },SPLASH_TIME_OUT);


    }
}