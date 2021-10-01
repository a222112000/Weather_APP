package com.example.weatherapp.data.network

import androidx.lifecycle.LiveData
import com.example.weatherapp.data.db.entity.WeatherApi
import com.example.weatherapp.data.db.entity.WeatherResponse


interface WeatherNetworkDataSource {
    val downloadedCurrentWeather: LiveData<WeatherApi>
    suspend fun fetchCurrentWeather(location: String,language:String)
}