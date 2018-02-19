package com.samadtalukdar.fenicomputerinstitute;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Principal extends Activity {
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pricipal);

        t1= (TextView) findViewById(R.id.textView2);
        Typeface face= Typeface.createFromAsset(getAssets(), "hotpizza.ttf");
        t1.setTypeface(face);

        t2= (TextView) findViewById(R.id.textView4);
        Typeface face2= Typeface.createFromAsset(getAssets(), "hotpizza.ttf");
        t2.setTypeface(face2);
    }

    public void call(View v)
    {
        Intent i=null;

        switch(v.getId())
        {
            case R.id.intr:

                i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.fcibd.net"));
                startActivity(i);
                break;



            case R.id.phn:

                i=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0088-0331-61888"));
                startActivity(i);
                break;

            case R.id.mail2:
                i=new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:fci_bd@yahoo.com"));
                startActivity(i);
                break;
        }


    }
}
