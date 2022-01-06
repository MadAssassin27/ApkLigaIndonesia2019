package com.example.ligaindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MaduraUnited extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madura_united);
    }

    public void madurapemain(View view) {
        Intent intentmadurapemain = new Intent(MaduraUnited.this, MaduraUnitedPemain.class);
        startActivity(intentmadurapemain);
    }
}
