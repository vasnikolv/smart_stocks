package com.example.smart_stocks;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread thread = new Thread() {

            @Override
            public void run() {
                try {
                    while (!isInterrupted()) {
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                // update TextView here!
                            }
                        });
                    }
                } catch (InterruptedException e) {
                }
            }
        };

        thread.start();

//        final NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
//        final NavController navController = navHostFragment.getNavController();
//        NavigationUI.setupWithNavController(bottomNavigationView, navController);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav_view);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            Fragment fragment = new Articles();
            switch (item.getItemId()) {
                case R.id.navigation_articles:
                    fragment = new Articles();
                    break;
                case R.id.navigation_ups:
                    fragment = new StocksUp();
                    break;
                case R.id.navigation_robot:
                    fragment = new Robot();
                    break;
                case R.id.navigation_downs:
                    fragment = new StocksDown();
                    break;
                case R.id.navigation_profile:
                    fragment = new Profile();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
            return true;
        });


//
//        Button changeLanguage = findViewById(R.id.button_switch_language_to_en);
//        changeLanguage.setOnClickListener(new View.onClickListener(){
//            @Override
//            public void onClick(View view){
//                showChangeLanguageDialog();
//            }
//
//            private void showChangeLanguageDialog() {
//            }
//        });


//        BottomNavigationView navView = findViewById(R.id.bottom_nav_view);
//        navView.setOnItemSelectedListener(item -> {
//            int id = item.getItemId();
//            if (id == R.id.navigation_news) {
//                findViewById(R.id.fr_articles).setVisibility(View.VISIBLE);
//                findViewById(R.id.fr_stocks_up).setVisibility(View.GONE);
//                findViewById(R.id.fr_robot).setVisibility(View.GONE);
//                findViewById(R.id.fr_stocks_down).setVisibility(View.GONE);
//                findViewById(R.id.fr_profile).setVisibility(View.GONE);
//            } else if (id == R.id.navigation_ups) {
//                findViewById(R.id.fr_articles).setVisibility(View.GONE);
//                findViewById(R.id.fr_stocks_up).setVisibility(View.VISIBLE);
//                findViewById(R.id.fr_robot).setVisibility(View.GONE);
//                findViewById(R.id.fr_stocks_down).setVisibility(View.GONE);
//                findViewById(R.id.fr_profile).setVisibility(View.GONE);
//            } else if (id == R.id.navigation_robot) {
//                findViewById(R.id.fr_articles).setVisibility(View.GONE);
//                findViewById(R.id.fr_stocks_up).setVisibility(View.GONE);
//                findViewById(R.id.fr_robot).setVisibility(View.VISIBLE);
//                findViewById(R.id.fr_stocks_down).setVisibility(View.GONE);
//                findViewById(R.id.fr_profile).setVisibility(View.GONE);
//            } else if (id == R.id.navigation_downs) {
//                findViewById(R.id.fr_articles).setVisibility(View.GONE);
//                findViewById(R.id.fr_stocks_up).setVisibility(View.GONE);
//                findViewById(R.id.fr_robot).setVisibility(View.GONE);
//                findViewById(R.id.fr_stocks_down).setVisibility(View.VISIBLE);
//                findViewById(R.id.fr_profile).setVisibility(View.GONE);
//            } else if (id == R.id.navigation_profile) {
//                findViewById(R.id.fr_articles).setVisibility(View.GONE);
//                findViewById(R.id.fr_stocks_up).setVisibility(View.GONE);
//                findViewById(R.id.fr_robot).setVisibility(View.GONE);
//                findViewById(R.id.fr_stocks_down).setVisibility(View.GONE);
//                findViewById(R.id.fr_profile).setVisibility(View.VISIBLE);
//            }
//
//
//            return true;
//        });
    }

    public MainActivity() {

        super();
    }

    public static class FirstNew extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.fragment_first_new);

        }

        public FirstNew() {

            super();
        }
    }
}

