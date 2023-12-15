package com.example.projectdevmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class buildpc extends AppCompatActivity {

    private int buttonClickCount = 0;





    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1 && resultCode == RESULT_OK) {
            // Check the component chosen
            String componentChosen = data.getStringExtra("componentChosen");

            // Show the corresponding TextView and ImageView
            if ("CPU".equals(componentChosen)) {
                // Assuming you have a TextView with ID 'textViewCpu' and an ImageView with ID 'imageViewCpu'
                TextView textViewCpu = findViewById(R.id.textView158);
                ImageView imageViewCpu = findViewById(R.id.imageView14);

                // Make the TextView and ImageView visible
                textViewCpu.setVisibility(View.VISIBLE);
                imageViewCpu.setVisibility(View.VISIBLE);

            }

            else if ("MOTHERBOARD".equals(componentChosen)) {
                    // Assuming you have a TextView with ID 'textViewCpu' and an ImageView with ID 'imageViewCpu'
                    TextView textViewmotherboard = findViewById(R.id.textView159);
                    ImageView imageViewmotherboard = findViewById(R.id.imageView15);

                    // Make the TextView and ImageView visible
                    textViewmotherboard.setVisibility(View.VISIBLE);
                    imageViewmotherboard.setVisibility(View.VISIBLE);
                }

            else if ("memory".equals(componentChosen)) {
                // Assuming you have a TextView with ID 'textViewCpu' and an ImageView with ID 'imageViewCpu'
                TextView textViewmemory = findViewById(R.id.textView160);
                ImageView imageViewmemory = findViewById(R.id.imageView16);

                // Make the TextView and ImageView visible
                textViewmemory.setVisibility(View.VISIBLE);
                imageViewmemory.setVisibility(View.VISIBLE);
            }


            else if ("cases".equals(componentChosen)) {
                // Assuming you have a TextView with ID 'textViewCpu' and an ImageView with ID 'imageViewCpu'
                TextView textViewcases = findViewById(R.id.textView161);
                ImageView imageViewcases = findViewById(R.id.imageView17);

                // Make the TextView and ImageView visible
                textViewcases.setVisibility(View.VISIBLE);
                imageViewcases.setVisibility(View.VISIBLE);
            }

            else if ("cartegraphique".equals(componentChosen)) {
                // Assuming you have a TextView with ID 'textViewCpu' and an ImageView with ID 'imageViewCpu'
                TextView textViewcarte = findViewById(R.id.textView162);
                ImageView imageViewcarte = findViewById(R.id.imageView18);

                // Make the TextView and ImageView visible
                textViewcarte.setVisibility(View.VISIBLE);
                imageViewcarte.setVisibility(View.VISIBLE);
            }
            else if ("storage".equals(componentChosen)) {
                // Assuming you have a TextView with ID 'textViewCpu' and an ImageView with ID 'imageViewCpu'
                TextView textViewstorage = findViewById(R.id.textView163);
                ImageView imageViewstorage = findViewById(R.id.imageView19);

                // Make the TextView and ImageView visible
                textViewstorage.setVisibility(View.VISIBLE);
                imageViewstorage.setVisibility(View.VISIBLE);
            }

            }
        }




    Button B1,B2,B3,B4,B5,B6,B7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buildpc);



        B1 = findViewById(R.id.button13);
        B2 = findViewById(R.id.button14);
        B3 = findViewById(R.id.button15);
        B4 = findViewById(R.id.button16);
        B5 = findViewById(R.id.button17);
        B6 = findViewById(R.id.button18);
        B7 = findViewById(R.id.button19);


        TextView textViewCpu = findViewById(R.id.textView158);
        ImageView imageViewCpu = findViewById(R.id.imageView14);
        TextView textViewmotherboard = findViewById(R.id.textView159);
        ImageView imageViewmotherboard = findViewById(R.id.imageView15);
        TextView textViewmemory = findViewById(R.id.textView160);
        ImageView imageViewmemory = findViewById(R.id.imageView16);
        TextView textViewcases = findViewById(R.id.textView161);
        ImageView imageViewcases = findViewById(R.id.imageView17);
        TextView textViewcarte = findViewById(R.id.textView162);
        ImageView imageViewcarte = findViewById(R.id.imageView18);
        TextView textViewstorage = findViewById(R.id.textView163);
        ImageView imageViewstorage = findViewById(R.id.imageView19);



        textViewCpu.setVisibility(View.INVISIBLE);
        imageViewCpu.setVisibility(View.INVISIBLE);
        textViewmotherboard.setVisibility(View.INVISIBLE);
        imageViewmotherboard.setVisibility(View.INVISIBLE);
        textViewmemory.setVisibility(View.INVISIBLE);
        imageViewmemory.setVisibility(View.INVISIBLE);
        textViewcases.setVisibility(View.INVISIBLE);
        imageViewcases.setVisibility(View.INVISIBLE);
        textViewcarte.setVisibility(View.INVISIBLE);
        imageViewcarte.setVisibility(View.INVISIBLE);
        textViewstorage.setVisibility(View.INVISIBLE);
        imageViewstorage.setVisibility(View.INVISIBLE);


        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(buildpc.this, cpu.class);
                startActivityForResult(intent, 1);  // 1 is a request code
                buttonClickCount++;
            }
        });


        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(buildpc.this, motherboards.class);
                startActivityForResult(intent, 1);  // 1 is a request code
                buttonClickCount++;
            }
        });


        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(buildpc.this, memory.class);
                startActivityForResult(intent, 1);  // 1 is a request code
                buttonClickCount++;
            }
        });


        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(buildpc.this, cases.class);
                startActivityForResult(intent, 1);  // 1 is a request code
                buttonClickCount++;
            }
        });


        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(buildpc.this, cartegraphique.class);
                startActivityForResult(intent, 1);  // 1 is a request code
                buttonClickCount++;
            }
        });


        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(buildpc.this, storage.class);
                startActivityForResult(intent, 1);  // 1 is a request code
                buttonClickCount++;
            }
        });

        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonClickCount == 6) {
                    Intent intent = new Intent(buildpc.this, Paiement.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(buildpc.this, "Please select all items", Toast.LENGTH_SHORT).show();
                }
            }
        });



        }

}