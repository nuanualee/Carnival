package com.example.music_carnival.Page.MainActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.music_carnival.AddDone.Done;
import com.example.music_carnival.AddDone.DoneCollection;
import com.example.music_carnival.Page.PhotoCategory.PhotoCateActivity;
import com.example.music_carnival.Page.Playlist.Friends.FriendsCollection;
import com.example.music_carnival.Page.Playlist.Friends.PlayFriendActivity;
import com.example.music_carnival.R;

public class MainProfileActivity extends AppCompatActivity {

    Button btnMyCarnival;
    ImageButton backButton;
    SharedPreferences sharedPreferences;
    TextView txt;

    TextView mainTxtCategory;
    ImageView btnGoCategory;

    ProgressDialog progressDialog;


    private int drawable;
    private int currentIndex = -1;
    DoneCollection doneCollection = new DoneCollection();
    FriendsCollection friendsCollection = new FriendsCollection();

    //call getSharedPreferences to fetch vibes data

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_profile);


        //getting extras, if extras is NOT null we will get it
        Bundle bundle = this.getIntent().getExtras(); //receiving Extras from Animal
        if (bundle != null) {
            currentIndex = bundle.getInt("pfp");
            Log.d("bark", "we received: " + currentIndex);
            int i = bundle.getInt("pfp");
            displayAnimalBasedOnIndex(currentIndex);
        }


        txt = findViewById(R.id.mainTxtUsername);
        sharedPreferences = getSharedPreferences("SHARED_PREF", MODE_PRIVATE);
        String name = sharedPreferences.getString("NAME", "");

        //getting name extras, if name extras is NOT null we will get it
        if (name != null) {
            //set data on textview after if
            txt.setText(name);
        }
        mainTxtCategory = findViewById(R.id.mainTxtCategory);
        Intent intent = getIntent();

        //for our feeling (xxx) text
        sharedPreferences = getSharedPreferences("SHARED_PREF_NAME", MODE_PRIVATE);
        String feeling = sharedPreferences.getString("VIBES", null);
        Log.d("temasek", "MainProfileActivity receieved Feeling: " + feeling);

        if (mainTxtCategory != null) {
            mainTxtCategory.setText("Feeling " + feeling);
        }


        /*   Bundle feeling = this.getIntent().getExtras();
        String feelingIndex = feeling.getString("title");
        Log.d("temasek", "PhotoCate receieved Feeling: " + feelingIndex);

        if (mainTxtCategory != null) {
            mainTxtCategory.setText("Feeling " + getIntent().getStringExtra("title"));
        } else {
            mainTxtCategory.setText("Feeling rhythm");
        } */

        //maintxtcategory and arrowgocategory goes the same activity
        mainTxtCategory = findViewById(R.id.mainTxtCategory);
        btnGoCategory = findViewById(R.id.arrowGoCategory);
        mainTxtCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainProfileActivity.this, PhotoCateActivity.class);

                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "CLICKING FEELING received: " + currentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);
                intent.putExtra("pfp", i);

                startActivity(intent);
            }
        });


        btnGoCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainProfileActivity.this, PhotoCateActivity.class);

                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "CLICKING FEELING received: " + currentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);
                intent.putExtra("pfp", i);

                startActivity(intent);
            }
        });


        //TO CARNIVAL
        btnMyCarnival = findViewById(R.id.btnMyCarnival);
        btnMyCarnival.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainProfileActivity.this, MyCarnivalActivity.class);

                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);
                intent.putExtra("pfp", i);

                startActivity(intent);
            }
        });

        //back to our mainactivity
        backButton = findViewById(R.id.btnBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);


                Intent intent = new Intent(MainProfileActivity.this, MainActivity.class);
                intent.putExtra("pfp", i);
                startActivity(intent);
            }
        });

    }

    public void displayAnimalBasedOnIndex(int selectedIndex) {
        Done done = doneCollection.getCurrentAnimal(selectedIndex);
        drawable = done.getDrawable();
        Log.d("temasek", "You clicked on animal : " + drawable);

        ImageView iCoverArt = findViewById(R.id.insideMainPfp);
        iCoverArt.setImageResource(drawable);
    }


    //FOR FRIENDS
    public void friendsSelection(View view) {
        String friendId = getResources().getResourceEntryName(view.getId());
        int currentFriendArrayIndex = friendsCollection.searchFriendById(friendId);

        Log.d("temasek", "The current friend array position is " + currentFriendArrayIndex);
        sendFriendstoActivity(currentFriendArrayIndex);
    }

    public void sendFriendstoActivity(int index) {
        Intent intent = new Intent(this, PlayFriendActivity.class);
        intent.putExtra("index", index);

        Bundle bundle = this.getIntent().getExtras(); //receiving Extras from Animal
        currentIndex = bundle.getInt("pfp");
        Log.d("bark", "MAIN received: " + currentIndex);
        int i = bundle.getInt("pfp");
        intent.putExtra("pfp", i);

        //init dialog
        progressDialog = new ProgressDialog(MainProfileActivity.this);
        //show dialog
        progressDialog.show();
        progressDialog.setContentView(R.layout.progress_dialog);
        //set transparent bg
        progressDialog.getWindow().setBackgroundDrawableResource(
                android.R.color.transparent
        );
        startActivity(intent);
    }
}
