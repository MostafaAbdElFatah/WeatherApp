package com.example.mostafa.weatherapp.View;

import com.example.mostafa.weatherapp.Model.Network.CityInfo;


public interface ICitiesView {
    void updateListView(CityInfo cityInfo);
    void showAlertMessage(String title, String message);
}
