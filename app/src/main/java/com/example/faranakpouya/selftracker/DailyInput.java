package com.example.faranakpouya.selftracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DailyInput extends AppCompatActivity {

    TextView showValue;
    int counter =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_input);

        showValue = (TextView) findViewById(R.id.counterValue);
    }

    public void countIN (View view) {
        counter++;
        showValue.setText(Integer.toString(counter));
    }

    public void countDE (View view) {
        if (counter ==0) {
            showValue.setText(Integer.toString(counter));
        }
        else{
            counter--;
            showValue.setText(Integer.toString(counter));
        }
    }

}
