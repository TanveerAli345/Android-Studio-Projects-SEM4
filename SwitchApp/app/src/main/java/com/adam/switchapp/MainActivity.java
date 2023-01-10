package com.adam.switchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Switch switchLight;
    TextView lightView, heading;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchLight = findViewById(R.id.switchLight);
        lightView = findViewById(R.id.lightView);
        heading = findViewById(R.id.heading);
        relativeLayout = findViewById(R.id.relLayout);

        switchLight.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    lightView.setText("Light is ON");
                    switchLight.setTextColor(Color.BLACK);
                    lightView.setTextColor(Color.BLACK);
                    heading.setTextColor(Color.BLACK);
                    relativeLayout.setBackgroundResource(R.color.white);
                } else {
                    lightView.setText("Light is OFF");
                    lightView.setTextColor(Color.WHITE);
                    switchLight.setTextColor(Color.WHITE);
                    heading.setTextColor(Color.WHITE);
                    relativeLayout.setBackgroundResource(R.color.myGray);
                }
            }
        });
    }
}