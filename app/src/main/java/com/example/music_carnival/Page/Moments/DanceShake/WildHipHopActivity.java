package com.example.music_carnival.Page.Moments.DanceShake;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.anupkumarpanwar.scratchview.ScratchView;
import com.example.music_carnival.Page.Moments.DanceShake.WildCard.WildCardActivity;
import com.example.music_carnival.Page.Moments.MomentsPackage.Moments;
import com.example.music_carnival.R;

import java.util.Random;

public class WildHipHopActivity extends AppCompatActivity {
    ImageButton backButton;
    ImageButton imageButton;
    ImageButton btnGenre;
    Button findSongButton;
    TextView textView;
    ScratchView scratchView;
    Random r;
    Integer[] images = {
            R.drawable.hurt2bhuman,
            R.drawable.iftheworldwasending,
            R.drawable.kissmemor,
            R.drawable.lovescenario,
            R.drawable.leavethedooropen,
            R.drawable.magic24k,
            R.drawable.monster,

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wild_card);

        r = new Random();
        textView = findViewById(R.id.wildCardTitle);


        btnGenre = findViewById(R.id.btnMenu);
        btnGenre.setOnClickListener(new View.OnClickListener() { //FIRST ONCLICK
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(WildHipHopActivity.this, btnGenre);
                getMenuInflater().inflate(R.menu.menu_wildcard, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {//SECOND ONCLICK
                        Toast.makeText(WildHipHopActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                        int id = item.getItemId();

                        if (id == R.id.wildAll) {
                            Intent intentHH = new Intent(WildHipHopActivity.this, WildCardActivity.class);
                            startActivity(intentHH);
                            Toast.makeText(WildHipHopActivity.this, "Wildcard genre - All", Toast.LENGTH_SHORT).show();
                        }
                        if (id == R.id.wildHipHop) {
                            //do nothing
                        } else if (id == R.id.wildDance) {
                            Intent intentDE = new Intent(WildHipHopActivity.this, WildDanceElecActivity.class);
                            startActivity(intentDE);
                            Toast.makeText(WildHipHopActivity.this, "Wildcard genre - Dance/Electronic", Toast.LENGTH_SHORT).show();
                        } else if (id == R.id.wildRBSoul) {
                            Intent intentRB = new Intent(WildHipHopActivity.this, WildRBSoulActivity.class);
                            startActivity(intentRB);
                            Toast.makeText(WildHipHopActivity.this, "Wildcard genre - R&B/Soul", Toast.LENGTH_SHORT).show();
                        } else if (id == R.id.wildAlt) {
                            Intent intentRB = new Intent(WildHipHopActivity.this, WildAltIndieActivity.class);
                            startActivity(intentRB);
                            Toast.makeText(WildHipHopActivity.this, "Wildcard genre - Alternative/Indie", Toast.LENGTH_SHORT).show();
                        } else if (id == R.id.wildJPop) {
                            Intent intentAI = new Intent(WildHipHopActivity.this, WildJPopActivity.class);
                            startActivity(intentAI);
                            Toast.makeText(WildHipHopActivity.this, "Wildcard genre - J-Pop", Toast.LENGTH_SHORT).show();
                        } else if (id == R.id.wildKPop) {
                            Intent intentRB = new Intent(WildHipHopActivity.this, WildKPopActivity.class);
                            startActivity(intentRB);
                            Toast.makeText(WildHipHopActivity.this, "Wildcard genre - K-Pop", Toast.LENGTH_SHORT).show();
                        } else if (id == R.id.wildContemp) {
                            Intent intentRB = new Intent(WildHipHopActivity.this, WildContempActivity.class);
                            startActivity(intentRB);
                            Toast.makeText(WildHipHopActivity.this, "Wildcard genre - Contemporary", Toast.LENGTH_SHORT).show();
                        } else if (id == R.id.wildRap) {
                            Intent intentRB = new Intent(WildHipHopActivity.this, WildRapActivity.class);
                            startActivity(intentRB);
                            Toast.makeText(WildHipHopActivity.this, "Wildcard genre - Rap", Toast.LENGTH_SHORT).show();
                        }
                        return true;
                    }
                });
                popup.show();

            }
        });


        //ScratchView here
        scratchView = findViewById(R.id.scratchView);
        scratchView.setRevealListener(new ScratchView.IRevealListener() {
            @Override
            public void onRevealed(ScratchView scratchView) {
                Toast.makeText(WildHipHopActivity.this, "Revealed", Toast.LENGTH_SHORT).show();
                if (images.equals(R.drawable.harrystyles)) {
                    textView.setText("Fine Line");
                }
            }

            @Override
            public void onRevealPercentChangedListener(ScratchView scratchView, float percent) {
                Toast.makeText(WildHipHopActivity.this, "Scratched off" + percent * 100, Toast.LENGTH_SHORT).show();
            }
        });


        backButton = findViewById(R.id.btnBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WildHipHopActivity.this, Moments.class);
                startActivity(intent);
            }
        });


        //initialize
        imageButton = findViewById(R.id.wildCardImage);
        findSongButton = findViewById(R.id.btnFind);
        findSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WildHipHopActivity.this, "Finding Song", Toast.LENGTH_SHORT).show();
                //display random images by setting array integer
                imageButton.setImageResource(images[r.nextInt(images.length)]);
                textView.setText("Song found! Scratch to reveal");

            }
        });
    }
}