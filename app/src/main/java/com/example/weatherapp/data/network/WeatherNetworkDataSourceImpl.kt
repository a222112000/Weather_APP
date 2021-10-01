package com.example.weatherapp.data.network

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.weatherapp.data.db.entity.WeatherApi
import com.example.weatherapp.data.db.entity.WeatherResponse
import com.example.weatherapp.internal.NoConnectivityException

class WeatherNetworkDataSourceImpl(
    private val apiService: ApiService
) : WeatherNetworkDataSource {
    private val _downloadedCurrentWeather = MutableLiveData<WeatherApi>()
    override val downloadedCurrentWeather: LiveData<WeatherApi>
        get() = _downloadedCurrentWeather

    override suspend fun fetchCurrentWeather(location: String, language: String) {
        try {
            val fetchedCurrentWeather = apiService
                .getCurrentWeather(location,language)
                .await()
            _downloadedCurrentWeather.postValue(fetchedCurrentWeather)
        }catch (e: NoConnectivityException){
            Log.e("Connectivity","No Internet Connection",e)
        }
    }
}