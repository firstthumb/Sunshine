package com.ekocaman.sunshine;

import android.app.Application;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.ekocaman.sunshine.app.SunshineApp;
import com.ekocaman.sunshine.data.WeatherResult;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ForecastFragment extends Fragment {
    private ArrayAdapter<String> listAdapter;

    public ForecastFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        listAdapter = new ArrayAdapter<String>(getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                new ArrayList<String>());

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(listAdapter);

        return rootView;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.forecastfragment, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_refresh) {
            new FetchWeatherTask().execute();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public class FetchWeatherTask extends AsyncTask<Void, Void, Void> {
        private final String TAG = FetchWeatherTask.class.getSimpleName();

        @Override
        protected Void doInBackground(Void... params) {
            Log.e(TAG, ((SunshineApp) getActivity().getApplication()).getWeatherService().getWeatherResult("95136", "metric").toString());


            final List<String> data = new ArrayList<>();
            for (WeatherResult weatherResult : ((SunshineApp) getActivity().getApplication()).getWeatherService().getWeatherResult("95136", "metric").getList()) {
                data.add(String.format("Weather %s %s", weatherResult.getTemp().min, weatherResult.getTemp().max));
            }

            getActivity().runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    listAdapter.clear();
                    listAdapter.addAll(data);
                }
            });



            return null;
        }
    }
}
