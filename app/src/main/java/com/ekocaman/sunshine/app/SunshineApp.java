package com.ekocaman.sunshine.app;

import android.app.Activity;
import android.app.Application;

import dagger.ObjectGraph;

public class SunshineApp extends Application {
    private ObjectGraph objectGraph;

    public synchronized ObjectGraph getObjectGraph() {
        if (objectGraph == null) {
            objectGraph = ObjectGraph.create(new SunshineModule(this));
        }
        return objectGraph;
    }

    public void inject(Activity activity) {
        getObjectGraph().inject(activity);
    }
}
