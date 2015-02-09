package com.ekocaman.sunshine.app;

import android.content.Context;

import com.ekocaman.sunshine.MainActivity;
import com.ekocaman.sunshine.service.WeatherService;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        injects = {
                MainActivity.class
        },
        complete = false,
        library = true
)
public class SunshineModule {
    private final SunshineApp sunshineApp;

    public SunshineModule(SunshineApp sunshineApp) {
        this.sunshineApp = sunshineApp;
    }

    @Provides
    @Named("Application")
    Context provideContext() {
        return sunshineApp;
    }

    @Provides
    @Singleton
    WeatherService provideWeatherService() {
        return new WeatherService();
    }
}
