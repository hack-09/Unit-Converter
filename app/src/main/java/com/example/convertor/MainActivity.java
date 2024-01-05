package com.example.convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button button1,button2,button3,button4;
    public TextView textView;
    public EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str;
                str = editText.getText().toString ();
                if(editText.getText ().toString ().length ()>0 && editText.getText ().toString ().length ()<8){
                    int kl = Integer.parseInt (str);
                    double length = kl * 1000;
                    textView.setText (String.format ("%.2f", length) + " meters");
                }
                else{
                    Toast.makeText(MainActivity.this,"Please Enter the Vaild Length",Toast.LENGTH_LONG).show();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str;
                str = editText.getText().toString ();
                if(editText.getText ().toString ().length ()>0 && editText.getText ().toString ().length ()<8){
                    int kl = Integer.parseInt (str);
                    double length = kl * 3280.83;
                    textView.setText (String.format ("%.2f", length) + " feets");
                }
                else{
                    Toast.makeText(MainActivity.this,"Please Enter the Vaild Length",Toast.LENGTH_LONG).show();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str;
                str = editText.getText().toString ();
                if(editText.getText ().toString ().length ()>0 && editText.getText ().toString ().length ()<8){
                    int kl = Integer.parseInt (str);
                    double length = kl * 39370.07;
                    textView.setText (String.format ("%.2f", length) + " Inches");
                }
                else{
                    Toast.makeText(MainActivity.this,"Please Enter the Vaild Length",Toast.LENGTH_LONG).show();
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str;
                str = editText.getText().toString ();
                if(editText.getText ().toString ().length ()>0 && editText.getText ().toString ().length ()<8){
                    int kl = Integer.parseInt (str);
                    double length = kl * 0.6213;
                    textView.setText (String.format ("%.4f", length) + " miles");
                }
                else{
                    Toast.makeText(MainActivity.this,"Please Enter the Vaild Length",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}