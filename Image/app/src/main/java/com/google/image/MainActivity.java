package com.google.image;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void changeImage(View view) {
        Log.i("Tag:","Button Pressed");

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.squirtle);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
