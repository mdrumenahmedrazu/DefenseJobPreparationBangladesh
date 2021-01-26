package com.rumenahmedrazu.defensejobpreparationbangladesh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Army extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_army);
    }
    public void btnArmyhistory(View view) {
        Intent intent =new Intent(this, Armyhistory.class);
        startActivity(intent);
    }
    public void btnArmychief(View view) {
        Intent intent =new Intent(this, Chiefarmy.class);
        startActivity(intent);
    }
    public void btnArmyrank(View view) {
        Intent intent =new Intent(this, Ranksarmy.class);
        startActivity(intent);
    }

    public void btnAcareer(View view) {
        Intent intent =new Intent(this, Armycareer.class);
        startActivity(intent);
    }

}
