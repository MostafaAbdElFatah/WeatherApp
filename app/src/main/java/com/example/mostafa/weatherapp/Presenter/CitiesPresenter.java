package com.example.mostafa.weatherapp.Presenter;

import android.content.Context;

import com.example.mostafa.weatherapp.Model.Database.City;
import com.example.mostafa.weatherapp.Model.Database.RoomDB.RoomManager;
import com.example.mostafa.weatherapp.Model.Network.Cities;
import com.example.mostafa.weatherapp.Model.Network.CityInfo;
import com.example.mostafa.weatherapp.Model.Network.APIServices;
import com.example.mostafa.weatherapp.Model.Network.NetworkState;
import com.example.mostafa.weatherapp.Utilities.ServerResponsed;
import com.example.mostafa.weatherapp.View.ICitiesView;
import com.google.gson.Gson;

import java.util.List;

public class CitiesPresenter {


    private ICitiesView citiesView;
    private Context mContext;
    private RoomManager mRoomManager;
    public CitiesPresenter(Context citiesView) {
        this.citiesView = (ICitiesView) citiesView;
        this.mContext = citiesView;
        this.mRoomManager = new RoomManager(citiesView);
    }

    public void getCities(){
        // get 5 cities
        if (NetworkState.isOnLine(this.mContext)){
            // get data from server
            for (final Cities.City city:Cities.getCities(mContext)) {
                // get city inf
                APIServices.getWeatherCityInfo(mContext, city, new ServerResponsed() {
                    @Override
                    public void onResponse(Object response) {
                        CityInfo mCityInfo = (CityInfo) response;
                        // save jsonString city info in database
                        String jsonString = mCityInfo.getJsonStringCityInfo();
                        City dbCity = new City();
                        dbCity.setCityId(mCityInfo.getId());
                        dbCity.setCityInfo(jsonString);
                        mRoomManager.saveCity(dbCity);
                        /// update recyclerView with data
                        citiesView.updateListView(mCityInfo);
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
            if (mRoomManager.isHasCities()){

                List<City> cityList = mRoomManager.getCities();
                for (City item: cityList) {
                    Gson gson = new Gson();
                    CityInfo mCityInfo = gson.fromJson(item.getCityInfo(), CityInfo.class);
                    citiesView.updateListView(mCityInfo);
                }

            }else
                citiesView.showAlertMessage("Internet Connection!!!"
                        ,"please connect to internet to get  Weather info");
        }

    }

}
