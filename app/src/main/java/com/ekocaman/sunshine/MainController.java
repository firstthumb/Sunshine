package com.ekocaman.sunshine;

import android.util.Log;

import com.ekocaman.sunshine.service.WeatherService;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MainController {
    @Inject
    WeatherService weatherService;

    private MainActivity activity;

    public void callWeatherService() {
        Log.d("SUNSHINE", weatherService.test("sunshine"));
    }
}
