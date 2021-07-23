package Search;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.music_carnival.ArtistCollection.ArtistCollection;
import com.example.music_carnival.Page.MainActivity.MainActivity;
import com.example.music_carnival.R;

import java.util.ArrayList;

import SongCollection.Song.All.SongCollection;

public class SearchActivity extends AppCompatActivity {

    private ArrayList<Search> mSearchList;


    private RecyclerView recyclerView;
    private AdapterSearch sAdapter;
    private RecyclerView.LayoutManager layoutManager;
    SongCollection songCollection = new SongCollection();
    ArtistCollection artistCollection = new ArtistCollection();


    ImageView imageCancel;


    TextView btnMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        createSearchList();
        buildRecyclerView();


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
        mSearchList.add(new Search("btnMain",
                "Fine Line",
                "Harry Styles",
                R.drawable.harrystyles));

        mSearchList.add(new Search("btnMain2",
                "Plastic Hearts",
                "Miley Cyrus",
                R.drawable.plastichearts));
        mSearchList.add(new Search("titleTwo",
                "Plastic Hearts",
                "Miley Cyrus",
                R.drawable.plastichearts));
        mSearchList.add(new Search("titleTwo",
                "Plastic Hearts",
                "Miley Cyrus",
                R.drawable.plastichearts));
        mSearchList.add(new Search("titleTwo",
                "Plastic Hearts",
                "Miley Cyrus",
                R.drawable.plastichearts));
        mSearchList.add(new Search("friendOne",
                "@Meow",
                "Carnival User",
                R.drawable.pfp_giraffe));


    }

    private void buildRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        sAdapter = new AdapterSearch(mSearchList);


        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(sAdapter);
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

