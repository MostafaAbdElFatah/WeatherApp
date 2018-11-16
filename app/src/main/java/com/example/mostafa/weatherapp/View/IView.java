package com.example.mostafa.weatherapp.View;

import com.example.mostafa.weatherapp.Model.CityInfo;


public interface IView {
    void updateListView(CityInfo cityInfo);
    void showAlertMessage(String title, String message);
}
