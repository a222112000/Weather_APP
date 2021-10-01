package com.example.weatherapp.weather.current

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapp.data.provider.UnitProvider
import com.example.weatherapp.data.repository.ForcastRepository

class CurrentWeatherViewModelFactory(
    private val forcastRepository: ForcastRepository,
    private val unitProvider: UnitProvider
):ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return CurrentWeatherViewModel(forcastRepository,unitProvider) as T
    }
}