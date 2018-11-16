package com.example.mostafa.weatherapp.Utilities;

import com.example.mostafa.weatherapp.Model.Cities;

public class URLs {

    // "https://api.openweathermap.org/data/2.5/weather?q=Cairo,EG&appid=cbcb746e72e2798cee539c711858e447"
    // "https://api.openweathermap.org/data/2.5/forecast?q=Cairo,EG&appid=cbcb746e72e2798cee539c711858e447"
    static String mainURL  = "https://api.openweathermap.org/data/2.5/";
    static String weatherURL     = "weather?q=";
    static String forecastingURL = "forecast?q=";
    static String apiKey = "&appid=cbcb746e72e2798cee539c711858e447";

    public static String getCurrentTemperatureOfCityURL(Cities.City city){
        String stringUrl= URLs.mainURL + URLs.weatherURL
                + city.getName() + "," +city.getCountry() + URLs.apiKey;
        return stringUrl;
    }

    public static String getforecastingOfCityURL(Cities.City city){
        String stringUrl= URLs.mainURL + URLs.forecastingURL
                + "q="+city.getName() + "," +city.getCountry() + URLs.apiKey;
        return stringUrl;
    }
}
