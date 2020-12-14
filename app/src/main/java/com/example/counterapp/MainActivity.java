package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView ;
    private Button increase ,decrease;
    private int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        increase = findViewById(R.id.PlusValue);
        decrease = findViewById(R.id.MinusValue);
        textView = findViewById(R.id.TextViewNumber);


    }

    public void IncreaseValue(View view) {
        number++;
        textView.setText(""+number);

    }

    public void DecreaseValue(View view) {
        number--;
        textView.setText(""+number);
    }
}