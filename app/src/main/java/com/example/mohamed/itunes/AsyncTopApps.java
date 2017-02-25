package com.example.mohamed.itunes;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.ProgressBar;

import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by mohamed on 2/25/17.
 */

public class AsyncTopApps extends AsyncTask<String, Void, ArrayList<App>> {

    ProgressBar pb;
    MainActivity activity;
    @Override
    protected ArrayList<App> doInBackground(String... strings) {

        BufferedReader reader = null;

        try {
            URL url = new URL(strings[0]);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line = "";
            while ((line = reader.readLine()) != null ) {
                sb.append(line);
            }
            try {
                return AppUtils.JSonParser.parseData(sb.toString());
            }
            catch (JSONException d){

            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        return null;
    }

    AsyncTopApps(MainActivity mainActivity){
        activity = mainActivity;
        //interfaceIData = d;
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
