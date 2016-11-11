package com.example.galsdev.cardbusiness;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by galsdev on 11/11/2016.
 */

public class list_card extends AppCompatActivity {
    ListView lv;
    Context context;

    public static int [] prgmImages={R.drawable.m_galang_arbi_s,R.drawable.people_one,R.drawable.people_two,R.drawable.people_three};
    public static String [] prgmNameList={"Galang AS","John","Jessica","Mc"};
    public static String [] prgmCompany={"Microsoft","Microsoft","IBM","Node"};

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context=this;
        lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(new (this, prgmNameList,prgmCompany,prgmImages));
    }
}