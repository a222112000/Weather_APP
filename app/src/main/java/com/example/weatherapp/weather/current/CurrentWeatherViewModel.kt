package com.example.weatherapp.weather.current

import androidx.lifecycle.ViewModel
import com.example.weatherapp.data.provider.UnitProvider
import com.example.weatherapp.data.repository.ForcastRepository
import com.example.weatherapp.internal.UnitSystem
import com.example.weatherapp.internal.lazyDeferred

class CurrentWeatherViewModel(
    private val forecastRepository: ForcastRepository,
    unitProvider: UnitProvider
) : ViewModel() {
    private val unitSystem = unitProvider.getUnitSystem()
    val isMetric: Boolean
        get() = unitSystem == UnitSystem.Metric

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(isMetric)
    }
    val weatherLocation  by lazyDeferred {
        forecastRepository.getWeatherLocation()
    }
}