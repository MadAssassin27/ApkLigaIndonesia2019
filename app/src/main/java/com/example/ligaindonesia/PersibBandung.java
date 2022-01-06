package com.example.ligaindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PersibBandung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persib_bandung);
    }

    public void persibpemain(View view) {
        Intent intentpersibpemain = new Intent(PersibBandung.this, PersibBandungPemain.class);
        startActivity(intentpersibpemain);
    }
}
