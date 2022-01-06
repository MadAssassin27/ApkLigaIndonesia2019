package com.example.ligaindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KaltengPutra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalteng_putra);
    }

    public void kaltengpemain(View view) {
        Intent intentkaltengpemain = new Intent(KaltengPutra.this, KaltengPutraPemain.class);
        startActivity(intentkaltengpemain);
    }
}
