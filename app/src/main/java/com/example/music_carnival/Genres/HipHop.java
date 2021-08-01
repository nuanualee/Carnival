package com.example.music_carnival.Genres;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.music_carnival.AddDone.Done;
import com.example.music_carnival.AddDone.DoneCollection;
import com.example.music_carnival.ArtistCollection.ArtistCollection;
import com.example.music_carnival.ArtistCollection.PlayArtistActivity;
import com.example.music_carnival.Page.MainActivity.MainActivity;
import com.example.music_carnival.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import SongCollection.Song.HipHop.HHSongCollection;
import SongCollection.Song.HipHop.PlayHipHopSongActivity;

public class HipHop extends AppCompatActivity {


    ImageButton backButton;
    ImageButton rapButton;
    ImageButton danceeButton;
    Animation slideRight, slideLeft;
    HHSongCollection hhSongCollection = new HHSongCollection();

    private int drawable;
    private int currentIndex = -1;
    DoneCollection doneCollection = new DoneCollection();
    ArtistCollection artistCollection = new ArtistCollection();

    ScrollView scrollView2;
    FloatingActionButton floatingActionButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hip_hop);

        Bundle bundle = this.getIntent().getExtras(); //receiving Extras from Animal
        if (bundle != null) {
            currentIndex = bundle.getInt("pfp");
            Log.d("bark", "we received: " + currentIndex);
            int i = bundle.getInt("pfp");
            displayAnimalBasedOnIndex(currentIndex);
        }

        scrollView2 = findViewById(R.id.scrollView2);
        floatingActionButton = findViewById(R.id.floatingActionButton);
        //up button
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView2.fullScroll(ScrollView.FOCUS_UP);
                floatingActionButton.show();
            }
        });



        //anim//
        slideRight = AnimationUtils.loadAnimation(getApplicationContext()
        , R.anim.left_to_right);
        slideLeft = AnimationUtils.loadAnimation(getApplicationContext()
        , R.anim.right_to_left);




        backButton = findViewById(R.id.btnBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HipHop.this, MainActivity.class);
                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);
                intent.putExtra("pfp", i);



                startActivity(intent);
                    }
                });


        rapButton = findViewById(R.id.trendingRap);
        rapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HipHop.this, Rap.class);

                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "PLAYCONTEMPACTIVITY sending: " + currentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);
                intent.putExtra("pfp", i);

                startActivity(intent);
                Toast.makeText(HipHop.this, "Genre : Rap", Toast.LENGTH_SHORT).show();
                overridePendingTransition(0,0);
            }
        });

        danceeButton = findViewById(R.id.trendingDancee);
        danceeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HipHop.this, DanceElectronic.class);

                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "PLAYCONTEMPACTIVITY sending: " + currentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);
                intent.putExtra("pfp", i);

                startActivity(intent);
                Toast.makeText(HipHop.this, "Genre : Dance/Electronic", Toast.LENGTH_SHORT).show();
                overridePendingTransition(0,0);
            }
        });
    }

    public void songHandleSelection(View myView) { //getter function for handleSelection instance
        String resourceId = getResources().getResourceEntryName(myView.getId()); //can get back ID from file layout
        int currentArrayIndex = hhSongCollection.searchSongById(resourceId);

        Log.d("temasek","The current array position is :  " + currentArrayIndex);
        sendDataToActivity(currentArrayIndex); //method being called, sent to PlaySongActivity

    }

    public void sendDataToActivity (int index){
        Intent intent = new Intent (this, PlayHipHopSongActivity.class );
        intent.putExtra("index",index);

        Bundle bundle = this.getIntent().getExtras(); //receiving Extras from Animal
        currentIndex = bundle.getInt("pfp");
        Log.d("bark", "MAIN received: " + currentIndex);
        int i = bundle.getInt("pfp");
        intent.putExtra("pfp", i);
        startActivity(intent);

    }
    public void artistSelection(View view) {
        String artistId = getResources().getResourceEntryName(view.getId());
        int currentArtistArrayIndex = artistCollection.searchArtistById(artistId);

        Log.d("temasek", "The current artist array position is " + currentArtistArrayIndex);
        sendArtistToActivity(currentArtistArrayIndex);
    }


    public void sendArtistToActivity(int index) {
        Intent intent = new Intent(this, PlayArtistActivity.class);
        intent.putExtra("index", index);

        Bundle bundle = this.getIntent().getExtras(); //receiving Extras from Animal
        currentIndex = bundle.getInt("pfp");
        Log.d("bark", "MAIN received: " + currentIndex);
        int i = bundle.getInt("pfp");
        intent.putExtra("pfp", i);

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