package com.example.practical1803;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        int result = getIntent().getIntExtra("factorialResult", 0);
        TextView resultTextView = findViewById(R.id.resultTextView);
        resultTextView.setText("The factorial is: " + result);
    }
}