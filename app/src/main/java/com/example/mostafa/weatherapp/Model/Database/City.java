package com.example.mostafa.weatherapp.Model.Database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class City {

    @PrimaryKey
    @NonNull
    @ColumnInfo
    private int cityId;

    @NonNull
    @ColumnInfo
    private String cityInfo;

    @NonNull
    public int getCityId() {
        return cityId;
    }

    public void setCityId(@NonNull int cityId) {
        this.cityId = cityId;
    }

    @NonNull
    public String getCityInfo() {
        return cityInfo;
    }

    public void setCityInfo(@NonNull String cityInfo) {
        this.cityInfo = cityInfo;
    }
}
