package com.github.gmetal.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText display;
    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonStar;
    private Button buttonDiv;
    private Button buttonEq;
    private Button buttonPlus;
    private Button buttonMinus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.button_0);
        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);
        button3 = findViewById(R.id.button_3);
        button4 = findViewById(R.id.button_4);
        button5 = findViewById(R.id.button_5);
        button6 = findViewById(R.id.button_6);
        button7 = findViewById(R.id.button_7);
        button8 = findViewById(R.id.button_8);
        button9 = findViewById(R.id.button_9);
        buttonStar = findViewById(R.id.button_star);
        buttonDiv = findViewById(R.id.button_div);
        buttonEq = findViewById(R.id.button_eq);
        buttonPlus = findViewById(R.id.button_plus);
        buttonMinus = findViewById(R.id.button_minus);
        display = findViewById(R.id.display);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonStar.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonEq.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
    }

    @Override
    public void onClick(final View v) {

        Button buttonPressed = (Button) v;
        //Toast.makeText(this, buttonPressed.getText(), Toast.LENGTH_SHORT).show();
        final String buttonPressedText = buttonPressed.getText().toString();
        final String displayText = display.getText().toString();

        if ((buttonPressedText.length() == 1) && Character.isDigit(buttonPressedText.charAt(0))) {
            // Numeric button pressed
            if (displayText.length() < 8) {
                if (displayText.length() == 1) {
                    if (buttonPressedText.equals("0") && displayText.equals("0")) {
                        // Empty - ignore
                    } else if (displayText.equals("0")) {
                        display.setText(buttonPressedText);
                    } else {
                        display.getText().append(buttonPressedText);
                    }
                } else {
                    display.getText().append(buttonPressedText);
                }
            }
        } else {
            display.setText("0");
        }
    }
}
