package com.example.projectdevmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class memory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory);



        Button addButton = findViewById(R.id.button8);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set a result to indicate that the CPU is chosen
                Intent resultIntent = new Intent();
                resultIntent.putExtra("componentChosen", "memory");
                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });

    }
}