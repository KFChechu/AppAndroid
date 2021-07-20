package com.example.chechuapp;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class CalcActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editText1,editText2;
    TextView resul;
    Button suma,resta,multi,divi;
    int num1,num2,botonPulsadoCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        editText1 = (EditText)  findViewById(R.id.calcEditText1);
        editText2 = (EditText)  findViewById(R.id.calcEditText2);
        suma = (Button)  findViewById(R.id.sumaButton);
        resta = (Button)  findViewById(R.id.restaButton);
        multi = (Button)  findViewById(R.id.multiButton);
        divi = (Button)  findViewById(R.id.divideButton);
        resul = (TextView)  findViewById(R.id.calcResultadotextView);
        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        multi.setOnClickListener(this);
        divi.setOnClickListener(this);
    }

    public void onClick(View view) {
        num1=Integer.parseInt(editText1.getText().toString());
        num2=Integer.parseInt(editText2.getText().toString());
        switch (botonPulsadoCalc = view.getId()) {
            case (R.id.sumaButton):
                sumar();
                break;
            case (R.id.restaButton):
                restar();
                break;
            case (R.id.multiButton):
                multiplicar();
                break;
            case (R.id.divideButton):
                dividir();
                break;
        }
    }

    private void sumar(){
        int sum=num1+num2;
        resul.setText("El resultado de la suma es: "+sum);
    }

    private void restar(){
        int res=num1-num2;
        resul.setText("El resultado de la resta es: "+res);
    }

    private void multiplicar(){
        int mul=num1*num2;
        resul.setText("El resultado de la multiplicacion es: "+mul);
    }

    private void dividir(){
        if(num2>0) {
            int div = num1/num2;
            resul.setText("El resultado de la division es: " + div);
        }else{
            Toast.makeText(getApplicationContext(),"Advertencia", Toast.LENGTH_LONG).show();    //getaplicationcontext es mejor que un this directo para coger el contexto
            resul.setText("Numero 2 debe ser mayor a 0 para dividir");
        }
    }
}