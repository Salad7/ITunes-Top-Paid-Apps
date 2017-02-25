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
     static ArrayList<App> parseData(String link) throws JSONException{
         ArrayList<App> appList = new ArrayList<>();
         JSONObject root = new JSONObject(link); //Capture the outer braces which is a JSON object
         JSONObject dataJSonObject = root.getJSONObject("feed"); //Capture feed which is an object
         JSONArray apps = dataJSonObject.getJSONArray("entry"); //Capture entry which is an array

         //For each object we have
         for (int i = 0; i < apps.length(); i++) {
                App application = new App();

                //Grab each json object inside of entry
                JSONObject app = apps.getJSONObject(i);

             //Inside of each object, grab the im:name object
             JSONObject nameObj= app.getJSONObject("im:name");
             JSONObject imageObj= app.getJSONObject("im:image");
             JSONObject priceObj= app.getJSONObject("im:price");


             //Log.d("JSONObject @string rets",obj.getString("label")); //Works

             //Grab the label attribute that lives inside of im:name and store it
             application.setName(nameObj.getString("label"));
             application.setThumbnail(imageObj.getString("label"));
             application.setFavorite(false);
             application.setPrice(priceObj.getString("label"));
             appList.add(application);
             //Log.d("JSonObject Title",app.toString());
         }
         return  appList;
     }
    }
}
