package com.example.projectdevmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class games extends AppCompatActivity {


    TextView T1,T2;
    ImageView I1,I2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);


        T1 = findViewById(R.id.textView6);
        T2 = findViewById(R.id.textView164);

        I1 = findViewById(R.id.imageView23);
        I2 = findViewById(R.id.imageView24);


        T1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, reddeadredemption.class);
                startActivity(intent);

            }
        });

        I1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, reddeadredemption.class);
                startActivity(intent);

            }
        });


        T2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, forzamotorsport.class);
                startActivity(intent);

            }
        });



        I2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, forzamotorsport.class);
                startActivity(intent);

            }
        });


    }
}