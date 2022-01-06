package com.example.ligaindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PersebayaSurabaya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persebaya_surabaya);
    }

    public void persebayapemain(View view) {
        Intent intentpersebayapemain = new Intent(PersebayaSurabaya.this, PersebayaSurabayaPemain.class);
        startActivity(intentpersebayapemain);
    }
}
