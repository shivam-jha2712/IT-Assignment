package com.example.modulus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView n1;
    private TextView n2;
    private TextView output;
    private static final int LONG_DELAY = 3500;
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
                    Toast.makeText(MainActivity.this,"ENTER A CORRECT INPUT",Toast.LENGTH_LONG).show();
//                    Toast toast= Toast.makeText(getApplicationContext(),
//                            "Your string here", Toast.LENGTH_SHORT);
//                    toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 0);
//                    toast.show();

                }
                else
                {
                    double c = a%b;
                    output.setText("The value is : "+c);
                    for (int i = 0; i < 5; i++)
                    {
                        Toast.makeText(MainActivity.this,"THE value is: "+c,Toast.LENGTH_LONG).show();
//                        Toast toast= Toast.makeText(getApplicationContext(),
//                                "Your string here", Toast.LENGTH_SHORT);
//                        toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 0);
//                        toast.show();
                    }

                }

            }
        });

    }
}