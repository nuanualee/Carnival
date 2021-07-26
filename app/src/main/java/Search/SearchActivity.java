package Search;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.music_carnival.AddDone.Done;
import com.example.music_carnival.AddDone.DoneCollection;
import com.example.music_carnival.ArtistCollection.ArtistCollection;
import com.example.music_carnival.Page.MainActivity.MainActivity;
import com.example.music_carnival.R;

import java.util.ArrayList;

import SongCollection.Song.All.PlaySongActivity;
import SongCollection.Song.All.SongCollection;

public class SearchActivity extends AppCompatActivity {

    private ArrayList<Search> mSearchList;


    private RecyclerView recyclerView;
    private AdapterSearch sAdapter;
    private RecyclerView.LayoutManager layoutManager;
    SongCollection songCollection = new SongCollection();
    ArtistCollection artistCollection = new ArtistCollection();


    ImageView imageCancel;


    private int drawable;
    private int currentIndex = -1;
    DoneCollection doneCollection = new DoneCollection();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        createSearchList();
        buildRecyclerView();

        Bundle bundle = this.getIntent().getExtras(); //receiving Extras from Animal
        if (bundle != null) {
            currentIndex = bundle.getInt("pfp");
            Log.d("bark", "we received: " + currentIndex);
            int i = bundle.getInt("pfp");
            displayAnimalBasedOnIndex(currentIndex);
        }



        EditText editSearch = findViewById(R.id.editSearch);
        editSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });

        imageCancel = findViewById(R.id.imageCancel);
        imageCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cancelIntent = new Intent(SearchActivity.this, MainActivity.class);

                currentIndex = bundle.getInt("pfp");
                Log.d("bark", "we received: " + currentIndex);
                int i = bundle.getInt("pfp");
                displayAnimalBasedOnIndex(currentIndex);
                cancelIntent.putExtra("pfp", i);

                startActivity(cancelIntent);
            }
        });


    }


    private void filter(String text) {
        ArrayList<Search> filteredList = new ArrayList<>();
        for (Search item : mSearchList) {
            if (item.getName().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }

        sAdapter.filterList(filteredList);
    }


    private void createSearchList() {
        mSearchList = new ArrayList<>();
        mSearchList.add(new Search("one",
                "Fine Line",
                "Harry Styles",
                R.drawable.harrystyles));

        mSearchList.add(new Search("two",
                "Angels Like You",
                "Miley Cyrus",
                R.drawable.plastichearts));
        mSearchList.add(new Search("three",
                "Mother's Daughter",
                "Miley Cyrus",
                R.drawable.mothersdaughter));
        mSearchList.add(new Search("four",
                "Walk Me Home",
                "P!nk",
                R.drawable.plastichearts));
        mSearchList.add(new Search("five",
                "Super Bass",
                "Nicki Minaj",
                R.drawable.superbass));

        mSearchList.add(new Search("six",
                "Glass Of Heart",
                "Miley Cyrus",
                R.drawable.heartofglass));

        mSearchList.add(new Search("seven",
                "Who Do You Love",
                "The Chainsmokers",
                R.drawable.whodoyoulove));

        mSearchList.add(new Search("eight",
                "Timber",
                "Pitbull & Ke$ha",
                R.drawable.pbmeltdown));

        mSearchList.add(new Search("nine",
                "We Can't Stop",
                "Miley Cyrus ",
                R.drawable.bangerz));

        mSearchList.add(new Search("ten",
                "Sorry",
                "Alan Walker",
                R.drawable.sorry));

        mSearchList.add(new Search("eleven",
                "Malibu",
                "Miley Cyrus",
                R.drawable.younger_now));

        mSearchList.add(new Search("twelve",
                "Lights Up",
                "Harry Styles",
                R.drawable.harrystyles));

        mSearchList.add(new Search("thirteen",
                "Just Give Me A Reason",
                "P!nk & Nate Ruess",
                R.drawable.truthaboutlove));

        mSearchList.add(new Search("fourteen",
                "Leave The Door Open",
                "Bruno Mars",
                R.drawable.leavethedooropen));

        mSearchList.add(new Search("fifteen",
                "People Help The People",
                "Cherry Ghost",
                R.drawable.peoplehelpthepeople));

        mSearchList.add(new Search("sixteen",
                "Heartbreak Anniversary",
                "Giveon",
                R.drawable.heartbreakann));

        mSearchList.add(new Search("seventeen",
                "24k Magic",
                "Bruno Mar",
                R.drawable.magic24k));

        mSearchList.add(new Search("eightteen",
                "napori",
                "Vaundy",
                R.drawable.napori));

        mSearchList.add(new Search("nineteen",
                "Toriko",
                "Nissy",
                R.drawable.relaxandchill));

        mSearchList.add(new Search("friend",
                "@RADWIMPS",
                "Carnival User",
                R.drawable.pfp_giraffe));

        mSearchList.add(new Search("friend",
                "@sawturn",
                "Carnival User",
                R.drawable.pfp_alpaca));


        mSearchList.add(new Search("friend",
                "@galaxyStellar",
                "Carnival User",
                R.drawable.pfp_fox));

        mSearchList.add(new Search("friend",
                "@BubbleStte",
                "Carnival User",
                R.drawable.pfp_seal));

        mSearchList.add(new Search("friend",
                "@WANDERLUST",
                "Carnival User",
                R.drawable.pfp_frog));

        mSearchList.add(new Search("friend",
                "@mercury",
                "Carnival User",
                R.drawable.pfp_giraffe));

        mSearchList.add(new Search("friend",
                "@shiwaaseeeee",
                "Carnival User",
                R.drawable.pfp_elephant));

        mSearchList.add(new Search("friend",
                "@lettersforYOU",
                "Carnival User",
                R.drawable.pfp_fox));

        mSearchList.add(new Search("friend",
                "@tpwk",
                "Carnival User",
                R.drawable.pfp_seal));

        mSearchList.add(new Search("friend",
                "@soulWatermelon",
                "Carnival User",
                R.drawable.pfp_cat));

        mSearchList.add(new Search("friend",
                "@puresnow",
                "Carnival User",
                R.drawable.pfp_alpaca));

        mSearchList.add(new Search("friend",
                "@grapesaresour",
                "Carnival User",
                R.drawable.pfp_monkey));

        mSearchList.add(new Search("friend",
                "@glossyGlossy",
                "Carnival User",
                R.drawable.pfp_frog));

        mSearchList.add(new Search("friend",
                "@floralfaith",
                "Carnival User",
                R.drawable.pfp_bear));

        mSearchList.add(new Search("friend",
                "@gleemini",
                "Carnival User",
                R.drawable.pfp_pug));

    }

    private void buildRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        sAdapter = new AdapterSearch(mSearchList);


        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(sAdapter);
    }


    public void displayAnimalBasedOnIndex(int selectedIndex) {
        Done done = doneCollection.getCurrentAnimal(selectedIndex);
        drawable = done.getDrawable();
        Log.d("temasek", "You clicked on animal : " + drawable);

        ImageView iCoverArt = findViewById(R.id.pfpSearchActivity);
        iCoverArt.setImageResource(drawable);
    }

    public void handleSelection(View myView) { //getter function for handleSelection instance
        String resourceId = getResources().getResourceEntryName(myView.getId()); //can get back ID from file layout
        int currentArrayIndex = songCollection.searchSongById(resourceId);

        Log.d("temasek", "The current array position of SEARCH is:  " + currentArrayIndex);
        sendDataToActivity(currentArrayIndex); //method being called, sent to PlaySongActivity

    }

    public void sendDataToActivity(int index) {
        Intent intent = new Intent(this, PlaySongActivity.class);
        intent.putExtra("index", index);

        Bundle bundle = this.getIntent().getExtras(); //receiving Extras from Animal
        currentIndex = bundle.getInt("pfp");
        Log.d("bark", "MAIN received: " + currentIndex);
        int i = bundle.getInt("pfp");
        intent.putExtra("pfp", i);

        startActivity(intent);

    }


 /*   public void searchHandleSelection(View view) {
        String resourceId = getResources().getResourceEntryName(view.getId()); //can get back ID from file layout
        int currentArrayIndex = songCollection.searchSongById(resourceId);

        Log.d("temasek","The current array position is :  " + currentArrayIndex);
        sendDataToActivity(currentArrayIndex); //method being called, sent to PlaySongActivity
    }
    public void sendDataToActivity (int index) {
        Intent intent = new Intent(this, PlaySongActivity.class);
        intent.putExtra("index", index);
        startActivity(intent);

    } */

}

