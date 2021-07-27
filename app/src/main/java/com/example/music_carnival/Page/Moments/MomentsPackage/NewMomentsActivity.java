package com.example.music_carnival.Page.Moments.MomentsPackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.music_carnival.AddDone.Done;
import com.example.music_carnival.AddDone.DoneCollection;
import com.example.music_carnival.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Random;

public class NewMomentsActivity extends AppCompatActivity {

    //init
    Button btnAddNow, btnCancel;
    EditText userName, userDetails, songChosen;
    DatabaseReference reference;
    Integer momentNum = new Random().nextInt();

    //change int to string of our randomized number
    String keyMoments = Integer.toString(momentNum);

    private int drawable;
    private int currentIndex = -1;
    DoneCollection doneCollection = new DoneCollection();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_moments);



        Bundle bundle = this.getIntent().getExtras(); //receiving Extras from Moments
        if (bundle != null) {
            currentIndex = bundle.getInt("pfp");
            Log.d("bark", "we received: " + currentIndex);
            int i = bundle.getInt("pfp");
            displayAnimalBasedOnIndex(currentIndex);
        }



        btnAddNow = findViewById(R.id.btnAddNow);
        btnCancel = findViewById(R.id.btnCancel);

        userName = findViewById(R.id.userNameE);
        userDetails = findViewById(R.id.userDetails);
        songChosen = findViewById(R.id.songChosen);

        btnAddNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //insert data to database
                //creating new directory. new random
                reference = FirebaseDatabase.getInstance().getReference().child("Moments").
                        child("Moments" + momentNum);
                reference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        dataSnapshot.getRef().child("userName").setValue(userName.getText().toString());
                        dataSnapshot.getRef().child("userDetail").setValue(userDetails.getText().toString());
                        dataSnapshot.getRef().child("songChose").setValue(songChosen.getText().toString());
                        dataSnapshot.getRef().child("momentNum").setValue(keyMoments);

                        if (userName.getText().toString().equals("") && userDetails.getText().toString().equals("")
                                && songChosen.getText().toString().equals("")) {
                            Toast.makeText(NewMomentsActivity.this, "Input the above fields!!", Toast.LENGTH_SHORT).show();
                        }
                        if (userName.getText().toString().equals("") && !userDetails.getText().toString().equals("")
                                && !songChosen.getText().toString().equals("")) {
                            Toast.makeText(NewMomentsActivity.this, "Input your Username!", Toast.LENGTH_SHORT).show();
                        }
                        if (!userName.getText().toString().equals("") && userDetails.getText().toString().equals("")
                                && !songChosen.getText().toString().equals("")) {
                            Toast.makeText(NewMomentsActivity.this, "Input Moments description!", Toast.LENGTH_SHORT).show();
                        }
                        if (!userName.getText().toString().equals("") && !userDetails.getText().toString().equals("")
                                && songChosen.getText().toString().equals("")) {
                            Toast.makeText(NewMomentsActivity.this, "Input Song - Artist!", Toast.LENGTH_SHORT).show();
                        }
                        if (!userName.getText().toString().equals("") && userDetails.getText().toString().equals("")
                                && songChosen.getText().toString().equals("")) {
                            Toast.makeText(NewMomentsActivity.this, "Input Moment description & Song - Artist!", Toast.LENGTH_SHORT).show();
                        }
                        if (userName.getText().toString().equals("") && userDetails.getText().toString().equals("")
                                && !songChosen.getText().toString().equals("")) {
                            Toast.makeText(NewMomentsActivity.this, "Input your Username & Moments description", Toast.LENGTH_SHORT).show();
                        }
                        if (userName.getText().toString().equals("") && !userDetails.getText().toString().equals("")
                                && !songChosen.getText().toString().equals("")) {
                            Toast.makeText(NewMomentsActivity.this, "Input your Username & Song - Artist", Toast.LENGTH_SHORT).show();
                        }

                        if (!userName.getText().toString().equals("") && !userDetails.getText().toString().equals("")
                                && !songChosen.getText().toString().equals("")) {
                            Intent intent = new Intent(NewMomentsActivity.this, Moments.class);

                            currentIndex = bundle.getInt("pfp");
                            Log.d("bark", "newmoments sending: " + currentIndex);
                            int i = bundle.getInt("pfp");
                            displayAnimalBasedOnIndex(currentIndex);
                            intent.putExtra("pfp", i);


                            Toast.makeText(NewMomentsActivity.this, "Moments added!", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });
    }

    public void displayAnimalBasedOnIndex(int selectedIndex) {
        Done done = doneCollection.getCurrentAnimal(selectedIndex);
        drawable = done.getDrawable();
        Log.d("temasek", "You clicked on animal : " + drawable);

        ImageView iCoverArt = findViewById(R.id.pfpNewMoments);
        iCoverArt.setImageResource(drawable);
    }

}