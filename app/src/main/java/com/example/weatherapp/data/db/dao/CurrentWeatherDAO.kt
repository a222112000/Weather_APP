package com.example.weatherapp.data.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

import com.example.weatherapp.data.db.unitLocalized.ImperialCurrentWeather
import com.example.weatherapp.data.db.unitLocalized.MetricCurrentWeatherEntry
import com.example.weatherapp.data.db.entity.WeatherApi
import com.example.weatherapp.internal.Constants

@Dao
interface CurrentWeatherDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(weaterEntry: WeatherApi)

    @Query("select * from current_weather ")
    fun getWeatherMetric(): LiveData<MetricCurrentWeatherEntry>

    @Query("select * from current_weather")
    fun getWeatherImperail(): LiveData<ImperialCurrentWeather>
}