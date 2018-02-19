package com.samadtalukdar.fenicomputerinstitute;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Faculty_info extends Activity implements View.OnClickListener {

    Button b1,b2,b3;
    Intent i;
    String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faculty_info);

        b1=(Button) findViewById(R.id.dnt);
        Typeface face= Typeface.createFromAsset(getAssets(), "button.ttf");
        b1.setTypeface(face);

        b2=(Button) findViewById(R.id.cst);
        Typeface face2= Typeface.createFromAsset(getAssets(), "button.ttf");
        b2.setTypeface(face2);

        b3=(Button) findViewById(R.id.rs);
        Typeface face3= Typeface.createFromAsset(getAssets(), "button.ttf");
        b3.setTypeface(face3);


        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.dnt){
            i=new Intent(Faculty_info.this,  Faculty_dnt.class);
            msg="You Clicked: Department Of DNT";
        }
        else if(v.getId()==R.id.cst){
            i=new Intent(Faculty_info.this, Faculty_cst.class);
            msg="You Clicked: Department Of CST";
        }
        else if(v.getId()==R.id.rs){
            i=new Intent(Faculty_info.this, Faculty_rs.class);
            msg="You Clicked: RS";
        }

        Toast.makeText(Faculty_info.this, msg + " ", Toast.LENGTH_SHORT).show();
        startActivity(i);
    }
}

