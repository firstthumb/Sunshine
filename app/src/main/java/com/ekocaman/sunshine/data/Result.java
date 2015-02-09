package com.ekocaman.sunshine.data;

import java.util.ArrayList;
import java.util.List;

public class Result {
    private String cod;
    private float message;
    private int cnt;
    private City city;
    private List<WeatherResult> list = new ArrayList<WeatherResult>();

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public float getMessage() {
        return message;
    }

    public void setMessage(float message) {
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

    public List<WeatherResult> getList() {
        return list;
    }

    public void setList(List<WeatherResult> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Result{" +
                "cod='" + cod + '\'' +
                ", message=" + message +
                ", cnt=" + cnt +
                ", city=" + city +
                ", list=" + list +
                '}';
    }
}
