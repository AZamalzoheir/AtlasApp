package com.example.amalzoheir.atlasapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Handler homePageHandler = new Handler();
        homePageHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(HomePage.this,MainPage.class));
            }

        }, 2000L);

    }
}
