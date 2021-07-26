package com.example.music_carnival.Page.MainActivity;

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
import com.example.music_carnival.R;
import com.google.android.material.imageview.ShapeableImageView;

public class MyCarnivalActivity extends AppCompatActivity {
    ImageButton backButton;
    ShapeableImageView artistC1,artistC2,artistC3,artistC4;
    TextView artistName1,artistName2,artistName3,artistName4;
    TextView genreName1,genreName2,genreName3,genreName4;
    CarnivalCollection carnivalCollection = new CarnivalCollection();

    private int drawable;
    private int currentIndex = -1;
    DoneCollection doneCollection = new DoneCollection();


    private int drawablePfp;
    private int pfpCurrentIndex = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_carnival);

        Bundle bundle = this.getIntent().getExtras(); //receiving Extras from Animal
        if (bundle != null) {
            currentIndex = bundle.getInt("index");
            Log.d("bark", "we received: " + currentIndex);
            int i = bundle.getInt("index");
            displayAnimalBasedOnIndex(currentIndex);
        }


        Bundle bundlePfp = this.getIntent().getExtras(); //receiving Extras from Animal
        if (bundlePfp != null) {
            pfpCurrentIndex = bundlePfp.getInt("pfp");
            Log.d("bark", "pfp received: " + pfpCurrentIndex);
            int i = bundlePfp.getInt("pfp");
            displayAnimalBasedOnIndex(pfpCurrentIndex);
        }


        backButton = findViewById(R.id.btnBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "we received: " + pfpCurrentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(pfpCurrentIndex);

                Intent intent = new Intent(MyCarnivalActivity.this, MainProfileActivity.class);
                intent.putExtra("pfp", i);
                startActivity(intent);
            }
        });




    }

    public void carnivalSelection(View view) {
        String resourceId = getResources().getResourceEntryName(view.getId()); //can get back ID from file layout
        int currentArrayIndex = carnivalCollection.searchCarnivalById(resourceId);

        Log.d("temasek", "The current array position is :  " + currentArrayIndex);
        sendCarnivalToActivity(currentArrayIndex); //method being called, sent to PlaySongActivity

    }

    public void sendCarnivalToActivity(int index) {
        Intent intent = new Intent(this, CarnivalSamplerActivity.class);
        intent.putExtra("index", index);

        Bundle bundlePfp = this.getIntent().getExtras(); //receiving Extras from Animal
        pfpCurrentIndex = bundlePfp.getInt("pfp");
        Log.d("bark", "CARNIVAL sending: " + pfpCurrentIndex + "to SAMPLER");
        int i = bundlePfp.getInt("pfp");
        intent.putExtra("pfp", i);


        startActivity(intent);
    }



    public void displayAnimalBasedOnIndex(int selectedIndex) {
        Done done = doneCollection.getCurrentAnimal(selectedIndex);
        drawable = done.getDrawable();
        Log.d("temasek", "You clicked on animal : " + drawablePfp);

        ImageView iCoverArt = findViewById(R.id.pfpCarnivalActivity);
        iCoverArt.setImageResource(drawablePfp);
    }

}