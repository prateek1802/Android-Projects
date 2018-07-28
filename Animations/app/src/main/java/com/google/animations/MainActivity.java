package com.google.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean bartIsShowing = true;

    public void fade(View view) {
        Log.i("Tag", "Image Clicked!");

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);

        /*if (bartIsShowing) {
            bartIsShowing = false;
            imageView.animate().alpha(0).setDuration(2000);
            imageView1.animate().alpha(1).setDuration(3000);
        } else {
            bartIsShowing = true;
            imageView.animate().alpha(1).setDuration(2000);
            imageView1.animate().alpha(0).setDuration(3000);
        }*/

        //imageView.animate().translationX(-2000).setDuration(1000);
        //imageView.animate().translationX(2000).rotation(360).setDuration(3000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setX(-1000);

        imageView.animate().translationXBy(1000).rotation(3600).setDuration(2000);
    }
}
