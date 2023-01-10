package com.adam.radiobuttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSubmit;
    TextView txtDetails;
    EditText txtName;
    RadioGroup radioGroup;
    RadioButton radioMale, radioFemale, radioOther;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = (Button) findViewById(R.id.submitBtn);
        txtName = (EditText) findViewById(R.id.editTextName);
        txtDetails = (TextView) findViewById(R.id.textViewDetails);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioMale = (RadioButton) findViewById(R.id.maleRadio);
        radioFemale = (RadioButton) findViewById(R.id.femaleRadio);
        radioOther = (RadioButton) findViewById(R.id.otherRadio);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDetails.setText("Name: " + txtName.getText());

                if (radioGroup.getCheckedRadioButtonId() == -1) {
                    txtDetails.setText(txtName.getText() + "\n Gender: Not Selected");
                } else if (radioGroup.getCheckedRadioButtonId() == radioMale.getId()) {
                    txtDetails.setText(txtName.getText() + "\n Gender:" + radioMale.getText());
                } else if (radioGroup.getCheckedRadioButtonId() == radioFemale.getId()) {
                    txtDetails.setText(txtName.getText() + "\n Gender:" + radioFemale.getText());
                } else {
                    txtDetails.setText(txtName.getText() + "\n Gender:" + radioOther.getText());
                }
            }
        });
    }
}