package com.adam.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etID, etName, etAge, etBranch, etDept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new DatabaseUtil(this);

        etID = (EditText) findViewById(R.id.editTxtId);
        etName = (EditText) findViewById(R.id.editTxtName);
        etAge = (EditText) findViewById(R.id.editTxtAge);
        etBranch = (EditText) findViewById(R.id.editTxtBranch);
        etDept = (EditText) findViewById(R.id.editTxtDept);
    }

    public void registerStudent(View view) {
        DatabaseUtil databaseUtil = new DatabaseUtil(this);
        String result = databaseUtil.registerStudent(etID.getText().toString(),
                                    etName.getText().toString(),
                                    etAge.getText().toString(),
                                    etBranch.getText().toString(),
                                    etDept.getText().toString());

        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        etID.setText("");
        etName.setText("");
        etAge.setText("");
        etBranch.setText("");
        etDept.setText("");
    }
}