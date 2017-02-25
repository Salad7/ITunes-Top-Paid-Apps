package com.example.mohamed.itunes;

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
     public ArrayList<App> parseData(String link) throws JSONException{
         ArrayList<App> appList = null;
         JSONObject root = new JSONObject(link); //Capture the outer braces
         JSONArray apps = root.getJSONArray("entry");


         return  appList;
     }
    }
}
