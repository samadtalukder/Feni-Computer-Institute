package com.samadtalukdar.fenicomputerinstitute;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Contact extends Activity {
    Intent i;

    String[] names = new String[] {

            "Engr. Atiqul Islam",
            "Engr. Abdullah Al Mamun",
            "Engr. Sayed Mahbub Alam",
            "Afroja Joynob",
            "MD.Helal Uddin",
            "MD.Harun-ur-Roshid",
            "MD.Sazzad Arefin",
            "Nazmun Nahar Munni",
            "Tasnuba Begum ",
            "Mubarah Akter Nira",
            "MD.Abdus Sobhan Shamim",
            "MD.Nokibul HasaN",
            "MD.Rofiqul Islam",
            "MD.Mujahidul Islam",

            "MD.Gias Uddin",
            "MD.Hedaetul Islam",
            "MD.Shanewaz Khan",
            "Nahida Akter",
            "MD.Dulal hossain",
            "Farhana Jahan Chodhury",
            "MD.Sanowar hossain",
            "MD.Arifur Rahman",
            "MD.Mujider Rahman",
            "MD.Rajib Kumar Gosh",

            "MD.Altaf Hossain(Medical Ass.)",
            "MD.Shadul Islam(Regester)",
            "Atiqur Rahman",
            "Jafor Iqbal",
            "MD.Sorman Ali",
            "Abdul Malek",
            "MD.Aminul Islam",
            "MD.Rubel Mia (Guard)",
            "MD.Rejaul Karim (Guard)",
            "MD.Khulilor Rahman (Guard)",
            "Nuru Uddin (Guard)",
            "MD.Taifur Rahman",
            "Nitai Chondro haldar",
            "MD.Aminul Islam",
            "Sita Rani Dash",
            "MD.Shadiul Islam",
            "Shamoli Rani Dash",
            "Porimol Dash"
    };

    int[] pics = new int[]{

            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,

            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now,
            R.drawable.cal_now
    };

    String[] number = new String[]{

            "01716067885",
            "01818591793",
            "01849307471",
            "01711132353",
            "01815645223",
            "01719552993",
            "01771207440",
            "01740614292",
            "01838599437",
            "01828067490",
            "01813243436",
            "01710020761",
            "01710087845",
            "01762992719",

            "01819606121",
            "01719303001",
            "01819606121",
            "01937676576",
            "01724363463",
            "01197238174",
            "01737463844",
            "01816418552",
            "01843492677",
            "01767911281",

            "01738662958",
            "01915290221",
            "01826628897",
            "01814713208",
            "01715644511",
            "01965617002",
            "01743382677",
            "01811848619",
            "01727663920",
            "01764203538",
            "01913493227",
            "01754209451",
            "01742185713",
            "01738173977",
            "01736326161",
            "01751160035",

            "01825529436",
            "01716206507"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);

        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

        for(int i=0;i<42;i++){
            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("txt", "Name : " + names[i]);
            hm.put("num","Mobile No : " + number[i]);
            hm.put("pic", Integer.toString(pics[i]) );
            aList.add(hm);
        }

        String[] from = { "pic","txt","num" };


        int[] to = { R.id.flag,R.id.txt,R.id.cur};


        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), aList, R.layout.contact_listview_design, from, to);


        ListView listView = ( ListView ) findViewById(R.id.listview);


        listView.setAdapter(adapter);

        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {


            // TODO Auto-generated method stub



            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                // TODO Auto-generated method stub
                switch(arg2)
                {
                    case 0:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01716067885"));
                        break;

                    case 1:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01818591793"));
                        break;
                    case 2:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01849307471"));
                        break;
                    case 3:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01711132353"));
                        break;
                    case 4:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01815645223"));
                        break;
                    case 5:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01719552993"));
                        break;

                    case 6:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01771207440"));
                        break;
                    case 7:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01740614292"));
                        break;
                    case 8:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01838599437"));
                        break;
                    case 9:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01828067490"));
                        break;
                    case 10:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01813243436"));
                        break;
                    case 11:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01710020761"));
                        break;
                    case 12:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01710087845"));
                        break;
                    case 13:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01762992719"));
                        break;
                    case 14:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01819606121"));
                        break;
                    case 15:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01719303001"));
                        break;
                    case 16:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01819606121"));
                        break;
                    case 17:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01937676576"));
                        break;
                    case 18:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01724363463"));
                        break;
                    case 19:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01197238174"));
                        break;
                    case 20:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01737463844"));
                        break;
                    case 21:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01816418552"));
                        break;
                    case 22:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01843492677"));
                        break;
                    case 23:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01767911281"));
                        break;
                    case 24:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01738662958"));
                        break;
                    case 25:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01915290221"));
                        break;
                    case 26:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01826628897"));
                        break;
                    case 27:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01814713208"));
                        break;
                    case 28:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01715644511"));
                        break;
                    case 29:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01965617002"));
                        break;
                    case 30:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01743382677"));
                        break;
                    case 31:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01811848619"));
                        break;
                    case 32:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01727663920"));
                        break;
                    case 33:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01764203538"));
                        break;
                    case 34:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01913493227"));
                        break;
                    case 35:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01754209451"));
                        break;
                    case 36:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01742185713"));
                        break;
                    case 37:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01738173977"));
                        break;
                    case 38:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01736326161"));
                        break;
                    case 39:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01749708"));
                        break;
                    case 40:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01825529436"));
                        break;
                    case 41:
                        i=new Intent(Intent.ACTION_DIAL);
                        i.setData(Uri.parse("tel:01716206507"));
                        break;


                }
                startActivity(i);
            }

        };
        listView.setOnItemClickListener(itemClickListener);
    }
}

