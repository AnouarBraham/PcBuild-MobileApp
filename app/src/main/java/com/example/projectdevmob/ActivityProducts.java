package com.example.projectdevmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ActivityProducts extends AppCompatActivity {


    ImageButton B1,B2,B3,B4,B5,B6;
    TextView T1,T2,T3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);



        B1 = findViewById(R.id.imageButton);
        B2 = findViewById(R.id.imageButton2);
        B3 = findViewById(R.id.imageButton3);
        B4 = findViewById(R.id.imageButton5);
        B5 = findViewById(R.id.imageButton6);
        B6 = findViewById(R.id.imageButton7);


        T1 = findViewById(R.id.textView23);
        T2 = findViewById(R.id.textView24);
        T3 = findViewById(R.id.textView25);





        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityProducts.this, cartegraphique.class);
                startActivity(intent);

            }
        });


        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityProducts.this, cases.class);
                startActivity(intent);

            }
        });

        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityProducts.this, storage.class);
                startActivity(intent);

            }
        });

        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityProducts.this, motherboards.class);
                startActivity(intent);

            }
        });

        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityProducts.this, memory.class);
                startActivity(intent);

            }
        });


        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityProducts.this, cpu.class);
                startActivity(intent);

            }
        });

        T1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code to open the new activity
                Intent intent = new Intent(ActivityProducts.this, monitor.class);
                startActivity(intent);
            }
        });


        T2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code to open the new activity
                Intent intent = new Intent(ActivityProducts.this, keyboards.class);
                startActivity(intent);
            }
        });


        T3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code to open the new activity
                Intent intent = new Intent(ActivityProducts.this, mice.class);
                startActivity(intent);
            }
        });

    }
}