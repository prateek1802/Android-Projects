package com.google.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences = this.getSharedPreferences("com.google.sharedpreferences", Context.MODE_PRIVATE);

//        sharedPreferences.edit().putString("username", "Prateek").apply();
//
//        String username = sharedPreferences.getString("username", "");
//
//        Log.i("Name", username);

        ArrayList<String> friends = new ArrayList<String>();

        friends.add("Ronaldo");
        friends.add("Ramos");
        friends.add("Bale");

        for (int i = 0; i < friends.size(); i++) {
            sharedPreferences.edit().putString("username", friends.get(i)).apply();
            String x = sharedPreferences.getString("username", "");
            Log.i("Name", x);
        }

    }
}
