package com.example.controldeclientes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private TextView txt1;
    private TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cont = Integer.parseInt(txt1.getText().toString())+1;
                txt1.setText(Integer.toString(cont));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cont = Integer.parseInt(txt2.getText().toString()) + 1;
                txt2.setText(Integer.toString(cont));
            }
        });
    }
}
