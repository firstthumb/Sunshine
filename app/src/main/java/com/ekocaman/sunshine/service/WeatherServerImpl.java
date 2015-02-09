package com.ekocaman.sunshine.service;

import com.ekocaman.sunshine.data.Result;

import retrofit.RestAdapter;

public class WeatherServerImpl implements WeatherService {

    private WeatherService service;

    public WeatherServerImpl() {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://api.openweathermap.org/")
                .build();
        this.service = restAdapter.create(WeatherService.class);
    }

    @Override
    public Result getWeatherResult(String postcode, String units) {
        return service.getWeatherResult(postcode, units);
    }
}
