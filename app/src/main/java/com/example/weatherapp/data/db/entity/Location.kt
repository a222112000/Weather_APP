package com.example.weatherapp.data.db.entity


import android.os.Build
import androidx.annotation.NonNull
import androidx.annotation.RequiresApi
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.time.Instant
import java.time.ZoneId
import java.time.ZonedDateTime



data class Location(
//    @NonNull
//    @PrimaryKey(autoGenerate = false)
//    val id: Int,
    @SerializedName("country")
    val country: String?=null,
    @SerializedName("name")
    val name: String?=null,
    @SerializedName("localtime")
    val localtime: String?=null,
    @SerializedName("timezone_id")
    val timezone_id: String?=null,
    @SerializedName("region")
    val region: String?=null,
    @SerializedName("localtime_epoch")
    val localtime_epoch: Long?=null,
    @SerializedName("lat")
    val lat: Double?=null,
    @SerializedName("lon")
    val lon: Double?=null


){
    constructor(): this( null, null, null,null)
    val zonedDateTime: ZonedDateTime
        @RequiresApi(Build.VERSION_CODES.O)
        get()  {
            val instant = Instant.ofEpochSecond(localtime_epoch!!)
           val zoneId=
                ZoneId.of( timezone_id )

            return ZonedDateTime.ofInstant(instant,zoneId)
        }
}