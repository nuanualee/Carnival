package com.example.music_carnival.Page.Moments.DanceShake.WildCard;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.music_carnival.AddDone.Done;
import com.example.music_carnival.AddDone.DoneCollection;
import com.example.music_carnival.Page.Moments.DanceShake.WildAltIndieActivity;
import com.example.music_carnival.Page.Moments.DanceShake.WildContempActivity;
import com.example.music_carnival.Page.Moments.DanceShake.WildDanceElecActivity;
import com.example.music_carnival.Page.Moments.DanceShake.WildHipHopActivity;
import com.example.music_carnival.Page.Moments.DanceShake.WildJPopActivity;
import com.example.music_carnival.Page.Moments.DanceShake.WildKPopActivity;
import com.example.music_carnival.Page.Moments.DanceShake.WildRBSoulActivity;
import com.example.music_carnival.Page.Moments.DanceShake.WildRapActivity;
import com.example.music_carnival.Page.Moments.MomentsPackage.Moments;
import com.example.music_carnival.R;

import java.util.Random;

public class WildCardActivity extends AppCompatActivity {


    ImageView imageWildCard;
    ImageButton menu_button;
    TextView textView;
    TextView codeTxt;


    private ScratchCard mScratchCard;

    ImageButton backButton;


    Random r;
    Integer[] images = {

            //hiphop
            R.drawable.superbass,
            R.drawable.hurt2bhuman,
            R.drawable.mothersdaughter,
            R.drawable.heartofglass,
            R.drawable.n_sunflower,
            R.drawable.n_seeyouagain,
            R.drawable.n_onedancec,
            R.drawable.n_roxanne,
            R.drawable.n_peaches,
            R.drawable.n_hollywoodbleeding,

            //danceelec
            R.drawable.whodoyoulove,
            R.drawable.pbmeltdown,
            R.drawable.bangerz,
            R.drawable.sorry,
            R.drawable.n_allfallsdown,
            R.drawable.n_allweknow,
            R.drawable.n_onekiss,
            R.drawable.n_allforlove,
            R.drawable.n_allmylove,
            R.drawable.n_layitallonme,

            //rbsoul
            R.drawable.younger_now,
            R.drawable.harrystyles,
            R.drawable.truthaboutlove,
            R.drawable.n_wastingtime,
            R.drawable.n_tragic,
            R.drawable.n_outtatime,
            R.drawable.n_notanotherlovesong,
            R.drawable.n_byyourself,
            R.drawable.n_myaffection,
            R.drawable.leavethedooropen,

            //altindie
            R.drawable.shyaway,
            R.drawable.peoplehelpthepeople,
            R.drawable.heartbreakann,
            R.drawable.magic24k,
            R.drawable.n_goodgrief,
            R.drawable.n_broken,
            R.drawable.n_someonenew,
            R.drawable.n_moralofthestory,
            R.drawable.n_mountainsound,
            R.drawable.n_hohey,


            //jpop
            R.drawable.napori,
            R.drawable.relaxandchill,
            R.drawable.standbymeyou,
            R.drawable.dryflower,
            R.drawable.n_viewoflife,
            R.drawable.n_konomama,
            R.drawable.n_summersamasama,
            R.drawable.n_benefits,
            R.drawable.n_taketen,
            R.drawable.n_perfectworld,


            //kpop
            R.drawable.butter,
            R.drawable.howyoulikethat,
            R.drawable.lovescenario,
            R.drawable.monster,
            R.drawable.howyoulikethat,
            R.drawable.n_maria,
            R.drawable.n_leftandright,
            R.drawable.n_lifegoeson,
            R.drawable.n_fancy,
            R.drawable.n_filmout,


            //contemporary
            R.drawable.iftheworldwasending,
            R.drawable.plastichearts,
            R.drawable.harrystyles,
            R.drawable.yousay,
            R.drawable.n_someoneyouloved,
            R.drawable.n_sucker,
            R.drawable.n_hollywoodbleeding,
            R.drawable.n_loseyoutoloveme,
            R.drawable.n_lover,
            R.drawable.n_beautifulpeople,




            //rap
            R.drawable.sickomode,
            R.drawable.ourtimetogether,
            R.drawable.seventhday,
            R.drawable.cominginhot,
    };


    private int drawable;
    private int currentIndex = -1;
    DoneCollection doneCollection = new DoneCollection();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wild_card);

        Bundle bundle = this.getIntent().getExtras(); //receiving Extras from Animal
        if (bundle != null) {
            currentIndex = bundle.getInt("pfp");
            Log.d("bark", "we received: " + currentIndex);
            int i = bundle.getInt("pfp");
            displayAnimalBasedOnIndex(currentIndex);
        }

        backButton = findViewById(R.id.btnBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WildCardActivity.this, Moments.class);

                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "WILDCARD received: " + currentIndex + "back to MOMENTS");
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);
                intent.putExtra("pfp", i);

                startActivity(intent);
            }
        });


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

        menu_button = findViewById(R.id.btnMenu);
        menu_button.setOnClickListener(new View.OnClickListener() { //FIRST ONCLICK
            @Override
            public void onClick(View v) {
                Toast.makeText(WildCardActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
                PopupMenu popup = new PopupMenu(WildCardActivity.this, menu_button);
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
                            Intent intent = new Intent(WildCardActivity.this, WildHipHopActivity.class);
                            startActivity(intent);

                            currentIndex = bundle.getInt("pfp");
                            Log.d("bark", "WildCard sending: " + currentIndex + "to HipHop");
                            int i = bundle.getInt("pfp");
                            displayAnimalBasedOnIndex(currentIndex);
                            intent.putExtra("pfp", i);


                            overridePendingTransition(0, 0);
                            Toast.makeText(WildCardActivity.this, "Wildcard genre - Hiphop", Toast.LENGTH_SHORT).show();

                        } else if (id == R.id.wildDance) {
                            Intent intent = new Intent(WildCardActivity.this, WildDanceElecActivity.class);

                            currentIndex = bundle.getInt("pfp");
                            Log.d("bark", "WildCard sending: " + currentIndex + "to dance");
                            int i = bundle.getInt("pfp");
                            displayAnimalBasedOnIndex(currentIndex);
                            intent.putExtra("pfp", i);




                            startActivity(intent);
                            overridePendingTransition(0, 0);
                            Toast.makeText(WildCardActivity.this, "Wildcard genre - Dance/Electronic", Toast.LENGTH_SHORT).show();
                        } else if (id == R.id.wildRBSoul) {
                            Intent intent = new Intent(WildCardActivity.this, WildRBSoulActivity.class);

                            currentIndex = bundle.getInt("pfp");
                            Log.d("bark", "WildCard sending: " + currentIndex + "to rbsoul");
                            int i = bundle.getInt("pfp");
                            displayAnimalBasedOnIndex(currentIndex);
                            intent.putExtra("pfp", i);


                            startActivity(intent);
                            overridePendingTransition(0, 0);
                            Toast.makeText(WildCardActivity.this, "Wildcard genre - R&B/Soul", Toast.LENGTH_SHORT).show();
                        } else if (id == R.id.wildAlt) {
                            Intent intent = new Intent(WildCardActivity.this, WildAltIndieActivity.class);

                            currentIndex = bundle.getInt("pfp");
                            Log.d("bark", "WildCard sending: " + currentIndex + "to alt indie");
                            int i = bundle.getInt("pfp");
                            displayAnimalBasedOnIndex(currentIndex);
                            intent.putExtra("pfp", i);


                            startActivity(intent);
                            overridePendingTransition(0, 0);
                            Toast.makeText(WildCardActivity.this, "Wildcard genre - Alternative/Indie", Toast.LENGTH_SHORT).show();
                        } else if (id == R.id.wildJPop) {
                            Intent intent = new Intent(WildCardActivity.this, WildJPopActivity.class);

                            currentIndex = bundle.getInt("pfp");
                            Log.d("bark", "WildCard sending: " + currentIndex + "to jpop");
                            int i = bundle.getInt("pfp");
                            displayAnimalBasedOnIndex(currentIndex);
                            intent.putExtra("pfp", i);


                            startActivity(intent);
                            overridePendingTransition(0, 0);
                            Toast.makeText(WildCardActivity.this, "Wildcard genre - J-Pop", Toast.LENGTH_SHORT).show();
                        } else if (id == R.id.wildKPop) {
                            Intent intent = new Intent(WildCardActivity.this, WildKPopActivity.class);

                            currentIndex = bundle.getInt("pfp");
                            Log.d("bark", "WildCard sending: " + currentIndex + "to kpop");
                            int i = bundle.getInt("pfp");
                            displayAnimalBasedOnIndex(currentIndex);
                            intent.putExtra("pfp", i);


                            startActivity(intent);
                            overridePendingTransition(0, 0);
                            Toast.makeText(WildCardActivity.this, "Wildcard genre - K-Pop", Toast.LENGTH_SHORT).show();
                        } else if (id == R.id.wildContemp) {
                            Intent intent = new Intent(WildCardActivity.this, WildContempActivity.class);

                            currentIndex = bundle.getInt("pfp");
                            Log.d("bark", "WildCard sending: " + currentIndex + "to contemporary");
                            int i = bundle.getInt("pfp");
                            displayAnimalBasedOnIndex(currentIndex);
                            intent.putExtra("pfp", i);


                            startActivity(intent);
                            overridePendingTransition(0, 0);
                            Toast.makeText(WildCardActivity.this, "Wildcard genre - Contemporary", Toast.LENGTH_SHORT).show();
                        } else if (id == R.id.wildRap) {
                            Intent intent = new Intent(WildCardActivity.this, WildRapActivity.class);

                            currentIndex = bundle.getInt("pfp");
                            Log.d("bark", "WildCard sending: " + currentIndex + "to rap");
                            int i = bundle.getInt("pfp");
                            displayAnimalBasedOnIndex(currentIndex);
                            intent.putExtra("pfp", i);


                            startActivity(intent);
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


    }

    public void displayAnimalBasedOnIndex(int selectedIndex) {
        Done done = doneCollection.getCurrentAnimal(selectedIndex);
        drawable = done.getDrawable();
        Log.d("temasek", "You clicked on animal : " + drawable);

        ImageView iCoverArt = findViewById(R.id.pfpWildCardActivity);
        iCoverArt.setImageResource(drawable);
    }


}
