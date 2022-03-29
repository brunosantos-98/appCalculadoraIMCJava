package com.example.projimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText vAltura;
    EditText vMassa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vAltura = findViewById(R.id.etAltura);
        vMassa = findViewById(R.id.etMassa);
    }

    public void CalcularImc (View view) {
        if (vAltura.getText().toString().equals("")) {
            vAltura.setError("O campo altura não pode ser vazio!");
        } else if (vMassa.getText().toString().equals("")) {
            vAltura.setError("O campo massa não pode ser vazio!");
        } else {
            float imc = 0;
            float altura = Float.parseFloat(
                    vAltura.getText().toString()
            );
            float massa = Float.parseFloat(
                    vMassa.getText().toString()
            );
            imc = massa/(altura*altura);

            Intent i = new Intent(
                    MainActivity.this,
                    Resultado.class);
            i.putExtra("resultado",(float)imc);

            startActivity(i);
        }
    }

}