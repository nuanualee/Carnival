package SongCollection.Song;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.music_carnival.R;

import java.util.ArrayList;

import SongCollection.Song.All.Song;
import SongCollection.Song.All.SongCollection;

public class AddToPlaylist extends AppCompatActivity {
    TextView title;
    TextView txt;


    SongCollection songCollection = new SongCollection();
    ArrayList<Song> favList = new ArrayList<Song>(); //will increase or decrease depending on number of songs added in


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_playlist);


        title = findViewById((R.id.txt_titleDisplay));
        Intent intent = getIntent();
        String titleName = intent.getStringExtra("TITLE");
        title.setText(titleName);


        txt = findViewById((R.id.playlistCreator1));
        String userName = intent.getStringExtra("USERNAME");
        txt.setText(userName);

        txt = findViewById((R.id.playlistCreator2));
        String userName1 = intent.getStringExtra("USERNAME");
        txt.setText(userName1);

        txt = findViewById((R.id.playlistCreator3));
        String userName3 = intent.getStringExtra("USERNAME");
        txt.setText(userName3);

        txt = findViewById((R.id.playlistCreator4));
        String userName4 = intent.getStringExtra("USERNAME");
        txt.setText(userName4);


    }


    public void addtoFavourite(View view) {
        Toast.makeText(this, "ADDED TO PLAYLIST!", Toast.LENGTH_SHORT).show();
    }


}