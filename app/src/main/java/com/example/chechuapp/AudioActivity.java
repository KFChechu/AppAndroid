package com.example.chechuapp;
import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class AudioActivity extends AppCompatActivity implements View.OnClickListener {
    Button audio1,audio2,audio3,audio4,audio5,audio6,audio7,stopAudio;
    MediaPlayer mp;
    int botonPulsadoAudio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);
        audio1 = (Button)  findViewById(R.id.audio1Button);
        audio2 = (Button)  findViewById(R.id.audio2Button);
        audio3 = (Button)  findViewById(R.id.audio3Button);
        audio4 = (Button)  findViewById(R.id.audio4Button);
        audio5 = (Button)  findViewById(R.id.audio5Button);
        audio6 = (Button)  findViewById(R.id.audio6Button);
        audio7 = (Button)  findViewById(R.id.audio7Button);
        stopAudio = (Button)  findViewById(R.id.stopAudioButton);
        audio1.setOnClickListener(this);
        audio2.setOnClickListener(this);
        audio3.setOnClickListener(this);
        audio4.setOnClickListener(this);
        audio5.setOnClickListener(this);
        audio6.setOnClickListener(this);
        audio7.setOnClickListener(this);
        stopAudio.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (botonPulsadoAudio = view.getId()) {
            case (R.id.audio1Button):
                stopMusic();
                mp = MediaPlayer.create(this, R.raw.peliculas);
                mp.start();
                break;
            case (R.id.audio2Button):
                stopMusic();
                mp = MediaPlayer.create(this, R.raw.gilkong);
                mp.start();
                break;
            case (R.id.audio3Button):
                stopMusic();
                mp = MediaPlayer.create(this, R.raw.chuache);
                mp.start();
                break;
            case (R.id.audio4Button):
                stopMusic();
                mp = MediaPlayer.create(this, R.raw.burladorcastilla);
                mp.start();
                break;
            case (R.id.audio5Button):
                stopMusic();
                mp = MediaPlayer.create(this, R.raw.antoniobanderas);
                mp.start();
                break;
            case (R.id.audio6Button):
                stopMusic();
                mp = MediaPlayer.create(this, R.raw.brucelee);
                mp.start();
                break;
            case (R.id.audio7Button):
                stopMusic();
                mp = MediaPlayer.create(this, R.raw.torrente);
                mp.start();
                break;
            case (R.id.stopAudioButton):
                stopMusic();
                break;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopMusic();
    }

    private void stopMusic () {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }
}
