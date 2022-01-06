package com.example.ligaindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TIRAPersikabo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tirapersikabo);
    }

    public void tirapemain(View view) {
        Intent intenttirapemain = new Intent(TIRAPersikabo.this, TIRAPersikaboPemain.class);
        startActivity(intenttirapemain);
    }
}
