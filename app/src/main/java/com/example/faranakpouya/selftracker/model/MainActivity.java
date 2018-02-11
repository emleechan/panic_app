package com.example.faranakpouya.selftracker.model;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.faranakpouya.selftracker.DailyInput;
import com.example.faranakpouya.selftracker.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createButtonGoals();
        createButtonDaily();
    }

    private void createButtonGoals(){
        Button start = (Button) findViewById(R.id.btn_start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goals = new Intent(MainActivity.this, goals.class);
                startActivity(goals);
            }
        });
    }

    private void createButtonDaily(){
        Button start = (Button) findViewById(R.id.buttonD);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goals = new Intent(MainActivity.this, DailyInput.class);
                startActivity(goals);
            }
        });
    }
}

