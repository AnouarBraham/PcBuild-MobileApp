package com.example.projectdevmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class cpu extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpu);



        Button addButton = findViewById(R.id.button9);



        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set a result to indicate that the CPU is chosen
                Intent resultIntent = new Intent();
                resultIntent.putExtra("componentChosen", "CPU");
                setResult(RESULT_OK, resultIntent);
                finish();


            }
        });



    }
}