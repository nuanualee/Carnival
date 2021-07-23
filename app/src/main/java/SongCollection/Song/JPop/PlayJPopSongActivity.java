package SongCollection.Song.JPop;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.music_carnival.AddDone.Done;
import com.example.music_carnival.AddDone.DoneCollection;
import com.example.music_carnival.Page.MainActivity.MainActivity;
import com.example.music_carnival.Page.Moments.MomentsPackage.NewMomentsActivity;
import com.example.music_carnival.R;

import java.io.IOException;
import java.util.ArrayList;

import Search.Search;
import SongCollection.Song.AddToPlaylist;
import SongCollection.Song.All.Song;
import SongCollection.Song.Countdown.Countdown;

import static com.example.music_carnival.R.drawable.like_orange;
import static com.example.music_carnival.R.drawable.play_letterh;
import static com.example.music_carnival.R.drawable.play_triangleanother;
import static com.example.music_carnival.R.drawable.triangle_play;

public class PlayJPopSongActivity extends AppCompatActivity {

    private String title = "";
    private String artiste = "";
    private String filelink = "";
    private int drawable;
    private int currentIndex = -1;

    private int drawablePfp;

    private final MediaPlayer player = new MediaPlayer();
    private ImageButton btnPlayPause = null; //button initiate
    JPopSongCollection jPopSongCollection = new JPopSongCollection();
    DoneCollection doneCollection = new DoneCollection();
    ArrayList<Song> favList = new ArrayList<Song>(); //will increase or decrease depending on number of songs added in

    ImageButton backButton;
    ImageButton likedButton;

    ImageButton menu_button;

    //to access seekbar, as class variable.
    SeekBar seekbar;
    Handler handler = new Handler();
    TextView elapsedTimeLabel, remainingTimeLabel;
    int totalTime;

    Search search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_song);

        menu_button = findViewById(R.id.btnMenu);
        menu_button.setOnClickListener(new View.OnClickListener() { //FIRST ONCLICK
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(PlayJPopSongActivity.this, menu_button);
                popup.getMenuInflater().inflate(R.menu.menu_popup, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {//SECOND ONCLICK
                        Toast.makeText(PlayJPopSongActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();

                        int id = item.getItemId();
                        if (id == R.id.addToPlaylist) {
                            Intent intent = new Intent(PlayJPopSongActivity.this, AddToPlaylist.class);
                            intent.putExtra("TITLE", title);
                            startActivity(intent);
                        } else if (id == R.id.addToMoments) {
                            Intent intent2 = new Intent(PlayJPopSongActivity.this, NewMomentsActivity.class);
                            startActivity(intent2);

                        } else if (id == R.id.countdownTimer) {
                            Intent intent3 = new Intent(PlayJPopSongActivity.this, Countdown.class);

                            intent3.putExtra("ALBUM", drawable);
                            //intent.getExtras().getInt("index");
                            Log.d("temasek", "Countdown received " + currentIndex);
                            intent3.putExtra("index", currentIndex);
                            intent3.putExtra("genre","jPop");

                            startActivity(intent3);

                        }

                        return true;
                    }
                });
                popup.show();

            }
        });


        //seekbar, manipulationt through here.
        seekbar = findViewById(R.id.seekBar);
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //whenever value changes

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //when touch
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //let go, scrub and let go will call this method
                if (player != null && player.isPlaying()) {
                    player.seekTo(seekbar.getProgress());
                }
            }
        });


        //playpause
        btnPlayPause = findViewById(R.id.btnPlayPause);

        btnPlayPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!player.isPlaying()) { //if player is NOT playing
                    player.start();

                    //length will now represent duration
                    seekbar.setMax(player.getDuration());
                    //remove existing calling of run, so it won't interject
                    handler.removeCallbacks(p_bar);
                    handler.postDelayed(p_bar, 1000);//calling progress bar,activation starts after 1 sec


                    btnPlayPause.setImageResource(play_letterh);
                } else {
                    player.pause();
                    btnPlayPause.setImageResource(play_triangleanother);
                }
            }
        });


        Intent intent = getIntent();

        if (intent.getExtras() != null) {
            Bundle songData = this.getIntent().getExtras();
            int currentIndex = songData.getInt("index");
            Log.d("temasek", "We receieved: " + currentIndex);
            displaySongBasedOnIndex(currentIndex);
            playSong(filelink);
        }
        Bundle bundle = this.getIntent().getExtras(); //receiving Extras from Animal
        if (bundle != null) {
            currentIndex = bundle.getInt("index");
            Log.d("bark", "we received: " + currentIndex);
            int i = bundle.getInt("index");
            displayAnimalBasedOnIndex(currentIndex);
        }


        backButton = findViewById(R.id.btnBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayJPopSongActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }


    //SEEKBAR
    Runnable p_bar = new Runnable() {
        @Override
        public void run() {
            // Log.d("temasek", "running");
            seekbar.setProgress(player.getCurrentPosition());
            handler.postDelayed(this, 1000); //this, run this runnable. will call itself 1 sec after.


        }
    };


    public void handleSelection(View view) {
        likedButton = findViewById(R.id.btnLiked);
        likedButton.setImageResource(like_orange);
        Toast.makeText(this, "Song has been liked!", Toast.LENGTH_SHORT).show();

    }

    public void displaySongBasedOnIndex(int selectedIndex) {
        JPSong jpSong = jPopSongCollection.getCurrentSong(selectedIndex);
        title = jpSong.getTitle();
        Log.d("temasek", "the title is: " + title);
        artiste = jpSong.getArtiste();
        filelink = jpSong.getFileLink();
        drawable = jpSong.getDrawable();

        TextView txtTitle = findViewById(R.id.txtSongTitle);
        txtTitle.setText(title);

        TextView txtArtist = findViewById(R.id.txtArtist);
        txtArtist.setText(artiste);

        ImageView iCoverArt = findViewById(R.id.imgCoverArt);
        iCoverArt.setImageResource(drawable);

    }

    public void playSong(String songUrl) {
        //songurl is pertaining to input and output

        try { //we are playign song here
            player.reset(); //we created instance ontop. we are resettnig
            player.setDataSource(songUrl); //WILL NEED TO PUT CLAUSE
            player.prepare(); //prepare player
            player.start(); //start player
            btnPlayPause.setImageResource(play_letterh); //BUTTON becomes paused
            setTitle(title);
            gracefullyStopsWhenMusicEnds(); //METHOD IS BEING CALLED

        } catch (IOException e) {
            e.printStackTrace(); //if something went wrong


        }
    }


    ////////////////////////


    private void gracefullyStopsWhenMusicEnds() { //new method to allow music player to go back to PLAY
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { //goig to listen: when it completed played
            @Override
            public void onCompletion(MediaPlayer mp) { //ON COMPLETION, finished playing
                Toast.makeText(PlayJPopSongActivity.this, "Song ended", Toast.LENGTH_SHORT).show();
                btnPlayPause.setImageResource(triangle_play); //btn changes back to PLAY
            }
        });
    }

    public void playNext(View view) {
        currentIndex = jPopSongCollection.getNextSong(currentIndex);
        Toast.makeText(this, "Now Playing!: " + currentIndex, Toast.LENGTH_LONG).show();
        Log.d("temasek", "After playnext, the index is now : " + currentIndex);
        displaySongBasedOnIndex(currentIndex);
        playSong(filelink);
    }

    public void playPrevious(View view) {
        currentIndex = jPopSongCollection.getPrevSong(currentIndex);
        Toast.makeText(this, "Now Playing! " + currentIndex, Toast.LENGTH_LONG).show();
        displaySongBasedOnIndex(currentIndex);
        playSong(filelink);

    }

    @Override //the parent of PSA also has this function implemented
    public void onBackPressed() {
        super.onBackPressed(); //will be called super...
        player.release();//to destroy player to OS
    }
    public void displayAnimalBasedOnIndex(int selectedIndex) {
        Done done = doneCollection.getCurrentAnimal(selectedIndex);
        drawablePfp = done.getDrawable();
        Log.d("temasek", "You clicked on animal : " + drawablePfp);

        ImageView iCoverArt = findViewById(R.id.pfpPlaySongActivity);
        iCoverArt.setImageResource(drawablePfp);
    }

}