package com.rumenahmedrazu.defensejobpreparationbangladesh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Preparation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preparation);
    }
    public void btnMain(View view) {
        Intent intent =new Intent(this, Maintainance.class);
        startActivity(intent);
    }
}
