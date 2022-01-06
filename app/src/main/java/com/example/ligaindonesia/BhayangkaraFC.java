package com.example.ligaindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BhayangkaraFC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhayangkara_fc);
    }

    public void bhayangkarapemain(View view) {
        Intent intentbhayangkarapemain = new Intent(BhayangkaraFC.this, BhayangkaraFCPemain.class);
        startActivity(intentbhayangkarapemain);
    }
}
