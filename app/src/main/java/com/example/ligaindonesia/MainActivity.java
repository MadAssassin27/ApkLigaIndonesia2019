package com.example.ligaindonesia;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFrament = null;

                    switch (menuItem.getItemId()) {
                        case R.id.nav_home:
                            selectedFrament = new HomeFragment();
                            break;
                        case R.id.nav_klasemen:
                            selectedFrament = new KlasemenFragment();
                            break;
                        case R.id.nav_info:
                            selectedFrament = new InfoFragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFrament).commit();

                    return true;
                }
            };

    public void Tim(View view) {
        Intent intenttim = new Intent(MainActivity.this, TIM.class);
        startActivity(intenttim);
    }
}
