package com.example.mostafa.weatherapp.View;

import android.graphics.Movie;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mostafa.weatherapp.Model.CityInfo;
import com.example.mostafa.weatherapp.Model.Forecast;
import com.example.mostafa.weatherapp.R;

import java.util.List;

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.Holder> {

    private Type mType;
    private List<Object> mCityInfoList;
    private OnClickedListener listener;


    public CityAdapter( Type type , List<Object> mCityInfoList){
        this.mCityInfoList = mCityInfoList;
        this.mType = type;
    }

    public void setOnClickedListener(OnClickedListener listener){
        this.listener = listener;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.city_row
                ,parent,false);
        return  new Holder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        if (this.mType == Type.CurrentWeather){
            CityInfo mCityInfo = (CityInfo) this.mCityInfoList.get(position);
            holder.cityNameTextView.setText(mCityInfo.getName());
            holder.cityTempTextView.setText(String.valueOf(mCityInfo.getMain().getTemp()));
        }else if (this.mType == Type.ForecastDays){
            Forecast.ForecastList forecastList = (Forecast.ForecastList) this.mCityInfoList.get(position);
            String stringDate = forecastList.getDt_txt().substring(0, 10);
            holder.cityNameTextView.setText(stringDate);
            holder.cityTempTextView.setText(String.valueOf(forecastList.getMain().getTemp()));
        }


    }

    @Override
    public int getItemCount() {
        return this.mCityInfoList.size();
    }

    class Holder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView cityNameTextView, cityTempTextView;

        public Holder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            this.cityNameTextView = itemView.findViewById(R.id.city_name);
            this.cityTempTextView = itemView.findViewById(R.id.city_temp);
        }

        @Override
        public void onClick(View v) {
            if (listener != null)
                listener.onClicked(getLayoutPosition());
        }
    }

    public interface OnClickedListener{
        public void onClicked(int position);
    }

    public enum Type{
        CurrentWeather,
        ForecastDays
    }
}