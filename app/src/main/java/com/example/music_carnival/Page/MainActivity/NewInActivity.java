package com.example.music_carnival.Page.MainActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.music_carnival.AddDone.Done;
import com.example.music_carnival.AddDone.DoneCollection;
import com.example.music_carnival.R;

import SongCollection.Song.NewIn.NewInSongCollection;
import SongCollection.Song.NewIn.PlayNewInSongActivity;

public class NewInActivity extends AppCompatActivity {

    ImageButton backButton;
    ScrollView scrollView;

    private int drawable;
    private int currentIndex = -1;
    DoneCollection doneCollection = new DoneCollection();
    NewInSongCollection newInSongCollection = new NewInSongCollection();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_in);

        scrollView = findViewById(R.id.scrollViewNewIn);
        scrollView.setFillViewport(true);

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
                currentIndex = bundle.getInt("index");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("index");
                displayAnimalBasedOnIndex(currentIndex);


                Intent intent = new Intent(NewInActivity.this, MainActivity.class);
                intent.putExtra("index", i);
                startActivity(intent);
            }
        });

    }

    public void displayAnimalBasedOnIndex(int selectedIndex) {
        Done done = doneCollection.getCurrentAnimal(selectedIndex);
        drawable = done.getDrawable();
        Log.d("temasek", "You clicked on animal : " + drawable);

        ImageView iCoverArt = findViewById(R.id.pfpNewIn);
        iCoverArt.setImageResource(drawable);
    }

    public void handleSelection(View myView) { //getter function for handleSelection instance
        String resourceId = getResources().getResourceEntryName(myView.getId()); //can get back ID from file layout
        int currentArrayIndex = newInSongCollection.searchSongById(resourceId);

        Log.d("temasek", "The current array position is :  " + currentArrayIndex);
        sendDataToActivity(currentArrayIndex); //method being called, sent to PlaySongActivity

    }

    public void sendDataToActivity(int index) {
        Intent intent = new Intent(this, PlayNewInSongActivity.class);
        intent.putExtra("index", index);
        startActivity(intent);

    }
}