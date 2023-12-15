package com.example.projectdevmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class MainPage extends AppCompatActivity {

    private boolean isValidSearchTerm(String searchTerm) {
        // Define the allowed search terms
        String[] allowedSearchTerms = {"rtx", "geforce", "msi", "3060","rtx 3060", "ventus", "2x", "12g", "MSI GeForce RTX 3060 Ventus 2X 12G","MSI geforce","MSI Geforce RTX","MSI GeForce RTX 3060","MSI GeForce RTX 3060 Ventus","MSI GeForce RTX 3060 Ventus 2X","geforce rtx 3060","geforce rtx","amd ryzen 5 5600x", "amd ryzen 5", "amd"};

        // Check if the entered search term is in the allowed list
        return Arrays.asList(allowedSearchTerms).contains(searchTerm);
    }


    ImageButton B1,B2,B3;
    ImageView I1;

    EditText E1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);



        B1 = findViewById(R.id.imageButton8);
        B2 = findViewById(R.id.imageButton15);
        B3 = findViewById(R.id.imageButton4);
        I1 = findViewById(R.id.imageView3);
        E1 = findViewById(R.id.editTextText);



        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this, ActivityProducts.class);
                startActivity(intent);

            }
        });


        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this, buildpc.class);
                startActivity(intent);

            }
        });

        I1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this, games.class);
                startActivity(intent);

            }
        });


        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String searchTerm = E1.getText().toString().trim().toLowerCase();

                if (isValidSearchTerm(searchTerm)) {
                    if (searchTerm.equals("amd ryzen 5 5600x") || searchTerm.equals("amd ryzen 5") || searchTerm.equals("amd")) {
                        // Rediriger vers l'activité CPU
                        Intent intent = new Intent(MainPage.this, cpu.class);
                        startActivity(intent);
                    } else {
                        // Rediriger vers l'activité cartegraphique avec le terme de recherche
                        Intent intent = new Intent(MainPage.this, cartegraphique.class);
                        intent.putExtra("searchTerm", searchTerm);
                        startActivity(intent);
                    }
                } else {
                    // Handle invalid search term
                    Toast.makeText(MainPage.this, "Item doesn't exist", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}