package com.example.music_carnival.Genres;

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
import com.example.music_carnival.ArtistCollection.ArtistCollection;
import com.example.music_carnival.ArtistCollection.PlayArtistActivity;
import com.example.music_carnival.Page.MainActivity.MainActivity;
import com.example.music_carnival.R;

import SongCollection.Song.AlternativeIndie.AltIndieSongCollection;
import SongCollection.Song.AlternativeIndie.PlayAltIndieSongActivity;

public class AlternativeIndie extends AppCompatActivity {


    ImageButton backButton;
    ImageButton rbSoulButton;
    ImageButton jPopButton;
    Animation slideRight, slideLeft;

    AltIndieSongCollection altIndieSongCollection = new AltIndieSongCollection();
    ArtistCollection artistCollection = new ArtistCollection();


    private int drawable;
    private int currentIndex = -1;
    DoneCollection doneCollection = new DoneCollection();    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alternative_indie);


        Bundle bundle = this.getIntent().getExtras(); //receiving Extras from Animal
        if (bundle != null) {
            currentIndex = bundle.getInt("pfp");
            Log.d("bark", "ALTINDIE received: " + currentIndex);
            int i = bundle.getInt("pfp");
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
                Intent intent = new Intent(AlternativeIndie.this, MainActivity.class);
                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);
                intent.putExtra("pfp", i);

                startActivity(intent);
            }
        });


        rbSoulButton = findViewById(R.id.btnRB);
        rbSoulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlternativeIndie.this, RBSoul.class);

                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "ALTINDIE sending: " + currentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);
                intent.putExtra("pfp", i);

                startActivity(intent);
                Toast.makeText(AlternativeIndie.this, "Genre : R&B/Soul", Toast.LENGTH_SHORT).show();
                overridePendingTransition(0,0);
            }
        });

        jPopButton = findViewById(R.id.btnJP);
        jPopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlternativeIndie.this, JPop.class);

                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "ALTINDIE sending: " + currentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);
                intent.putExtra("pfp", i);

                startActivity(intent);
                Toast.makeText(AlternativeIndie.this, "Genre : J-Pop", Toast.LENGTH_SHORT).show();
                overridePendingTransition(0,0);
            }
        });
    }

    public void handleSelection(View myView) { //getter function for handleSelection instance
        String resourceId = getResources().getResourceEntryName(myView.getId()); //can get back ID from file layout
        int currentArrayIndex = altIndieSongCollection.searchSongById(resourceId);

        Log.d("temasek","The current array position is :  " + currentArrayIndex);
        sendDataToActivity(currentArrayIndex); //method being called, sent to PlaySongActivity

    }

    public void sendDataToActivity (int index){
        Intent intent = new Intent (this, PlayAltIndieSongActivity.class );
        intent.putExtra("index",index);

        Bundle bundle = this.getIntent().getExtras(); //receiving Extras from Animal
        currentIndex = bundle.getInt("pfp");
        Log.d("bark", "ALT received: " + currentIndex);
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