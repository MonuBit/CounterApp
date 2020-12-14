package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView ;
    private Button increase ,decrease;
    MainActivityViewModelClass model = new ViewModelProvider(this).get(MainActivityViewModelClass.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        increase = findViewById(R.id.PlusValue);
        decrease = findViewById(R.id.MinusValue);
        textView = findViewById(R.id.TextViewNumber);

        textView.setText(String.valueOf(model.Current()));


    }

    public void IncreaseValue(View view) {

            textView.setText(String.valueOf(model.DecreaseValue()));

    }

    public void DecreaseValue(View view) {

        textView.setText(String.valueOf(model.IncreaseValue()));
    }
}