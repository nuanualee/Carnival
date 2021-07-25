package SongCollection.Song.Countdown;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.music_carnival.R;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.Timer;

import SongCollection.Song.All.SongCollection;

public class Countdown extends AppCompatActivity {


    boolean check = false;
    ImageButton firstTimer;
    TextView fiveSeconds;
    ImageButton secondTimer;
    TextView tenSeconds;
    ImageButton thirdTimer;
    TextView twentyFiveSeconds;
    ImageButton fourthTimer;
    TextView fortySeconds;

    ImageButton startTimer;
    Countdown countDownTimer;

    ShapeableImageView display_Album;

    private long mStartTimeInMillis;
    Timer timer;
    SongCollection songCollection = new SongCollection();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countdown);

        firstTimer = findViewById(R.id.timer1);
        fiveSeconds = findViewById(R.id.fiveSeconds);
        secondTimer = findViewById(R.id.timer2);
        tenSeconds = findViewById(R.id.tenSeconds);
        thirdTimer = findViewById(R.id.timer3);
        twentyFiveSeconds = findViewById(R.id.twoFiveSeconds);
        fourthTimer = findViewById(R.id.timer4);
        fortySeconds = findViewById(R.id.fourtySeconds);

        startTimer = findViewById(R.id.btnStart);

        Bundle extras = this.getIntent().getExtras();
        if (extras == null) {
            return;
        }
        int pic = extras.getInt("ALBUM");
        display_Album = findViewById(R.id.display_Album);
        display_Album.setImageResource(pic);

        int currentIndex = extras.getInt("index");
        Log.d("temasek", "Countdown CHOOSING Received " + currentIndex);

        int pfpCurrentIndex = extras.getInt("pfp");
        Log.d("temasek", "Countdown PFP Received " + pfpCurrentIndex);

        String genre = extras.getString("genre");
        Log.d("temasek", "Countdown GENRE Received " + genre);



        //first timer
        firstTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Countdown.this, "5 SECONDS", Toast.LENGTH_SHORT).show();
                firstTimer.setImageResource(R.drawable.timer_orange);
                fiveSeconds.setTextColor(Color.rgb(255, 68, 0));

                secondTimer.setImageResource(R.drawable.timer);
                tenSeconds.setTextColor(Color.rgb(255, 255, 255));

                thirdTimer.setImageResource(R.drawable.timer);
                twentyFiveSeconds.setTextColor(Color.rgb(255, 255, 255));

                fourthTimer.setImageResource(R.drawable.timer);
                fortySeconds.setTextColor(Color.rgb(255, 255, 255));

                startTimer.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Countdown.this, ElaspedCountdownActivity.class);

                        intent.putExtra("index", currentIndex);
                        intent.putExtra("pfp",pfpCurrentIndex);
                        intent.putExtra("timer", 1);
                        intent.putExtra("genre",genre);

                        startActivity(intent);
                    }
                });

            }
        });


        //second timer
        secondTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Countdown.this, "10 SECONDS", Toast.LENGTH_SHORT).show();
                secondTimer.setImageResource(R.drawable.timer_orange);
                tenSeconds.setTextColor(Color.rgb(255, 68, 0));

                firstTimer.setImageResource(R.drawable.timer);
                fiveSeconds.setTextColor(Color.rgb(255, 255, 255));

                thirdTimer.setImageResource(R.drawable.timer);
                twentyFiveSeconds.setTextColor(Color.rgb(255, 255, 255));

                fourthTimer.setImageResource(R.drawable.timer);
                fortySeconds.setTextColor(Color.rgb(255, 255, 255));

                startTimer.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Countdown.this, ElaspedCountdownActivity.class);

                        intent.putExtra("index", currentIndex);
                        intent.putExtra("pfp",pfpCurrentIndex);
                        intent.putExtra("timer", 2);
                        intent.putExtra("genre",genre);

                        startActivity(intent);
                    }
                });

            }
        });

        //third timer
        thirdTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Countdown.this, "25 SECONDS", Toast.LENGTH_SHORT).show();
                thirdTimer.setImageResource(R.drawable.timer_orange);
                twentyFiveSeconds.setTextColor(Color.rgb(255, 68, 0));

                firstTimer.setImageResource(R.drawable.timer);
                fiveSeconds.setTextColor(Color.rgb(255, 255, 255));

                secondTimer.setImageResource(R.drawable.timer);
                tenSeconds.setTextColor(Color.rgb(255, 255, 255));

                fourthTimer.setImageResource(R.drawable.timer);
                fortySeconds.setTextColor(Color.rgb(255, 255, 255));

                startTimer.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Countdown.this, ElaspedCountdownActivity.class);

                        intent.putExtra("index", currentIndex);
                        intent.putExtra("pfp",pfpCurrentIndex);
                        intent.putExtra("timer", 3);
                        intent.putExtra("genre",genre);

                        startActivity(intent);
                    }
                });


            }
        });

        //fourth timer
        fourthTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Countdown.this, "40 SECONDS", Toast.LENGTH_SHORT).show();
                fourthTimer.setImageResource(R.drawable.timer_orange);
                fortySeconds.setTextColor(Color.rgb(255, 68, 0));

                firstTimer.setImageResource(R.drawable.timer);
                fiveSeconds.setTextColor(Color.rgb(255, 255, 255));

                secondTimer.setImageResource(R.drawable.timer);
                tenSeconds.setTextColor(Color.rgb(255, 255, 255));

                thirdTimer.setImageResource(R.drawable.timer);
                twentyFiveSeconds.setTextColor(Color.rgb(255, 255, 255));

                startTimer.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Countdown.this, ElaspedCountdownActivity.class);

                        intent.putExtra("index", currentIndex);
                        intent.putExtra("pfp",pfpCurrentIndex);
                        intent.putExtra("timer",4);
                        intent.putExtra("genre",genre);

                        startActivity(intent);
                    }
                });

            }
        });
    }


}