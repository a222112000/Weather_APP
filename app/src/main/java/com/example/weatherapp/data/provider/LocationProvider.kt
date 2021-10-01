package com.example.weatherapp.data.provider

import com.example.weatherapp.data.db.entity.Location
import com.example.weatherapp.data.db.unitLocalized.MetricCurrentWeatherEntry
import com.example.weatherapp.data.network.ApiService

interface LocationProvider {
    suspend fun hasLocationChange(lastWeatherLocation:MetricCurrentWeatherEntry):Boolean
    suspend fun getPreferredLocationString(): String
}