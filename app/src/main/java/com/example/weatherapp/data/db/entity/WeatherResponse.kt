package com.example.weatherapp.data.db.entity

data class WeatherResponse(
    val location: Location,
    val weatherApi: WeatherApi
) {
}