package com.example.music_carnival.Page.Moments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.music_carnival.AddProfile.AddProfile;
import com.example.music_carnival.R;

public class Account extends AppCompatActivity {


    ImageButton backButton, toUsernameButton;
    TextView txtUsername;
    Switch switchMode;
    TextView signOut;
    ImageButton arrowOne;

    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

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
}