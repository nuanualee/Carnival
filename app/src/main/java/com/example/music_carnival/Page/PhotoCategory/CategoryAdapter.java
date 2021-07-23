package com.example.music_carnival.Page.PhotoCategory;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.music_carnival.Page.MainActivity.MainProfileActivity;
import com.example.music_carnival.R;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    Context context;
    List<Category> categoryList;


    public CategoryAdapter(Context context, List<Category> categoryList) {
        this.context = context;
        this.categoryList = categoryList;
    }


    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_menu, null);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int i) {

        Category category = categoryList.get(i);
        categoryViewHolder.iconTitle.setText(category.getIconTitle());
        categoryViewHolder.iconImg.setImageDrawable(context.getResources().
                getDrawable(category.getIconImg()));

        categoryViewHolder.iconImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, category.getIconTitle(), Toast.LENGTH_SHORT).show();

              if (category.getIconTitle().equals("Rhythm")){
                  Intent intent = new Intent(context,MainProfileActivity.class);
                  intent.putExtra("title", "RHYTHM");

                  context.startActivity(intent);
              }

            }
        });

       /*  currentIndex = bundle.getInt("index");
        Log.d("bark", "we received: " + currentIndex);
        int i = bundle.getInt("index");
        displayAnimalBasedOnIndex(currentIndex);
        intent.putExtra("index", i);  */


        /*categoryViewHolder.iconImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainProfileActivity.class);
                Toast.makeText(context, "Clicked! " + categoryList.get(i), Toast.LENGTH_SHORT).show();

                intent.putExtra("feeling", categoryList.indexOf(i) );
                context.startActivity(intent);
            }
        }); */


    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

  /*  public int searchVibesById(String id){
        for (int i = 0; i < categoryList.size(); i++) { //song.length = 3 items
            Song tempSong = songs[i];
            if (tempSong.getId().equals(id)) { //does comparison if id is the same.
                return i; //return - method will just stop. will return the position
            }
        }
        return -1; // if no known position is found, it will give an unknown number
    }
   */


    class CategoryViewHolder extends RecyclerView.ViewHolder {

        TextView iconTitle;
        ImageView iconImg;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            //itemview is to access ANOTHER layout. we are not able to access before this
            iconTitle = itemView.findViewById(R.id.iconTitle);
            iconImg = itemView.findViewById(R.id.iconImg);


        /*    iconTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int categoryPosition = (int) getItemId();
                    Log.d("temasek", "Current search clicked is" + categoryPosition);
                }
            }); */


        }
    }


}
