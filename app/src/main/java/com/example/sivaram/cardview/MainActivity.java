package com.example.sivaram.cardview;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calc(View view) {
        Intent j = new Intent(this,Main4Activity.class);
        startActivity(j);
    }

    public void bmi(View view) {
        Intent i = new Intent(this,Main2Activity.class);
        startActivity(i);
    }

    public void age(View view) {
        Intent n = new Intent(this,Main3Activity.class);
        startActivity(n);
    }

    public void currency(View view) {
        Intent o = new Intent(this,Main5Activity.class);
        startActivity(o);

    }

    public void exit(View view) {
        finish();
        System.exit(0);
    }

    public void feedback(View view) {
        sendMail();

    }
    private void sendMail()
    {
        Intent y = new Intent(Intent.ACTION_SENDTO,Uri.fromParts("mailto","sivaramsiva16@gmail.com",null));
        y.putExtra(Intent.EXTRA_SUBJECT,"Send your feedback about my application");
        startActivity(y.createChooser(y,"choose app to send feedback"));

    }
}
