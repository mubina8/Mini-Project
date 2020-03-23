package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class preventionActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView preventionImage1,preventionImage2,preventionImage3,preventionImage4,preventionImage5,preventionImage6;
    Button backPreventionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevention);
        preventionImage1 =(ImageView)findViewById(R.id.prevention1);
        preventionImage2 =(ImageView)findViewById(R.id.prevention2);
        preventionImage3 =(ImageView)findViewById(R.id.prevention3);
        preventionImage4 =(ImageView)findViewById(R.id.prevention4);
        preventionImage5 =(ImageView)findViewById(R.id.prevention5);
        preventionImage6 =(ImageView)findViewById(R.id.prevention6);
        backPreventionButton =  (Button)findViewById(R.id.backPreventionId);
        preventionImage1.setOnClickListener(this);
        preventionImage2.setOnClickListener(this);
        preventionImage3.setOnClickListener(this);
        preventionImage4.setOnClickListener(this);
        preventionImage5.setOnClickListener(this);
        preventionImage6.setOnClickListener(this);
        backPreventionButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.prevention1)
        {
            preventionImage1.setVisibility(v.GONE);
            preventionImage2.setVisibility(v.VISIBLE);


        }
       else if(v.getId()==R.id.prevention2)
        {
            preventionImage2.setVisibility(v.GONE);
            preventionImage3.setVisibility(v.VISIBLE);
        }
        else if(v.getId()==R.id.prevention3)
        {
            preventionImage3.setVisibility(v.GONE);
            preventionImage4.setVisibility(v.VISIBLE);

        }
        else if(v.getId()==R.id.prevention4)
        {
            preventionImage4.setVisibility(v.GONE);
            preventionImage5.setVisibility(v.VISIBLE);

        }
        else if(v.getId()==R.id.prevention5)
        {
            preventionImage5.setVisibility(v.GONE);
            preventionImage6.setVisibility(v.VISIBLE);

        }
        else if(v.getId()==R.id.backPreventionId)
        {
            Intent intent1 = new Intent(preventionActivity.this,symtomActivity.class);
            startActivity(intent1);
        }
      else{
            Intent intent1 = new Intent(preventionActivity.this,HealthTipsActivity.class);
            startActivity(intent1);
        }

    }
}
