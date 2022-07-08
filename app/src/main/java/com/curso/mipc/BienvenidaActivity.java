package com.curso.mipc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class BienvenidaActivity extends AppCompatActivity {


    Button botonBR,botonBL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);


        botonBL= findViewById(R.id.btnIniciarB);
        botonBR= findViewById(R.id.btnRegistroB);

        botonBL.setOnClickListener(view -> {
            Herramientas.nextActivity(LoginActivity.class, BienvenidaActivity.this);


        });
        botonBR.setOnClickListener(view -> {

            Herramientas.nextActivity(RegistroActivity.class, BienvenidaActivity.this);
        });

    }
}