package com.google.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.VectorEnabledTintResources;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void generate(View view) {
        EditText getNumber = (EditText) findViewById(R.id.number);
        String n = getNumber.getText().toString();

        int number = Integer.parseInt(n);
        int randomNumber = (int) (Math.random() * (21 - 1)) + 1;

        //String rNo= Integer.toString(randomNumber);
        Log.i("Number", n);
        //Log.i("Random Number:", rNo);

        if(randomNumber==number){
            Toast.makeText(this, "You got it Right!", Toast.LENGTH_LONG).show();
        }
        else if(randomNumber>number){
            Toast.makeText(this, "You got it low!", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "You got it High!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
