package com.example.smart_stocks;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        findViewById(R.id.fr_articles).setVisibility(View.VISIBLE);
                        findViewById(R.id.fr_stocks_up).setVisibility(View.GONE);
                        findViewById(R.id.fr_robot).setVisibility(View.GONE);
                        findViewById(R.id.fr_stocks_down).setVisibility(View.GONE);
                        findViewById(R.id.fr_profile).setVisibility(View.GONE);
                        break;
                    case R.id.navigation_ups:
                        findViewById(R.id.fr_articles).setVisibility(View.GONE);
                        findViewById(R.id.fr_stocks_up).setVisibility(View.VISIBLE);
                        findViewById(R.id.fr_robot).setVisibility(View.GONE);
                        findViewById(R.id.fr_stocks_down).setVisibility(View.GONE);
                        findViewById(R.id.fr_profile).setVisibility(View.GONE);
                        break;
                    case R.id.navigation_robot:
                        findViewById(R.id.fr_articles).setVisibility(View.GONE);
                        findViewById(R.id.fr_stocks_up).setVisibility(View.GONE);
                        findViewById(R.id.fr_robot).setVisibility(View.VISIBLE);
                        findViewById(R.id.fr_stocks_down).setVisibility(View.GONE);
                        findViewById(R.id.fr_profile).setVisibility(View.GONE);
                        break;
                    case R.id.navigation_downs:
                        findViewById(R.id.fr_articles).setVisibility(View.GONE);
                        findViewById(R.id.fr_stocks_up).setVisibility(View.GONE);
                        findViewById(R.id.fr_robot).setVisibility(View.GONE);
                        findViewById(R.id.fr_stocks_down).setVisibility(View.VISIBLE);
                        findViewById(R.id.fr_profile).setVisibility(View.GONE);
                        break;
                    case R.id.navigation_profile:
                        findViewById(R.id.fr_articles).setVisibility(View.GONE);
                        findViewById(R.id.fr_stocks_up).setVisibility(View.GONE);
                        findViewById(R.id.fr_robot).setVisibility(View.GONE);
                        findViewById(R.id.fr_stocks_down).setVisibility(View.GONE);
                        findViewById(R.id.fr_profile).setVisibility(View.VISIBLE);
                        break;
                }

                return true;
            }
        });
    }

    public MainActivity() {

        super();
    }
}

