package com.example.wall;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextEmail, editTextPassword;
    private Button buttonLogin, buttonSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        buttonSignup = findViewById(R.id.buttonSignup);

        // Set click listeners for Login and Signup buttons
        buttonLogin.setOnClickListener(v -> login());
        buttonSignup.setOnClickListener(v -> signup());
    }

    private void login(){

        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        if(email.equals("username") && password.equals("password")){

            // TODO: Authentication logic here
            Toast.makeText(MainActivity.this, "Login successful!", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, HomeActivity.class));
        }
        else{
            Toast.makeText(MainActivity.this, "Invalid email or password", Toast.LENGTH_SHORT).show();
        }
    }

    private void signup(){

        // TODO: Handle signup
        Toast.makeText(MainActivity.this, "Redirecting to Signup", Toast.LENGTH_SHORT).show();
    }
}































