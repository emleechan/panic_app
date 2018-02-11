package com.example.faranakpouya.selftracker.model;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.faranakpouya.selftracker.R;

public class study extends AppCompatActivity {

    Button submit;
    EditText eHour, eMinutes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);

        submit = (Button)findViewById(R.id.studySubmit);
        eHour   = (EditText)findViewById(R.id.getHour);
        eMinutes   = (EditText)findViewById(R.id.getMinutes);


        submit.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        Log.v("Hours", eHour.getText().toString());
                        Log.v("Minutese", eMinutes.getText().toString());
                    }
                });
    }
}
