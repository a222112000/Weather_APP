package com.example.weatherapp

import android.app.Activity
import android.app.Application
import android.content.Context
import androidx.preference.PreferenceManager
import com.example.weatherapp.data.ConnectivityIntercepter
import com.example.weatherapp.data.ConnectivityIntercepterImpl
import com.example.weatherapp.data.db.ForcastDatabase
import com.example.weatherapp.data.db.entity.WeatherApi
import com.example.weatherapp.data.network.ApiService
import com.example.weatherapp.data.network.WeatherNetworkDataSource
import com.example.weatherapp.data.network.WeatherNetworkDataSourceImpl
import com.example.weatherapp.data.provider.LocationProvider
import com.example.weatherapp.data.provider.LocationProviderImpl
import com.example.weatherapp.data.provider.UnitProvider
import com.example.weatherapp.data.provider.UnitProviderImpl
import com.example.weatherapp.data.repository.ForcastRepository
import com.example.weatherapp.data.repository.ForcastRepositoryImpl
import com.example.weatherapp.weather.current.CurrentWeatherFragment
import com.example.weatherapp.weather.current.CurrentWeatherViewModelFactory
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class ForcastApplication : Application(), KodeinAware {
    override val kodein= Kodein.lazy {
        import(androidXModule(this@ForcastApplication))
        bind() from singleton {ForcastDatabase(instance())}
        bind() from singleton { instance<ForcastDatabase>().currentWeatherDao() }
        bind<ConnectivityIntercepter>() with singleton { ConnectivityIntercepterImpl(instance()) }
        bind() from singleton { WeatherApi(instance()) }
        bind<WeatherNetworkDataSource>() with singleton { WeatherNetworkDataSourceImpl(instance()) }
        bind<ForcastRepository>() with singleton { ForcastRepositoryImpl(instance(),instance(),instance()) }
        bind() from singleton {ApiService(instance())}
        //bind() from provider { LocationServices.getFusedLocationProviderClient(instance()) }
        bind<LocationProvider>() with singleton { LocationProviderImpl(instance(),instance()) }
        bind<UnitProvider>() with singleton { UnitProviderImpl(instance()) }
        bind() from provider { CurrentWeatherViewModelFactory(instance(),instance()) }

        bind() from provider { LocationServices.getFusedLocationProviderClient(instance<Context>()) }

    }

    override fun onCreate() {
        super.onCreate()
        PreferenceManager.setDefaultValues(this,R.xml.preferences,false)
    }

}