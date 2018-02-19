package com.samadtalukdar.fenicomputerinstitute;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;


public class Faculty_dnt extends Activity {
    TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faculty_dnt);

        t1= (TextView) findViewById(R.id.textView1);
        Typeface face= Typeface.createFromAsset(getAssets(), "hotpizza.ttf");
        t1.setTypeface(face);

        t2= (TextView) findViewById(R.id.textView4);
        Typeface face2= Typeface.createFromAsset(getAssets(), "hotpizza.ttf");
        t2.setTypeface(face2);

        t3= (TextView) findViewById(R.id.textView6);
        Typeface face3= Typeface.createFromAsset(getAssets(), "hotpizza.ttf");
        t3.setTypeface(face3);
    }
}

