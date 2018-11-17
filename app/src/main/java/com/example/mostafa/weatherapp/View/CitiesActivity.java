package com.example.mostafa.weatherapp.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;

import com.example.mostafa.weatherapp.Model.Network.CityInfo;
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
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        progressBar = findViewById(R.id.progressBar);

        cities = new ArrayList<>();
        recyclerView.setHasFixedSize(true);
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

        mPresenter = new CitiesPresenter(this);
        mPresenter.getCities();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_Refresh) {
            progressBar.setVisibility(View.VISIBLE);
            this.cities.clear();
            mPresenter.getCities();
            return true;
        }else if (id == R.id.action_ContactUs){
            // open new page the save new year ratio
            startActivity(new Intent(CitiesActivity.this,ContactActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void updateListView(CityInfo cityInfo) {

        this.cities.add(cityInfo);
        mRecyclerViewAdapter.notifyDataSetChanged();
        progressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void showAlertMessage(String title, String message) {
        AlertManager.showAlert(this, title, message);
    }


}
