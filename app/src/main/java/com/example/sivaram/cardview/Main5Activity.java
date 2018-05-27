package com.example.sivaram.cardview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }


    void convertUsdToInr() {
        EditText aed = (EditText) findViewById(R.id.aed);
        aed.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText inr = (EditText) findViewById(R.id.inr);
        inr.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a = Double.parseDouble(aed.getText().toString());
        double result = a * 60;
        inr.setText(String.valueOf("₹"+result));

    }

    void convertInrToUsd() {
        EditText aed = (EditText) findViewById(R.id.aed);
        aed.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText inr = (EditText) findViewById(R.id.inr);
        inr.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a = Double.parseDouble(inr.getText().toString());
        double result = a / 60;
        aed.setText(String.valueOf("$"+result));
    }

    public void click(View view) {
        EditText aed = (EditText) findViewById(R.id.aed);
        final String s1 = aed.getText().toString();
        if (TextUtils.isEmpty(s1)) {
            aed.setError("Please enter value");
            aed.requestFocus();
            return;
        }
        convertUsdToInr();
        Button b2 = (Button) findViewById(R.id.submit2);
        b2.setEnabled(false);
    }

    public void reset(View view) {
        Button b1 = (Button) findViewById(R.id.submit);
        b1.setEnabled(true);
        Button b2 = (Button) findViewById(R.id.submit2);
        b2.setEnabled(true);
        EditText aed = (EditText) findViewById(R.id.aed);
        EditText inr = (EditText) findViewById(R.id.inr);
        aed.setText("");
        inr.setText("");

    }

    public void click2(View view) {
        EditText inr = (EditText) findViewById(R.id.inr);
        final String s2 = inr.getText().toString();
        if (TextUtils.isEmpty(s2)) {
            inr.setError("Please enter value");
            inr.requestFocus();
            return;
        }
        Button b1 = (Button) findViewById(R.id.submit);
        b1.setEnabled(false);
        convertInrToUsd();
    }

    public void back(View view) {
        super.onBackPressed();
    }
}


