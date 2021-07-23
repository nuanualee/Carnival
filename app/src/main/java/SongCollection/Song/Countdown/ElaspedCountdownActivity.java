package SongCollection.Song.Countdown;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.music_carnival.R;

import SongCollection.Song.All.PlaySongActivity;
import SongCollection.Song.AlternativeIndie.PlayAltIndieSongActivity;
import SongCollection.Song.Contemporary.PlayContempSongActivity;
import SongCollection.Song.DanceElectronic.PlayDanceElectronicActivity;
import SongCollection.Song.HipHop.PlayHipHopSongActivity;
import SongCollection.Song.JPop.PlayJPopSongActivity;
import SongCollection.Song.KPop.PlayKPopSongActivity;
import SongCollection.Song.RBSoul.PlayRBSoulSongActivity;
import SongCollection.Song.Rap.PlayRapSongActivity;

public class ElaspedCountdownActivity extends AppCompatActivity {

    TextView timeDisplay;
    Button startButton;
    CountDownTimer countdownTimer;
    int remainingTime = 60;

    TextView textOverlay;
    ImageView bgOverlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elasped_countdown);


        timeDisplay = findViewById(R.id.timeDisplay);
        startButton = findViewById(R.id.buttonStart);


        bgOverlay = findViewById(R.id.bgOverlay);
        textOverlay = findViewById(R.id.textOverlay);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.btt);


        Bundle extras = this.getIntent().getExtras();
        if (extras == null) {
            return;
        }
        int currentIndex = extras.getInt("index");
        int timerPosition = extras.getInt("timer");
        String genre = extras.getString("genre");



        if (timerPosition == 1) {
            countdownTimer = new CountDownTimer(5000, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {

                    remainingTime = (int) millisUntilFinished / 1000;
                    timeDisplay.setText(String.valueOf(remainingTime));
                }

                @Override
                public void onFinish() {
                    //timeDisplay.setText("Finished!");

                    bgOverlay.setAnimation(animation);
                    textOverlay.setAnimation(animation);
                    bgOverlay.setVisibility(View.VISIBLE);
                    textOverlay.setVisibility(View.VISIBLE);
                    startButton.setVisibility(View.INVISIBLE);

                    if (genre.equals("mainActivity")) {
                        Intent intent = new Intent(ElaspedCountdownActivity.this, PlaySongActivity.class);
                        Log.d("temasek", "Elapsed will send over MAIN ACTIVITY INDEX " + currentIndex);
                        intent.putExtra("index", currentIndex);
                        startActivity(intent);
                    } else if (genre.equals("altIndie")) {
                        Intent intent = new Intent(ElaspedCountdownActivity.this, PlayAltIndieSongActivity.class);
                        Log.d("temasek", "Elapsed will send over ALT INDIE INDEX " + currentIndex);
                        intent.putExtra("index", currentIndex);
                        startActivity(intent);
                    } else if (genre.equals("contemp")) {
                        Intent intent = new Intent(ElaspedCountdownActivity.this, PlayContempSongActivity.class);
                        Log.d("temasek", "Elapsed will send over CONTEMP INDEX " + currentIndex);
                        intent.putExtra("index", currentIndex);
                        startActivity(intent);
                    } else if (genre.equals("hipHop")) {
                        Intent intent = new Intent(ElaspedCountdownActivity.this, PlayHipHopSongActivity.class);
                        Log.d("temasek", "Elapsed will send over HIP HOP INDEX " + currentIndex);
                        intent.putExtra("index", currentIndex);
                        startActivity(intent);
                    } else if (genre.equals("danceElec")) {
                        Intent intent = new Intent(ElaspedCountdownActivity.this, PlayDanceElectronicActivity.class);
                        Log.d("temasek", "Elapsed will send over DANCE ELECINDEX " + currentIndex);
                        intent.putExtra("index", currentIndex);
                        startActivity(intent);
                    } else if (genre.equals("jPop")) {
                        Intent intent = new Intent(ElaspedCountdownActivity.this, PlayJPopSongActivity.class);
                        Log.d("temasek", "Elapsed will send over JPOP INDEX " + currentIndex);
                        intent.putExtra("index", currentIndex);
                        startActivity(intent);
                    } else if (genre.equals("kPop")) {
                        Intent intent = new Intent(ElaspedCountdownActivity.this, PlayKPopSongActivity.class);
                        Log.d("temasek", "Elapsed will send over KPOP INDEX " + currentIndex);
                        intent.putExtra("index", currentIndex);
                        startActivity(intent);
                    } else if (genre.equals("rbSoul")) {
                        Intent intent = new Intent(ElaspedCountdownActivity.this, PlayRBSoulSongActivity.class);
                        Log.d("temasek", "Elapsed will send over RB SOUL INDEX " + currentIndex);
                        intent.putExtra("index", currentIndex);
                        startActivity(intent);
                    } else if (genre.equals("rap")) {
                        Intent intent = new Intent(ElaspedCountdownActivity.this, PlayRapSongActivity.class);
                        Log.d("temasek", "Elapsed will send over RAP INDEX " + currentIndex);
                        intent.putExtra("index", currentIndex);
                        startActivity(intent);
                    }
                }
            };
            countdownTimer.start();

        } else if (timerPosition == 2) {
            countdownTimer = new CountDownTimer(10000, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {

                    remainingTime = (int) millisUntilFinished / 1000;
                    timeDisplay.setText(String.valueOf(remainingTime));
                }

                @Override
                public void onFinish() {
                    //timeDisplay.setText("Finished!");
                    bgOverlay.setAnimation(animation);
                    textOverlay.setAnimation(animation);
                    bgOverlay.setVisibility(View.VISIBLE);
                    textOverlay.setVisibility(View.VISIBLE);
                    startButton.setVisibility(View.INVISIBLE);


                    if (genre.equals("mainActivity")) {
                        Intent intent2 = new Intent(ElaspedCountdownActivity.this, PlaySongActivity.class);
                        Log.d("temasek", "Elapsed will send over MAIN ACTIVITY INDEX " + currentIndex);
                        intent2.putExtra("index", currentIndex);
                        startActivity(intent2);
                    } else if (genre.equals("altIndie")) {
                        Intent intent2 = new Intent(ElaspedCountdownActivity.this, PlayAltIndieSongActivity.class);
                        Log.d("temasek", "Elapsed will send over ALT INDIE INDEX " + currentIndex);
                        intent2.putExtra("index", currentIndex);
                        startActivity(intent2);
                    } else if (genre.equals("contemp")) {
                        Intent intent2 = new Intent(ElaspedCountdownActivity.this, PlayContempSongActivity.class);
                        Log.d("temasek", "Elapsed will send over CONTEMP INDEX " + currentIndex);
                        intent2.putExtra("index", currentIndex);
                        startActivity(intent2);
                    } else if (genre.equals("hipHop")) {
                        Intent intent2 = new Intent(ElaspedCountdownActivity.this, PlayHipHopSongActivity.class);
                        Log.d("temasek", "Elapsed will send over HIP HOP INDEX " + currentIndex);
                        intent2.putExtra("index", currentIndex);
                        startActivity(intent2);
                    } else if (genre.equals("danceElec")) {
                        Intent intent2 = new Intent(ElaspedCountdownActivity.this, PlayDanceElectronicActivity.class);
                        Log.d("temasek", "Elapsed will send over DANCE ELECINDEX " + currentIndex);
                        intent2.putExtra("index", currentIndex);
                        startActivity(intent2);
                    } else if (genre.equals("jPop")) {
                        Intent intent2 = new Intent(ElaspedCountdownActivity.this, PlayJPopSongActivity.class);
                        Log.d("temasek", "Elapsed will send over JPOP INDEX " + currentIndex);
                        intent2.putExtra("index", currentIndex);
                        startActivity(intent2);
                    } else if (genre.equals("kPop")) {
                        Intent intent2 = new Intent(ElaspedCountdownActivity.this, PlayKPopSongActivity.class);
                        Log.d("temasek", "Elapsed will send over KPOP INDEX " + currentIndex);
                        intent2.putExtra("index", currentIndex);
                        startActivity(intent2);
                    } else if (genre.equals("rbSoul")) {
                        Intent intent2 = new Intent(ElaspedCountdownActivity.this, PlayRBSoulSongActivity.class);
                        Log.d("temasek", "Elapsed will send over RB SOUL INDEX " + currentIndex);
                        intent2.putExtra("index", currentIndex);
                        startActivity(intent2);
                    } else if (genre.equals("rap")) {
                        Intent intent2 = new Intent(ElaspedCountdownActivity.this, PlayRapSongActivity.class);
                        Log.d("temasek", "Elapsed will send over RAP INDEX " + currentIndex);
                        intent2.putExtra("index", currentIndex);
                        startActivity(intent2);
                    }
                }
            };
            countdownTimer.start();


        } else if (timerPosition == 3) {
            countdownTimer = new CountDownTimer(25000, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {

                    remainingTime = (int) millisUntilFinished / 1000;
                    timeDisplay.setText(String.valueOf(remainingTime));
                }

                @Override
                public void onFinish() {
                    //timeDisplay.setText("Finished!");3
                    bgOverlay.setAnimation(animation);
                    textOverlay.setAnimation(animation);
                    bgOverlay.setVisibility(View.VISIBLE);
                    textOverlay.setVisibility(View.VISIBLE);
                    startButton.setVisibility(View.INVISIBLE);


                    if (genre.equals("mainActivity")) {
                        Intent intent = new Intent(ElaspedCountdownActivity.this, PlaySongActivity.class);
                        Log.d("temasek", "Elapsed will send over MAIN ACTIVITY INDEX " + currentIndex);
                        intent.putExtra("index", currentIndex);
                        startActivity(intent);
                    } else if (genre.equals("altIndie")) {
                        Intent intent = new Intent(ElaspedCountdownActivity.this, PlayAltIndieSongActivity.class);
                        Log.d("temasek", "Elapsed will send over ALT INDIE INDEX " + currentIndex);
                        intent.putExtra("index", currentIndex);
                        startActivity(intent);
                    } else if (genre.equals("contemp")) {
                        Intent intent = new Intent(ElaspedCountdownActivity.this, PlayContempSongActivity.class);
                        Log.d("temasek", "Elapsed will send over CONTEMP INDEX " + currentIndex);
                        intent.putExtra("index", currentIndex);
                        startActivity(intent);
                    } else if (genre.equals("hipHop")) {
                        Intent intent = new Intent(ElaspedCountdownActivity.this, PlayHipHopSongActivity.class);
                        Log.d("temasek", "Elapsed will send over HIP HOP INDEX " + currentIndex);
                        intent.putExtra("index", currentIndex);
                        startActivity(intent);
                    } else if (genre.equals("danceElec")) {
                        Intent intent = new Intent(ElaspedCountdownActivity.this, PlayDanceElectronicActivity.class);
                        Log.d("temasek", "Elapsed will send over DANCE ELECINDEX " + currentIndex);
                        intent.putExtra("index", currentIndex);
                        startActivity(intent);
                    } else if (genre.equals("jPop")) {
                        Intent intent = new Intent(ElaspedCountdownActivity.this, PlayJPopSongActivity.class);
                        Log.d("temasek", "Elapsed will send over JPOP INDEX " + currentIndex);
                        intent.putExtra("index", currentIndex);
                        startActivity(intent);
                    } else if (genre.equals("kPop")) {
                        Intent intent = new Intent(ElaspedCountdownActivity.this, PlayKPopSongActivity.class);
                        Log.d("temasek", "Elapsed will send over KPOP INDEX " + currentIndex);
                        intent.putExtra("index", currentIndex);
                        startActivity(intent);
                    } else if (genre.equals("rbSoul")) {
                        Intent intent = new Intent(ElaspedCountdownActivity.this, PlayRBSoulSongActivity.class);
                        Log.d("temasek", "Elapsed will send over RB SOUL INDEX " + currentIndex);
                        intent.putExtra("index", currentIndex);
                        startActivity(intent);
                    } else if (genre.equals("rap")) {
                        Intent intent = new Intent(ElaspedCountdownActivity.this, PlayRapSongActivity.class);
                        Log.d("temasek", "Elapsed will send over RAP INDEX " + currentIndex);
                        intent.putExtra("index", currentIndex);
                        startActivity(intent);
                    }
                }
            };
            countdownTimer.start();


        } else if (timerPosition == 3) {
            countdownTimer = new CountDownTimer(40000, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {

                    remainingTime = (int) millisUntilFinished / 1000;
                    timeDisplay.setText(String.valueOf(remainingTime));
                }

                @Override
                public void onFinish() {
                    //timeDisplay.setText("Finished!");
                    //Intent intent = new Intent(ElaspedCountdownActivity.this, PlaySongActivity.class);
                    bgOverlay.setAnimation(animation);
                    textOverlay.setAnimation(animation);
                    bgOverlay.setVisibility(View.VISIBLE);
                    textOverlay.setVisibility(View.VISIBLE);
                    startButton.setVisibility(View.INVISIBLE);

                    if (genre.equals("mainActivity")) {
                        Intent intent3 = new Intent(ElaspedCountdownActivity.this, PlaySongActivity.class);
                        Log.d("temasek", "Elapsed will send over MAIN ACTIVITY INDEX " + currentIndex);
                        intent3.putExtra("index", currentIndex);
                        startActivity(intent3);
                    } else if (genre.equals("altIndie")) {
                        Intent intent3 = new Intent(ElaspedCountdownActivity.this, PlayAltIndieSongActivity.class);
                        Log.d("temasek", "Elapsed will send over ALT INDIE INDEX " + currentIndex);
                        intent3.putExtra("index", currentIndex);
                        startActivity(intent3);
                    } else if (genre.equals("contemp")) {
                        Intent intent3 = new Intent(ElaspedCountdownActivity.this, PlayContempSongActivity.class);
                        Log.d("temasek", "Elapsed will send over CONTEMP INDEX " + currentIndex);
                        intent3.putExtra("index", currentIndex);
                        startActivity(intent3);
                    } else if (genre.equals("hipHop")) {
                        Intent intent3 = new Intent(ElaspedCountdownActivity.this, PlayHipHopSongActivity.class);
                        Log.d("temasek", "Elapsed will send over HIP HOP INDEX " + currentIndex);
                        intent3.putExtra("index", currentIndex);
                        startActivity(intent3);
                    } else if (genre.equals("danceElec")) {
                        Intent intent3 = new Intent(ElaspedCountdownActivity.this, PlayDanceElectronicActivity.class);
                        Log.d("temasek", "Elapsed will send over DANCE ELECINDEX " + currentIndex);
                        intent3.putExtra("index", currentIndex);
                        startActivity(intent3);
                    } else if (genre.equals("jPop")) {
                        Intent intent3 = new Intent(ElaspedCountdownActivity.this, PlayJPopSongActivity.class);
                        Log.d("temasek", "Elapsed will send over JPOP INDEX " + currentIndex);
                        intent3.putExtra("index", currentIndex);
                        startActivity(intent3);
                    } else if (genre.equals("kPop")) {
                        Intent intent3 = new Intent(ElaspedCountdownActivity.this, PlayKPopSongActivity.class);
                        Log.d("temasek", "Elapsed will send over KPOP INDEX " + currentIndex);
                        intent3.putExtra("index", currentIndex);
                        startActivity(intent3);
                    } else if (genre.equals("rbSoul")) {
                        Intent intent3 = new Intent(ElaspedCountdownActivity.this, PlayRBSoulSongActivity.class);
                        Log.d("temasek", "Elapsed will send over RB SOUL INDEX " + currentIndex);
                        intent3.putExtra("index", currentIndex);
                        startActivity(intent3);
                    } else if (genre.equals("rap")) {
                        Intent intent3 = new Intent(ElaspedCountdownActivity.this, PlayRapSongActivity.class);
                        Log.d("temasek", "Elapsed will send over RAP INDEX " + currentIndex);
                        intent3.putExtra("index", currentIndex);
                        startActivity(intent3);
                    }
                }
            };
            countdownTimer.start();


            //  int currentIndex = extras.getInt("index");
            Log.d("temasek", "Countdown Elapsed Received " + currentIndex);


        }
    }
}

