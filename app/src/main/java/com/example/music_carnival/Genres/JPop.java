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

import SongCollection.Song.JPop.JPopSongCollection;
import SongCollection.Song.JPop.PlayJPopSongActivity;

public class JPop extends AppCompatActivity {


    ImageButton backButton;
    ImageButton altButton;
    ImageButton kPopButton;
    Animation slideRight, slideLeft;

    JPopSongCollection jPopSongCollection = new JPopSongCollection();
   // SongCollection songCollection = new SongCollection();

    private int drawable;
    private int currentIndex = -1;
    DoneCollection doneCollection = new DoneCollection();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_j_pop);

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
                Intent intent = new Intent(JPop.this, MainActivity.class);
                currentIndex = bundle.getInt("index");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("index");
                displayAnimalBasedOnIndex(currentIndex);
                intent.putExtra("index", i);



                startActivity(intent);
            }
        });


        altButton = findViewById(R.id.btnAlt);
        altButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JPop.this, AlternativeIndie.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });

        kPopButton = findViewById(R.id.btnKPop);
        kPopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JPop.this, KPop.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });
    }
    public void handleSelection(View myView) { //getter function for handleSelection instance
        String resourceId = getResources().getResourceEntryName(myView.getId()); //can get back ID from file layout
        int currentArrayIndex = jPopSongCollection.searchSongById(resourceId);

        Log.d("temasek","The current array position is :  " + currentArrayIndex);
        sendDataToActivity(currentArrayIndex); //method being called, sent to PlaySongActivity

    }

    public void sendDataToActivity (int index){
        Intent intent = new Intent (this, PlayJPopSongActivity.class );
        intent.putExtra("index",index);
        startActivity(intent);

    }
    public void displayAnimalBasedOnIndex(int selectedIndex) {
        Done done = doneCollection.getCurrentAnimal(selectedIndex);
        drawable = done.getDrawable();
        Log.d("temasek", "You clicked on animal : " + drawable);

        ImageView iCoverArt = findViewById(R.id.pfpNewMoments);
        iCoverArt.setImageResource(drawable);
    }
}