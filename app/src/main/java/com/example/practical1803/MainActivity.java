package com.example.practical1803;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText numberEditText = findViewById(R.id.numberEditText);
        Button factorialButton = findViewById(R.id.factorialButton);

        factorialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int number = Integer.parseInt(numberEditText.getText().toString());
                    int result = calculateFactorial(number);
                    Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                    intent.putExtra("factorialResult", result);
                    startActivity(intent);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
