package com.example.ligaindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PerseruBadak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perseru_badak);
    }

    public void perserupemain(View view) {
        Intent intentperserupemain = new Intent(PerseruBadak.this, PerseruBadakPemain.class);
        startActivity(intentperserupemain);
    }
}
