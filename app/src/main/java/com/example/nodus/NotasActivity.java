package com.example.nodus;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
public class NotasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);

        findViewById(R.id.btnVolver).setOnClickListener(v -> {
            finish();
        });

        RecyclerView recyclerNotas = findViewById(R.id.recyclerNotas);

        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerNotas.setLayoutManager(layoutManager);


        NotaAdapter adapter = new NotaAdapter();
        recyclerNotas.setAdapter(adapter);

        findViewById(R.id.fabNuevaNota).setOnClickListener(v -> {
            Intent intent = new Intent(NotasActivity.this, CrearNotaActivity.class);
            startActivity(intent);
        });
    }
}