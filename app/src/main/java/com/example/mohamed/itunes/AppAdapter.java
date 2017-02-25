package com.example.mohamed.itunes;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by mohamed on 2/25/17.
 */

public class AppAdapter extends ArrayAdapter<App> {
    Context ctx;
    int resource;
    List<App> objects;
    public AppAdapter(Context context, int resource, List<App> objects) {
        super(context, resource, objects);
        ctx = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(resource,parent,false);

return null;
        //return super.getView(position, convertView, parent);
    }
}
