package com.example.sivaram.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        final EditText e1 = findViewById(R.id.editText);
        final EditText e2 = findViewById(R.id.editText2);
        final EditText e3 = findViewById(R.id.editText3);
        final TextView e4 = findViewById(R.id.textView5);
        final Button b1 = findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String s1 = e1.getText().toString();
                final String s2 = e2.getText().toString();
                final String s3 = e3.getText().toString();

                if (TextUtils.isEmpty(s1)) {
                    e1.setError("Please enter your date");
                    e1.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(s2)) {
                    e2.setError("Please enter your month");
                    e2.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(s3)) {
                    e3.setError("Please enter your year");
                    e3.requestFocus();
                    return;
                }
                final int n3 = Integer.parseInt(s3);
                int a = Calendar.getInstance().get(Calendar.YEAR);
                int c = a - n3;
                e4.setText("Your age is: " + c);


            }
        });
    }
    public void back(View view) {
        super.onBackPressed();

    }
}
