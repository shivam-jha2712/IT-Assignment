package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    CheckBox checkbox1;
    CheckBox checkbox2;
    CheckBox checkbox3;
    CheckBox checkbox4;
    Button button;
    TextView textview;
    private ArrayList<String> result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        checkbox1=findViewById(R.id.checkBox1);
        checkbox2=findViewById(R.id.checkBox2);
        checkbox3=findViewById(R.id.checkBox3);
        checkbox4=findViewById(R.id.checkBox4);

        button = findViewById(R.id.button);
        textview =  findViewById(R.id.display);

        result= new ArrayList<>();
        textview.setEnabled(false);

        checkbox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(checkbox1.isChecked())
                {
                    result.add("PIZZA");
                }
                else
                {
                    result.remove("PIZZA");
                }
            }
        });

        checkbox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(checkbox2.isChecked())
                {
                    result.add("PEPSI");
                }
                else
                {
                    result.remove("PEPSI");
                }

            }
        });


        checkbox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(checkbox3.isChecked())
                {
                    result.add("MOMO");
                }
                else
                {
                    result.remove("MOMO");
                }

            }
        });


        checkbox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(checkbox4.isChecked())
                {
                    result.add("TACOS");
                }
                else
                {
                    result.remove("TACOS");
                }

            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                StringBuilder stringBuilder= new StringBuilder();
                for(String s : result)
                {
                    stringBuilder.append(s).append("\n");
                }
                textview.setText((stringBuilder.toString()));
                textview.setEnabled(false);
            }
        });

    }
}