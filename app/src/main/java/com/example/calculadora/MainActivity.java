package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    double valor = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button soma = findViewById(R.id.buttonSoma);
        soma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText etValor = (EditText) findViewById(R.id.editTextNumberValor);
                EditText eTResultado = (EditText) findViewById(R.id.editTextNumberResultado);
                double aux;
                aux = Double.valueOf(etValor.getText().toString());
                valor = valor + aux;
                etValor.getText().clear();
                eTResultado.setText(String.valueOf(valor));
            }
        });

        final Button sub = findViewById(R.id.buttonSubtracao);
        sub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText etValor = (EditText) findViewById(R.id.editTextNumberValor);
                EditText eTResultado = (EditText) findViewById(R.id.editTextNumberResultado);
                double aux;
                aux = Double.valueOf(etValor.getText().toString());
                valor = valor - aux;
                etValor.getText().clear();
                eTResultado.setText(String.valueOf(valor));
            }
        });

        final Button div = findViewById(R.id.buttonDivisao);
        div.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText etValor = (EditText) findViewById(R.id.editTextNumberValor);
                EditText eTResultado = (EditText) findViewById(R.id.editTextNumberResultado);
                double aux;
                aux = Double.valueOf(etValor.getText().toString());
                valor = valor / aux;
                etValor.getText().clear();
                eTResultado.setText(String.valueOf(valor));
            }
        });

        final Button mul = findViewById(R.id.buttonMultiplicacao);
        mul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText etValor = (EditText) findViewById(R.id.editTextNumberValor);
                EditText eTResultado = (EditText) findViewById(R.id.editTextNumberResultado);
                double aux;
                aux = Double.valueOf(etValor.getText().toString());
                valor = valor * aux;
                etValor.getText().clear();
                eTResultado.setText(String.valueOf(valor));
            }
        });

        final Button limpar = findViewById(R.id.buttonLimpar);
        limpar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText etValor = (EditText) findViewById(R.id.editTextNumberValor);
                EditText eTResultado = (EditText) findViewById(R.id.editTextNumberResultado);
                valor = 0.0;
                etValor.getText().clear();
                eTResultado.getText().clear();
            }
        });




    }
}