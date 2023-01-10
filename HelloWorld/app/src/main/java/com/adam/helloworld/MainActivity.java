package com.adam.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    Button btnAdd, btnSubt, btnMult, btnDiv, btnDot, btnAC, btnEqual;
    TextView txtResult;
    double firstNum, secondNum, result;
    String opr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDot =(Button)findViewById(R.id.btnDot);
        btnSubt = (Button)findViewById(R.id.btnSubt);
        btnMult =(Button)findViewById(R.id.btnMult);
        btnDiv=(Button)findViewById(R.id.btnDiv);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnEqual = (Button)findViewById(R.id.btnEqual);
        txtResult = (TextView)findViewById(R.id.resultTextView);
        btnAC =(Button)findViewById(R.id.btnAC);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btn0 = (Button)findViewById(R.id.btn0);

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = txtResult.getText() +".";
                txtResult.setText(temp);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = txtResult.getText() +"1";
                txtResult.setText(temp);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = txtResult.getText() +"2";
                txtResult.setText(temp);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = txtResult.getText() +"3";
                txtResult.setText(temp);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = txtResult.getText() +"4";
                txtResult.setText(temp);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = txtResult.getText() +"5";
                txtResult.setText(temp);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = txtResult.getText() +"6";
                txtResult.setText(temp);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = txtResult.getText() +"7";
                txtResult.setText(temp);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = txtResult.getText() +"8";
                txtResult.setText(temp);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = txtResult.getText() +"9";
                txtResult.setText(temp);
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = txtResult.getText() +"0";
                txtResult.setText(temp);
            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText("");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum = Double.parseDouble(txtResult.getText().toString());
                txtResult.setText("");
                opr ="+";
            }
        });
        btnSubt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum = Double.parseDouble(txtResult.getText().toString());
                txtResult.setText("");
                opr ="-";
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum = Double.parseDouble(txtResult.getText().toString());
                txtResult.setText("");
                opr ="*";

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum = Double.parseDouble(txtResult.getText().toString());
                txtResult.setText("");
                opr ="/";
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondNum = Double.parseDouble(txtResult.getText().toString());

                if(opr == "+") {
                    result = firstNum + secondNum;
                    txtResult.setText(result + "");
                }
                if(opr == "-") {
                    result = firstNum - secondNum;
                    txtResult.setText(result + "");
                }
                if(opr == "*") {
                    result = firstNum * secondNum;
                    txtResult.setText(result + "");
                }
                if(opr == "/") {
                    result = firstNum / secondNum;
                    txtResult.setText(result + "");
                }
            }
        });
    }
}