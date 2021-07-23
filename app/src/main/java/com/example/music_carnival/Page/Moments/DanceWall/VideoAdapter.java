package com.example.music_carnival.Page.Moments.DanceWall;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.music_carnival.R;

import java.util.List;


//video adapter to inflate our custom video container to bind with video view
public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder>{

    //creating list
    private final List<VideoObject>  videoObjects;


    //constructor created from DanceWallActivity. constructor needed to pass objects in
    public VideoAdapter(List<VideoObject> videoObjects) {
        this.videoObjects = videoObjects;
    }


    //methods of videoAdapter created
    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VideoViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.video_container,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewHolder holder, int position) {
        holder.setVideoObjects(videoObjects.get(position));
    }

    @Override
    public int getItemCount() {
        return videoObjects.size();
    }




    static class VideoViewHolder extends RecyclerView.ViewHolder
    {
        VideoView videoView;
        TextView videoTitle, videoDescription, videoCreator;
        ImageView videoProfile;
        ProgressBar progressBar;

        public VideoViewHolder(@NonNull View itemView) {
            super(itemView);
            videoView = itemView.findViewById(R.id.videoView);
            videoTitle = itemView.findViewById(R.id.videoTitle);
            videoDescription = itemView.findViewById(R.id.videoDescription);
            videoCreator = itemView.findViewById(R.id.videoCreator);
            videoProfile = itemView.findViewById(R.id.videoProfile);
            progressBar = itemView.findViewById(R.id.progressBar);
        }

        @SuppressLint("ClickableViewAccessibility")
        void setVideoObjects(final VideoObject videoObjects)
        {
            videoTitle.setText(videoObjects.getVideoTitle());
            videoDescription.setText(videoObjects.getVideoDescription());
            videoView.setVideoPath(videoObjects.getVideoURL());
            videoCreator.setText(videoObjects.getVideoCreator());
            videoProfile.setImageResource(videoObjects.getDrawable());

            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    progressBar.setVisibility(View.GONE);
                    mp.start();
                }
            });
            //play and pause
            videoView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    if (videoView.isPlaying()) {
                        videoView.pause();
                        return false;
                    }
                    else {
                        videoView.start();
                        return false;
                    }
                }
            });


        }

    }


}
