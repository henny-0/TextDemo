package com.example.textdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.TextView);
        textView.setText("This is a TextView");
        textView.setTextSize(18); // Set text size textView.setTextColor(Color.BLUE);

        EditText editText = findViewById(R.id.EditText);
        editText.setText("Hello, World!");
        editText.setTextSize(18); // Set text size editText.setTextColor(Color.RED);

    }
}