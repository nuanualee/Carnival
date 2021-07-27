package com.example.music_carnival.Page.Moments.MomentsPackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.music_carnival.AddDone.DoneCollection;
import com.example.music_carnival.R;

import java.util.ArrayList;

//ONE. write extends RecyclerView.Adapter<MyViewHolder>
public class AdapterMoments extends RecyclerView.Adapter<AdapterMoments.MyViewHolder> {
    Context context;
    ArrayList<MyMoment> myMoments;


    private int drawable;
    private int currentIndex = -1;
    DoneCollection doneCollection = new DoneCollection();

    public AdapterMoments(Context c, ArrayList<MyMoment> p) {

        this.context = c;
        this.myMoments = p;
    }

    //TWO. method created
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.row_moment, viewGroup, false));

    }

    @Override
    public void onBindViewHolder(final MyViewHolder mvh, int position) {
        //TWELVE
        final MyMoment momentRow = myMoments.get(position);
        //FIFTEEN
        mvh.userName.setText(myMoments.get(position).getUserName());
        mvh.userDetail.setText(myMoments.get(position).getUserDetail());
        mvh.songChose.setText(myMoments.get(position).getSongChose());
//        mvh.keyMoment.setText(myMoments.get(position).getKeyMoment()); //no need for keymoment to init here


        final String getUserName = myMoments.get(position).getUserName();
        final String getUserDetail = myMoments.get(position).getUserDetail();
        final String getSongChose = myMoments.get(position).getSongChose();
        final String getKeyMoment = myMoments.get(position).getKeyMoment();


        mvh.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, EditMomentsActivity.class);
                intent.putExtra("userName", getUserName);
                intent.putExtra("userDetail", getUserDetail);
                intent.putExtra("songChose", getSongChose);
                intent.putExtra("momentNum", getKeyMoment);

                //PROFILE PIC SEND EXTRAS...
                Intent intentpfp = ((Activity) context).getIntent();
                int i = intentpfp.getIntExtra("pfp", currentIndex);
                Log.d("bark", "Adaptermoments received" + i + " to be sent to MOMENTS ");
                intent.putExtra("pfp", i);

                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return myMoments.size();
    }

    //THIRD. CREATING CLASS FOR MYVIEWHOLDER
    public class MyViewHolder extends RecyclerView.ViewHolder {
        //THIRTEEN, VARIABLE
        TextView userName, userDetail, songChose, keyMoment;

        //FOUR, CREATE CONSTRUCTOR FOR SUPER
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            //FOURTEEN, INS (13)
            userName = (TextView) itemView.findViewById(R.id.userUserName);
            userDetail = (TextView) itemView.findViewById(R.id.userDetail);
            songChose = (TextView) itemView.findViewById(R.id.songChose);


        }
    }
}
