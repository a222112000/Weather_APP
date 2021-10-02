package com.example.weatherapp.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.weatherapp.data.db.dao.CurrentWeatherDAO
import com.example.weatherapp.data.db.dao.LocationWeatherDao
import com.example.weatherapp.data.db.entity.Location
import com.example.weatherapp.data.db.entity.WeatherApi


@Database(entities = [WeatherApi::class],version = 4,exportSchema = true)
@TypeConverters(StringListConverter::class)
abstract class ForcastDatabase: RoomDatabase() {
    abstract fun currentWeatherDao(): CurrentWeatherDAO
    abstract fun weatherLocationDao():LocationWeatherDao
    companion object{
        @Volatile private var instance: ForcastDatabase?=null
        private val LOCK = Any()
        operator fun invoke(context: Context) = instance?: synchronized(LOCK){
            instance ?: buildDatabase(context).also { instance = it }
        }
        private fun buildDatabase(context: Context) = Room.databaseBuilder(context.applicationContext,ForcastDatabase::class.java,"forcast.db")
            .fallbackToDestructiveMigration()
            .build()
    }
}