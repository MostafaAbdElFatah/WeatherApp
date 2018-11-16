package com.example.mostafa.weatherapp.Utilities;

import com.example.mostafa.weatherapp.Model.CityInfo;

public interface ServerResponsed {
    void onResponse(CityInfo response);
    void onErrorResponse(String error);
}
