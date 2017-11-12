package com.tom.practice;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bmi(View v){
        EditText edWeight = findViewById(R.id.ed_weight);
        EditText edHeight = findViewById(R.id.ed_height);
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
