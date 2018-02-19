package com.samadtalukdar.fenicomputerinstitute;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Second_activity extends Activity implements View.OnClickListener {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Intent i;
    String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        b1=(Button) findViewById(R.id.about);
        Typeface face= Typeface.createFromAsset(getAssets(), "button.ttf");
        b1.setTypeface(face);

        b2=(Button) findViewById(R.id.principal);
        Typeface face2= Typeface.createFromAsset(getAssets(), "button.ttf");
        b2.setTypeface(face2);

        b3=(Button) findViewById(R.id.faculty);
        Typeface face3= Typeface.createFromAsset(getAssets(), "button.ttf");
        b3.setTypeface(face3);

        b4=(Button) findViewById(R.id.hostel);
        Typeface face4= Typeface.createFromAsset(getAssets(), "button.ttf");
        b4.setTypeface(face4);

        b5=(Button) findViewById(R.id.activits);
        Typeface face5= Typeface.createFromAsset(getAssets(), "button.ttf");
        b5.setTypeface(face5);

        b6=(Button) findViewById(R.id.result);
        Typeface face6= Typeface.createFromAsset(getAssets(), "button.ttf");
        b6.setTypeface(face6);

        b7=(Button) findViewById(R.id.contact);
        Typeface face7= Typeface.createFromAsset(getAssets(), "button.ttf");
        b7.setTypeface(face7);

        b8=(Button) findViewById(R.id.map);
        Typeface face8= Typeface.createFromAsset(getAssets(), "button.ttf");
        b8.setTypeface(face8);
       /* b9=(Button) findViewById(R.id.developer);*/




        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        /*b9.setOnClickListener(this);*/
    }


    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.about){
            i=new Intent(Second_activity.this,  About_fci.class);
            msg="You Clicked: About FCI";
        }
        else if(v.getId()==R.id.principal){
            i=new Intent(Second_activity.this, Principal.class);
            msg="You Clicked: Principal";
        }


        else if(v.getId()==R.id.faculty){
            i=new Intent(Second_activity.this, Faculty_info.class);
            msg="You Clicked: Faculty Information";
        }

        else if(v.getId()==R.id.hostel){
            i=new Intent(Second_activity.this, Hostels.class);
            msg="You Clicked: Hostels";
        }

        else if(v.getId()==R.id.activits){
            i=new Intent(Second_activity.this, Activites.class);
            msg="You Clicked: Activities";
        }
        else if(v.getId()==R.id.result){
            i=new Intent(Second_activity.this, Result.class);
            msg="You Clicked: Result";
        }

        else if(v.getId()==R.id.contact){
            i=new Intent(Second_activity.this, Contact.class);
            msg="You Clicked: Contact";
        }

        else if(v.getId()==R.id.map){
            i=new Intent(Second_activity.this, Campus_map.class);
            msg="You Clicked: Campus Map";
        }

        /*
        else if(v.getId()==R.id.developer){
            i=new Intent(Second_activity.this, Developer.class);
            msg="You Clicked: About Developer";
        }
        */
        Toast.makeText(Second_activity.this, msg+"", Toast.LENGTH_SHORT).show();
        startActivity(i);


    }

    //Exit Dialog
    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub
        //super.onBackPressed();
        calAlert();

    }


    private void calAlert() {
        // TODO Auto-generated method stub


        AlertDialog.Builder build=new AlertDialog.Builder(Second_activity.this);
        build.setIcon(R.drawable.ic_launcher);
        build.setTitle("Exit FCI");

        build.setMessage("Are Sure You Want To Exit");
        build.setPositiveButton("YES", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub

                finish();


            }
        });


        build.setNegativeButton("NO", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub


                dialog.cancel();


            }
        });

        AlertDialog alert=build.create();
        alert.show();

    }


    //Option Menu

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.developer_info) {
            Intent i=new Intent(Second_activity.this,Developer_info.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
