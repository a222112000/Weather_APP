package com.example.weatherapp.data.repository

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import com.example.weatherapp.data.db.dao.CurrentWeatherDAO
import com.example.weatherapp.data.db.dao.LocationWeatherDao
import com.example.weatherapp.data.db.entity.Location
import com.example.weatherapp.data.db.entity.WeatherApi
import com.example.weatherapp.data.db.entity.WeatherResponse

import com.example.weatherapp.data.db.unitLocalized.ImperialCurrentWeather
import com.example.weatherapp.data.db.unitLocalized.MetricCurrentWeatherEntry
import com.example.weatherapp.data.db.unitLocalized.UnitSpecialCurrentWeather
import com.example.weatherapp.data.network.ApiService
import com.example.weatherapp.data.network.WeatherNetworkDataSource
import com.example.weatherapp.data.provider.LocationProvider
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.time.ZonedDateTime
import java.util.*

class ForcastRepositoryImpl(
    private val currentWeatherDAO: CurrentWeatherDAO,

    private val weatherNetworkDataSource: WeatherNetworkDataSource,
    private val locationProvider: LocationProvider
) : ForcastRepository {
    init {
        weatherNetworkDataSource.downloadedCurrentWeather.observeForever{newCurrentWeather->
            persistFetchedCurrentWeather(newCurrentWeather)
        }
    }
    private fun persistFetchedCurrentWeather(fetchedWeather: WeatherApi){
        GlobalScope.launch(Dispatchers.IO) {
            currentWeatherDAO.upsert(fetchedWeather)

        }
    }
    @RequiresApi(Build.VERSION_CODES.O)
    override suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSpecialCurrentWeather> {
       return withContext(Dispatchers.IO){
           initWeather()
            return@withContext if (metric) currentWeatherDAO.getWeatherMetric()
           else currentWeatherDAO.getWeatherImperail()
        }
    }

    override suspend fun getWeatherLocation(): LiveData<MetricCurrentWeatherEntry> {
       return withContext(Dispatchers.IO){
           return@withContext currentWeatherDAO.getWeatherMetric()
       }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private suspend fun initWeather(){
        val lastWeatherLocation = currentWeatherDAO.getWeatherMetric().value
        if (lastWeatherLocation == null || locationProvider.hasLocationChange(lastWeatherLocation)) {
            fetchCurrentWeather()
            return
        }
            if(isFetchCurrentNeeded(lastWeatherLocation.zoneTime))
                fetchCurrentWeather()

    }
    private suspend fun fetchCurrentWeather(){
        weatherNetworkDataSource.fetchCurrentWeather(
            locationProvider.getPreferredLocationString(),Locale.getDefault().language
        )
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun isFetchCurrentNeeded(lasfetchTime: ZonedDateTime): Boolean{
        val thirtyMiutesAge = ZonedDateTime.now().minusMinutes(30)
        return lasfetchTime.isBefore(thirtyMiutesAge)
    }
}