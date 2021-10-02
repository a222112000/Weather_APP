package com.example.weatherapp.data.db.unitLocalized

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.room.ColumnInfo
import java.time.Instant
import java.time.ZoneId
import java.time.ZonedDateTime

data class MetricCurrentWeatherEntry(

    @ColumnInfo(name = "current_temperature")
    override val currentTemperature: Int,
    @ColumnInfo(name = "current_weather_icons")
    override val currentWeatherIcons: List<String>,
//    @ColumnInfo(name = "current_weather_description")
//    override val currentWeatherDescription: List<String>,
    @ColumnInfo(name = "current_observation_time")
    override val currentObservationTime: String,
    @ColumnInfo(name = "current_precip")
    override val currentPrecip: Double,
    @ColumnInfo(name = "current_cloudcover")
    override val currentCloudcover: Int,
    @ColumnInfo(name = "current_wind_dir")
    override val currentWind_dir: String,
    @ColumnInfo(name = "current_wind_speed")
    override val currentWind_speed: String,
    @ColumnInfo(name = "current_feelslike")
    override val currentFeelslike: Int,
    @ColumnInfo(name = "current_visibility")
    override val currentVisibility: Int,
    @ColumnInfo(name = "current_weather_descriptions")
    override val currentWeather_descriptions: List<String>,

    @ColumnInfo(name = "location_country")
    override val locationCountry: String,
    @ColumnInfo(name = "location_name")
    override val locationName: String,
    @ColumnInfo(name = "location_region")
    override val locationRegion: String,
    @ColumnInfo(name = "location_localtime")
    override val locationLocaltime: String,
    @ColumnInfo(name = "location_timezone_id")
    override val locationTimezone_id: String,
    @ColumnInfo(name = "location_localtime_epoch")
    override val locationLocaltime_epoch: Long,
    @ColumnInfo(name = "location_lat")
    override val locationLat: Double,
    @ColumnInfo(name = "location_lon")
    override val locationLon: Double,


    @ColumnInfo(name = "request_language")
    override val requestLanguage:String


): UnitSpecialCurrentWeather {

    override val zoneTime: ZonedDateTime
        @RequiresApi(Build.VERSION_CODES.O)
        get()  {
            val instant = Instant.ofEpochSecond(locationLocaltime_epoch)
            val zoneId= ZoneId.of( locationTimezone_id )
            return ZonedDateTime.ofInstant(instant,zoneId)
        }
}
