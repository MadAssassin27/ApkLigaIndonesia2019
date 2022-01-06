package com.example.ligaindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BaliUnited extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bali_united);
    }

    public void balipemain(View view) {
        Intent intentbalipemain = new Intent(BaliUnited.this, BaliUnitedPemain.class);
        startActivity(intentbalipemain);
    }
}
