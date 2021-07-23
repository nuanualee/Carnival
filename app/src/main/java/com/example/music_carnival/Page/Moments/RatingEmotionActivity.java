package com.example.music_carnival.Page.Moments;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Rating;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.music_carnival.R;

public class RatingEmotionActivity extends AppCompatActivity {

    private TextView txtRating;
    private RatingBar ratingBar;
    private Button btnSubmit;
    private TextView txtBack;
    private ImageView bgEmotion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_emotion);

        txtBack = findViewById(R.id.txtBack);
        txtBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RatingEmotionActivity.this,Settings.class);
                startActivity(intent);
            }
        });


        init();

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float ratingValue, boolean fromUser) {
                String rating = "User Rating : " + ratingValue;
                txtRating.setText(rating);


                if (ratingValue == 0)
                    bgEmotion.setImageResource(R.drawable.emotion_default);
                if (ratingValue == 1)
                    bgEmotion.setImageResource(R.drawable.emotion_first);
                else if (ratingValue <= 2 && ratingValue > 1)
                    bgEmotion.setImageResource(R.drawable.emotion_second);
                else if (ratingValue <= 3 && ratingValue > 2)
                    bgEmotion.setImageResource(R.drawable.emotion_third);
                else if (ratingValue <= 4 && ratingValue > 3)
                    bgEmotion.setImageResource(R.drawable.emotion_fourth);
                else if (ratingValue <= 5 && ratingValue > 4)
                    bgEmotion.setImageResource(R.drawable.emotion_fifth);
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(RatingEmotionActivity.this);
                builder.setTitle("Alert");
                builder.setMessage("Selected rating : " + ratingBar.getRating() + "\nThank you for rating!");
                builder.setPositiveButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();
                    }
                });

                //second
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

    }


    //initialize
    private void init() {
        txtRating = findViewById(R.id.txtRating);
        ratingBar = findViewById(R.id.ratingBar);
        btnSubmit = findViewById(R.id.btnSubmit);
        bgEmotion = findViewById(R.id.bgEmotion);
    }

}