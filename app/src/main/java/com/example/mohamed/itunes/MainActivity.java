package com.example.mohamed.itunes;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AsyncTopApps.IData{
    ListView listView;
    final ProgressDialog progressDialog = new ProgressDialog(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list);
        new AsyncTopApps(this).execute("");




    }

    @Override
    public void sendData(ArrayList<App> a) {
        //Data will be sent here
    }
}
