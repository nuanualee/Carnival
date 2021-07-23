package com.example.music_carnival.ArtistCollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.music_carnival.Page.MainActivity.MainActivity;
import com.example.music_carnival.R;

public class PlayArtistActivity extends AppCompatActivity {

    private String artiste = "";
    private String topSong1 = "";
    private String topSong2 = "";
    private String topSong3 = "";
    private double songLength1;
    private double songLength2;
    private double songLength3;
    private double stream1;
    private double stream2;
    private double stream3;
    private int drawable;

    ImageButton backbtn;


    ArtistCollection artistCollection = new ArtistCollection();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_artist);

        Bundle artistData = this.getIntent().getExtras();
        int currentIndex = artistData.getInt("index");
        Log.d("temasek", "We received: "+ currentIndex);
        displayArtistBasedOnIndex(currentIndex);

        backbtn = findViewById(R.id.btnBack);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayArtistActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });






    }

    public void displayArtistBasedOnIndex(int selectedIndex){
        Artist artist = artistCollection.getCurrentArtist(selectedIndex);
        artiste = artist.getArtiste();
        Log.d("temasek", "the artist is: " + artiste);

        topSong1 = artist.getTopSong1();
        topSong2 = artist.getTopSong2();
        topSong3 = artist.getTopSong3();

        songLength1 = artist.getSongLength1();
        songLength2 = artist.getSongLength2();
        songLength3 = artist.getSongLength3();

        stream1 = artist.getStream1();
        stream2 = artist.getStream2();
        stream3 = artist.getStream3();


        drawable = artist.getDrawable();

        TextView txtArtiste = findViewById(R.id.artiste);
        txtArtiste.setText(artiste);

        TextView txtTopSong1 = findViewById(R.id.topSong1);
        txtTopSong1.setText(topSong1);
        TextView txtTopSong2 = findViewById(R.id.topSong2);
        txtTopSong2.setText(topSong2);
        TextView txtTopSong3 = findViewById(R.id.topSong3);
        txtTopSong3.setText(topSong3);




        TextView txtSongLength1 = findViewById(R.id.topLength1);
        String stringdouble = Double.toString(songLength1);
        txtSongLength1.setText(stringdouble);

        TextView txtSongLength2 = findViewById(R.id.topLength2);
        String stringdouble2 = Double.toString(songLength2);
        txtSongLength2.setText(stringdouble2);

        TextView txtSongLength3 = findViewById(R.id.topLength3);
        String stringdouble3 = Double.toString(songLength3);
        txtSongLength3.setText(stringdouble3);



        TextView txtMillionListener1 = findViewById(R.id.txtMillion1);
        String milliondouble = Double.toString(stream1);
        txtMillionListener1.setText(milliondouble + "M");


        TextView txtMillionListener2 = findViewById(R.id.txtMillion2);
        String milliondouble2 = Double.toString(stream2);
        txtMillionListener2.setText(milliondouble2 + "M");

        TextView txtMillionListener3 = findViewById(R.id.txtMillion3);
        String milliondouble3= Double.toString(stream3);
        txtMillionListener3.setText(milliondouble3 + "M");

        ImageView imgArtistCover = findViewById(R.id.imgArtist);
        imgArtistCover.setImageResource(drawable);



    }
}