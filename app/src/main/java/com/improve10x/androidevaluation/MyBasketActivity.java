package com.improve10x.androidevaluation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MyBasketActivity extends AppCompatActivity {

    public ArrayList<MyBasketItems> myBasketItems;
    private MyBasketAdapter myBasketAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_basket);
    }
}