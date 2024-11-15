package com.example.m04_gui_01;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivityScreenSize extends AppCompatActivity {

    EditText textN1, textN2, textANS;
    Double num1, num2, numAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_screen_size);

        textN1 = findViewById(R.id.inputNum1);
        textN2 = findViewById(R.id.inputNum2);
        textANS = findViewById(R.id.outputNumAns);
    }

    // methods attached to buttons via xml
    public void mButton(View view) {
        Log.d("Calc multiply button", "Multiply button clicked");

        numAns = 0.0;

        try {
            num1 = Double.parseDouble(textN1.getText().toString());
            num2 = Double.parseDouble(textN2.getText().toString());
            numAns = num1 * num2;
        } catch (NumberFormatException e) {
            Log.w("Calc Multiply button", "Multiply Selected with no inputs ... ");
        }

        textANS.setText(String.format("%s", numAns));
    }

    public void dButton(View view) {
        Log.d("Calc divide button", "Divide button clicked");

        numAns = 0.0;

        try {
            num1 = Double.parseDouble(textN1.getText().toString());
            num2 = Double.parseDouble(textN2.getText().toString());
            numAns = num1 / num2;
        } catch (NumberFormatException e) {
            Log.w("Calc divide button", "Divide Selected with no inputs ... ");
        }

        textANS.setText(String.format("%s", numAns));
    }

    public void aButton(View view) {
        Log.d("Calc add button", "Add button clicked");

        numAns = 0.0;

        try {
            num1 = Double.parseDouble(textN1.getText().toString());
            num2 = Double.parseDouble(textN2.getText().toString());
            numAns = num1 + num2;
        } catch (NumberFormatException e) {
            Log.w("Calc add button", "Add Selected with no inputs ... ");
        }

        textANS.setText(String.format("%s", numAns));
    }

    public void sButton(View view) {
        Log.d("Calc subtract button", "Subtract button clicked");

        numAns = 0.0;

        try {
            num1 = Double.parseDouble(textN1.getText().toString());
            num2 = Double.parseDouble(textN2.getText().toString());
            numAns = num1 - num2;
        } catch (NumberFormatException e) {
            Log.w("Calc subtract button", "Subtract Selected with no inputs ... ");
        }

        textANS.setText(String.format("%s", numAns));
    }
}
