package Search;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.music_carnival.R;

import java.util.ArrayList;

import SongCollection.Song.All.SongCollection;

public class AdapterSearch extends RecyclerView.Adapter<AdapterSearch.AdapterViewHolder> {
    private ArrayList<Search> mSearchList;
    SongCollection songCollection = new SongCollection();


    public static class AdapterViewHolder extends RecyclerView.ViewHolder {
        public String id;
        public TextView nameHere;
        public TextView creatorHere;
        public ImageView drawable;


        public AdapterViewHolder(View itemView) {
            super(itemView);
            nameHere = itemView.findViewById(R.id.nameHere);
            creatorHere = itemView.findViewById(R.id.creatorHere);
            drawable = itemView.findViewById(R.id.imageView);

            nameHere.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int searchPosition = (int) getItemId();
                    Log.d("temasek", "Current search clicked is" + searchPosition + Integer.valueOf(nameHere.getId()));
                    //  Intent intent = new Intent(AdapterSearch.this, PlaySongActivity.class);

                }
            });


        }
    }


    public AdapterSearch(ArrayList<Search> searchList) {
        this.mSearchList = searchList;

    }

    @Override
    public AdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.search_item,
                parent, false);


        AdapterViewHolder avh = new AdapterViewHolder(v);
        return avh;


    }


    @Override
    public void onBindViewHolder(AdapterViewHolder holder, int position) {
        Search currentItem = mSearchList.get(position);

        holder.nameHere.setText(currentItem.getName());
        holder.creatorHere.setText(currentItem.getCreator());
        holder.drawable.setImageResource(currentItem.getDrawable());



    }

    @Override
    public int getItemCount() {
        return mSearchList.size();
    }

    public void filterList(ArrayList<Search> filteredList) {
        mSearchList = filteredList;
        notifyDataSetChanged();
    }


}


