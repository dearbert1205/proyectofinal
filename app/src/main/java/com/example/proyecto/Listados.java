package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Listados extends AppCompatActivity {

    @Override

    }

    public void la(View view) { Intent intent = new Intent(Listados.this, registro_alabanzas.class);
        Listados.this.startActivity(intent);
    }

    public void lc(View view) {
        Intent intent = new Intent(Listados.this, registro_coros.class);
        Listados.this.startActivity(intent);
    }
}
