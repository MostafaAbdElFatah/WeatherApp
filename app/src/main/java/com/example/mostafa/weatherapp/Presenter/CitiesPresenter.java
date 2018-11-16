package com.example.mostafa.weatherapp.Presenter;

import android.content.Context;

import com.example.mostafa.weatherapp.Model.Cities;
import com.example.mostafa.weatherapp.Model.CityInfo;
import com.example.mostafa.weatherapp.Model.Forecast;
import com.example.mostafa.weatherapp.Model.Network.APIServices;
import com.example.mostafa.weatherapp.Model.Network.NetworkState;
import com.example.mostafa.weatherapp.Utilities.ServerResponsed;
import com.example.mostafa.weatherapp.View.ICitiesView;

public class CitiesPresenter {


    private ICitiesView citiesView;
    private Context mContext;
    public CitiesPresenter(Context citiesView) {
        this.citiesView = (ICitiesView) citiesView;
        this.mContext = citiesView;
    }

    public void getCities(){
        // get 5 cities
        if (NetworkState.isOnLine(this.mContext)){
            // get data from server
            for (Cities.City city:Cities.getCities(mContext)) {
                // get city inf
                APIServices.getWeatherCityInfo(mContext, city, new ServerResponsed() {
                    @Override
                    public void onResponse(Object response) {
                        /// update recyclerView with data
                        citiesView.updateListView((CityInfo) response);
                    }

                    @Override
                    public void onErrorResponse(String error) {
                        /// show alertDialog
                        citiesView.showAlertMessage("Server Error", error);
                    }
                });
            }
        }else {
            // get data from database

        }

    }

}
