package com.example.mostafa.weatherapp.Model.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.content.Context;

import java.util.List;

@Database(entities = {City.class, CityForecast.class}, version = 1, exportSchema = false)
public abstract class RoomDB extends android.arch.persistence.room.RoomDatabase {

    abstract CityDao mCityDao();

    private static RoomDB mRoomManager;

    private static RoomDB getDatabase(final Context context) {
        if (mRoomManager == null) {
            synchronized (RoomDB.class) {
                if (mRoomManager == null) {
                    mRoomManager = Room.databaseBuilder(context,
                            RoomDB.class, "weather_database")
                            .allowMainThreadQueries()
                            .build();
                }
            }
        }
        return mRoomManager;
    }
    ///

    public static class RoomManager {
        private Context context;

        public RoomManager(Context context) {
            this.context = context;
            mRoomManager = getDatabase(context);
        }

        public void saveCity(City newCity) {
            City city = mRoomManager.mCityDao().getCity(newCity.getCityId());
            if (city == null)
                mRoomManager.mCityDao().saveCity(newCity);
            else
                mRoomManager.mCityDao().updateCity(newCity);
        }

        public void saveCities(List<City> cityList) {
            mRoomManager.mCityDao().saveCities(cityList);
        }

        public City getCity(int id) {
            return mRoomManager.mCityDao().getCity(id);
        }

        public List<City> getCities() {
            return mRoomManager.mCityDao().getCities();
        }

        public boolean isHasCities() {
            List<City> cityList = mRoomManager.mCityDao().getCities();
            if (cityList == null)
                return false;
            else if (cityList.size() <= 0)
                return false;
            else
                return true;
        }

        public void updateCity(City city) {
            mRoomManager.mCityDao().updateCity(city);
        }

        public void deleteCity(City city) {
            mRoomManager.mCityDao().deleteCity(city);
        }

        public void deleteAllCities() {
            mRoomManager.mCityDao().deleteAllCities();
        }


        public void saveCityForecast(CityForecast newCityForecast) {
            CityForecast cityForecast = mRoomManager.mCityDao().getCityForecast(newCityForecast.getCityId());
            if (cityForecast == null)
                mRoomManager.mCityDao().saveCityForecast(newCityForecast);
            else
                mRoomManager.mCityDao().updateCityForecast(newCityForecast);

        }

        public void saveCitiesForecast(List<CityForecast> cityList) {
            mRoomManager.mCityDao().saveCityForecast(cityList);
        }

        public CityForecast getCityForecast(int id) {
            return mRoomManager.mCityDao().getCityForecast(id);
        }

        public List<CityForecast> getCitiesForecast() {
            return mRoomManager.mCityDao().getCitiesForecasts();
        }

        public boolean isHasCitiesForecast() {
            List<CityForecast> citiesForecasts = mRoomManager.mCityDao().getCitiesForecasts();
            if (citiesForecasts == null)
                return false;
            else if (citiesForecasts.size() <= 0)
                return false;
            else
                return true;
        }

        public void updateCityForecast(CityForecast city) {
            mRoomManager.mCityDao().updateCityForecast(city);
        }

        public void deleteCityForecast(CityForecast city) {
            mRoomManager.mCityDao().deleteCityForecast(city);
        }

        public void deleteAllCitisForecast() {
            mRoomManager.mCityDao().deleteAllCitiesForecast();
        }
    }
}