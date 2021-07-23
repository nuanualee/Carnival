package com.example.music_carnival.Page.PhotoCategory;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import com.example.music_carnival.AddDone.Done;
import com.example.music_carnival.AddDone.DoneCollection;
import com.example.music_carnival.R;

import java.util.ArrayList;
import java.util.List;

public class PhotoCateActivity extends AppCompatActivity {

    RecyclerView myCategoryList;
    CategoryAdapter categoryAdapter;
    List<Category> categoryList;
    Button btnsavecate;
    Animation btt;

    private int drawable;
    private int currentIndex = -1;
    DoneCollection doneCollection = new DoneCollection();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_cate);

        btnsavecate = findViewById(R.id.btnsavecate);
        btt = AnimationUtils.loadAnimation(this, R.anim.btt);
        //  btt.setInterpolator(new AccelerateInterpolator());

        Bundle bundle = this.getIntent().getExtras(); //receiving Extras from Animal
        if (bundle != null) {
            currentIndex = bundle.getInt("index");
            Log.d("bark", "we received: " + currentIndex);
            int i = bundle.getInt("index");
            displayAnimalBasedOnIndex(currentIndex);
        }


        categoryList = new ArrayList<>();
        categoryList.add(
                new Category("Rhythm",
                        R.drawable.feeling_one
                )
        );
        categoryList.add(
                new Category("Strong",
                        R.drawable.feeling_two
                )
        );
        categoryList.add(
                new Category("Wavy",
                        R.drawable.feeling_three
                )
        );
        categoryList.add(
                new Category("Dilligent",
                        R.drawable.feeling_four
                )
        );
        categoryList.add(
                new Category("Gala",
                        R.drawable.feeling_five
                )
        );
        categoryList.add(
                new Category("Lucky",
                        R.drawable.feeling_six
                )
        );

        myCategoryList = findViewById(R.id.myCategoryList);

        final LinearLayoutManager linearLayoutManager = new
                LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,
                false);
        myCategoryList.setLayoutManager(linearLayoutManager);
        myCategoryList.setHasFixedSize(true);

        categoryAdapter = new CategoryAdapter(this, categoryList);
        myCategoryList.setAdapter(categoryAdapter);


        //snapping from Google
        final SnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(myCategoryList);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //do something after 100ms
                RecyclerView.ViewHolder viewHolderDefault = myCategoryList.
                        findViewHolderForAdapterPosition(0);

                ImageView imageViewDefault = viewHolderDefault.itemView.findViewById(R.id.iconImg);
                imageViewDefault.animate().alpha(1).scaleX(1).scaleY(1).setDuration(100).start();

                TextView iconTitleDefault = viewHolderDefault.itemView.findViewById(R.id.iconTitle);
                iconTitleDefault.animate().alpha(1).scaleX(1).scaleY(1).setDuration(100).start();

                btnsavecate.animate().alpha(1).setDuration(100).start();
                // btnsavecate.setAlpha(0);

            }
        }, 100);

        myCategoryList.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);

                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                    View view = snapHelper.findSnapView(linearLayoutManager);
                    int position = linearLayoutManager.getPosition(view);

                    RecyclerView.ViewHolder viewHolder = myCategoryList.findViewHolderForAdapterPosition(position);
                    ImageView iconImg = viewHolder.itemView.findViewById(R.id.iconImg);
                    iconImg.animate().alpha(1).scaleX(1).scaleY(1).setDuration(100).start();

                    TextView iconTitle = viewHolder.itemView.findViewById(R.id.iconTitle);
                    iconTitle.animate().alpha(1).scaleX(1).scaleY(1).setDuration(100).start();

                    btnsavecate.setAlpha(1);
                    btnsavecate.startAnimation(btt);

                } else {
                    View view = snapHelper.findSnapView(linearLayoutManager);
                    int position = linearLayoutManager.getPosition(view);

                    RecyclerView.ViewHolder viewHolder = myCategoryList.findViewHolderForAdapterPosition(position);
                    ImageView iconImg = viewHolder.itemView.findViewById(R.id.iconImg);
                    iconImg.animate().alpha(0.5f).scaleX(0.5f).scaleY(0.5f).setDuration(100).start();

                    TextView iconTitle = viewHolder.itemView.findViewById(R.id.iconTitle);
                    iconTitle.animate().alpha(0).setDuration(100).start();


                }
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                btnsavecate.setAlpha(0);
            }
        });


    }

    public void displayAnimalBasedOnIndex(int selectedIndex) {
        Done done = doneCollection.getCurrentAnimal(selectedIndex);
        drawable = done.getDrawable();
        Log.d("temasek", "PhotoCate Received " + drawable);

        ImageView iCoverArt = findViewById(R.id.pfpPhotoCategory);
        iCoverArt.setImageResource(drawable);
    }
}