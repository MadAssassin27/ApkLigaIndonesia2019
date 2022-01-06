package com.example.ligaindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PerselaLamongan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persela_lamongan);
    }

    public void perselapemain(View view) {
        Intent intentperselapemain = new Intent(PerselaLamongan.this, PerselaLamonganPemain.class);
        startActivity(intentperselapemain);
    }
}
