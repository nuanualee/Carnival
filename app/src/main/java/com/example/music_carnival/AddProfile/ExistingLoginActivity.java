package com.example.music_carnival.AddProfile;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.music_carnival.Page.Moments.MomentsPackage.Moments;
import com.example.music_carnival.R;
import com.google.android.material.imageview.ShapeableImageView;

public class ExistingLoginActivity extends AppCompatActivity {


    EditText editUsername, editPassword;
    CheckBox rememberMe;
    Button signIn;
    ShapeableImageView existingProfile;
    boolean isRemembered = false;


    //create shared preferences name and also create key name
    SharedPreferences sharedPreferences;


  //  ImageView drawable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_existing_login);

        editUsername = findViewById(R.id.txtEditUsername);
        editPassword = findViewById(R.id.txtEditPassword);
        rememberMe = findViewById(R.id.rememberMe);
        signIn = findViewById(R.id.btnSignIn);


        existingProfile = findViewById(R.id.existingProfile);
        existingProfile.setImageResource(R.drawable.pfp_cat);


        //activity check if data is available
        sharedPreferences = getSharedPreferences("SHARED_PREF", MODE_PRIVATE);
        //default value of checkbox is false
        isRemembered = sharedPreferences.getBoolean("CHECKED", false);

        if (isRemembered) {
            Intent intent = new Intent(ExistingLoginActivity.this, Moments.class);
            startActivity(intent);
            finish();
        }

        //GO TO HOME, DATA WILL GO
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //putting data on shared preferences
                String name = editUsername.getText().toString();
                boolean checked = rememberMe.isChecked();

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("NAME", name);
                editor.putBoolean("CHECKED", checked);
                editor.apply();

                Toast.makeText(ExistingLoginActivity.this, "Login succesfully!", Toast.LENGTH_SHORT).show();

            }
        });
    }


}