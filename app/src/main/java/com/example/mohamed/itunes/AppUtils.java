package com.example.mohamed.itunes;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by mohamed on 2/25/17.
 */

public class AppUtils {

    public static class JSonParser {
     public static ArrayList<App> parseData(String link) throws JSONException{
         ArrayList<App> appList = null;
         JSONObject root = new JSONObject(link); //Capture the outer braces
         JSONArray apps = root.getJSONArray("entry");

         for (int i = 0; i < apps.length(); i++) {
                App application = new App();
                JSONObject app = apps.getJSONObject(i);
             Log.d("JSonObject Title",app.toString());
         }

         return  appList;
     }
    }
}
