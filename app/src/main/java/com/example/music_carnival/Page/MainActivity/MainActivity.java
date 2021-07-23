package com.example.music_carnival.Page.MainActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.music_carnival.AddDone.Done;
import com.example.music_carnival.AddDone.DoneCollection;
import com.example.music_carnival.ArtistCollection.ArtistCollection;
import com.example.music_carnival.ArtistCollection.PlayArtistActivity;
import com.example.music_carnival.Genres.AlternativeIndie;
import com.example.music_carnival.Genres.Contemporary;
import com.example.music_carnival.Genres.DanceElectronic;
import com.example.music_carnival.Genres.HipHop;
import com.example.music_carnival.Genres.JPop;
import com.example.music_carnival.Genres.KPop;
import com.example.music_carnival.Genres.RBSoul;
import com.example.music_carnival.Genres.Rap;
import com.example.music_carnival.Page.Liked;
import com.example.music_carnival.Page.Moments.MomentsPackage.Moments;
import com.example.music_carnival.Page.Playlist.PlaylistActivity;
import com.example.music_carnival.Popular.PopularActivity;
import com.example.music_carnival.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;
import java.util.List;

import Search.SearchActivity;
import SongCollection.Song.All.PlaySongActivity;
import SongCollection.Song.All.SongCollection;

public class MainActivity extends AppCompatActivity {
    ImageButton firstButton;
    ImageButton secondButton;
    ImageButton thirdButton;
    ImageButton fourthButton;
    ImageButton fifthButton;
    ImageButton sixthButton;
    ImageButton seventhButton;
    ImageButton eigthButton;

    ImageButton btnGoPopular;
    ShapeableImageView imgGoPfp;

    TextView goSearch;


    TextView txt;

    SongCollection songCollection = new SongCollection();
    ArtistCollection artistCollection = new ArtistCollection();


    private int drawable;
    private int currentIndex = -1;
    DoneCollection doneCollection = new DoneCollection();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageSlider imageSlider = findViewById(R.id.slider);
        List<SlideModel> slideModelList = new ArrayList<>();
        slideModelList.add(new SlideModel(R.drawable.m_olivia, "NEW IN"));
        slideModelList.add(new SlideModel(R.drawable.m_weeknd, "HOTTEST"));
        slideModelList.add(new SlideModel(R.drawable.m_sekainoowari, "TRENDING"));
        slideModelList.add(new SlideModel(R.drawable.m_wild, "REWIND NOW"));
        imageSlider.setImageList(slideModelList, true);

        Bundle bundle = this.getIntent().getExtras(); //receiving Extras from Animal
        if (bundle != null) {
            currentIndex = bundle.getInt("index");
            Log.d("bark", "we received: " + currentIndex);
            int i = bundle.getInt("index");
            displayAnimalBasedOnIndex(currentIndex);
        }

        imgGoPfp = findViewById(R.id.pfpMainActivity);
        imgGoPfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainProfileActivity.class);

                currentIndex = bundle.getInt("index");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("index");
                displayAnimalBasedOnIndex(currentIndex);
                intent.putExtra("index", i);

                intent.putExtra("index", i);
                startActivity(intent);
            }
        });

        goSearch = findViewById(R.id.txtSearchBar);
        goSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goSearch = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(goSearch);
                overridePendingTransition(0, 0);
            }
        });


        firstButton = findViewById(R.id.btnGenre1);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_one = new Intent(MainActivity.this, HipHop.class);

                currentIndex = bundle.getInt("index");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("index");
                displayAnimalBasedOnIndex(currentIndex);
                intent_one.putExtra("index", i);


                startActivity(intent_one);
            }
        });

        secondButton = findViewById(R.id.btnGenre2);
        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_two = new Intent(MainActivity.this, DanceElectronic.class);
                startActivity(intent_two);
            }
        });

        thirdButton = findViewById(R.id.btnGenre3);
        thirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_three = new Intent(MainActivity.this, RBSoul.class);
                startActivity(intent_three);
            }
        });

        fourthButton = findViewById(R.id.btnGenre4);
        fourthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_fourth = new Intent(MainActivity.this, AlternativeIndie.class);
                startActivity(intent_fourth);
            }
        });

        fifthButton = findViewById(R.id.btnGenre5);
        fifthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_fifth = new Intent(MainActivity.this, JPop.class);
                startActivity(intent_fifth);
            }
        });

        sixthButton = findViewById(R.id.btnGenre6);
        sixthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_six = new Intent(MainActivity.this, KPop.class);
                startActivity(intent_six);
            }
        });

        seventhButton = findViewById(R.id.btnGenre7);
        seventhButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_seventh = new Intent(MainActivity.this, Contemporary.class);
                startActivity(intent_seventh);
            }
        });

        eigthButton = findViewById(R.id.btnGenre8);
        eigthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_eigth = new Intent(MainActivity.this, Rap.class);
                startActivity(intent_eigth);
            }
        });

        btnGoPopular = findViewById(R.id.btnGoPopular);
        btnGoPopular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_top = new Intent(MainActivity.this, PopularActivity.class);
                Toast.makeText(MainActivity.this, "Top songs now~", Toast.LENGTH_SHORT).show();
                startActivity(intent_top);
            }
        });


        //Initialize and assign variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //Set Home Selected
        bottomNavigationView.setSelectedItemId(R.id.home);

        //Perform ItemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {


                    case R.id.home:
                        return true; //HOME IS HERE


                    case R.id.moments:

                        Intent newIntent = new Intent(MainActivity.this, Moments.class);
                    {

                        currentIndex = bundle.getInt("index");
                        Log.d("bark", "we received: " + currentIndex);
                        int i = bundle.getInt("index");
                        displayAnimalBasedOnIndex(currentIndex);
                        newIntent.putExtra("index", i);
                    }
                    startActivity(newIntent);
                    return true;


                    case R.id.liked:

                        Intent newIntent2 = new Intent(MainActivity.this, Liked.class);
                    {
                        currentIndex = bundle.getInt("index");
                        Log.d("bark", "we received: " + currentIndex);
                        int i = bundle.getInt("index");
                        displayAnimalBasedOnIndex(currentIndex);
                        newIntent2.putExtra("index", i);
                    }
                    startActivity(newIntent2);
                    overridePendingTransition(0, 0);
                    return true;


                    case R.id.playlist:
                        Intent newIntent3 = new Intent(MainActivity.this, PlaylistActivity.class);
                    {
                        currentIndex = bundle.getInt("index");
                        Log.d("bark", "we received: " + currentIndex);
                        int i = bundle.getInt("index");
                        displayAnimalBasedOnIndex(currentIndex);
                        newIntent3.putExtra("index", i);
                    }


                        startActivity(newIntent3);
                        overridePendingTransition(0, 0);
                        return true;

                }
                return false;
            }
        });
    }


    public void handleSelection(View myView) { //getter function for handleSelection instance
        String resourceId = getResources().getResourceEntryName(myView.getId()); //can get back ID from file layout
        int currentArrayIndex = songCollection.searchSongById(resourceId);

        Log.d("temasek", "The current array position is :  " + currentArrayIndex);
        sendDataToActivity(currentArrayIndex); //method being called, sent to PlaySongActivity

    }

    public void sendDataToActivity(int index) {
        Intent intent = new Intent(this, PlaySongActivity.class);
        intent.putExtra("index", index);
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
        startActivity(intent);
    }

   /* public void profileSelection(View view) {
        Intent intent = new Intent(MainActivity.this, MainProfileActivity.class);
        intent.putExtra("index", i);
        startActivity(intent);
    } */

    public void displayAnimalBasedOnIndex(int selectedIndex) {
        Done done = doneCollection.getCurrentAnimal(selectedIndex);
        drawable = done.getDrawable();
        Log.d("temasek", "You clicked on animal : " + drawable);

        ImageView iCoverArt = findViewById(R.id.pfpMainActivity);
        iCoverArt.setImageResource(drawable);
    }

}