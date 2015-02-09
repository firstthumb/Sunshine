package com.ekocaman.sunshine.data;

import java.util.ArrayList;
import java.util.List;

public class WeatherResult {

    public static class Temperature {
        public float day;
        public float min;
        public float max;
        public float night;
        public float eve;
        public float morn;

        @Override
        public String toString() {
            return "Temperature{" +
                    "day=" + day +
                    ", min=" + min +
                    ", max=" + max +
                    ", night=" + night +
                    ", eve=" + eve +
                    ", morn=" + morn +
                    '}';
        }
    }

    public static class Weather {
        public int id;
        public String main;
        public String description;
        public String icon;

        @Override
        public String toString() {
            return "Weather{" +
                    "id=" + id +
                    ", main='" + main + '\'' +
                    ", description='" + description + '\'' +
                    ", icon='" + icon + '\'' +
                    '}';
        }
    }

    private long dt;
    private float pressure;
    private float humidity;
    private float speed;
    private float deg;
    private float clouds;
    private Temperature temp;
    private List<Weather> weather = new ArrayList<>();

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getDeg() {
        return deg;
    }

    public void setDeg(float deg) {
        this.deg = deg;
    }

    public float getClouds() {
        return clouds;
    }

    public void setClouds(float clouds) {
        this.clouds = clouds;
    }

    public Temperature getTemp() {
        return temp;
    }

    public void setTemp(Temperature temp) {
        this.temp = temp;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "WeatherResult{" +
                "dt=" + dt +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", speed=" + speed +
                ", deg=" + deg +
                ", clouds=" + clouds +
                ", temp=" + temp +
                ", weather=" + weather +
                '}';
    }
}
