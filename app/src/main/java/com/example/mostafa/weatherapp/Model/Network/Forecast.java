package com.example.mostafa.weatherapp.Model.Network;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Forecast {

    private String cod;
    private double message;
    private int cnt;
    private City city;
    private List<ForecastList> list;
    private String jsonForecastInfo;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<ForecastList> getForecastList() {
        return list;
    }

    public void setForecastList(List<ForecastList> forecastList) {
        this.list = forecastList;
    }
    public String getJsonForecastInfo() {
        return jsonForecastInfo;
    }

    public void setJsonForecastInfo(String jsonForecastInfo) {
        this.jsonForecastInfo = jsonForecastInfo;
    }

    public static class City {
        /**
         * id : 360630
         * name : Cairo
         * coord : {"lat":30.0488,"lon":31.2437}
         * country : EG
         * population : 7734614
         */

        private int id;
        private String name;
        private Coord coord;
        private String country;
        private int population;

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

        public Coord getCoord() {
            return coord;
        }

        public void setCoord(Coord coord) {
            this.coord = coord;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public static class Coord {
            /**
             * lat : 30.0488
             * lon : 31.2437
             */

            private double lat;
            private double lon;

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLon() {
                return lon;
            }

            public void setLon(double lon) {
                this.lon = lon;
            }
        }
    }

    public static class ForecastList {
        /**
         * dt : 1542391200
         * main : {"temp":289.46,"temp_min":288.758,"temp_max":289.46,"pressure":1020.21,"sea_level":1033.88,"grnd_level":1020.21,"humidity":74,"temp_kf":0.7}
         * weather : [{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}]
         * clouds : {"all":24}
         * wind : {"speed":2.11,"deg":0.00476074}
         * sys : {"pod":"n"}
         * dt_txt : 2018-11-16 18:00:00
         */

        private int dt;
        private Main main;
        private Clouds clouds;
        private Wind wind;
        private Sys sys;
        private String dt_txt;
        private List<Weather> weather;

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public Main getMain() {
            return main;
        }

        public void setMain(Main main) {
            this.main = main;
        }

        public Clouds getClouds() {
            return clouds;
        }

        public void setClouds(Clouds clouds) {
            this.clouds = clouds;
        }

        public Wind getWind() {
            return wind;
        }

        public void setWind(Wind wind) {
            this.wind = wind;
        }

        public Sys getSys() {
            return sys;
        }

        public void setSys(Sys sys) {
            this.sys = sys;
        }

        public String getDt_txt() {
            return dt_txt;
        }

        public void setDt_txt(String dt_txt) {
            this.dt_txt = dt_txt;
        }

        public List<Weather> getWeather() {
            return weather;
        }

        public void setWeather(List<Weather> weather) {
            this.weather = weather;
        }

        public static class Main {
            /**
             * temp : 289.46
             * temp_min : 288.758
             * temp_max : 289.46
             * pressure : 1020.21
             * sea_level : 1033.88
             * grnd_level : 1020.21
             * humidity : 74
             * temp_kf : 0.7
             */

            private double temp;
            private double temp_min;
            private double temp_max;
            private double pressure;
            private double sea_level;
            private double grnd_level;
            private int humidity;
            private double temp_kf;

            public double getTemp() {
                return temp;
            }

            public void setTemp(double temp) {
                this.temp = temp;
            }

            public double getTemp_min() {
                return temp_min;
            }

            public void setTemp_min(double temp_min) {
                this.temp_min = temp_min;
            }

            public double getTemp_max() {
                return temp_max;
            }

            public void setTemp_max(double temp_max) {
                this.temp_max = temp_max;
            }

            public double getPressure() {
                return pressure;
            }

            public void setPressure(double pressure) {
                this.pressure = pressure;
            }

            public double getSea_level() {
                return sea_level;
            }

            public void setSea_level(double sea_level) {
                this.sea_level = sea_level;
            }

            public double getGrnd_level() {
                return grnd_level;
            }

            public void setGrnd_level(double grnd_level) {
                this.grnd_level = grnd_level;
            }

            public int getHumidity() {
                return humidity;
            }

            public void setHumidity(int humidity) {
                this.humidity = humidity;
            }

            public double getTemp_kf() {
                return temp_kf;
            }

            public void setTemp_kf(double temp_kf) {
                this.temp_kf = temp_kf;
            }
        }

        public static class Clouds {
            /**
             * all : 24
             */

            private int all;

            public int getAll() {
                return all;
            }

            public void setAll(int all) {
                this.all = all;
            }
        }

        public static class Wind {
            /**
             * speed : 2.11
             * deg : 0.00476074
             */

            private double speed;
            private double deg;

            public double getSpeed() {
                return speed;
            }

            public void setSpeed(double speed) {
                this.speed = speed;
            }

            public double getDeg() {
                return deg;
            }

            public void setDeg(double deg) {
                this.deg = deg;
            }
        }

        public static class Sys {
            /**
             * pod : n
             */

            private String pod;

            public String getPod() {
                return pod;
            }

            public void setPod(String pod) {
                this.pod = pod;
            }
        }

        public static class Weather {
            /**
             * id : 801
             * main : Clouds
             * description : few clouds
             * icon : 02n
             */

            private int id;
            private String main;
            private String description;
            private String icon;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMain() {
                return main;
            }

            public void setMain(String main) {
                this.main = main;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }
    }

    // filter the list to get one day from three day that take in different hours
    public  ArrayList<ForecastList> filter(){
        Date mDate = null;
        ArrayList<ForecastList> forecastList = new ArrayList<>();
        for (ForecastList item:list){
            try {
                mDate = new SimpleDateFormat("yyyy-MM-dd").parse(item.dt_txt);
                Calendar mCalendar = Calendar.getInstance();
                mCalendar.setTime(mDate);
                int day = mCalendar.get(Calendar.DAY_OF_MONTH);
                if (!isFound(forecastList, day))
                    forecastList.add(item);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return forecastList;
    }

    // if the day found in list return true else false
    private boolean isFound(ArrayList<ForecastList> days, int day){
        Date mDate = null;
        for (ForecastList item:days){
            try {
                mDate = new SimpleDateFormat("yyyy-MM-dd").parse(item.dt_txt);
                Calendar mCalendar = Calendar.getInstance();
                mCalendar.setTime(mDate);
                int dayOfItem = mCalendar.get(Calendar.DAY_OF_MONTH);
                if (day == dayOfItem)
                    return true;
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
