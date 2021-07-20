package com.example.chechuapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BDActivity extends AppCompatActivity implements View.OnClickListener{
    Button bd1,bd2,bd3,bd4;
    int botonPulsadoBd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bd);
        bd1 = (Button)  findViewById(R.id.bd1btn);
        bd2 = (Button)  findViewById(R.id.bd2btn);
        bd3 = (Button)  findViewById(R.id.bd3btn);
        bd4 = (Button)  findViewById(R.id.bd4btn);
        bd1.setOnClickListener(this);
        bd2.setOnClickListener(this);
        bd3.setOnClickListener(this);
        bd4.setOnClickListener(this);
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this,"bd_usuarios",null,1);
    }

    public void onClick(View view) {
        Intent intent=null;
        switch (botonPulsadoBd = view.getId()) {
            case (R.id.bd1btn):
                //intent=new Intent(MainActivity.this,AudioActivity.class);
                //startActivity(intent);
                break;
        }
        switch (botonPulsadoBd = view.getId()) {
            case (R.id.bd2btn):
               // intent=new Intent(MainActivity.this,AudioActivity.class);
                //startActivity(intent);
                break;
        }
        switch (botonPulsadoBd = view.getId()) {
            case (R.id.bd3btn):
                //intent=new Intent(MainActivity.this,AudioActivity.class);
                //startActivity(intent);
                break;
        }
        switch (botonPulsadoBd = view.getId()) {
            case (R.id.bd4btn):
                //intent=new Intent(MainActivity.this,AudioActivity.class);
                //startActivity(intent);
                break;
        }
    }
}
