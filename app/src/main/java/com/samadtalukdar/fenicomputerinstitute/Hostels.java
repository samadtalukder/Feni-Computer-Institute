package com.samadtalukdar.fenicomputerinstitute;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Hostels extends Activity implements View.OnClickListener {

    Button b1,b2;
    Intent i;
    String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hostel);

        b1=(Button) findViewById(R.id.boys);
        Typeface face= Typeface.createFromAsset(getAssets(), "button.ttf");
        b1.setTypeface(face);

        b2=(Button) findViewById(R.id.girls);
        Typeface face2= Typeface.createFromAsset(getAssets(), "button.ttf");
        b2.setTypeface(face2);


        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.boys){
            i=new Intent(Hostels.this,  Hostel_boys.class);
            msg="You Clicked: FCI Boys Hostel";
        }
        else if(v.getId()==R.id.girls){
            i=new Intent(Hostels.this, Hostel_girls.class);
            msg="You Clicked: FCI Girls Hostel";
        }
        Toast.makeText(Hostels.this, msg + " ", Toast.LENGTH_SHORT).show();
        startActivity(i);
    }
}

