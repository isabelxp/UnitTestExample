package com.praticas.testunitario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.praticas.testunitario.calculadora.CalculadoraPreUnitTest;

public class PreUnitTestActivity extends AppCompatActivity {

    private int resultado;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_unit_test);

        tvResultado = findViewById(R.id.textResultado);
        resultado = CalculadoraPreUnitTest.sumar(10,20);
        tvResultado.setText(""+resultado);

        Log.d("TAG1", "Resultado metodo suma: ");

    }
}