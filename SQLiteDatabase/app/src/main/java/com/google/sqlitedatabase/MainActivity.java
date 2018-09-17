package com.google.sqlitedatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            SQLiteDatabase myDatabase = this.openOrCreateDatabase("Users", MODE_PRIVATE, null);
            myDatabase.execSQL("CREATE TABLE IF NOT EXISTS users (name VARCHAR,age INT(3))");

//            myDatabase.execSQL("INSERT INTO users (name,age) VALUES ('Modric',34)");
//            myDatabase.execSQL("INSERT INTO users (name,age) VALUES ('Mbappe',19)");

            Cursor c = myDatabase.rawQuery("SELECT * FROM users WHERE age>20", null);

            int nameIndex = c.getColumnIndex("name");
            int ageIndex = c.getColumnIndex("age");

            c.moveToFirst();

            while (c != null) {
                Log.i("Name: ", c.getString(nameIndex));
                Log.i("Age: ", c.getString(ageIndex));
                c.moveToNext();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
