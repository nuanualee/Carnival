package com.example.music_carnival.Genres;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.music_carnival.AddDone.Done;
import com.example.music_carnival.AddDone.DoneCollection;
import com.example.music_carnival.Page.MainActivity.MainActivity;
import com.example.music_carnival.R;

import SongCollection.Song.KPop.KPopSongCollection;
import SongCollection.Song.KPop.PlayKPopSongActivity;

public class KPop extends AppCompatActivity {
    ImageButton backButton;
    ImageButton jPopButton;
    ImageButton contempButton;
    Animation slideRight, slideLeft;
    KPopSongCollection kPopSongCollection = new KPopSongCollection();

    private int drawable;
    private int currentIndex = -1;
    DoneCollection doneCollection = new DoneCollection();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k_pop);

        Bundle bundle = this.getIntent().getExtras(); //receiving Extras from Animal
        if (bundle != null) {
            currentIndex = bundle.getInt("index");
            Log.d("bark", "we received: " + currentIndex);
            int i = bundle.getInt("index");
            displayAnimalBasedOnIndex(currentIndex);
        }

        //anim//
        slideRight = AnimationUtils.loadAnimation(getApplicationContext()
                , R.anim.left_to_right);
        slideLeft = AnimationUtils.loadAnimation(getApplicationContext()
                , R.anim.right_to_left);




        backButton = findViewById(R.id.btnBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KPop.this, MainActivity.class);
                currentIndex = bundle.getInt("index");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("index");
                displayAnimalBasedOnIndex(currentIndex);
                intent.putExtra("index", i);

                startActivity(intent);
            }
        });


        jPopButton = findViewById(R.id.btnJPop);
        jPopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KPop.this, JPop.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });

        contempButton = findViewById(R.id.btnC);
        contempButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KPop.this, Contemporary.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });
    }





    public void handleSelection(View myView) { //getter function for handleSelection instance
        String resourceId = getResources().getResourceEntryName(myView.getId()); //can get back ID from file layout
        int currentArrayIndex = kPopSongCollection.searchSongById(resourceId);

        Log.d("temasek","The current array position is :  " + currentArrayIndex);
        sendDataToActivity(currentArrayIndex); //method being called, sent to PlaySongActivity

    }

    public void sendDataToActivity (int index){
        Intent intent = new Intent (this, PlayKPopSongActivity.class );
        intent.putExtra("index",index);
        startActivity(intent);

    }
    public void displayAnimalBasedOnIndex(int selectedIndex) {
        Done done = doneCollection.getCurrentAnimal(selectedIndex);
        drawable = done.getDrawable();
        Log.d("temasek", "You clicked on animal : " + drawable);

        ImageView iCoverArt = findViewById(R.id.pfpGenreActivity);
        iCoverArt.setImageResource(drawable);
    }
}