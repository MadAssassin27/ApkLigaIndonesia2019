package com.example.ligaindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PersipuraJayapura extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persipura_jayapura);
    }

    public void persipurapemain(View view) {
        Intent intentpersipurapemain = new Intent(PersipuraJayapura.this, PersipuraJayapuraPemain.class);
        startActivity(intentpersipurapemain);
    }
}
