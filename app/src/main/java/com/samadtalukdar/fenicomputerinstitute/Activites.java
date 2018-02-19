package com.samadtalukdar.fenicomputerinstitute;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activites extends Activity implements View.OnClickListener {

    Button b1,b2,b3,b4,b5;
    Intent i;
    String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activites);

        b1=(Button) findViewById(R.id.library);
        Typeface face= Typeface.createFromAsset(getAssets(), "button.ttf");
        b1.setTypeface(face);

        b2=(Button) findViewById(R.id.blood);
        Typeface face2= Typeface.createFromAsset(getAssets(), "button.ttf");
        b2.setTypeface(face2);

        b3=(Button) findViewById(R.id.scout);
        Typeface face3= Typeface.createFromAsset(getAssets(), "button.ttf");
        b3.setTypeface(face3);

        b4=(Button) findViewById(R.id.club);
        Typeface face4= Typeface.createFromAsset(getAssets(), "button.ttf");
        b4.setTypeface(face4);

        b5=(Button) findViewById(R.id.isc);
        Typeface face5= Typeface.createFromAsset(getAssets(), "button.ttf");
        b5.setTypeface(face5);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.library){
            i=new Intent(Activites.this,  Activites_librery.class);
            msg="You Clicked: Library";
        }
        else if(v.getId()==R.id.blood){
            i=new Intent(Activites.this, Activites_blood.class);
            msg="You Clicked: FCI Blood Donation";
        }
        else if(v.getId()==R.id.scout){
            i=new Intent(Activites.this, Activties_scout.class);
            msg="You Clicked: Rover Scout";
        }
        else if(v.getId()==R.id.club){
            i=new Intent(Activites.this, Activites_club.class);
            msg="You Clicked: Clubs";
        }
        else if(v.getId()==R.id.isc){
            i=new Intent(Activites.this, Activites_isc.class);
            msg="You Clicked: ISC";
        }

        Toast.makeText(Activites.this, msg + " ", Toast.LENGTH_SHORT).show();
        startActivity(i);
    }
}

