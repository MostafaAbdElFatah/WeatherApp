package com.example.mostafa.weatherapp.Model.Database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import java.util.List;

@Dao
public interface CityDao {

    @Insert
    void saveCity(City city);

    @Insert
    void saveCities(List<City> cityList);

    @Query("SELECT * FROM City WHERE cityId = :id")
    City getCity(int id);

    @Query ("SELECT * FROM City")
    List<City> getCities();

    @Update
    void updateCity(City city);

    @Delete
    void deleteCity(City city);

    @Query("DELETE FROM City")
    void deleteAllCities();

    // for city forecast days

    @Insert
    void saveCityForecast(CityForecast cityForecast);

    @Insert
    void saveCityForecast(List<CityForecast> cityForecastList);

    @Query ("SELECT * FROM CityForecast")
    List<CityForecast> getCitiesForecasts();


    @Query("SELECT * FROM CityForecast WHERE cityId = :id")
    CityForecast getCityForecast(int id);

    @Update
    void updateCityForecast(CityForecast cityForecast);

    @Delete
    void deleteCityForecast(CityForecast cityForecast);

    @Query("DELETE FROM CityForecast")
    void deleteAllCitiesForecast();

}
