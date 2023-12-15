package com.example.projectdevmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {


    TextView T1;

    DBHelper dbHelper;
    Button B1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        TextView textView1 = findViewById(R.id.textView9);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code to open the new activity
                Intent intent = new Intent(MainActivity2.this, SignupActivity.class);
                startActivity(intent);
            }
        });

        B1 = findViewById(R.id.button2);





        EditText etUsername = findViewById(R.id.editTextTextEmailAddress);
        EditText etPassword = findViewById(R.id.editTextTextPassword);


        dbHelper = new DBHelper(MainActivity2.this);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
                    Toast.makeText(MainActivity2.this, "Please fill all the fields", Toast.LENGTH_LONG).show();
                } else {
                    // Check if the user is registered
                    boolean loginSuccess = dbHelper.checkLogin(username, password);

                    if (loginSuccess) {
                        Toast.makeText(MainActivity2.this, "Login Successful", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(MainActivity2.this, MainPage.class);
                        startActivity(intent);
                        // Proceed with your login logic (e.g., open a new activity)
                        // Intent intent = new Intent(LoginActivity.this, YourNextActivity.class);
                        // startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity2.this, "Invalid username or password", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });




    }
}