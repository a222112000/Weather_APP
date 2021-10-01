package com.example.weatherapp.data.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.weatherapp.data.db.entity.Location

import com.example.weatherapp.data.db.entity.WeatherApi
import com.example.weatherapp.data.db.unitLocalized.MetricCurrentWeatherEntry

@Dao
interface LocationWeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(weatherLocation: WeatherApi)
    @Query("select * from current_weather where id=''")
    fun getLocation(): LiveData<MetricCurrentWeatherEntry>
}