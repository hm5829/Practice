package com.tom.practice;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bHelp = findViewById(R.id.b_help);
        bHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainActivity.this)
                        .setMessage("BMI等於體重除以身高平方")
                        .setTitle("BMI說明")
                        .setPositiveButton("ok",null)
                        .show();
            }
        });
        };



    public void bmi(View v){
        EditText edWeight = (EditText) findViewById(R.id.ed_weight);
        EditText edHeight = (EditText) findViewById(R.id.ed_height);
        float w = Float.parseFloat(edWeight.getText().toString());
        float h = Float.parseFloat(edHeight.getText().toString());
        float bmi = w / (h*h);
//        Toast.makeText(this,"Your BMI is: "+bmi,Toast.LENGTH_LONG)
//                .show();
        new AlertDialog.Builder(this)
                .setMessage("Your BMI is: "+bmi)
                .setTitle("BMI計算")
                .setPositiveButton("OK", null)
                .show();
    }
}
