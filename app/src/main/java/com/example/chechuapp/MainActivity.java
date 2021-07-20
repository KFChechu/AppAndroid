package com.example.chechuapp;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button audios,videos,calculadora;
    int botonPulsadoMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        audios = (Button)  findViewById(R.id.menuAudioButton);
        videos = (Button)  findViewById(R.id.menuVideoButton);
        calculadora = (Button)  findViewById(R.id.menuCalcButton);
        audios.setOnClickListener(this);
        videos.setOnClickListener(this);
        calculadora.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent=null;
        switch(botonPulsadoMenu=view.getId())
        {
            case (R.id.menuAudioButton):
                intent=new Intent(MainActivity.this,AudioActivity.class);
                startActivity(intent);
                break;
            case (R.id.menuVideoButton):
                intent=new Intent(MainActivity.this,VideoActivity.class);
                startActivity(intent);
                break;
            case (R.id.menuCalcButton):
                intent=new Intent(MainActivity.this,CalcActivity.class);
                startActivity(intent);
                break;
            case (R.id.menuBDButton):
                intent=new Intent(MainActivity.this,BDActivity.class);
                startActivity(intent);
                break;
        }
    }
}
/*  Para debugs con Logcat:
        Log.i("info","Valor Info")
        Log.d("Debug","Valor Debug")
        Log.w("Warning","Valor Warning")
        Log.e("Error","Valor Error")
        Log.v("Verbose","Valor Verbose")
    o para publicar mensajes
        public static final String TAG="Seguimiento";
        Log.i(TAG,"Mensaje Seguimiento 1");
        Log.i(TAG,"Mensaje Seguimiento 2");
        Log.i(TAG,"Mensaje Seguimiento 3");
        Log.i(TAG,"Mensaje Seguimiento 4");
        .....etc
*/

