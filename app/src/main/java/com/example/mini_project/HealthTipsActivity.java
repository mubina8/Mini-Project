package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HealthTipsActivity extends AppCompatActivity implements View.OnClickListener{
    Button backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_tips);
        backButton = (Button) findViewById(R.id.backId);
        backButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent goToMain = new Intent(HealthTipsActivity.this,MainActivity.class);
        startActivity(goToMain);
    }
}
