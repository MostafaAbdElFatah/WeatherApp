package com.example.mostafa.weatherapp.Presenter;

import android.content.Context;

import com.example.mostafa.weatherapp.Model.Database.City;
import com.example.mostafa.weatherapp.Model.Database.CityForecast;
import com.example.mostafa.weatherapp.Model.Database.RoomDB.RoomManager;
import com.example.mostafa.weatherapp.Model.Network.CityInfo;
import com.example.mostafa.weatherapp.Model.Network.Forecast;
import com.example.mostafa.weatherapp.Model.Network.APIServices;
import com.example.mostafa.weatherapp.Model.Network.NetworkState;
import com.example.mostafa.weatherapp.Utilities.ServerResponsed;
import com.example.mostafa.weatherapp.View.IForecastView;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class ForecastPresenter {

    private IForecastView forecastView;
    private Context mContext;
    private RoomManager mRoomManager;

    public ForecastPresenter(Context mContext) {
        this.forecastView = (IForecastView) mContext;
        this.mContext = mContext;
        this.mRoomManager = new RoomManager(mContext);
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

                    // save forecast in dataabse
                    CityForecast cityForecast = new CityForecast();
                    cityForecast.setCityId(mForecast.getCity().getId());
                    cityForecast.setCityInfo(mForecast.getJsonForecastInfo());
                    mRoomManager.saveCityForecast(cityForecast);
                    // update the views
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
            CityForecast cityForecast = mRoomManager.getCityForecast(cityInfo.getId());
            if ( cityForecast != null ){
                ///
                Gson gson = new Gson();
                Forecast mForecast = gson.fromJson(cityForecast.getCityInfo(), Forecast.class);
                ArrayList<Forecast.ForecastList> filter = mForecast.filter();
                forecastView.updateView(filter);
            }else
                forecastView.showAlertMessage("Internet Connection!!!"
                        ,"please connect to internet to get  Weather info");
        }

    }
}
