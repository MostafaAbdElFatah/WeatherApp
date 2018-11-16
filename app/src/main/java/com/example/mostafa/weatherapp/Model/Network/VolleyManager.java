package com.example.mostafa.weatherapp.Model.Network;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VolleyManager {

    private static VolleyManager mVolleyManager;
    private RequestQueue requestQueue;
    private static Context context;

    private VolleyManager(Context context1){
        context = context1;
        requestQueue = getRequestQueue();
    }

    public RequestQueue getRequestQueue(){
        if (requestQueue == null){
            requestQueue = Volley.newRequestQueue(context.getApplicationContext());
        }
        return  requestQueue;
    }
    public static synchronized VolleyManager getsInstance(Context context1){
        if (mVolleyManager == null){
            mVolleyManager = new VolleyManager(context1);
        }
        return mVolleyManager;
    }
    public<T> void addToRequestQueue(Request<T> request){
        requestQueue.add(request);
    }

}
