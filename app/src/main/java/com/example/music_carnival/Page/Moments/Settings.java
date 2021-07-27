package com.example.music_carnival.Page.Moments;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.music_carnival.AddDone.Done;
import com.example.music_carnival.AddDone.DoneCollection;
import com.example.music_carnival.Page.Moments.MomentsPackage.Moments;
import com.example.music_carnival.R;

public class Settings extends AppCompatActivity {

    ImageButton backButton;
    TextView goAccount;
    TextView goAbout;
    TextView goRate;
    TextView toClearCache;

    private int drawable;
    private int currentIndex = -1;
    DoneCollection doneCollection = new DoneCollection();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Bundle bundle = this.getIntent().getExtras(); //receiving Extras from Animal
        if (bundle != null) {
            currentIndex = bundle.getInt("pfp");
            Log.d("bark", "we received: " + currentIndex);
            int i = bundle.getInt("pfp");
            displayAnimalBasedOnIndex(currentIndex);
        }


        backButton = findViewById(R.id.btnBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Settings.this, Moments.class);

                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);
                intent.putExtra("pfp", i);


                startActivity(intent);
            }
        });

        goAccount = findViewById(R.id.idAccount);
        goAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAccount = new Intent(Settings.this, Account.class);

                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "Moments received" + currentIndex + " to be sent to ACCOUNT ");
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);
                intentAccount.putExtra("pfp", i);

                startActivity(intentAccount);
            }
        });

        goAbout = findViewById(R.id.idAbout);
        goAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAbout = new Intent(Settings.this, About.class);

                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "Moments received" + currentIndex + " to be sent to ABOUT ");
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);
                intentAbout.putExtra("pfp", i);

                startActivity(intentAbout);
            }
        });

        goRate = findViewById(R.id.idRate);
        goRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRate = new Intent(Settings.this, RatingEmotionActivity.class);
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

    public void displayAnimalBasedOnIndex(int selectedIndex) {
        Done done = doneCollection.getCurrentAnimal(selectedIndex);
        drawable = done.getDrawable();
        Log.d("temasek", "You clicked on animal : " + drawable);

        ImageView iCoverArt = findViewById(R.id.pfpInsideSettings);
        iCoverArt.setImageResource(drawable);
    }
}