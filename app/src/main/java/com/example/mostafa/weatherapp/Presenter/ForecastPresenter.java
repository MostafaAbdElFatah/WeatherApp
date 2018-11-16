package com.example.mostafa.weatherapp.Presenter;

import android.content.Context;

import com.example.mostafa.weatherapp.Model.Cities;
import com.example.mostafa.weatherapp.Model.CityInfo;
import com.example.mostafa.weatherapp.Model.Forecast;
import com.example.mostafa.weatherapp.Model.Network.APIServices;
import com.example.mostafa.weatherapp.Model.Network.NetworkState;
import com.example.mostafa.weatherapp.Utilities.ServerResponsed;
import com.example.mostafa.weatherapp.View.ICitiesView;
import com.example.mostafa.weatherapp.View.IForecastView;

import java.util.ArrayList;

public class ForecastPresenter {

    private IForecastView forecastView;
    private Context mContext;

    public ForecastPresenter(Context mContext) {
        this.forecastView = (IForecastView) mContext;
        this.mContext = mContext;
    }

    public void getForecastDays(final CityInfo cityInfo){
        // get 5 days of city weather
        if (NetworkState.isOnLine(this.mContext)){
            // get data from server
            APIServices.getForecastCityInfo(mContext, cityInfo, new ServerResponsed() {
                @Override
                public void onResponse(Object response) {
                    Forecast mForecast = (Forecast) response;
                    ArrayList<Forecast.ForecastList> filter = mForecast.filter();
                    forecastView.updateView(filter);
                }

                @Override
                public void onErrorResponse(String error) {
                    /// show alertDialog
                    forecastView.showAlertMessage("Server Error", error);
                }
            });
        }else {
            // get data from database

        }

    }
}
