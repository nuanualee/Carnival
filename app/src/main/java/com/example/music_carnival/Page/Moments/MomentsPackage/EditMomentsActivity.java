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

import com.airbnb.lottie.LottieAnimationView;
import com.example.music_carnival.AddDone.Done;
import com.example.music_carnival.AddDone.DoneCollection;
import com.example.music_carnival.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Random;

public class EditMomentsActivity extends AppCompatActivity {

    Button btnCancel, btnDelete;
    LottieAnimationView lottieAnimationView;
    private boolean deleteMoments = false;

    EditText userName, userDetails, songChosen;

    DatabaseReference reference;
    Integer momentNum = new Random().nextInt();

    private int drawable;
    private int currentIndex = -1;
    DoneCollection doneCollection = new DoneCollection();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_moments);

        Bundle bundle = this.getIntent().getExtras(); //receiving Extras from Moments
        if (bundle != null) {
            currentIndex = bundle.getInt("pfp");
            Log.d("bark", "editmoments received: " + currentIndex);
            int i = bundle.getInt("pfp");
            displayAnimalBasedOnIndex(currentIndex);
        }

        btnCancel = findViewById(R.id.btnCancel);
        btnDelete = findViewById(R.id.btnDelete);
        lottieAnimationView = findViewById(R.id.animDelete);

        userName = findViewById(R.id.userNameE);
        userDetails = findViewById(R.id.userDetails);
        songChosen = findViewById(R.id.songChosen);

        userName.setText(getIntent().getStringExtra("userName"));
        userDetails.setText(getIntent().getStringExtra("userDetail"));
        songChosen.setText(getIntent().getStringExtra("songChose"));


        final String numMomentNum = getIntent().getStringExtra("keyMoment");
        reference = FirebaseDatabase.getInstance().getReference().child("Moments").
                child("Moments" + numMomentNum);


        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(EditMomentsActivity.this, "Deleting!!!!!!!", Toast.LENGTH_SHORT).show();
                reference.removeValue().addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()){
                           // lottieAnimationView.playAnimation(); animation not working..... leaving it out
                            Intent intent = new Intent(EditMomentsActivity.this,Moments.class);


                            currentIndex = bundle.getInt("pfp");
                            Log.d("bark", "editmoments sending : " + currentIndex + "after deletion");
                            int i = bundle.getInt("pfp");
                            displayAnimalBasedOnIndex(currentIndex);
                            intent.putExtra("pfp", i);

                            startActivity(intent);
                            Toast.makeText(EditMomentsActivity.this, "Moments Post Deleted", Toast.LENGTH_SHORT).show();
                        } else {
                            //safetynet, if cannot delete!
                            Toast.makeText(EditMomentsActivity.this, "Unable to delete!", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });


        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditMomentsActivity.this, Moments.class);

                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "EDITMOMENTS sending: " + currentIndex + " back to MOMENTS");
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);
                intent.putExtra("pfp", i);

                startActivity(intent);
            }
        });

    }


    public void displayAnimalBasedOnIndex(int selectedIndex) {
        Done done = doneCollection.getCurrentAnimal(selectedIndex);
        drawable = done.getDrawable();
        Log.d("temasek", "You clicked on animal : " + drawable);

        ImageView iCoverArt = findViewById(R.id.pfpPost);
        iCoverArt.setImageResource(drawable);
    }
}