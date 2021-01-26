package com.rumenahmedrazu.defensejobpreparationbangladesh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Navy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navy);
    }
    public void btnNavyhistory(View view) {
        Intent intent =new Intent(this, Navyhistory.class);
        startActivity(intent);
    }
    public void btnNavyrank(View view) {
        Intent intent =new Intent(this, Ranksnavy.class);
        startActivity(intent);
    }
    public void btnNavychief(View view) {
        Intent intent =new Intent(this, Chiefnavy.class);
        startActivity(intent);

    }
    public void btnMain(View view) {
        Intent intent =new Intent(this, Maintainance.class);
        startActivity(intent);
    }
}
