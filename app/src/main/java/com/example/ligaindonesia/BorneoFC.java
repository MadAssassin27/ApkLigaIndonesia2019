package com.example.ligaindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BorneoFC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_borneo_fc);
    }

    public void borneopemain(View view) {
        Intent intentborneopemain = new Intent(BorneoFC.this, BorneoFCPemain.class);
        startActivity(intentborneopemain);
    }
}
