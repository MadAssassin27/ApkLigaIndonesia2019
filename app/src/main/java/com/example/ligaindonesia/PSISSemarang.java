package com.example.ligaindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PSISSemarang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psissemarang);
    }

    public void psispemain(View view) {
        Intent intentpsispemain = new Intent(PSISSemarang.this, PSISSemarangPemain.class);
        startActivity(intentpsispemain);
    }
}
