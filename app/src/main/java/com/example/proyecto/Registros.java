package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registros);
    }

    public void rA(View view) {
        Intent intent = new Intent(Registros.this, AlabanzasActivity.class);
        Registros.this.startActivity(intent);
    }

    public void rC(View view) {
        Intent intent = new Intent(Registros.this, CorosActivity.class);
        Registros.this.startActivity(intent);
    }
}
