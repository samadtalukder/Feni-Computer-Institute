package com.samadtalukdar.fenicomputerinstitute;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;


public class About_fci extends Activity {
    TextView t1,t2,t3,t4,t5,t6,t7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_fci);

        t1= (TextView) findViewById(R.id.textView1);
        Typeface face= Typeface.createFromAsset(getAssets(), "hotpizza.ttf");
        t1.setTypeface(face);

        t2= (TextView) findViewById(R.id.textView3);
        Typeface face2= Typeface.createFromAsset(getAssets(), "hotpizza.ttf");
        t2.setTypeface(face2);

        t3= (TextView) findViewById(R.id.textView5);
        Typeface face3= Typeface.createFromAsset(getAssets(), "hotpizza.ttf");
        t3.setTypeface(face3);

        t4= (TextView) findViewById(R.id.textView7);
        Typeface face4= Typeface.createFromAsset(getAssets(), "hotpizza.ttf");
        t4.setTypeface(face4);

        t5= (TextView) findViewById(R.id.textView9);
        Typeface face5= Typeface.createFromAsset(getAssets(), "hotpizza.ttf");
        t5.setTypeface(face5);

        t6= (TextView) findViewById(R.id.textView11);
        Typeface face6= Typeface.createFromAsset(getAssets(), "hotpizza.ttf");
        t6.setTypeface(face6);

        t7= (TextView) findViewById(R.id.textView13);
        Typeface face7= Typeface.createFromAsset(getAssets(), "hotpizza.ttf");
        t7.setTypeface(face7);
    }
}
