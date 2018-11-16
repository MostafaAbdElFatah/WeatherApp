package com.example.mostafa.weatherapp.Presenter;

import android.content.Context;

import com.example.mostafa.weatherapp.Model.Cities;
import com.example.mostafa.weatherapp.Model.CityInfo;
import com.example.mostafa.weatherapp.Model.Network.APIServices;
import com.example.mostafa.weatherapp.Model.Network.NetworkState;
import com.example.mostafa.weatherapp.Utilities.ServerResponsed;
import com.example.mostafa.weatherapp.View.IView;

public class CitiesPresenter {


    private IView citiesView;
    private Context mContext;
    public CitiesPresenter(Context citiesView) {
        this.citiesView = (IView) citiesView;
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
                    public void onResponse(CityInfo response) {
                        /// update recyclerView with data
                        citiesView.updateListView(response);
                    }

                    @Override
                    public void onErrorResponse(String error) {
                        /// show
                        citiesView.showAlertMessage("Server Error", error);
                    }
                });
            }
        }else {
            // get data from database

        }

    }

    private void getCityInfo(Cities.City city){

    }
}
