package com.example.music_carnival.Page.MainActivity;

import android.content.Intent;
import android.media.MediaPlayer;
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
import com.example.music_carnival.R;

import java.io.IOException;

import static com.example.music_carnival.R.drawable.pause_letterh;
import static com.example.music_carnival.R.drawable.triangle_play;

public class CarnivalSamplerActivity extends AppCompatActivity {
    CarnivalCollection carnivalCollection = new CarnivalCollection();
    private String artiste = "";
    private String title = "";
    private String filelink = "";
    private int drawable;
    private final int currentIndex = -1;

    ImageButton btnPlayPause;
    private TextView txtBack;

    private int drawablePfp;
    private int pfpCurrentIndex = -1;

    private final MediaPlayer player = new MediaPlayer();

    DoneCollection doneCollection = new DoneCollection();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carnival_sampler);

        Intent intent = getIntent();

        //getting extras
        if (intent.getExtras() != null) {
            Bundle songData = this.getIntent().getExtras();
            int currentIndex = songData.getInt("index");
            Log.d("temasek", "We receieved: " + currentIndex);
            displayCarnivalBasedOnIndex(currentIndex);
            playCarnival(filelink);

        }


        Bundle bundle = this.getIntent().getExtras(); //receiving Extras from Animal
        if (bundle != null) {
            pfpCurrentIndex = bundle.getInt("pfp");
            Log.d("bark", "pfp received: " + pfpCurrentIndex);
            int i = bundle.getInt("pfp");
            displayAnimalBasedOnIndex(pfpCurrentIndex);
        }


        //playpause
        btnPlayPause = findViewById(R.id.btnPlayPause);
        btnPlayPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!player.isPlaying()) { //if player is NOT playing
                    player.start();

                    btnPlayPause.setImageResource(pause_letterh);
                } else {
                    player.pause();
                    btnPlayPause.setImageResource(triangle_play);
                }
            }
        });

        //going back to MyCarnivalActivity
        txtBack = findViewById(R.id.txtBack);
        txtBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CarnivalSamplerActivity.this,MyCarnivalActivity.class);

                pfpCurrentIndex = bundle.getInt("pfp");
                Log.d("bark", "we received: " + pfpCurrentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(pfpCurrentIndex);
                intent.putExtra("pfp", i);

                startActivity(intent);
                player.stop();
            }
        });



    }


    public void displayCarnivalBasedOnIndex(int selectedIndex) {
        Carnival carnival = carnivalCollection.getCurrentCarnival(selectedIndex);
        artiste = carnival.getArtiste();
        Log.d("temasek", "the title is: " + artiste);
        title = carnival.getGenre();
        filelink = carnival.getFileLink();
        drawable = carnival.getDrawable();

        TextView txtArtist = findViewById(R.id.txtCarnivalArtist);
        txtArtist.setText(artiste);

        TextView txtGenre = findViewById(R.id.txtCarnivalTitle);
        txtGenre.setText(title);

        ImageView iCoverArt = findViewById(R.id.imgCarnival);
        iCoverArt.setImageResource(drawable);
    }

    public void playCarnival(String songUrl) {
        //songurl is pertaining to input and output

        try { //we are playing song here
            player.reset(); //we created instance ontop. we are resetting
            player.setDataSource(songUrl); //WILL NEED TO PUT CLAUSE
            player.prepare(); //prepare player
            player.start(); //start player
            setTitle(artiste);
            gracefullyStopsWhenMusicEnds(); //METHOD IS BEING CALLED

        } catch (IOException e) {
            e.printStackTrace(); //if something went wrong

        }
    }
    private void gracefullyStopsWhenMusicEnds() { //new method to allow music player gracefully end
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) { //ON COMPLETION, finished playing
                Toast.makeText(CarnivalSamplerActivity.this, "Carnival ended", Toast.LENGTH_SHORT).show();
                btnPlayPause.setImageResource(triangle_play); //btn changes back to PLAY
            }
        });
    }

    @Override //the parent of PSA also has this function implemented
    public void onBackPressed() {
        super.onBackPressed(); //will be called super...
        player.release();//to destroy player to OS
    }

    public void doneCarnival(View view) {
        Intent intentBack = new Intent(CarnivalSamplerActivity.this, MyCarnivalActivity.class);
        startActivity(intentBack);
    }
    public void displayAnimalBasedOnIndex(int selectedIndex) {
        Done done = doneCollection.getCurrentAnimal(selectedIndex);
        drawable = done.getDrawable();
        Log.d("temasek", "You clicked on animal : " + drawablePfp);

        ImageView iCoverArt = findViewById(R.id.pfpCarnivalSampler);
        iCoverArt.setImageResource(drawablePfp);
    }

}