package com.example.weatherapp.data.db.unitLocalized

import com.google.gson.annotations.SerializedName
import java.time.ZonedDateTime

interface UnitSpecialCurrentWeather {

    val currentTemperature: Int
     val currentWeatherIcons: List<String>
//     val currentWeatherDescription: List<String>
    val currentObservationTime: String

    val currentPrecip: Double
    val currentCloudcover: Int
    val currentWind_dir: String
    val currentWind_speed: String
    val currentFeelslike: Int
    val currentVisibility: Int

    val locationCountry: String

    val locationName: String

    val locationRegion: String

    val locationLocaltime: String

    val locationTimezone_id: String

    val locationLocaltime_epoch: Long

    val requestLanguage:String
    val zoneTime: ZonedDateTime

}