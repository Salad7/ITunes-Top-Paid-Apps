package com.example.mohamed.itunes;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.ProgressBar;

import java.util.ArrayList;

/**
 * Created by mohamed on 2/25/17.
 */

public class AsyncTopApps extends AsyncTask<String, Void, ArrayList<App>> {

    ProgressBar pb;
    IData interfaceIData;
    MainActivity activity;
    @Override
    protected ArrayList<App> doInBackground(String... strings) {
        return null;
    }

    AsyncTopApps(MainActivity mainActivity, IData d){
        activity = mainActivity;
        interfaceIData = d;
    }

    @Override
    protected void onPreExecute() {
        pb = (ProgressBar) activity.findViewById(R.id.progressBar);
        super.onPreExecute();

    }

    @Override
    protected void onPostExecute(ArrayList<App> apps) {
        super.onPostExecute(apps);
    }

    @Override
    protected void onProgressUpdate(Void... values) {

        super.onProgressUpdate(values);
    }


   public static interface IData{
       void sendData(ArrayList<App> a);
    }
}
