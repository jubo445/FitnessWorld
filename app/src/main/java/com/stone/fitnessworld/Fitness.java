package com.stone.fitnessworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fitness extends AppCompatActivity {
    Button ftbtn1,ftbtn2,ftbtn3,ftbtn4,ftbtn5,ftbtn6,ftbtn7,ftbtn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness);
        ftbtn1=findViewById(R.id.ftbtn1);
        ftbtn2=findViewById(R.id.ftbtn2);
        ftbtn3=findViewById(R.id.ftbtn3);
        ftbtn4=findViewById(R.id.ftbtn4);
        ftbtn5=findViewById(R.id.ftbtn5);
        ftbtn6=findViewById(R.id.ftbtn6);
        ftbtn7=findViewById(R.id.ftbtn7);
        ftbtn8=findViewById(R.id.ftbtn8);

        ftbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fitness.this,ab.class));
            }
        });
        ftbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fitness.this,arm.class));
            }
        });
        ftbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fitness.this,butt.class));
            }
        });
        ftbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fitness.this,cardio.class));
            }
        });
        ftbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fitness.this,gear.class));
            }
        });
        ftbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fitness.this,legs.class));
            }
        });
        ftbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fitness.this,strength.class));
            }
        });
        ftbtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fitness.this,yoga.class));
            }
        });
    }
}