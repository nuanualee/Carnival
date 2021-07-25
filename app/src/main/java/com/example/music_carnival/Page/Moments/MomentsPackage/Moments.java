package com.example.music_carnival.Page.Moments.MomentsPackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.music_carnival.AddDone.Done;
import com.example.music_carnival.AddDone.DoneCollection;
import com.example.music_carnival.Page.Liked;
import com.example.music_carnival.Page.MainActivity.MainActivity;
import com.example.music_carnival.Page.Moments.DanceShake.WildCard.WildCardActivity;
import com.example.music_carnival.Page.Moments.DanceWall.SelectionDanceWallActivity;
import com.example.music_carnival.Page.Moments.Settings;
import com.example.music_carnival.Page.Playlist.PlaylistActivity;
import com.example.music_carnival.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Moments extends AppCompatActivity {

    TextView txt, txtProfile;
    ImageButton pfpDisplay;
    ImageButton setting;
    ImageButton danceShake_button;
    SharedPreferences sharedPreferences;


    DatabaseReference reference;
    RecyclerView ourmoments;
    ArrayList<MyMoment> list;
    AdapterMoments adapterMoments;

    ImageButton btnAddNew;

    private int drawable;
    private int currentIndex = -1;
    DoneCollection doneCollection = new DoneCollection();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moments);


        Bundle bundle = this.getIntent().getExtras(); //receiving Extras from Animal
        if (bundle != null) {
            currentIndex = bundle.getInt("index");
            Log.d("bark", "we received: " + currentIndex);
            int i = bundle.getInt("index");
            displayAnimalBasedOnIndex(currentIndex);
        }


        btnAddNew = findViewById(R.id.btnAddNew);
        btnAddNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moments.this, NewMomentsActivity.class);

                currentIndex = bundle.getInt("index");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("index");
                displayAnimalBasedOnIndex(currentIndex);
                intent.putExtra("index", i);


                startActivity(intent);
            }
        });


        txt = findViewById(R.id.txt_userNameDisplay);
        txtProfile = findViewById(R.id.txt_userProfileNameDisplay);
        pfpDisplay = findViewById(R.id.pfpDisplay);
        sharedPreferences = getSharedPreferences("SHARED_PREF", MODE_PRIVATE);
        String name = sharedPreferences.getString("NAME", "");


        //working with data
        ourmoments = findViewById(R.id.ourmoments);
        ourmoments.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<MyMoment>();

        //get data from database
        reference = FirebaseDatabase.getInstance().getReference().child("Moments");
        //pull data from firebase
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                //set code to retrieve data and replace layout
                //looping for
                for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {
                    MyMoment p = dataSnapshot1.getValue(MyMoment.class);
                    list.add(p);
                }
                adapterMoments = new AdapterMoments(Moments.this, list);
                ourmoments.setAdapter(adapterMoments);
                adapterMoments.notifyDataSetChanged();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                //for errors
                Toast.makeText(Moments.this, "No Data", Toast.LENGTH_SHORT).show();
            }
        });


        if (name != null) {
            //set data on textview after if
            txt.setText(name);
        }


        setting = findViewById(R.id.btnSettings);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSettings = new Intent(Moments.this, Settings.class);
                startActivity(intentSettings);
            }
        });

        danceShake_button = findViewById(R.id.btnShakeDance);
        danceShake_button.setOnClickListener(new View.OnClickListener() { //FIRST ONCLICK

            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(Moments.this, danceShake_button);
                popup.getMenuInflater().inflate(R.menu.menu_dance, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {//SECOND ONCLICK
                        Toast.makeText(Moments.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                        int id = item.getItemId();

                        if (id == R.id.danceWall) {
                            Intent intent = new Intent(Moments.this, SelectionDanceWallActivity.class);

                            currentIndex = bundle.getInt("index");
                            Log.d("bark", "we received: " + currentIndex);
                            int i = bundle.getInt("index");
                            displayAnimalBasedOnIndex(currentIndex);
                            intent.putExtra("index", i);


                            startActivity(intent);
                            Toast.makeText(Moments.this, "Going to Dance Wall", Toast.LENGTH_SHORT).show();

                        } else if (id == R.id.wildCard) {
                            Intent intent = new Intent(Moments.this, WildCardActivity.class);

                            currentIndex = bundle.getInt("index");
                            Log.d("bark", "Moments received" + currentIndex + " to be sent to WILDCARD ");
                            int i = bundle.getInt("index");
                            displayAnimalBasedOnIndex(currentIndex);
                            intent.putExtra("index", i);

                            startActivity(intent);
                            Toast.makeText(Moments.this, "Going to Wild Card", Toast.LENGTH_SHORT).show();

                        }
                        return true;
                    }
                });
                popup.show();

            }
        });


        //Initialize and assign variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //Set Home Selected
        bottomNavigationView.setSelectedItemId(R.id.moments);

        //Perform ItemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {


                switch (menuItem.getItemId()) {


                    case R.id.home:
                        Intent intent = new Intent(Moments.this, MainActivity.class);

                        currentIndex = bundle.getInt("index");
                        Log.d("bark", "we received: " + currentIndex);
                        int i = bundle.getInt("index");
                        displayAnimalBasedOnIndex(currentIndex);


                        intent.putExtra("index", i);
                        startActivity(intent);
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.moments:
                        return true; //MOMENTS IS HERE

                    case R.id.liked:
                        Intent intentLiked = new Intent(Moments.this, Liked.class);
                        currentIndex = bundle.getInt("index");
                        Log.d("bark", "we received: " + currentIndex);
                        i = bundle.getInt("index");
                        displayAnimalBasedOnIndex(currentIndex);

                        intentLiked.putExtra("index", i);
                        startActivity(intentLiked);
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.playlist:

                        Intent newIntent = new Intent(Moments.this, PlaylistActivity.class);
                        Bundle bundle = getIntent().getExtras();
                        if (bundle != null) {
                            newIntent.putExtras(bundle);
                        }
                        startActivity(newIntent);


                        overridePendingTransition(0, 0);
                        return true;

                }
                return false;
            }
        });

    }

    public void displayAnimalBasedOnIndex(int selectedIndex) {
        Done done = doneCollection.getCurrentAnimal(selectedIndex);
        drawable = done.getDrawable();
        Log.d("temasek", "You clicked on animal : " + drawable);

        ImageView iCoverArt = findViewById(R.id.pfpDisplay);
        iCoverArt.setImageResource(drawable);
    }
}