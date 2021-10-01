package com.example.weatherapp.data.repository

import androidx.lifecycle.LiveData
import com.example.weatherapp.data.db.entity.Location
import com.example.weatherapp.data.db.unitLocalized.MetricCurrentWeatherEntry
import com.example.weatherapp.data.db.unitLocalized.UnitSpecialCurrentWeather
import com.example.weatherapp.data.network.ApiService

interface ForcastRepository {
    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSpecialCurrentWeather>
    suspend fun getWeatherLocation(): LiveData<MetricCurrentWeatherEntry>
}