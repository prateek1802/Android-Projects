package com.google.multipleactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String playerName = "";

    public void goToNext(View view) {
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        //intent.putExtra("age", 22);
        intent.putExtra("pName", playerName);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = findViewById(R.id.listView);

        final ArrayList<String> name = new ArrayList<String>();

        name.add("Navas");
        name.add("Carvajal");
        name.add("Varane");
        name.add("Ramos");
        name.add("Marcelo");
        name.add("Casemiro");
        name.add("Kroos");
        name.add("Modric");
        name.add("Bale");
        name.add("Benzema");
        name.add("Ronaldo");

        ArrayAdapter<String> names = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, name);

        myListView.setAdapter(names);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(MainActivity.this, "Hala " + name.get(i), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                //intent.putExtra("age", 22);
                playerName = name.get(i);
                intent.putExtra("pName", playerName);
                startActivity(intent);
            }
        });
    }
}
