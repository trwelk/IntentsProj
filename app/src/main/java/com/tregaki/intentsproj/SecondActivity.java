package com.tregaki.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private EditText num1Field;
    private EditText num2Field;
    private TextView result;

    private Button add_btn;
    private Button sub_btn;
    private Button mult_btn;
    private Button div_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent curInent = getIntent();
        String num1 = curInent.getStringExtra("NUMBER_ONE");
        String num2 = curInent.getStringExtra("NUMBER_TWO");

        num1Field = (EditText) findViewById(R.id.scnd_act_number1);
        num2Field = (EditText) findViewById(R.id.scnd_act_number2);

        add_btn = (Button) findViewById(R.id.add_btn);
        sub_btn = (Button) findViewById(R.id.sub_btn);
        mult_btn = (Button) findViewById(R.id.mult_btn);
        div_btn = (Button) findViewById(R.id.div_btn);

        num1Field.setText(num1);
        num2Field.setText(num2);

        result = (TextView) findViewById(R.id.result_text);

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numOne = Integer.parseInt(num1Field.getText().toString());
                int numTwo = Integer.parseInt(num2Field.getText().toString());
                int sum = numOne + numTwo;
                String ret = String.valueOf(sum);

                result.setText(ret);

            }
        });

        div_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numOne = Integer.parseInt(num1Field.getText().toString());
                int numTwo = Integer.parseInt(num2Field.getText().toString());
                String retVal = String.valueOf((double)numOne/(double)numTwo);
                result.setText(retVal);
            }
        });

        mult_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numOne = Integer.parseInt(num1Field.getText().toString());
                int numTwo = Integer.parseInt(num2Field.getText().toString());
                String retVal = String.valueOf(numOne*numTwo);
                result.setText(retVal);

            }
        });

        sub_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numOne = Integer.parseInt(num1Field.getText().toString());
                int numTwo = Integer.parseInt(num2Field.getText().toString());
                String retVal = String.valueOf(numOne-numTwo);
                result.setText(retVal);
            }
        });
    }
}