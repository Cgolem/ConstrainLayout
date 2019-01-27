package com.example.constrainlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button btnSumar;
    EditText inputOne;
    EditText inputTwo;
    TextView labelResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSumar = (Button) findViewById(R.id.btnSuma);
        inputOne = (EditText) findViewById(R.id.inputOne);
        inputTwo = (EditText) findViewById(R.id.inputTwo);
        labelResult = (TextView) findViewById(R.id.txtResult);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double valueOne = Double.valueOf(inputOne.getText().toString());
                double valueTwo = Double.valueOf(inputTwo.getText().toString());

                double result = valueOne + valueTwo;

                labelResult.setText(String.valueOf(result));
            }
        });
    }
}
