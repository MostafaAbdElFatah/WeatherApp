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
import com.example.mostafa.weatherapp.Model.Network.Forecast;
import com.example.mostafa.weatherapp.Presenter.ForecastPresenter;
import com.example.mostafa.weatherapp.R;
import com.example.mostafa.weatherapp.Utilities.AlertManager;

import java.util.ArrayList;

public class ForecastCityActivity extends AppCompatActivity implements IForecastView {


    CityInfo mCityInfo;
    ArrayList<Object> forecastList;
    ForecastPresenter mPresenter;

    RecyclerView recyclerView;
    ProgressBar progressBar;
    CityAdapter mRecyclerViewAdapter;
    RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast_city);

        recyclerView = findViewById(R.id.recyclerView);
        progressBar = findViewById(R.id.progressBar);

        mCityInfo = (CityInfo) getIntent().getSerializableExtra("cityInfo");
        getSupportActionBar().setTitle(mCityInfo.getName());
        forecastList = new ArrayList<>();

        recyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerViewAdapter = new CityAdapter(CityAdapter.Type.ForecastDays,forecastList);
        recyclerView.setAdapter(mRecyclerViewAdapter);
        recyclerView.setLayoutManager(mLayoutManager);

        mPresenter = new ForecastPresenter(this);
        mPresenter.getForecastDays(mCityInfo);
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
            mPresenter.getForecastDays(mCityInfo);
            return true;
        }else if (id == R.id.action_ContactUs){
            // open new page the save new year ratio
            startActivity(new Intent(ForecastCityActivity.this,ContactActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void updateView(ArrayList<Forecast.ForecastList> forecastLists) {
        this.forecastList.clear();
        this.forecastList.addAll(forecastLists);
        mRecyclerViewAdapter.notifyDataSetChanged();
        progressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void showAlertMessage(String title, String message) {
        AlertManager.showAlert(this, title, message);
    }
}
