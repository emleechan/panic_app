package com.example.faranakpouya.selftracker.model;

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
    }

    private void createWaterButton(){
        Button waterBtn = (Button) findViewById(R.id.btn_water);
        waterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void createStudyButton(){

    }

    private void createExerciseButton(){

    }
}
