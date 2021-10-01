package com.example.weatherapp.data.provider

import com.example.weatherapp.data.db.entity.Location
import com.example.weatherapp.data.db.unitLocalized.MetricCurrentWeatherEntry
import com.example.weatherapp.data.network.ApiService

class LocationProviderImpl : LocationProvider {
//    override suspend fun hasLocationChange(lastWeatherLocation: ApiService): Boolean {
//        return true
//    }

    override suspend fun hasLocationChange(lastWeatherLocation: MetricCurrentWeatherEntry): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun getPreferredLocationString(): String {
        return "Manchester"
    }
}