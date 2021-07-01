package com.example.lolotest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;


public class Video extends AppCompatActivity {

    private static final String VIDEO_SAMPLE = "asd";
    private VideoView mVideoView;
    Button button;
    private int mCurrentPosition;
    private static final String PLAYBACK_TIME = "play_time";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        setTitle("Знакомство с Lolo");

        mVideoView = findViewById(R.id.videoView);

        MediaController controller = new MediaController(this);
        controller.setMediaPlayer(mVideoView);
        mVideoView.setMediaController(controller);

        button = findViewById(R.id.StartTestButton);

        button.setOnClickListener(StartTest);

        if (savedInstanceState != null) {
            mCurrentPosition = savedInstanceState.getInt(PLAYBACK_TIME);
            Log.d("aaa", "onCreate: загрузило данные");
            Log.d("aaa", "onCreate: "+ mCurrentPosition);
        }
    }

    View.OnClickListener StartTest = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mVideoView.pause();
            Intent intent = new Intent(Video.this, Dresscode.class);
            startActivity(intent);


        }
    };



    private Uri getMedia(String mediaName) {
        return Uri.parse("android.resource://" + getPackageName() +
                "/raw/" + mediaName);
    }

    private void initializePlayer() {
        Uri videoUri = getMedia(VIDEO_SAMPLE);
        mVideoView.setVideoURI(videoUri);
        if (mCurrentPosition != 0) {
            mVideoView.seekTo(mCurrentPosition);
            Log.d("aaa", "initializePlayer: начал воспроизведение с сохраненной точки");
        } else {
            // Skipping to 1 shows the first frame of the video.
            mVideoView.seekTo(1);
            Log.d("aaa", "initializePlayer: начал с 1 милисекунды виео");
        }
        mVideoView.start();
    }

      private void releasePlayer() {
          mVideoView.stopPlayback();
      }

    @Override
    protected void onStart() {
        super.onStart();

        initializePlayer();
    }

    @Override
    protected void onStop() {
        super.onStop();

        releasePlayer();
    }


    @Override
    protected void onPause() {
        super.onPause();

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            mVideoView.pause();
        }
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt(PLAYBACK_TIME, mVideoView.getCurrentPosition());
        Log.d("aaa", "onSaveInstanceState: сохранило данные");
        Log.d("aaa", "onSaveInstanceState: "+ mCurrentPosition);
    }

}