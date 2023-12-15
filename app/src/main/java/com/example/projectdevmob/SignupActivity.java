package com.example.projectdevmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import javax.annotation.Nullable;

public class SignupActivity extends AppCompatActivity {


    TextView T1;
    DBHelper dbhelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        TextView textView1 = findViewById(R.id.textView12);
        EditText E1 = findViewById(R.id.editTextTextEmailAddress2);
        EditText E2 = findViewById(R.id.editTextTextPassword3);
        EditText E3 = findViewById(R.id.editTextTextPassword2);
        Button B1 = findViewById(R.id.button3);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code to open the new activity
                Intent intent = new Intent(SignupActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });


        DBHelper dbHelper = new DBHelper(SignupActivity.this); // Assuming you have a context variable defined

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = E1.getText().toString();
                String pwd = E2.getText().toString();
                String rePad = E3.getText().toString();

                if (user.equals("") || pwd.equals("") || rePad.equals("")) {
                    Toast.makeText(SignupActivity.this, "Please fill all the fields", Toast.LENGTH_LONG).show();
                } else {
                    if (pwd.equals(rePad)) {
                        // Proceed with registration
                        boolean registeredSuccess = dbHelper.insertData(user, pwd);

                        if (registeredSuccess) {
                            Toast.makeText(SignupActivity.this, "User Registered Successfully", Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(SignupActivity.this, "User Registration Failed", Toast.LENGTH_LONG).show();
                        }
                    } else {
                        Toast.makeText(SignupActivity.this, "Passwords do not match", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

    }
}
