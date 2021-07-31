package com.example.music_carnival.AddDone;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.music_carnival.Page.MainActivity.MainActivity;
import com.example.music_carnival.R;

public class AddProfileDone extends AppCompatActivity {

    String userStr;
    EditText user_txt;

    private int drawable;
    private int currentIndex = -1;
    ImageButton btnSave;

    DoneCollection doneCollection = new DoneCollection();
    AddDoneCollection addDoneCollection = new AddDoneCollection();


    SharedPreferences sharedPreferences;

    //remember me
    boolean isRemembered = false;
    CheckBox rememberMe;

    //progress dialog
    ProgressDialog progressDialog;
    Dialog dialog;
    ////////////////////////


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_profile_done);
        dialog = new Dialog(this);

        //init
        rememberMe = findViewById(R.id.rememberMe);
        sharedPreferences = getSharedPreferences("SHARED_PREF", MODE_PRIVATE);
        //default value of checkbox is false
        isRemembered = sharedPreferences.getBoolean("CHECKED", false);
        if (isRemembered) {
            Intent intent = new Intent(AddProfileDone.this, MainActivity.class);
            Bundle btnAnimal = this.getIntent().getExtras(); //receiving Extras from Animal
            int i = btnAnimal.getInt("pfp");
            intent.putExtra("pfp", i);

            startActivity(intent);
        }

        Bundle btnAnimal = this.getIntent().getExtras(); //receiving Extras from Animal
        currentIndex = btnAnimal.getInt("pfp");
        Log.d("bark", "we received: " + currentIndex);
        int i = btnAnimal.getInt("pfp");
        displayAnimalBasedOnIndex(currentIndex);


        ////////////////////////////////////////

        user_txt = findViewById(R.id.nameInput);
        btnSave = findViewById(R.id.btn1);


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //putting data on shared preferences
                String name = user_txt.getText().toString();
                boolean checked = rememberMe.isChecked();

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("NAME", name);
                editor.putBoolean("CHECKED", checked);
                editor.apply();


                //convert text to string
                userStr = user_txt.getText().toString();
                //deny users of empty field
                if (!userStr.equals("")) {
                    Toast.makeText(AddProfileDone.this, "Login succesfully!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(AddProfileDone.this, MainActivity.class);
                    intent.putExtra("pfp", i);
                    displayAnimalBasedOnIndex(currentIndex);


                    //init dialog
                    progressDialog = new ProgressDialog(AddProfileDone.this);
                    //show dialog
                    progressDialog.show();
                    progressDialog.setContentView(R.layout.progress_done_dialog);
                    //set transparent bg
                    progressDialog.getWindow().setBackgroundDrawableResource(
                            android.R.color.transparent
                    );


                    startActivity(intent);
                    finish();
                } else {
                    //if users did not write anything
                    Toast.makeText(AddProfileDone.this, "Type Display Name!", Toast.LENGTH_LONG).show();
                }
            }
        });



      /*  buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                userStr = user_txt.getText().toString();

             if (!userStr.isEmpty())
             {
                 Intent i = new Intent(getApplicationContext(),MainActivity.class) ;
                 i.putExtra("USERNAME",userStr);
                 startActivity(i);
             }
             else{
                 Toast.makeText(AddProfileDone.this, "Type Display Name!", Toast.LENGTH_LONG).show();
             }

            }
        }); */

    }


  /*  public void handleSelection(View myView) {
        String resourceId = getResources().getResourceEntryName(myView.getId());
        int currentArrayIndex = addDoneCollection.searchSCByID(resourceId);
        Log.d("temasek", "The pressed image is   " + currentArrayIndex);
        sendDataToProfile(currentArrayIndex);
    }

   /* public void sendDataToProfile(int i) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("index", i);
        startActivity(intent);

    } */

    public void displayAnimalBasedOnIndex(int selectedIndex) {
        Done done = doneCollection.getCurrentAnimal(selectedIndex);
        drawable = done.getDrawable();
        Log.d("temasek", "You clicked on animal : " + drawable);

        ImageView iCoverArt = findViewById(R.id.btnSmile);
        iCoverArt.setImageResource(drawable);
    }


}




   /*  public void handleSelection(View view) {
        String resourceId = getResources().getResourceEntryName(myView.getId());
        int currentArrayIndex = ProfileCollection.searchPicById

    }
    */
