package com.example.nodus;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class NotasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);

        setContentView(R.layout.activity_notas);
        findViewById(R.id.btnVolver).setOnClickListener(v -> {
            finish();
        });
    }
}