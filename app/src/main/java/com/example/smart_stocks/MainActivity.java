package com.example.smart_stocks;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.fr_articles).setVisibility(View.VISIBLE);
        findViewById(R.id.fr_stocks_up).setVisibility(View.GONE);
        findViewById(R.id.fr_robot).setVisibility(View.GONE);
        findViewById(R.id.fr_stocks_down).setVisibility(View.GONE);
        findViewById(R.id.fr_profile).setVisibility(View.GONE);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.navigation_news) {
                findViewById(R.id.fr_articles).setVisibility(View.VISIBLE);
                findViewById(R.id.fr_stocks_up).setVisibility(View.GONE);
                findViewById(R.id.fr_robot).setVisibility(View.GONE);
                findViewById(R.id.fr_stocks_down).setVisibility(View.GONE);
                findViewById(R.id.fr_profile).setVisibility(View.GONE);
            } else if (id == R.id.navigation_ups) {
                findViewById(R.id.fr_articles).setVisibility(View.GONE);
                findViewById(R.id.fr_stocks_up).setVisibility(View.VISIBLE);
                findViewById(R.id.fr_robot).setVisibility(View.GONE);
                findViewById(R.id.fr_stocks_down).setVisibility(View.GONE);
                findViewById(R.id.fr_profile).setVisibility(View.GONE);
            } else if (id == R.id.navigation_robot) {
                findViewById(R.id.fr_articles).setVisibility(View.GONE);
                findViewById(R.id.fr_stocks_up).setVisibility(View.GONE);
                findViewById(R.id.fr_robot).setVisibility(View.VISIBLE);
                findViewById(R.id.fr_stocks_down).setVisibility(View.GONE);
                findViewById(R.id.fr_profile).setVisibility(View.GONE);
            } else if (id == R.id.navigation_downs) {
                findViewById(R.id.fr_articles).setVisibility(View.GONE);
                findViewById(R.id.fr_stocks_up).setVisibility(View.GONE);
                findViewById(R.id.fr_robot).setVisibility(View.GONE);
                findViewById(R.id.fr_stocks_down).setVisibility(View.VISIBLE);
                findViewById(R.id.fr_profile).setVisibility(View.GONE);
            } else if (id == R.id.navigation_profile) {
                findViewById(R.id.fr_articles).setVisibility(View.GONE);
                findViewById(R.id.fr_stocks_up).setVisibility(View.GONE);
                findViewById(R.id.fr_robot).setVisibility(View.GONE);
                findViewById(R.id.fr_stocks_down).setVisibility(View.GONE);
                findViewById(R.id.fr_profile).setVisibility(View.VISIBLE);
            }


            return true;
        });
    }

    public MainActivity() {

        super();
    }

    public static class FirstNew extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_first_new);

        }
        public FirstNew() {

            super();
        }
    }
}

