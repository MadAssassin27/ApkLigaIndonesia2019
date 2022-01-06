package com.example.ligaindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AremaFC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arema_fc);
    }

    public void aremapemain(View view) {
        Intent intentaremapemain = new Intent(AremaFC.this, AremaFCPemain.class);
        startActivity(intentaremapemain);
    }
}
