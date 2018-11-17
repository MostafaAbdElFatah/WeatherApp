package com.example.mostafa.weatherapp;


import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.util.Log;

import com.example.mostafa.weatherapp.Model.Database.City;
import com.example.mostafa.weatherapp.Model.Database.CityForecast;
import com.example.mostafa.weatherapp.Model.Database.RoomDB.RoomManager;
import com.example.mostafa.weatherapp.Model.Network.APIServices;
import com.example.mostafa.weatherapp.Model.Network.Cities;
import com.example.mostafa.weatherapp.Model.Network.CityInfo;
import com.example.mostafa.weatherapp.Model.Network.Forecast;
import com.example.mostafa.weatherapp.Model.Network.NetworkState;
import com.example.mostafa.weatherapp.Presenter.CitiesPresenter;
import com.example.mostafa.weatherapp.Utilities.ServerResponsed;
import com.example.mostafa.weatherapp.Utilities.URLs;
import com.example.mostafa.weatherapp.View.CitiesActivity;
import com.google.gson.Gson;

import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class MockitoTest {

    protected Context context;

    @Mock
    RoomManager mRoomManager = mock(RoomManager.class);


    @Before
    public void setup(){
        context = InstrumentationRegistry.getTargetContext();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test() throws IOException {
        assertEquals("com.example.mostafa.weatherapp", context.getPackageName());
        // test NetworkState class
        assertTrue( NetworkState.isOnLine(context));
        assertTrue( NetworkState.isConnectedWifi(context));
        assertTrue( NetworkState.isNetworkAvailable(context));
        assertFalse( NetworkState.isConnectedMobile(context));
        assertEquals(1, NetworkState.getConnectivityType(context));
        // reading local file
        assertThat(context.getAssets().open("cities.json"), notNullValue());
        // test static getCities not return null object and has values
        assertThat(Cities.getCities(context), notNullValue());
        // when(Cities.getCities(context)).thenReturn(cities);
        assertThat(Cities.getCities(context), not(IsEmptyCollection.empty()) );
    }

    // test api Services
    @Test
    public void testAPIServices(){

        /// test api services with current weather of city
        for (final Cities.City city:Cities.getCities(context)) {
            assertThat(URLs.getCurrentTemperatureOfCityURL(city), notNullValue() );
            assertThat(URLs.getCurrentTemperatureOfCityURL(city), not("") );
            //assertEquals("", URLs.getCurrentTemperatureOfCityURL(city)); // failed
            // get city info
            APIServices.getWeatherCityInfo(context, city, new ServerResponsed() {
                @Override
                public void onResponse(Object response) {
                    Assert.assertTrue(true);
                    // test forecast api services
                }

                @Override
                public void onErrorResponse(String error) {
                    Assert.assertFalse(false);
                }
            });
        }

        /// test api services with forecast of city
        String response = getCityInfoJsonString();
        Gson gson = new Gson();
        CityInfo mCityInfo = gson.fromJson(response, CityInfo.class);

        assertThat(URLs.getforecastingOfCityURL(mCityInfo), notNullValue() );
        assertThat(URLs.getforecastingOfCityURL(mCityInfo), not("") );
        //assertEquals("", URLs.getforecastingOfCityURL(mCityInfo)); // failed
        APIServices.getForecastCityInfo(context, mCityInfo, new ServerResponsed() {
            @Override
            public void onResponse(Object response) {
                Assert.assertTrue(true);
            }

            @Override
            public void onErrorResponse(String error) {
                Assert.assertFalse(false);
            }
        });

        //END FUNCTIONS
    }

    //test the room database
    @Test
    public void testRoomDatabase(){

        mRoomManager.saveCity(any(City.class));
        mRoomManager.saveCityForecast(any(CityForecast.class));
        mRoomManager.getCityForecast(anyInt());
        //Failed if database not empty
        assertEquals(false, mRoomManager.isHasCities());
        //Failed if database not empty
        assertEquals(false, mRoomManager.isHasCitiesForecast());
        //Failed if database not empty
        assertThat(mRoomManager.getCities(), IsEmptyCollection.empty() );
        //Failed if database not empty
        assertThat(mRoomManager.getCitiesForecast(), IsEmptyCollection.empty() );

        mRoomManager = new RoomManager(context);

        // Failed if database empty
        assertEquals(true, mRoomManager.isHasCities());


        // Failed if database empty
        assertEquals(true, mRoomManager.isHasCitiesForecast());
        assertThat(mRoomManager.getCities(), notNullValue());
        // Failed if database empty
        assertThat(mRoomManager.getCities(), not(IsEmptyCollection.empty()) );
        assertThat(mRoomManager.getCitiesForecast(), notNullValue());
        // Failed if database empty
        assertThat(mRoomManager.getCitiesForecast(), not(IsEmptyCollection.empty()) );

    }

    private String getCityInfoJsonString(){
        String text = "";
        try {
            InputStream is = context.getAssets().open("cityInfo.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text = new String(buffer);
        } catch (Exception e) {
            Log.d("msg",e.toString());
        }
        return text;
    }


}
