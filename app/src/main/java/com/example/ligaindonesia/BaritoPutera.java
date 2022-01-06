package com.example.ligaindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BaritoPutera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barito_putera);
    }

    public void baritopemain(View view) {
        Intent intentbaritopemain = new Intent(BaritoPutera.this, BaritoPuteraPemain.class);
        startActivity(intentbaritopemain);
    }
}
