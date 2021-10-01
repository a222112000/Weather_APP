package com.example.weatherapp.data.db.entity


import androidx.annotation.NonNull
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "current_weather")
data class WeatherApi(
    @NonNull
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    @Embedded(prefix = "current_")
    val current: Current?=null,
    @NonNull
    @Embedded(prefix = "location_")
    val location: Location?=null,

    @Embedded(prefix = "request_")
    val request: Request?=null
) {

    constructor(): this( 0,null,  null)

//    @Ignore
//    constructor(id: Int,current: Current,location: Location,request: Request) : this(0, Current(current.cloudcover,
//        current.feelslike,
//        current.humidity,
//        current.isDay,
//        current.observationTime,
//        current.precip,
//        current.pressure,
//        current.temperature,
//        current.uvIndex,
//        current.visibility,
//        current.weatherCode,
//        current.weatherDescriptions,
//        current.weatherIcons,
//        current.windDegree,
//        current.windDir,
//        current.windSpeed), Location( location.country,
//        location.lat,
//        location.localtime,
//        location.localtimeEpoch,
//        location.lon,
//        location.name,
//        location.region,
//        location.timezoneId,
//        location.utcOffset),
//        Request( request.language,
//        request.query,
//        request.type,
//        request.unit))
}