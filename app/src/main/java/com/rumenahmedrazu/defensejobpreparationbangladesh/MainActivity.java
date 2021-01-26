package com.rumenahmedrazu.defensejobpreparationbangladesh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnArmy(View view) {
        Intent intent =new Intent(this, Army.class);
        startActivity(intent);
    }
    public void btnAir(View view) {
        Intent intent =new Intent(this, Airforce.class);
        startActivity(intent);
    }
    public void btnNavy(View view) {
        Intent intent =new Intent(this, Navy.class);
        startActivity(intent);
    }
    public void btnPreparation(View view) {
        Intent intent =new Intent(this, Preparation.class);
        startActivity(intent);
    }
}
