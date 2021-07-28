package com.example.music_carnival.Page.Playlist.Friends;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.music_carnival.AddDone.Done;
import com.example.music_carnival.AddDone.DoneCollection;
import com.example.music_carnival.Page.MainActivity.MainProfileActivity;
import com.example.music_carnival.R;
import com.google.android.material.imageview.ShapeableImageView;

public class PlayFriendActivity extends AppCompatActivity {

    FriendsCollection friendsCollection = new FriendsCollection();


    private int friendsPic;
    private String friendsName;

    private int friend1;
    private int friend2;
    private int friend3;
    private int friend4;
    private int friend5;

    private final String index1 = "";
    private int playlist1;
    private final String index2 = "";
    private int playlist2;
    private final String index3 = "";
    private int playlist3;
    private final String index4 = "";
    private int playlist4;

    private String playlistName1 = "";
    private String playlistName2 = "";
    private String playlistName3 = "";
    private String playlistName4 = "";

    private String genre1 = "";
    private String genre2 = "";
    private String genre3 = "";
    private String genre4 = "";

    ImageButton backButton;
    private int drawable;
    private int currentIndex = -1;
    private int pfpCurrentIndex = -1;
    DoneCollection doneCollection = new DoneCollection();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_friend);

        Intent intent = getIntent();

        if (intent.getExtras() != null) {
            Bundle friendData = this.getIntent().getExtras();
            int currentIndex = friendData.getInt("index");
            Log.d("temasek", "We receieved: " + currentIndex);
            displayFriendBasedOnIndex(currentIndex);
        }

        Bundle bundle = this.getIntent().getExtras(); //receiving Extras from Animal
        if (bundle != null) {
            pfpCurrentIndex = bundle.getInt("pfp");
            Log.d("bark", "pfp received: " + pfpCurrentIndex);
            int i = bundle.getInt("pfp");
            displayAnimalBasedOnIndex(pfpCurrentIndex);
        }


        backButton = findViewById(R.id.btnBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);


                Intent intent = new Intent(PlayFriendActivity.this, MainProfileActivity.class);
                intent.putExtra("pfp", i);
                startActivity(intent);
            }
        });


    }

    private void displayFriendBasedOnIndex(int currentIndex) {
        Friends friends = friendsCollection.getCurrentFriend(currentIndex);
        friendsPic = friends.getFriendsPic();
        Log.d("temasek", "Friend PIC INT: ");
        friendsName = friends.getFriendsName();
        friend1 = friends.getFriend1();
        friend2 = friends.getFriend2();
        friend3 = friends.getFriend3();
        friend4 = friends.getFriend4();
        friend5 = friends.getFriend5();

        playlist1 = friends.getPlaylist1();
        playlist2 = friends.getPlaylist2();
        playlist3 = friends.getPlaylist3();
        playlist4 = friends.getPlaylist4();

        playlistName1 = friends.getPlaylistName1();
        playlistName2 = friends.getPlaylistName2();
        playlistName3 = friends.getPlaylistName3();
        playlistName4 = friends.getPlaylistName4();

        genre1 = friends.getGenre1();
        genre2 = friends.getGenre2();
        genre3 = friends.getGenre3();
        genre4 = friends.getGenre4();

        ShapeableImageView viewFriend = findViewById(R.id.viewFriend);
        viewFriend.setImageResource(friendsPic);

        TextView nameDisplay = findViewById(R.id.txt_friendsNameDisplay);
        nameDisplay.setText(friendsName);

        ShapeableImageView friendOne = findViewById(R.id.friend1);
        friendOne.setImageResource(friend1);
        ShapeableImageView friendTwo = findViewById(R.id.friend2);
        friendTwo.setImageResource(friend2);
        ShapeableImageView friendThree = findViewById(R.id.friend3);
        friendThree.setImageResource(friend3);
        ShapeableImageView friendFour = findViewById(R.id.friend4);
        friendFour.setImageResource(friend4);
        ShapeableImageView friendFive = findViewById(R.id.friend5);
        friendFive.setImageResource(friend5);


        ShapeableImageView playListCover1 = findViewById(R.id.playlistCover1);
        playListCover1.setImageResource(playlist1);
        ShapeableImageView playListCover2 = findViewById(R.id.playlistCover2);
        playListCover2.setImageResource(playlist2);
        ShapeableImageView playListCover3 = findViewById(R.id.playlistCover3);
        playListCover3.setImageResource(playlist3);
        ShapeableImageView playListCover4 = findViewById(R.id.playlistCover4);
        playListCover4.setImageResource(playlist4);

        TextView playlistNameOne = findViewById(R.id.playlistName1);
        playlistNameOne.setText(playlistName1);
        TextView playlistNameTwo = findViewById(R.id.playlistName2);
        playlistNameTwo.setText(playlistName2);
        TextView playlistNameThree = findViewById(R.id.playlistName3);
        playlistNameThree.setText(playlistName3);
        TextView playlistNameFour = findViewById(R.id.playlistName4);
        playlistNameFour.setText(playlistName4);

        TextView genreOne = findViewById(R.id.playlistGenre1);
        genreOne.setText(genre1);
        TextView genreTwo = findViewById(R.id.playlistGenre2);
        genreTwo.setText(genre2);
        TextView genreThree = findViewById(R.id.playlistGenre3);
        genreThree.setText(genre3);
        TextView genreFour = findViewById(R.id.playlistGenre4);
        genreFour.setText(genre4);

    }
    public void displayAnimalBasedOnIndex(int selectedIndex) {
        Done done = doneCollection.getCurrentAnimal(selectedIndex);
        drawable = done.getDrawable();
        Log.d("temasek", "You clicked on animal : " + drawable);

        ImageView iCoverArt = findViewById(R.id.pfpFriendActivity);
        iCoverArt.setImageResource(drawable);
    }

}