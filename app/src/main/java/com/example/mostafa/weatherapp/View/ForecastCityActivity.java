package com.example.mostafa.weatherapp.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mostafa.weatherapp.Model.CityInfo;
import com.example.mostafa.weatherapp.Model.Forecast;
import com.example.mostafa.weatherapp.Presenter.CitiesPresenter;
import com.example.mostafa.weatherapp.Presenter.ForecastPresenter;
import com.example.mostafa.weatherapp.R;
import com.example.mostafa.weatherapp.Utilities.AlertManager;

import java.util.ArrayList;

public class ForecastCityActivity extends AppCompatActivity implements IForecastView {


    ArrayList<Object> forecastList;
    ForecastPresenter mPresenter;

    RecyclerView recyclerView;
    CityAdapter mRecyclerViewAdapter;
    RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast_city);
        CityInfo cityInfo = (CityInfo) getIntent().getSerializableExtra("cityInfo");
        forecastList = new ArrayList<>();
        mPresenter = new ForecastPresenter(this);
        mPresenter.getForecastDays(cityInfo);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerViewAdapter = new CityAdapter(CityAdapter.Type.ForecastDays,forecastList);
        recyclerView.setAdapter(mRecyclerViewAdapter);
        recyclerView.setLayoutManager(mLayoutManager);

    }

    @Override
    public void updateView(ArrayList<Forecast.ForecastList> forecastLists) {
        this.forecastList.addAll(forecastLists);
        mRecyclerViewAdapter.notifyDataSetChanged();
    }

    @Override
    public void showAlertMessage(String title, String message) {
        AlertManager.showAlert(this, title, message);
    }
}
