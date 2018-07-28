package com.google.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {
        Log.i("Tag:", "Button Pressed");

        EditText amount = (EditText) findViewById(R.id.amount);

        double recievedAmount = Double.parseDouble(amount.getText().toString());

        double INR = recievedAmount*90.27;

        Toast.makeText(this, "INR: " + INR, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
