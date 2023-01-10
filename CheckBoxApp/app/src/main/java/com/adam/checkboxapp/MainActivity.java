package com.adam.checkboxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    TextView txtOrder;
    Button button;
    CheckBox checkBox1,checkBox2,checkBox3;
    String str = "";
    int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtOrder = (TextView)findViewById(R.id.txtOrder);
        checkBox1 = (CheckBox)findViewById(R.id.checkBox);
        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox)findViewById(R.id.checkBox3);
        button = (Button)findViewById(R.id.btnOrder);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str="";
                total=0;
                if(checkBox1.isChecked()){
                    txtOrder.setText(str += "Shawarma: Rs. 100\n");
                    total=+100;
                }
                if(checkBox2.isChecked()){
                    txtOrder.setText(str += "Pizza: Rs. 180\n");
                    total+=180;
                }
                if(checkBox3.isChecked()){
                    txtOrder.setText(str += "Burger: Rs. 69\n");
                    total+=69;
                }

                Toast toast = Toast.makeText(MainActivity.this, "Order placed successfully!", Toast.LENGTH_SHORT);
                toast.show();

                txtOrder.setText(str + " \n Total: " + total);

            }
        });

    }

}