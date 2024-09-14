package com.example.lab2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        EditText email1 = findViewById(R.id.email1);
        EditText password1 = findViewById(R.id.password1);
        Button btn = findViewById(R.id.btnsubmit);

        btn.setOnClickListener(v -> {
            String email = email1.getText().toString();
            if (email.isEmpty()) {
                Toast toast = Toast.makeText(this, "email is empty", Toast.LENGTH_LONG);
                toast.show();

            }
            String password = password1.getText().toString();
            if (password.isEmpty()) {
                Toast toast = Toast.makeText(this, "password is empty", Toast.LENGTH_LONG);
                toast.show();

            }
        });
    }
}