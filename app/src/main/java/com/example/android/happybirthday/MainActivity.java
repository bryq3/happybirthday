package com.example.android.happybirthday;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "csnpwdt NFI.ttf");
        TextView myTextView = (TextView) findViewById(R.id.boo);
        myTextView.setTypeface(myTypeFace);
        TextView myTextView2 = (TextView) findViewById(R.id.happy);
        myTextView2.setTypeface(myTypeFace);
        TextView myTextView3 = (TextView) findViewById(R.id.andy);
        myTextView3.setTypeface(myTypeFace);
    }
}
