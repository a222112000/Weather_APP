package com.example.weatherapp.data.network

import com.example.weatherapp.data.ConnectivityIntercepter
import com.example.weatherapp.data.db.entity.WeatherApi

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

const val API_KEY = "81d2325598d4b1227af5cff0dbf87e6e"
// http://api.weatherstack.com/current?access_key=81d2325598d4b1227af5cff0dbf87e6e&query=New%20York
//https://api.weatherstack.com/current?access_key=81d2325598d4b1227af5cff0dbf87e6e&query=London
interface ApiService {

    @GET("current")
    fun getCurrentWeather(
        @Query("query")query:String,
        @Query("lang")lang:String="en"
    ): Deferred<WeatherApi>
    companion object{
        operator fun invoke(
            connectivityIntercepter: ConnectivityIntercepter
        ): ApiService{
            val requestInterceptor = Interceptor{chain->
                val url = chain.request()
                    .url()
                    .newBuilder()
                    .addQueryParameter("access_key", API_KEY)
                    .build()
                val request = chain.request()
                    .newBuilder()
                    .url(url)
                    .build()
                return@Interceptor chain.proceed(request)
            }
            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(requestInterceptor)
                .addInterceptor(connectivityIntercepter)
                .build()
            return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("http://api.weatherstack.com/")
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiService::class.java)
        }
    }
}