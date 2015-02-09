package com.ekocaman.sunshine.service;

import com.ekocaman.sunshine.data.Result;

import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

public interface WeatherService {

    @GET("/data/2.5/forecast/daily?mode=json&cnt=7")
    Result getWeatherResult(@Query("q") String postcode, @Query("units") String units);
}
