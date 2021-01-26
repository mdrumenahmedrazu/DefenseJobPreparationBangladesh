package com.rumenahmedrazu.defensejobpreparationbangladesh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Airforce extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airforce);
    }
    public void btnAirforcehistory(View view) {
        Intent intent =new Intent(this, Airforcehistory.class);
        startActivity(intent);
    }
    public void btnAirchief(View view) {
        Intent intent =new Intent(this, ChiefAir.class);
        startActivity(intent);
    }
    public void btnAirranks(View view) {
        Intent intent =new Intent(this, Ranksair.class);
        startActivity(intent);
    }
    public void btnAircareer(View view) {
        Intent intent =new Intent(this, Maintainance.class);
        startActivity(intent);
    }

}
