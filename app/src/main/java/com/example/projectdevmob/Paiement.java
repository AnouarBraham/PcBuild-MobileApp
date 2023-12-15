package com.example.projectdevmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Paiement extends AppCompatActivity {


    Button B1,B2;
    EditText T1,T2,T3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paiement);

        B1 = findViewById(R.id.button20);
        B2 = findViewById(R.id.button21);

        T1 = findViewById(R.id.editTextNumber2);
        T2 = findViewById(R.id.editTextDate);
        T3 = findViewById(R.id.editTextNumber);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!T1.getText().toString().isEmpty() && !T2.getText().toString().isEmpty() && !T3.getText().toString().isEmpty()) {
                    Toast.makeText(Paiement.this, "Transaction confirmed", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Paiement.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                }
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}