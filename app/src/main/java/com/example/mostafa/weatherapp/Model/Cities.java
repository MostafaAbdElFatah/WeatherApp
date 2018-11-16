package com.example.mostafa.weatherapp.Model;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Cities {


    private ArrayList<City> cities;

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    public static class City {
        /**
         * id : 358619
         * name : Port Said
         * country : EG
         * coord : {"lon":32.284119,"lat":31.25654}
         */

        private int id;
        private String name;
        private String country;
        private Coord coord;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public Coord getCoord() {
            return coord;
        }

        public void setCoord(Coord coord) {
            this.coord = coord;
        }

        public static class Coord {
            /**
             * lon : 32.284119
             * lat : 31.25654
             */

            private double lon;
            private double lat;

            public double getLon() {
                return lon;
            }

            public void setLon(double lon) {
                this.lon = lon;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }
        }
    }

    public static ArrayList<City> getCities(Context context){
        String text = "";
        try {
            InputStream is = context.getAssets().open("cities.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text = new String(buffer);
        } catch (Exception e) {
            Log.d("msg",e.toString());
        }
        Gson gson = new Gson();
        Cities mCities = gson.fromJson(text, Cities.class);
        return mCities.getCities();

    }
}
