package com.tregaki.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private EditText numberOne;
    private EditText numberTwo;
    private Button okButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        numberOne = (EditText) findViewById(R.id.number1);
        numberTwo = (EditText) findViewById(R.id.number2);
        okButton = (Button) findViewById(R.id.okBtn);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = num1 = numberOne.getText().toString();
                String num2 = num2 = numberTwo.getText().toString();


                LayoutInflater layoutInflater = getLayoutInflater();
                View layout = layoutInflater.inflate(R.layout.custom_toast, (ViewGroup)findViewById(R.id.custom_toast_layout) );
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setView(layout);
                toast.show();

                Intent secondActivityIntent = new Intent(FirstActivity.this, SecondActivity.class);
                secondActivityIntent.putExtra("NUMBER_ONE", num1);
                secondActivityIntent.putExtra("NUMBER_TWO", num2);
                startActivity(secondActivityIntent);

            }
        });

    }
}