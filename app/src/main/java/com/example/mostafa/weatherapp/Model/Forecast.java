package com.example.mostafa.weatherapp.Model;

import java.util.List;

public class Forecast {

    /**
     * cod : 200
     * message : 0.0023
     * cnt : 40
     * list : [{"dt":1542391200,"main":{"temp":289.46,"temp_min":288.758,"temp_max":289.46,"pressure":1020.21,"sea_level":1033.88,"grnd_level":1020.21,"humidity":74,"temp_kf":0.7},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"clouds":{"all":24},"wind":{"speed":2.11,"deg":0.00476074},"sys":{"pod":"n"},"dt_txt":"2018-11-16 18:00:00"},{"dt":1542402000,"main":{"temp":285.35,"temp_min":284.819,"temp_max":285.35,"pressure":1020.72,"sea_level":1034.46,"grnd_level":1020.72,"humidity":85,"temp_kf":0.53},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":1.67,"deg":12.5019},"sys":{"pod":"n"},"dt_txt":"2018-11-16 21:00:00"},{"dt":1542412800,"main":{"temp":282.75,"temp_min":282.404,"temp_max":282.75,"pressure":1020.48,"sea_level":1034.27,"grnd_level":1020.48,"humidity":85,"temp_kf":0.35},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":1.42,"deg":54.0002},"sys":{"pod":"n"},"dt_txt":"2018-11-17 00:00:00"},{"dt":1542423600,"main":{"temp":281.1,"temp_min":280.926,"temp_max":281.1,"pressure":1020.75,"sea_level":1034.69,"grnd_level":1020.75,"humidity":83,"temp_kf":0.18},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":1.28,"deg":70.0121},"sys":{"pod":"n"},"dt_txt":"2018-11-17 03:00:00"},{"dt":1542434400,"main":{"temp":286.242,"temp_min":286.242,"temp_max":286.242,"pressure":1021.17,"sea_level":1035.01,"grnd_level":1021.17,"humidity":82,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":1.21,"deg":83.0003},"sys":{"pod":"d"},"dt_txt":"2018-11-17 06:00:00"},{"dt":1542445200,"main":{"temp":296.264,"temp_min":296.264,"temp_max":296.264,"pressure":1020.94,"sea_level":1034.62,"grnd_level":1020.94,"humidity":48,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":1.87,"deg":90.5},"sys":{"pod":"d"},"dt_txt":"2018-11-17 09:00:00"},{"dt":1542456000,"main":{"temp":297.653,"temp_min":297.653,"temp_max":297.653,"pressure":1019.09,"sea_level":1032.72,"grnd_level":1019.09,"humidity":37,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02d"}],"clouds":{"all":12},"wind":{"speed":1.86,"deg":37.0027},"sys":{"pod":"d"},"dt_txt":"2018-11-17 12:00:00"},{"dt":1542466800,"main":{"temp":294.114,"temp_min":294.114,"temp_max":294.114,"pressure":1018.82,"sea_level":1032.45,"grnd_level":1018.82,"humidity":42,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"clouds":{"all":12},"wind":{"speed":1.97,"deg":22.5026},"sys":{"pod":"n"},"dt_txt":"2018-11-17 15:00:00"},{"dt":1542477600,"main":{"temp":287.253,"temp_min":287.253,"temp_max":287.253,"pressure":1019.44,"sea_level":1033.21,"grnd_level":1019.44,"humidity":68,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":2.37,"deg":36.5035},"sys":{"pod":"n"},"dt_txt":"2018-11-17 18:00:00"},{"dt":1542488400,"main":{"temp":283.206,"temp_min":283.206,"temp_max":283.206,"pressure":1019.08,"sea_level":1032.91,"grnd_level":1019.08,"humidity":84,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":1.75,"deg":60.002},"sys":{"pod":"n"},"dt_txt":"2018-11-17 21:00:00"},{"dt":1542499200,"main":{"temp":280.72,"temp_min":280.72,"temp_max":280.72,"pressure":1018.11,"sea_level":1032.2,"grnd_level":1018.11,"humidity":83,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":1.36,"deg":50.5012},"sys":{"pod":"n"},"dt_txt":"2018-11-18 00:00:00"},{"dt":1542510000,"main":{"temp":278.974,"temp_min":278.974,"temp_max":278.974,"pressure":1017.6,"sea_level":1031.64,"grnd_level":1017.6,"humidity":83,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":1.11,"deg":53.5023},"sys":{"pod":"n"},"dt_txt":"2018-11-18 03:00:00"},{"dt":1542520800,"main":{"temp":284.325,"temp_min":284.325,"temp_max":284.325,"pressure":1018.15,"sea_level":1032.11,"grnd_level":1018.15,"humidity":82,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":1.16,"deg":79.5002},"sys":{"pod":"d"},"dt_txt":"2018-11-18 06:00:00"},{"dt":1542531600,"main":{"temp":296.249,"temp_min":296.249,"temp_max":296.249,"pressure":1017.48,"sea_level":1031.07,"grnd_level":1017.48,"humidity":45,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02d"}],"clouds":{"all":12},"wind":{"speed":1.31,"deg":10.5012},"sys":{"pod":"d"},"dt_txt":"2018-11-18 09:00:00"},{"dt":1542542400,"main":{"temp":298.791,"temp_min":298.791,"temp_max":298.791,"pressure":1015.28,"sea_level":1028.69,"grnd_level":1015.28,"humidity":33,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":1.71,"deg":293.5},"sys":{"pod":"d"},"dt_txt":"2018-11-18 12:00:00"},{"dt":1542553200,"main":{"temp":294.548,"temp_min":294.548,"temp_max":294.548,"pressure":1014.8,"sea_level":1028.34,"grnd_level":1014.8,"humidity":40,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":64},"wind":{"speed":1.06,"deg":315.501},"sys":{"pod":"n"},"dt_txt":"2018-11-18 15:00:00"},{"dt":1542564000,"main":{"temp":288.96,"temp_min":288.96,"temp_max":288.96,"pressure":1014.7,"sea_level":1028.35,"grnd_level":1014.7,"humidity":65,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":80},"wind":{"speed":1.36,"deg":32.5016},"sys":{"pod":"n"},"dt_txt":"2018-11-18 18:00:00"},{"dt":1542574800,"main":{"temp":285.93,"temp_min":285.93,"temp_max":285.93,"pressure":1014.08,"sea_level":1027.71,"grnd_level":1014.08,"humidity":78,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":68},"wind":{"speed":0.89,"deg":127.5},"sys":{"pod":"n"},"dt_txt":"2018-11-18 21:00:00"},{"dt":1542585600,"main":{"temp":284.05,"temp_min":284.05,"temp_max":284.05,"pressure":1013.08,"sea_level":1026.89,"grnd_level":1013.08,"humidity":77,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"clouds":{"all":36},"wind":{"speed":1.21,"deg":173.001},"sys":{"pod":"n"},"dt_txt":"2018-11-19 00:00:00"},{"dt":1542596400,"main":{"temp":281.13,"temp_min":281.13,"temp_max":281.13,"pressure":1013.17,"sea_level":1027.12,"grnd_level":1013.17,"humidity":80,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":1.41,"deg":178.501},"sys":{"pod":"n"},"dt_txt":"2018-11-19 03:00:00"},{"dt":1542607200,"main":{"temp":285.665,"temp_min":285.665,"temp_max":285.665,"pressure":1014.17,"sea_level":1027.95,"grnd_level":1014.17,"humidity":71,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":1.71,"deg":160.504},"sys":{"pod":"d"},"dt_txt":"2018-11-19 06:00:00"},{"dt":1542618000,"main":{"temp":297.725,"temp_min":297.725,"temp_max":297.725,"pressure":1014.57,"sea_level":1027.98,"grnd_level":1014.57,"humidity":34,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":2.97,"deg":189},"sys":{"pod":"d"},"dt_txt":"2018-11-19 09:00:00"},{"dt":1542628800,"main":{"temp":300.058,"temp_min":300.058,"temp_max":300.058,"pressure":1013.21,"sea_level":1026.51,"grnd_level":1013.21,"humidity":28,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":2.36,"deg":206.505},"sys":{"pod":"d"},"dt_txt":"2018-11-19 12:00:00"},{"dt":1542639600,"main":{"temp":294.7,"temp_min":294.7,"temp_max":294.7,"pressure":1013.17,"sea_level":1026.64,"grnd_level":1013.17,"humidity":33,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":1.52,"deg":167.503},"sys":{"pod":"n"},"dt_txt":"2018-11-19 15:00:00"},{"dt":1542650400,"main":{"temp":286.526,"temp_min":286.526,"temp_max":286.526,"pressure":1014.59,"sea_level":1028.23,"grnd_level":1014.59,"humidity":61,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":1.69,"deg":155.002},"sys":{"pod":"n"},"dt_txt":"2018-11-19 18:00:00"},{"dt":1542661200,"main":{"temp":283.886,"temp_min":283.886,"temp_max":283.886,"pressure":1014.89,"sea_level":1028.69,"grnd_level":1014.89,"humidity":71,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":1.76,"deg":141},"sys":{"pod":"n"},"dt_txt":"2018-11-19 21:00:00"},{"dt":1542672000,"main":{"temp":282.263,"temp_min":282.263,"temp_max":282.263,"pressure":1014.98,"sea_level":1028.89,"grnd_level":1014.98,"humidity":76,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":1.75,"deg":145.006},"sys":{"pod":"n"},"dt_txt":"2018-11-20 00:00:00"},{"dt":1542682800,"main":{"temp":281.366,"temp_min":281.366,"temp_max":281.366,"pressure":1015.14,"sea_level":1029.09,"grnd_level":1015.14,"humidity":76,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":1.73,"deg":155.5},"sys":{"pod":"n"},"dt_txt":"2018-11-20 03:00:00"},{"dt":1542693600,"main":{"temp":286.314,"temp_min":286.314,"temp_max":286.314,"pressure":1016.19,"sea_level":1030.05,"grnd_level":1016.19,"humidity":59,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":1.51,"deg":167.004},"sys":{"pod":"d"},"dt_txt":"2018-11-20 06:00:00"},{"dt":1542704400,"main":{"temp":299.018,"temp_min":299.018,"temp_max":299.018,"pressure":1016.33,"sea_level":1029.8,"grnd_level":1016.33,"humidity":27,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":2.31,"deg":195.001},"sys":{"pod":"d"},"dt_txt":"2018-11-20 09:00:00"},{"dt":1542715200,"main":{"temp":300.779,"temp_min":300.779,"temp_max":300.779,"pressure":1015.27,"sea_level":1028.58,"grnd_level":1015.27,"humidity":22,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}],"clouds":{"all":44},"wind":{"speed":3.56,"deg":202.003},"sys":{"pod":"d"},"dt_txt":"2018-11-20 12:00:00"},{"dt":1542726000,"main":{"temp":296.431,"temp_min":296.431,"temp_max":296.431,"pressure":1015.2,"sea_level":1028.66,"grnd_level":1015.2,"humidity":28,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":80},"wind":{"speed":1.96,"deg":178},"sys":{"pod":"n"},"dt_txt":"2018-11-20 15:00:00"},{"dt":1542736800,"main":{"temp":290.707,"temp_min":290.707,"temp_max":290.707,"pressure":1015.65,"sea_level":1029.3,"grnd_level":1015.65,"humidity":41,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":68},"wind":{"speed":1.62,"deg":154.501},"sys":{"pod":"n"},"dt_txt":"2018-11-20 18:00:00"},{"dt":1542747600,"main":{"temp":288.347,"temp_min":288.347,"temp_max":288.347,"pressure":1015.51,"sea_level":1029.22,"grnd_level":1015.51,"humidity":49,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":64},"wind":{"speed":1.91,"deg":155.003},"sys":{"pod":"n"},"dt_txt":"2018-11-20 21:00:00"},{"dt":1542758400,"main":{"temp":288.01,"temp_min":288.01,"temp_max":288.01,"pressure":1014.38,"sea_level":1028.02,"grnd_level":1014.38,"humidity":51,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":56},"wind":{"speed":2.11,"deg":174.502},"sys":{"pod":"n"},"dt_txt":"2018-11-21 00:00:00"},{"dt":1542769200,"main":{"temp":285.192,"temp_min":285.192,"temp_max":285.192,"pressure":1013.67,"sea_level":1027.46,"grnd_level":1013.67,"humidity":57,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"02n"}],"clouds":{"all":8},"wind":{"speed":1.79,"deg":171.001},"sys":{"pod":"n"},"dt_txt":"2018-11-21 03:00:00"},{"dt":1542780000,"main":{"temp":289.872,"temp_min":289.872,"temp_max":289.872,"pressure":1014.13,"sea_level":1027.83,"grnd_level":1014.13,"humidity":39,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":3.04,"deg":174.504},"sys":{"pod":"d"},"dt_txt":"2018-11-21 06:00:00"},{"dt":1542790800,"main":{"temp":300.919,"temp_min":300.919,"temp_max":300.919,"pressure":1014.04,"sea_level":1027.44,"grnd_level":1014.04,"humidity":22,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":4.21,"deg":190.006},"sys":{"pod":"d"},"dt_txt":"2018-11-21 09:00:00"},{"dt":1542801600,"main":{"temp":302.689,"temp_min":302.689,"temp_max":302.689,"pressure":1012.01,"sea_level":1025.29,"grnd_level":1012.01,"humidity":20,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":4.25,"deg":203.5},"sys":{"pod":"d"},"dt_txt":"2018-11-21 12:00:00"},{"dt":1542812400,"main":{"temp":298.102,"temp_min":298.102,"temp_max":298.102,"pressure":1011.28,"sea_level":1024.68,"grnd_level":1011.28,"humidity":25,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":2.71,"deg":191.004},"sys":{"pod":"n"},"dt_txt":"2018-11-21 15:00:00"}]
     * city : {"id":360630,"name":"Cairo","coord":{"lat":30.0488,"lon":31.2437},"country":"EG","population":7734614}
     */

    private String cod;
    private double message;
    private int cnt;
    private City city;
    private List<ForecastList> forecastList;

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
        return forecastList;
    }

    public void setForecastList(List<ForecastList> forecastList) {
        this.forecastList = forecastList;
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
}
