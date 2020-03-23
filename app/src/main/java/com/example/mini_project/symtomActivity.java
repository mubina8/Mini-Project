package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class symtomActivity extends AppCompatActivity implements View.OnClickListener {
     Button symptomButton,prevButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symtom);
        symptomButton = (Button)findViewById(R.id.symptomButton);
        prevButton =  (Button)findViewById(R.id.prevButton);
        symptomButton.setOnClickListener(this);
        prevButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.symptomButton)
        {
            Intent intent = new Intent(symtomActivity.this,preventionActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.prevButton)
        {
            Intent intent = new Intent(symtomActivity.this,MainActivity.class);
            startActivity(intent);
        }

    }
}
