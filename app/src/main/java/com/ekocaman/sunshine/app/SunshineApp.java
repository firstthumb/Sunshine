package com.ekocaman.sunshine.app;

import android.app.Application;

import com.ekocaman.sunshine.service.WeatherService;

import javax.inject.Inject;

import dagger.ObjectGraph;

public class SunshineApp extends Application {
    private ObjectGraph objectGraph;

    @Inject
    WeatherService weatherService;

    @Override
    public void onCreate() {
        super.onCreate();

        objectGraph = ObjectGraph.create(new SunshineModule(this));
        objectGraph.inject(this);
    }

    public WeatherService getWeatherService() {
        return weatherService;
    }
}
