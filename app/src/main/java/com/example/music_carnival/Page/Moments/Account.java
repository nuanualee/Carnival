package com.example.music_carnival.Page.Moments;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import com.example.music_carnival.AddDone.Done;
import com.example.music_carnival.AddDone.DoneCollection;
import com.example.music_carnival.AddProfile.AddProfile;
import com.example.music_carnival.R;

public class Account extends AppCompatActivity{ //implements AdapterView.OnItemSelectedListener {


    ImageButton backButton, toUsernameButton;
    TextView txtUsername;
    Switch switchMode;
    TextView signOut;
    ImageButton arrowOne;

    SharedPreferences sharedPreferences;

    private int drawable;
    private int currentIndex = -1;
    DoneCollection doneCollection = new DoneCollection();

    Spinner spinnerLanguage;
    int selectedLangauge;
    Context context;
    Resources resources;

    View viewAccount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        Bundle bundle = this.getIntent().getExtras(); //receiving Extras from Animal
        if (bundle != null) {
            currentIndex = bundle.getInt("pfp");
            Log.d("bark", "we received: " + currentIndex);
            int i = bundle.getInt("pfp");
            displayAnimalBasedOnIndex(currentIndex);
        }

        arrowOne = findViewById(R.id.arrowOne);

        switchMode = findViewById(R.id.switchMode);
        int currentMode = AppCompatDelegate.getDefaultNightMode();
        switchMode.setChecked(currentMode == AppCompatDelegate.MODE_NIGHT_YES);
        switchMode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                }
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            }
        });


        txtUsername = findViewById(R.id.txt_userNameDisplay);
        sharedPreferences = getSharedPreferences("SHARED_PREF", MODE_PRIVATE);
        String name = sharedPreferences.getString("NAME", "");

        if (name != null) {
            //set data on textview after if
            txtUsername.setText(name);
            arrowOne.setVisibility(View.INVISIBLE);
        }


        backButton = findViewById(R.id.btnBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Account.this, Settings.class);

                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);
                intent.putExtra("pfp", i);

                startActivity(intent);
            }
        });


        signOut = findViewById(R.id.viewSignOut);
        signOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();

                Intent intent = new Intent(Account.this, AddProfile.class);
                startActivity(intent);
                finish();

                Toast.makeText(Account.this, "Signed out!", Toast.LENGTH_SHORT).show();
            }
        });




    }
    public void displayAnimalBasedOnIndex(int selectedIndex) {
        Done done = doneCollection.getCurrentAnimal(selectedIndex);
        drawable = done.getDrawable();
        Log.d("temasek", "You clicked on animal : " + drawable);

        ImageView iCoverArt = findViewById(R.id.pfpInsideSettings);
        iCoverArt.setImageResource(drawable);
    }




    /*@Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (parent.getId() == R.id.spinner){
            String spinnerValue = parent.getItemAtPosition(position).toString()

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    } */
}