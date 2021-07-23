package com.example.music_carnival.Page.Moments.DanceShake.WildCard;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.music_carnival.Page.Moments.DanceShake.WildAltIndieActivity;
import com.example.music_carnival.Page.Moments.DanceShake.WildContempActivity;
import com.example.music_carnival.Page.Moments.DanceShake.WildDanceElecActivity;
import com.example.music_carnival.Page.Moments.DanceShake.WildHipHopActivity;
import com.example.music_carnival.Page.Moments.DanceShake.WildJPopActivity;
import com.example.music_carnival.Page.Moments.DanceShake.WildKPopActivity;
import com.example.music_carnival.Page.Moments.DanceShake.WildRBSoulActivity;
import com.example.music_carnival.Page.Moments.DanceShake.WildRapActivity;
import com.example.music_carnival.R;

import java.util.Random;

public class WildCardActivity extends AppCompatActivity {


    ImageView imageWildCard;
    ImageButton btnGenre;
    TextView textView;
    TextView codeTxt;


    private ScratchCard mScratchCard;


    Random r;
    Integer[] images = {
            R.drawable.harrystyles,
            R.drawable.allaboutthatbass,
            R.drawable.alliknowsofar,
            R.drawable.bangerz,
            R.drawable.bluma_to_lunch,
            R.drawable.butter,
            R.drawable.eminem,

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wild_card);

        r = new Random();
        textView = findViewById(R.id.wildCardTitle);
        imageWildCard = findViewById(R.id.wildCardImage);
        mScratchCard = findViewById(R.id.scratchCard);

        imageWildCard.setImageResource(images[r.nextInt(images.length)]);
        findViewById(R.id.btnFind).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(getIntent());
                overridePendingTransition(0, 0);

                textView.setText("Finding Song!");

            }
        });
    }

    private void scratch(boolean isScratched) {
        if (isScratched) {
            mScratchCard.setVisibility(View.INVISIBLE);
        } else {
            mScratchCard.setVisibility(View.VISIBLE);
        }
    }

    private void handleListeners() {
        mScratchCard.setOnScratchListener(new ScratchCard.OnScratchListener() {
            @Override
            public void onScratch(ScratchCard scratchCard, float visiblePercent) {
                if (visiblePercent > 0.8) {
                    scratch(true);
                }
            }
        });




        btnGenre = findViewById(R.id.btnMenu);
        btnGenre.setOnClickListener(new View.OnClickListener() { //FIRST ONCLICK
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(WildCardActivity.this, btnGenre);
                getMenuInflater().inflate(R.menu.menu_wildcard, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {//SECOND ONCLICK
                        Toast.makeText(WildCardActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                        int id = item.getItemId();

                        if (id == R.id.wildAll) {
                            //do nothing
                        }
                        if (id == R.id.wildHipHop) {
                            Intent intentHH = new Intent(WildCardActivity.this, WildHipHopActivity.class);
                            startActivity(intentHH);
                            overridePendingTransition(0, 0);
                            Toast.makeText(WildCardActivity.this, "Wildcard genre - Hiphop", Toast.LENGTH_SHORT).show();

                        } else if (id == R.id.wildDance) {
                            Intent intentDE = new Intent(WildCardActivity.this, WildDanceElecActivity.class);
                            startActivity(intentDE);
                            overridePendingTransition(0, 0);
                            Toast.makeText(WildCardActivity.this, "Wildcard genre - Dance/Electronic", Toast.LENGTH_SHORT).show();
                        } else if (id == R.id.wildRBSoul) {
                            Intent intentRB = new Intent(WildCardActivity.this, WildRBSoulActivity.class);
                            startActivity(intentRB);
                            overridePendingTransition(0, 0);
                            Toast.makeText(WildCardActivity.this, "Wildcard genre - R&B/Soul", Toast.LENGTH_SHORT).show();
                        } else if (id == R.id.wildAlt) {
                            Intent intentRB = new Intent(WildCardActivity.this, WildAltIndieActivity.class);
                            startActivity(intentRB);
                            overridePendingTransition(0, 0);
                            Toast.makeText(WildCardActivity.this, "Wildcard genre - Alternative/Indie", Toast.LENGTH_SHORT).show();
                        } else if (id == R.id.wildJPop) {
                            Intent intentAI = new Intent(WildCardActivity.this, WildJPopActivity.class);
                            startActivity(intentAI);
                            overridePendingTransition(0, 0);
                            Toast.makeText(WildCardActivity.this, "Wildcard genre - J-Pop", Toast.LENGTH_SHORT).show();
                        } else if (id == R.id.wildKPop) {
                            Intent intentRB = new Intent(WildCardActivity.this, WildKPopActivity.class);
                            startActivity(intentRB);
                            overridePendingTransition(0, 0);
                            Toast.makeText(WildCardActivity.this, "Wildcard genre - K-Pop", Toast.LENGTH_SHORT).show();
                        } else if (id == R.id.wildContemp) {
                            Intent intentRB = new Intent(WildCardActivity.this, WildContempActivity.class);
                            startActivity(intentRB);
                            overridePendingTransition(0, 0);
                            Toast.makeText(WildCardActivity.this, "Wildcard genre - Contemporary", Toast.LENGTH_SHORT).show();
                        } else if (id == R.id.wildRap) {
                            Intent intentRB = new Intent(WildCardActivity.this, WildRapActivity.class);
                            startActivity(intentRB);
                            overridePendingTransition(0, 0);
                            Toast.makeText(WildCardActivity.this, "Wildcard genre - Rap", Toast.LENGTH_SHORT).show();
                        }
                        return true;
                    }
                });
                popup.show();

            }
        });


    }


}
