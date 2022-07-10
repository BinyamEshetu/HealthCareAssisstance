package com.example.healthcare;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HealthNewsActivity extends AppCompatActivity {

    TextView one, two, three, four, five, six, seven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthnews);

        one = (TextView)findViewById(R.id.none);
        one.setMovementMethod(LinkMovementMethod.getInstance());

        two = (TextView)findViewById(R.id.ntwo);
        two.setMovementMethod(LinkMovementMethod.getInstance());

        three = (TextView)findViewById(R.id.nthree);
        three.setMovementMethod(LinkMovementMethod.getInstance());

        four = (TextView)findViewById(R.id.nfour);
        four.setMovementMethod(LinkMovementMethod.getInstance());

        five = (TextView)findViewById(R.id.nfive);
        five.setMovementMethod(LinkMovementMethod.getInstance());

        six = (TextView)findViewById(R.id.nsix);
        six.setMovementMethod(LinkMovementMethod.getInstance());

        seven = (TextView)findViewById(R.id.nseven);
        seven.setMovementMethod(LinkMovementMethod.getInstance());


    }
}
