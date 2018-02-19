package com.samadtalukdar.fenicomputerinstitute;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread create=new Thread()
        {
            @Override
            public void run()
            {
                try {
                    sleep(2000);
                }
                catch (Exception e){}
                finally {
                    Intent i=new Intent(MainActivity.this,Second_activity.class);
                    startActivity(i);
                    finish();

                }

            }
        };

        create.start();
    }


}
