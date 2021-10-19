package com.example.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ListView myListView = findViewById(R.id.myListView);
        ArrayList<String> grocery = new ArrayList<>();

        grocery.add("INDIA");
        grocery.add("ARGENTINA");
        grocery.add("AUSTRALIA");
        grocery.add("CHINA");
        grocery.add("AUSTRIA");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,grocery);
        myListView.setAdapter((arrayAdapter));


        ArrayList<String> grocery2 = new ArrayList<>();

        grocery2.add("New Delhi");
        grocery2.add("Buenos Aires");
        grocery2.add("Canberra");
        grocery2.add("Beijing");
        grocery2.add("Vienna");

        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,grocery);
        myListView.setAdapter((arrayAdapter2));


        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text = "Item" + position + "" + view.toString();
//                Toast.makeText(MainActivity.this, "CAPITAL: "+ grocery2.get(position)+ "", Toast.LENGTH_SHORT).show();
                display= findViewById(R.id.output);
                display.setText(grocery2.get(position));

            }
        });
    }
}