package com.example.weatherapp.data.db.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/example/weatherapp/data/db/dao/CurrentWeatherDAO;", "", "getWeatherImperail", "Landroidx/lifecycle/LiveData;", "Lcom/example/weatherapp/data/db/unitLocalized/ImperialCurrentWeather;", "getWeatherMetric", "Lcom/example/weatherapp/data/db/unitLocalized/MetricCurrentWeatherEntry;", "upsert", "", "weaterEntry", "Lcom/example/weatherapp/data/db/entity/WeatherApi;", "app_debug"})
public abstract interface CurrentWeatherDAO {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void upsert(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.db.entity.WeatherApi weaterEntry);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from current_weather ")
    public abstract androidx.lifecycle.LiveData<com.example.weatherapp.data.db.unitLocalized.MetricCurrentWeatherEntry> getWeatherMetric();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from current_weather")
    public abstract androidx.lifecycle.LiveData<com.example.weatherapp.data.db.unitLocalized.ImperialCurrentWeather> getWeatherImperail();
}