package com.example.mohamed.itunes;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AsyncTopApps.IData{
    ListView listView;
   ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list);
        //progressDialog = new ProgressDialog(this);
        new AsyncTopApps(this).execute("https://itunes.apple.com/us/rss/toppaidapplications/limit=25/json");




    }

    @Override
    public void sendData(ArrayList<App> a) {
        //Data will be sent here
        AppAdapter adapter = new AppAdapter(this,R.layout.custom_list,a);
        listView.setAdapter(adapter);

    }
}
