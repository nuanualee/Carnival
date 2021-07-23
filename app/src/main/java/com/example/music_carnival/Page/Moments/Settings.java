package com.example.music_carnival.Page.Moments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.music_carnival.Page.MainActivity.MainActivity;
import com.example.music_carnival.R;

public class Settings extends AppCompatActivity {

    ImageButton backButton;
    TextView goAccount;
    TextView goAbout;
    TextView goRate;
    TextView toClearCache;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        backButton = findViewById(R.id.btnBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Settings.this, MainActivity.class);
                startActivity(intent);
            }
        });

        goAccount = findViewById(R.id.idAccount);
        goAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAccount = new Intent(Settings.this,Account.class);
                startActivity(intentAccount);
            }
        });

        goAbout = findViewById(R.id.idAbout);
        goAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAbout = new Intent(Settings.this,About.class);
                startActivity(intentAbout);
            }
        });

        goRate = findViewById(R.id.idRate);
        goRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRate = new Intent(Settings.this,RatingEmotionActivity.class);
                startActivity(intentRate);
            }
        });

        toClearCache = findViewById(R.id.idCache);
        toClearCache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Settings.this, "Cache cleared!", Toast.LENGTH_LONG).show();
            }
        });


    }
}