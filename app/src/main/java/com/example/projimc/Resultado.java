package com.example.projimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        TextView tvResultado = (TextView) findViewById(R.id.tvResultado);
        TextView tvClassificacao = (TextView) findViewById(
                R.id.tvClassicicacao
        );

        Intent i = getIntent();
        float imc = (float) i.getFloatExtra (
                "resultado",
                0
        );
        tvResultado.setText(String.format(Float.toString(imc),2));

        if (imc >= 40) {
            tvClassificacao.setText("Obesidade Grau 3");
        } else if (imc >= 35) {
            tvClassificacao.setText("Obesidade Grau 2");
        } else if (imc >= 30) {
            tvClassificacao.setText("Obesidade Grau 1");
        } else if (imc >= 25) {
            tvClassificacao.setText("Sobrepeso");
        } else if (imc >= 18.5) {
            tvClassificacao.setText("Saldável");
        } else if (imc >= 17) {
            tvClassificacao.setText("Magreza Leve");
        } else if (imc >= 16) {
            tvClassificacao.setText("Magreza Moderada");
        } else {
            tvClassificacao.setText("Magreza Grave");
        }
    }

    public void voltar(View v) { finish(); }

}