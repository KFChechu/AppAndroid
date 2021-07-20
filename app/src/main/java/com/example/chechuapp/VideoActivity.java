package com.example.chechuapp;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;
public class VideoActivity extends AppCompatActivity implements View.OnClickListener {
    Button video1,video2,video3,stopVideo;
    VideoView video;
    int botonPulsadoVideo;
    String videopath;       //Ubicacion del video en la carpeta raw
    Uri uri;                //Identificador de recursos uniforme para localizar los videos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        video1 = (Button) findViewById(R.id.video1Button);
        video2 = (Button) findViewById(R.id.video2Button);
        video3 = (Button) findViewById(R.id.video3Button);
        video = (VideoView) findViewById(R.id.videoView);
        stopVideo = (Button) findViewById(R.id.stopVideoButton);
        video1.setOnClickListener(this);
        video2.setOnClickListener(this);
        video3.setOnClickListener(this);
        stopVideo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (botonPulsadoVideo = view.getId()) {
            case (R.id.video1Button):
                videopath = "android.resource://com.example.chechuapp/" + R.raw.golraul;
                uri = uri.parse(videopath);
                video.setVideoURI(uri);
                video.start();
                break;
            case (R.id.video2Button):
                videopath = "android.resource://com.example.chechuapp/" + R.raw.conor;
                uri = uri.parse(videopath);
                video.setVideoURI(uri);
                video.start();
                break;
            case (R.id.video3Button):
                videopath = "android.resource://com.example.chechuapp/" + R.raw.ezequiel;
                uri = uri.parse(videopath);
                video.setVideoURI(uri);
                video.start();
                break;
            case (R.id.stopVideoButton):
                stopVideo();
                break;
        }
    }

    @SuppressLint("WrongConstant")
    private void stopVideo() {
        if (video.isPlaying()) {
            video.setVisibility(1);
            video.setVisibility(0);
            video.stopPlayback();
        }
    }
}