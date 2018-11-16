package com.example.mostafa.weatherapp.View;

import android.graphics.Movie;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mostafa.weatherapp.Model.CityInfo;
import com.example.mostafa.weatherapp.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.Holder> {

    List<CityInfo> mCityInfoList;
    OnClickedListener listener;

    public CityAdapter(List<CityInfo> mCityInfoList){
        this.mCityInfoList = mCityInfoList;
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

        CityInfo mCityInfo = this.mCityInfoList.get(position);

        holder.cityNameTextView.setText(mCityInfo.getName());
        holder.cityTempTextView.setText(String.valueOf(mCityInfo.getMain().getTemp()));
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

}