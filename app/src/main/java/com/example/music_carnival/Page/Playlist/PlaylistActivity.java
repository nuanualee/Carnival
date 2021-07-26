package com.example.music_carnival.Page.Playlist;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.music_carnival.AddDone.Done;
import com.example.music_carnival.AddDone.DoneCollection;
import com.example.music_carnival.Page.Liked;
import com.example.music_carnival.Page.MainActivity.MainActivity;
import com.example.music_carnival.Page.Moments.MomentsPackage.Moments;
import com.example.music_carnival.Page.Playlist.Friends.FriendsCollection;
import com.example.music_carnival.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PlaylistActivity extends AppCompatActivity {

    private int friend1;
    private int friend2;
    private int friend3;
    private int friend4;
    private int friend5;

    private int playlist1;
    private int playlist2;
    private int playlist3;
    private int playlist4;

    ImageView playlistView1;
    ImageView playlistView2;
    ImageView playlistView3;
    ImageView playlistView4;


    private final String playlistName1 = "";
    private final String playlistName2 = "";
    private final String playlistName3 = "";
    private final String playlistName4 = "";

    private final String genre1 = "";
    private final String genre2 = "";
    private final String genre3 = "";
    private final String genre4 = "";

    PlaylistCollection playlistCollection = new PlaylistCollection();
    FriendsCollection friendsCollection = new FriendsCollection();

    SharedPreferences sharedPreferences;


    //ins username typed from before
    TextView txt;
    TextView txt2;
    TextView txt3;
    TextView txt4;
    TextView txt5;

    private int drawable;
    private int currentIndex = -1;
    DoneCollection doneCollection = new DoneCollection();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        sharedPreferences = getSharedPreferences("SHARED_PREF", MODE_PRIVATE);
        String name = sharedPreferences.getString("NAME", "");

        txt2 = findViewById(R.id.playlistCreator1);
        txt3 = findViewById(R.id.playlistCreator2);
        txt4 = findViewById(R.id.playlistCreator3);
        txt5 = findViewById(R.id.playlistCreator4);


        txt2.setText(name + " | ");
        txt3.setText(name + " | ");
        txt4.setText(name + " | ");
        txt5.setText(name + " | ");

        Bundle bundle = this.getIntent().getExtras(); //receiving Extras from Animal
        if (bundle != null) {
            currentIndex = bundle.getInt("pfp");
            Log.d("bark", "we received: " + currentIndex);
            int i = bundle.getInt("pfp");
            displayAnimalBasedOnIndex(currentIndex);
        }


        playlistView1 = findViewById(R.id.playlistCover1);
        playlistView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPlaylistOne = new Intent(PlaylistActivity.this, PlaylistOneActivity.class);
                startActivity(intentPlaylistOne);
            }
        });

        playlistView2 = findViewById(R.id.playlistCover2);
        playlistView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPlaylistTwo = new Intent(PlaylistActivity.this, PlaylistTwoActivity.class);
                startActivity(intentPlaylistTwo);
            }
        });


        playlistView3 = findViewById(R.id.playlistCover3);
        playlistView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPlaylistThree = new Intent(PlaylistActivity.this, PlaylistThreeActivity.class);
                startActivity(intentPlaylistThree);
            }
        });


        playlistView4 = findViewById(R.id.playlistCover4);
        playlistView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPlaylistFour = new Intent(PlaylistActivity.this, PlaylistFourActivity.class);
                startActivity(intentPlaylistFour);
            }
        });


        //Initialize and assign variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //Set Home Selected
        bottomNavigationView.setSelectedItemId(R.id.playlist);

        //Perform ItemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {


                switch (menuItem.getItemId()) {


                    case R.id.home:
                        Intent intentHome = new Intent(PlaylistActivity.this, MainActivity.class);

                    {
                        currentIndex = bundle.getInt("pfp");
                        Log.d("bark", "we received: " + currentIndex);
                        int i = bundle.getInt("pfp");
                        displayAnimalBasedOnIndex(currentIndex);
                        intentHome.putExtra("pfp", i);
                    }
                        startActivity(intentHome);
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.moments:
                        Intent intentMoments = new Intent(PlaylistActivity.this, Moments.class);
                    {
                        currentIndex = bundle.getInt("pfp");
                        Log.d("bark", "we received: " + currentIndex);
                        int i = bundle.getInt("pfp");
                        displayAnimalBasedOnIndex(currentIndex);
                        intentMoments.putExtra("pfp", i);
                    }

                        startActivity(intentMoments);

                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.liked:
                        Intent intentLike = new Intent(PlaylistActivity.this, Liked.class);
                    {
                        currentIndex = bundle.getInt("pfp");
                        Log.d("bark", "we received: " + currentIndex);
                        int i = bundle.getInt("pfp");
                        displayAnimalBasedOnIndex(currentIndex);
                        intentLike.putExtra("pfp", i);
                    }
                        startActivity(intentLike);
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.playlist:
                        return true; //PLAYLIST IS HERE

                }
                return false;
            }
        });
    }



    /*public void friendsSelection(View view) {
        String friendId = getResources().getResourceEntryName(view.getId());
        int currentArtistArrayIndex = friendsCollection.searchFriendById(friendId);

        Log.d("temasek","The current friend array position is " + currentArtistArrayIndex);
        sendFriendstoActivity(currentArtistArrayIndex);
    }

    public void sendFriendstoActivity (int index){
        Intent intent = new Intent (this, PlayFriendActivity.class );
        intent.putExtra("index",index);
        startActivity(intent);
    } */

    public void displayAnimalBasedOnIndex(int selectedIndex) {
        Done done = doneCollection.getCurrentAnimal(selectedIndex);
        drawable = done.getDrawable();
        Log.d("temasek", "You clicked on animal : " + drawable);

        ImageView iCoverArt = findViewById(R.id.pfpPlaylist);
        iCoverArt.setImageResource(drawable);
    }
}