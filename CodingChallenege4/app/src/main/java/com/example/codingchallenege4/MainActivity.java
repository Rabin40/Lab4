package com.example.codingchallenege4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.coddingchallenge";
    Button buttonOne,buttonTwo,buttonThree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonOne =findViewById(R.id.button_1) ;
        buttonTwo =findViewById(R.id.button_2) ;
        buttonThree =findViewById(R.id.button_3) ;
    }

    public void button1(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = buttonOne.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void button2(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = buttonTwo.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void button3(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = buttonThree.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }




}