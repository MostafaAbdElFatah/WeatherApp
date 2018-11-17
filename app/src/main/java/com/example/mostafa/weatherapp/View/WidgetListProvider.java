package com.example.mostafa.weatherapp.View;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;

import com.example.mostafa.weatherapp.Model.Database.City;
import com.example.mostafa.weatherapp.Model.Database.RoomDB;
import com.example.mostafa.weatherapp.Model.Network.CityInfo;
import com.example.mostafa.weatherapp.R;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class WidgetListProvider implements RemoteViewsService.RemoteViewsFactory {

    private int appWidgetId;
    private Context context;
    private ArrayList<CityInfo> mCityInfoList;
    RoomDB.RoomManager mRoomManager;

    public WidgetListProvider(Context context, Intent intent) {
        this.context = context;
        this.mCityInfoList = new ArrayList<>();
        mRoomManager = new RoomDB.RoomManager(context);
        appWidgetId = intent.getIntExtra(AppWidgetManager.EXTRA_APPWIDGET_ID,
                AppWidgetManager.INVALID_APPWIDGET_ID);
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onDataSetChanged() {
        mCityInfoList.clear();
        this.getData();
    }

    private void getData(){
        if (mRoomManager.isHasCities()){
            List<City> cityList = mRoomManager.getCities();
            for (City item: cityList) {
                Gson gson = new Gson();
                CityInfo mCityInfo = gson.fromJson(item.getCityInfo(), CityInfo.class);
                mCityInfoList.add(mCityInfo);
            }

        }
    }

    @Override
    public void onDestroy() {

    }

    @Override
    public int getCount() {
        return mCityInfoList.size();
    }

    @Override
    public RemoteViews getViewAt(int index) {

        final RemoteViews remoteRowView = new RemoteViews(
                context.getPackageName(), R.layout.listview_row_widget);
        CityInfo mCityInfo = mCityInfoList.get(index);
        Log.v("weatherWidget","getViewAt "+mCityInfo.getName());
        remoteRowView.setTextViewText(R.id.city_name_widget, mCityInfo.getName());
        remoteRowView.setTextViewText(R.id.city_temp_widget, String
                .valueOf(mCityInfo.getMain().getTemp()));

        Intent clickIntent = new Intent()
                .putExtra("cityInfo",mCityInfo);
        remoteRowView.setOnClickFillInIntent(R.id.list_view_row_widget, clickIntent);

        return remoteRowView;
    }

    @Override
    public RemoteViews getLoadingView() {
        return null;
    }

    @Override
    public int getViewTypeCount() {
        return 1;
    }

    @Override
    public long getItemId(int i) {
        return mCityInfoList.get(i).getId();
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }
}
