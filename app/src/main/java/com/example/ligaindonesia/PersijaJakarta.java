package com.example.ligaindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PersijaJakarta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persija_jakarta);
    }

    public void persijapemain(View view) {
        Intent intentpersijapemain = new Intent(PersijaJakarta.this, PersijaJakartaPemain.class);
        startActivity(intentpersijapemain);
    }
}
