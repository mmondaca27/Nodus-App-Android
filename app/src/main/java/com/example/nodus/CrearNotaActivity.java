package com.example.nodus;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class CrearNotaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_nota);

        findViewById(R.id.btnVolver).setOnClickListener(v -> {
            finish();
        });
    }
}