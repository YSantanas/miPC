package com.curso.mipc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        new CountDownTimer(5000,1000){

            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                Herramientas.nextActivity(BienvenidaActivity.class, MainActivity.this);
            }
        }.start();


    }
}