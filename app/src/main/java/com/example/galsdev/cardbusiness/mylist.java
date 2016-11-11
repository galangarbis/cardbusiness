package com.example.galsdev.cardbusiness;

import android.os.Bundle;
import android.app.ListActivity;
import android.widget.ArrayAdapter;
/**
 * Created by galsdev on 11/11/2016.
 */

public class mylist extends ListActivity {
    String[] itemname ={
            "Indonesia",
            "Malasyia",
            "Thailand",
            "Filipina",
            "Kamboja",
            "Vietnam",
            "Singapura",
            "Laos"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setListAdapter(new ArrayAdapter<String>(
                this, R.layout.mylist,
                R.id.Itemname,itemname));

    }

}