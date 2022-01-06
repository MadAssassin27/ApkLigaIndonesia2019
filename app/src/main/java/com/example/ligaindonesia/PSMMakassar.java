package com.example.ligaindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PSMMakassar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psmmakassar);
    }

    public void psmpemain(View view) {
        Intent intentpsmpemain = new Intent(PSMMakassar.this, PSMMakassarPemain.class);
        startActivity(intentpsmpemain);
    }
}
