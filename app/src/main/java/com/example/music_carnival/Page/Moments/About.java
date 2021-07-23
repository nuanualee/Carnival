package com.example.music_carnival.Page.Moments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.music_carnival.R;

public class About extends AppCompatActivity {

    ImageButton backButton;
    AnimationDrawable circusAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ImageView imageView = findViewById(R.id.animalCircus);
        imageView.setBackgroundResource(R.drawable.animation);
        circusAnimation = (AnimationDrawable) imageView.getBackground();


        backButton = findViewById(R.id.btnBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(About.this, Settings.class);
                startActivity(intent);

            }
        });

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        circusAnimation.start();

    }
}