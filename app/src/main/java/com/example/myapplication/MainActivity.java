package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button click;
    private TextView number;
    int num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click = (Button) findViewById(R.id.button);
        number = (TextView) findViewById(R.id.textView);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num++;
                number.setText(String.valueOf(num));

            }
        });

    }}