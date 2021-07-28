package com.example.music_carnival.Popular;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.music_carnival.AddDone.Done;
import com.example.music_carnival.AddDone.DoneCollection;
import com.example.music_carnival.Page.MainActivity.MainActivity;
import com.example.music_carnival.R;

public class PopularActivity extends AppCompatActivity {

    ListView listView;
    int[] popularAlbum = {R.drawable.alliknowsofar, R.drawable.signofthetimes,
            R.drawable.plastichearts, R.drawable.relaxandchill, R.drawable.shyaway,
            R.drawable.hurt2bhuman, R.drawable.harrystyles};
    String[] title = {"All I Know So Far", "Sign Of The Times", "Angels Like You",
            "Toriko", "Shy Away", "Walk Me Home", "Lights Up"};
    String[] artiste = {"P!nk", "Harry Styles", "Miley Cyrus", "Nissy", "Twenty one Pilots",
            "P!nk", "Lights Up"};
    String[] id = {"popularFirst", "popularSecond", "popularThird", "popularFourth",
            "popularFifth", "popularSixth", "popularSeventh"};

    Animation animRotate;
    ImageView cd_Popular;
    ImageButton backButton;


    private int drawable;
    private int currentIndex = -1;
    DoneCollection doneCollection = new DoneCollection();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular);

        Bundle bundle = this.getIntent().getExtras(); //receiving Extras from Animal
        if (bundle != null) {
            currentIndex = bundle.getInt("pfp");
            Log.d("bark", "NEW IN received: " + currentIndex);
            int i = bundle.getInt("pfp");
            displayAnimalBasedOnIndex(currentIndex);
        }

        listView = findViewById(R.id.listview);

        PopularAdapter adapter = new PopularAdapter(this,artiste,title,popularAlbum);
        listView.setAdapter(adapter);

        //onclick on listview
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                if (position == 0){
                    Toast.makeText(PopularActivity.this, "1st Popular!", Toast.LENGTH_SHORT).show();
                }
                if (position == 1){
                    Toast.makeText(PopularActivity.this, "2nd Popular!", Toast.LENGTH_SHORT).show();
                }
                if (position == 2){
                    Toast.makeText(PopularActivity.this, "3rd Popular!", Toast.LENGTH_SHORT).show();
                }

            }
        });


       cd_Popular = findViewById(R.id.cd_Popular);
       rotateAnimation();


        backButton = findViewById(R.id.btnBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PopularActivity.this, MainActivity.class);

                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "BACK SENDING: " + currentIndex + " back MAIN");
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);
                intent.putExtra("pfp", i);


                startActivity(intent);
            }
        });
    }

    private void rotateAnimation() {

        animRotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
        cd_Popular.startAnimation(animRotate);

    }


    //adapter
    class PopularAdapter extends ArrayAdapter<String> {
        Context context;
        String[] title;
        String[] artiste;
        int[] album;

        PopularAdapter(Context c, String[] title, String[] artiste, int[] album) {
            super(c, R.layout.list_popular, R.id.popularTitle,title);
            this.context = c;
            this.title = title;
            this.artiste = artiste;
            this.album = album;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.list_popular,parent,false);
            ImageView popularAlbum = row.findViewById(R.id.popularAlbum);
            TextView popularTitle = row.findViewById(R.id.popularTitle);
            TextView popularArtiste = row.findViewById(R.id.popularArtiste);

            //set resources on views
            popularAlbum.setImageResource(album[position]);
            popularTitle.setText(title[position]);
            popularArtiste.setText(artiste[position]);


            return row;
        }
    }
    public void displayAnimalBasedOnIndex(int selectedIndex) {
        Done done = doneCollection.getCurrentAnimal(selectedIndex);
        drawable = done.getDrawable();
        Log.d("temasek", "You clicked on animal : " + drawable);

        ImageView iCoverArt = findViewById(R.id.pfpPopularActivity);
        iCoverArt.setImageResource(drawable);
    }

}