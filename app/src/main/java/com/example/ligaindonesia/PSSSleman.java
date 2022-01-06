package com.example.ligaindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PSSSleman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psssleman);
    }

    public void psspemain(View view) {
        Intent intentpsspemain = new Intent(PSSSleman.this, PSSSlemanPemain.class);
        startActivity(intentpsspemain);
    }
}
