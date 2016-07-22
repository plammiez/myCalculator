package com.augmentis.ayp.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bt_1;
    Button bt_2;
    Button bt_3;
    Button bt_4;
    Button bt_5;
    Button bt_6;
    Button bt_7;
    Button bt_8;
    Button bt_9;
    Button bt_0;
    Button bt_ac;
    Button bt_plusDel;
    Button bt_mod;
    Button bt_half;
    Button bt_koon;
    Button bt_del;
    Button bt_plus;
    Button bt_dot;
    Button bt_eq;
    EditText textBox;

    String operand = "";
    float x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_0 = (Button) findViewById(R.id.bt_0);
        bt_1 = (Button) findViewById(R.id.bt_1);
        bt_2 = (Button) findViewById(R.id.bt_2);
        bt_3 = (Button) findViewById(R.id.bt_3);
        bt_4 = (Button) findViewById(R.id.bt_4);
        bt_5 = (Button) findViewById(R.id.bt_5);
        bt_6 = (Button) findViewById(R.id.bt_6);
        bt_7 = (Button) findViewById(R.id.bt_7);
        bt_8 = (Button) findViewById(R.id.bt_8);
        bt_9 = (Button) findViewById(R.id.bt_9);

        bt_ac = (Button) findViewById(R.id.bt_ac);
        bt_plusDel = (Button) findViewById(R.id.bt_plusDel);
        bt_mod = (Button) findViewById(R.id.bt_mod);
        bt_half = (Button) findViewById(R.id.bt_half);
        bt_koon = (Button) findViewById(R.id.bt_koon);
        bt_del = (Button) findViewById(R.id.bt_del);
        bt_plus = (Button) findViewById(R.id.bt_plus);
        bt_dot = (Button) findViewById(R.id.bt_dot);
        bt_eq = (Button) findViewById(R.id.bt_eq);

        textBox = (EditText) findViewById(R.id.textBox);

        if (operand.equals("")) {
            bt_eq.setEnabled(false);
        }

        bt_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click
                textBox.append(bt_0.getText());
            }
        });
        bt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click
                textBox.append(bt_1.getText());
            }
        });

        bt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click
                textBox.append(bt_2.getText());
            }
        });
        bt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click
                textBox.append(bt_3.getText());
            }
        });
        bt_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click
                textBox.append(bt_4.getText());
            }
        });
        bt_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click
                textBox.append(bt_5.getText());
            }
        });
        bt_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click
                textBox.append(bt_6.getText());
            }
        });
        bt_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click
                textBox.append(bt_7.getText());
            }
        });
        bt_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click
                textBox.append(bt_8.getText());
            }
        });
        bt_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click
                textBox.append(bt_9.getText());
            }
        });
        bt_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click
                textBox.append(bt_dot.getText());
            }
        });


        bt_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click
                textBox.setText("");
                bt_eq.setEnabled(false);
            }
        });
        bt_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click
                operand = "+";
                bt_eq.setEnabled(true);
                x = Float.parseFloat(textBox.getText().toString());
                textBox.setText("");
            }
        });
        bt_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click
                operand = "-";
                bt_eq.setEnabled(true);
                x = Float.parseFloat(textBox.getText().toString());
                textBox.setText("");
            }
        });
        bt_koon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click
                operand = "x";
                bt_eq.setEnabled(true);
                x = Float.parseFloat(textBox.getText().toString());
                textBox.setText("");
            }
        });
        bt_half.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click
                operand = "/";
                bt_eq.setEnabled(true);
                x = Float.parseFloat(textBox.getText().toString());
                textBox.setText("");
            }
        });
        bt_eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click

                if (operand.equals("+")) {
                    float y = Float.parseFloat(textBox.getText().toString());
                    float result = x + y;
                    textBox.setText(String.valueOf(result));
                } else if (operand.equals("-")) {
                    float y = Float.parseFloat(textBox.getText().toString());
                    float result = x - y;
                    textBox.setText(String.valueOf(result));
                } else if (operand.equals("x")) {
                    float y = Float.parseFloat(textBox.getText().toString());
                    float result = x * y;
                    textBox.setText(String.valueOf(result));
                } else if (operand.equals("/")) {
                    float y = Float.parseFloat(textBox.getText().toString());
                    float result = x / y;
                    textBox.setText(String.valueOf(result));
                } else {
                    float y = Float.parseFloat(textBox.getText().toString());
                    textBox.setText(String.valueOf(y));
                }
            }
        });
    }

}
