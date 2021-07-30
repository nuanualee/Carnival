package com.example.music_carnival.AddProfile;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.music_carnival.ProfileAct.ProfileActivity;
import com.example.music_carnival.R;

public class AddProfile extends AppCompatActivity {


    TextView txt;

    ImageButton saveButton;
    ImageButton cancelButton;
    ImageButton menu_button;

    ImageButton btnSave;

    //(ONE) Declare name input in xml
    EditText nameInput;

    ///////////////////////////
    AddProfileCollection addProfileCollection = new AddProfileCollection();
    SharedPreferences sharedPreferences;
    EditText txtDisplayName;
    TextView txtPlaceHolder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_profile);

        //init
        btnSave = findViewById(R.id.btn1);
        sharedPreferences = getSharedPreferences("SHARED_PREF", MODE_PRIVATE);
        String name = sharedPreferences.getString("NAME", "");
        txt = findViewById(R.id.txt_displayName);
        txtDisplayName = findViewById(R.id.txtDisplayName);
        txtPlaceHolder = findViewById(R.id.txtPlaceHolder);

        /* if (name != null) {
            //set data on textview after if
          //  txtDisplayName.setVisibility(View.INVISIBLE);
            txtPlaceHolder.setText("You have previously signed in with Remember Me");
          //  txt.setText(name);
        } else {
            txtDisplayName.setVisibility(View.VISIBLE);

        } */

        //menu button
        menu_button = findViewById(R.id.btnMenu);
        menu_button.setOnClickListener(new View.OnClickListener() { //FIRST ONCLICK

            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(AddProfile.this, menu_button);
                popup.getMenuInflater().inflate(R.menu.menu_profile, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {//SECOND ONCLICK
                        Toast.makeText(AddProfile.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                        int id = item.getItemId();
                        if (id == R.id.firstProfile) {
                        } else if (id == R.id.secondProfile) {

                        } else if (id == R.id.subLogin1) {
                            Toast.makeText(AddProfile.this, "Directing to Login", Toast.LENGTH_SHORT).show();
                            Intent loginPage = new Intent(AddProfile.this, ExistingLoginActivity.class);
                            startActivity(loginPage);
                        }
                        if (id == R.id.subDelete1) {
                            Toast.makeText(AddProfile.this, "Deleting Profile", Toast.LENGTH_SHORT).show();
                        } else if (id == R.id.subLogin2) {
                            Toast.makeText(AddProfile.this, "Directing to Login", Toast.LENGTH_SHORT).show();
                            Intent loginPage = new Intent(AddProfile.this, ExistingLoginActivity.class);
                            startActivity(loginPage);
                        }
                        if (id == R.id.subDelete2) {
                            Toast.makeText(AddProfile.this, "Deleting Profile", Toast.LENGTH_SHORT).show();
                        }

                        return true;
                    }
                });
                popup.show();

            }
        });


        //(ONE) initialize name input
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //putting data on shared preferences
                String name = nameInput.getText().toString();

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("NAME", name);
                editor.apply();

                Toast.makeText(AddProfile.this, "Please choose an unique avatar!", Toast.LENGTH_SHORT).show();
            }
        });


        cancelButton = findViewById(R.id.btn2);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AddProfile.this, "You will exit the app if you click cancel once more!", Toast.LENGTH_SHORT).show();
            }
        });

    }


    public void handleSelection(View myView) {
        String resourceId = getResources().getResourceEntryName(myView.getId());
        int currentArrayIndex = addProfileCollection.searchButtonById(resourceId);
        Log.d("temasek", "The pressed image is   " + currentArrayIndex);
        sendDataToProfile(currentArrayIndex);
    }

    public void sendDataToProfile(int i) {
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra("pfp", i);
        startActivity(intent);
    }


}