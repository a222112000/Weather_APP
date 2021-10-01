package com.example.weatherapp.data.db.entity


import androidx.annotation.NonNull
import androidx.room.Embedded
import com.google.gson.annotations.SerializedName
import java.lang.reflect.Array

data class Current(


    val temperature: Int?= null,
    @SerializedName("weather_icons")
    val weather_icons: List<String>?=null,
//    val weather_description: List<String>?=null,
    @SerializedName("observation_time")
    val observation_time: String?=null,
    @SerializedName("precip")
    val precip: Double?=null,
    @SerializedName("cloudcover")
    val cloudcover: Int?=null,
    @SerializedName("wind_dir")
    val wind_dir: String?=null,
    @SerializedName("wind_speed")
    val wind_speed: String?=null,
    @SerializedName("feelslike")
    val feelslike: Int?=null,
    @SerializedName("visibility")
    val visibility: Int?=null


    ){
    constructor(): this( null, null,null,null,null,null,null)
}
