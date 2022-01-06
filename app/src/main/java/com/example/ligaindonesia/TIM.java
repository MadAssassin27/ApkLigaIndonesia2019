package com.example.ligaindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TIM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tim);
    }

    public void arema(View view) {
        Intent intentarema = new Intent(TIM.this, AremaFC.class);
        startActivity(intentarema);
    }

    public void bali(View view) {
        Intent intentbali = new Intent(TIM.this, BaliUnited.class);
        startActivity(intentbali);
    }

    public void barito(View view) {
        Intent intentbarito = new Intent(TIM.this, BaritoPutera.class);
        startActivity(intentbarito);
    }

    public void bhayangkara(View view) {
        Intent intentbhayangkara = new Intent(TIM.this, BhayangkaraFC.class);
        startActivity(intentbhayangkara);
    }

    public void borneo(View view) {
        Intent intentborneo = new Intent(TIM.this, BorneoFC.class);
        startActivity(intentborneo);
    }

    public void kalteng(View view) {
        Intent intentkalteng = new Intent(TIM.this, KaltengPutra.class);
        startActivity(intentkalteng);
    }

    public void madura(View view) {
        Intent intentmadura = new Intent(TIM.this, MaduraUnited.class);
        startActivity(intentmadura);
    }

    public void persebaya(View view) {
        Intent intentpersebaya = new Intent(TIM.this, PersebayaSurabaya.class);
        startActivity(intentpersebaya);
    }

    public void persela(View view) {
        Intent intentpersela = new Intent(TIM.this, PerselaLamongan.class);
        startActivity(intentpersela);
    }

    public void perseru(View view) {
        Intent intentperseru = new Intent(TIM.this, PerseruBadak.class);
        startActivity(intentperseru);
    }

    public void persib(View view) {
        Intent intentpersib = new Intent(TIM.this, PersibBandung.class);
        startActivity(intentpersib);
    }

    public void persija(View view) {
        Intent intentpersija = new Intent(TIM.this, PersijaJakarta.class);
        startActivity(intentpersija);
    }

    public void persipura(View view) {
        Intent intentpersipura = new Intent(TIM.this, PersipuraJayapura.class);
        startActivity(intentpersipura);
    }

    public void psis(View view) {
        Intent intentpsis = new Intent(TIM.this, PSISSemarang.class);
        startActivity(intentpsis);
    }

    public void psm(View view) {
        Intent intentpsm = new Intent(TIM.this, PSMMakassar.class);
        startActivity(intentpsm);
    }

    public void pss(View view) {
        Intent intentpss = new Intent(TIM.this, PSSSleman.class);
        startActivity(intentpss);
    }

    public void semen(View view) {
        Intent intentsemen = new Intent(TIM.this, SemenPadangFC.class);
        startActivity(intentsemen);
    }

    public void tira(View view) {
        Intent intenttira = new Intent(TIM.this, TIRAPersikabo.class);
        startActivity(intenttira);
    }
}
