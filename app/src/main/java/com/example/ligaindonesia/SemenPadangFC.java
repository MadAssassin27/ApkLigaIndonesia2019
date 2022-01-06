package com.example.ligaindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SemenPadangFC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semen_padang_fc);
    }

    public void semenpemain(View view) {
        Intent intentsemenpemain = new Intent(SemenPadangFC.this, SemenPadangPemain.class);
        startActivity(intentsemenpemain);
    }
}
