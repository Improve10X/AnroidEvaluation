package com.improve10x.androidevaluation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().setTitle("SplashActivity");
        Handler handler = new Handler();
        handler.postDelayed(() -> {
            Intent intent = new Intent(this, MyBasketActivity.class);
            finish();
            startActivity(intent);
        }, 3000);

    }

}