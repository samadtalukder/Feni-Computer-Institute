package com.samadtalukdar.fenicomputerinstitute;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class Developer_info extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.developer_info);

    }
    public void call(View v)
    {
        Intent i=null;

        switch(v.getId())
        {


            case R.id.fb:


                i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/Samurai.X.008"));
                startActivity(i);
                break;

            case R.id.phone:

                i=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01967612240"));
                startActivity(i);
                break;

            case R.id.mail:


                i=new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:samadtalukdar6@gmail.com"));
                startActivity(i);
                break;
        }


    }
}
