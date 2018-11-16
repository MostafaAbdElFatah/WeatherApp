package com.example.mostafa.weatherapp.Model.Network;


import android.content.Context;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.example.mostafa.weatherapp.Model.Cities;
import com.example.mostafa.weatherapp.Model.CityInfo;
import com.example.mostafa.weatherapp.Utilities.ServerResponsed;
import com.example.mostafa.weatherapp.Utilities.URLs;
import com.google.gson.Gson;

public class APIServices {

    public static void getWeatherCityInfo(Context context, Cities.City city, final ServerResponsed mServerResponsed){

        String stringURL = URLs.getCurrentTemperatureOfCityURL(city);
        StringRequest mStringRequest = new StringRequest(Request.Method.GET, stringURL
                , new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                CityInfo mCityInfo = gson.fromJson(response, CityInfo.class);
                mServerResponsed.onResponse(mCityInfo);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                mServerResponsed.onErrorResponse(error.getMessage());
                error.printStackTrace();
            }
        });
        VolleyManager.getsInstance(context.getApplicationContext()).addToRequestQueue(mStringRequest);
    }



}
