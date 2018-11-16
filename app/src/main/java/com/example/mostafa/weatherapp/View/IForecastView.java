package com.example.mostafa.weatherapp.View;

import com.example.mostafa.weatherapp.Model.CityInfo;
import com.example.mostafa.weatherapp.Model.Forecast;

import java.util.ArrayList;

public interface IForecastView {
    void updateView(ArrayList<Forecast.ForecastList> forecastLists);
    void showAlertMessage(String title, String message);
}
