package com.example.android1st;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.example.android1st.R;


public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView n1;
    private TextView n2;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        button = findViewById(R.id.button);
        n1 = findViewById(R.id.number1);
        n2 = findViewById(R.id.number2);
        output = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String s1 = n1.getText().toString();
                double a = Double.parseDouble(s1);

                String s2 = n2.getText().toString();
                double b = Double.parseDouble(s2);
                if(b==0)
                {
                    output.setText("Please give correct input");
                }
                else
                {
                    double c = a/b;
                    output.setText("The value is : "+c);

                }

            }
        });

    }
}