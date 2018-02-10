package com.example.faranakpouya.selftracker.model;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.faranakpouya.selftracker.R;

public class goals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals);
        createWaterButton();
        createStudyButton();
        createExerciseButton();
    }

    private void createWaterButton(){
        Button waterBtn = (Button) findViewById(R.id.btn_water);
        waterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(goals.this, water.class);
                startActivity(intent);
            }
        });
    }

    private void createStudyButton(){
        final Button studyBtn = (Button) findViewById(R.id.btn_study);
        studyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(goals.this, study.class);
                startActivity(intent);
            }
        });
    }

    private void createExerciseButton(){
        Button exerciseBtn = (Button) findViewById(R.id.btn_exercise);
        exerciseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(goals.this, exercise.class);
                startActivity(intent);
            }
        });
    }
}
