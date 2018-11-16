package com.example.mostafa.weatherapp.View;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mostafa.weatherapp.Model.CityInfo;
import com.example.mostafa.weatherapp.Presenter.CitiesPresenter;
import com.example.mostafa.weatherapp.R;
import com.example.mostafa.weatherapp.Utilities.AlertManager;

import java.util.ArrayList;

public class CitiesActivity extends AppCompatActivity implements ICitiesView {

    ArrayList<Object> cities;
    CitiesPresenter mPresenter;
    RecyclerView recyclerView;
    CityAdapter mRecyclerViewAdapter;
    RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cities = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        mPresenter = new CitiesPresenter(this);
        mPresenter.getCities();

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerViewAdapter = new CityAdapter(CityAdapter.Type.CurrentWeather,cities);
        recyclerView.setAdapter(mRecyclerViewAdapter);
        recyclerView.setLayoutManager(mLayoutManager);
        mRecyclerViewAdapter.setOnClickedListener(new CityAdapter.OnClickedListener() {
            @Override
            public void onClicked(int position) {
                Intent intent = new Intent(CitiesActivity.this, ForecastCityActivity.class);
                intent.putExtra("cityInfo",(CityInfo)cities.get(position));
                startActivity(intent);
            }
        });
    }


    @Override
    public void updateListView(CityInfo cityInfo) {
        this.cities.add(cityInfo);
        mRecyclerViewAdapter.notifyDataSetChanged();
    }

    @Override
    public void showAlertMessage(String title, String message) {
        AlertManager.showAlert(this, title, message);
    }


}
