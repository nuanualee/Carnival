package com.example.music_carnival.Page.MainActivity;

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


    private int drawable;
    private int currentIndex = -1;
    DoneCollection doneCollection = new DoneCollection();
    FriendsCollection friendsCollection = new FriendsCollection();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_profile);

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


        if (name != null) {
            //set data on textview after if
            txt.setText(name);
        }



       // if ()

        mainTxtCategory = findViewById(R.id.mainTxtCategory);
        btnGoCategory = findViewById(R.id.arrowGoCategory);
        mainTxtCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainProfileActivity.this, PhotoCateActivity.class);

                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "we received: " + currentIndex);
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
                startActivity(intent);
            }
        });


        btnMyCarnival = findViewById(R.id.btnMyCarnival);
        btnMyCarnival.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);


                Intent intent = new Intent(MainProfileActivity.this, MyCarnivalActivity.class);
                intent.putExtra("pfp", i);
                startActivity(intent);
            }
        });

        backButton = findViewById(R.id.btnBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);


                Intent intent = new Intent(MainProfileActivity.this, MainActivity.class);
                intent.putExtra("index", i);
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




    public void friendsSelection(View view) {
        String friendId = getResources().getResourceEntryName(view.getId());
        int currentFriendArrayIndex = friendsCollection.searchFriendById(friendId);

        Log.d("temasek","The current friend array position is " + currentFriendArrayIndex);
        sendFriendstoActivity(currentFriendArrayIndex);
    }

    public void sendFriendstoActivity (int index){
        Intent intent = new Intent (this, PlayFriendActivity.class );
        intent.putExtra("index",index);
        startActivity(intent);
    }

}
