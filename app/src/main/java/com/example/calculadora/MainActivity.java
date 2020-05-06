package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.etNum1);
        num2 = findViewById(R.id.etNum2);
        result = findViewById(R.id.tvResult);
    }

    public void adicaoResultado(View v) {
        String num1Str = num1.getText().toString().trim();
        String num2Str = num2.getText().toString().trim();
        result.setText("");
        if (num1Str.equals("") || num2Str.equals("")) {
            Toast.makeText(this, "Por favor insira um valor válido", Toast.LENGTH_LONG).show();
        } else {
            Float res = Float.valueOf(num1Str) + Float.valueOf(num2Str);
            result.setText("Resultado: " + res);
        }

        //Toast.makeText(this, "Adição", Toast.LENGTH_SHORT).show();
    }

    public void subResultado(View v) {
        String num1Str = num1.getText().toString().trim();
        String num2Str = num2.getText().toString().trim();
        result.setText("");
        if (num1Str.equals("") || num2Str.equals("")) {
            Toast.makeText(this, "Por favor insira um valor válido", Toast.LENGTH_LONG).show();
        } else {
            Float res = Float.valueOf(num1Str) - Float.valueOf(num2Str);
            result.setText("Resultado: " + res);
        }

        //Toast.makeText(this, "Adição", Toast.LENGTH_SHORT).show();
    }

    public void multiResultado(View v) {
        String num1Str = num1.getText().toString().trim();
        String num2Str = num2.getText().toString().trim();
        result.setText("");
        if (num1Str.equals("") || num2Str.equals("")) {
            Toast.makeText(this, "Por favor insira um valor válido", Toast.LENGTH_LONG).show();
        } else {
            Float res = Float.valueOf(num1Str) * Float.valueOf(num2Str);
            result.setText("Resultado: " + res);
        }

        //Toast.makeText(this, "Adição", Toast.LENGTH_SHORT).show();
    }

    public void divResultado(View v) {
        String num1Str = num1.getText().toString().trim();
        String num2Str = num2.getText().toString().trim();
        result.setText("");
        if (num1Str.equals("") || num2Str.equals("") || num2Str.equals("0")) {
            Toast.makeText(this, "Por favor insira um valor válido", Toast.LENGTH_LONG).show();
        } else {
            Float res = Float.valueOf(num1Str) / Float.valueOf(num2Str);
            result.setText("Resultado: " + res);
        }

        //Toast.makeText(this, "Adição", Toast.LENGTH_SHORT).show();
    }
}
