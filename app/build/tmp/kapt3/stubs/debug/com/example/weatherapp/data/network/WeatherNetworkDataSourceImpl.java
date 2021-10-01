package com.example.weatherapp.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J!\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/weatherapp/data/network/WeatherNetworkDataSourceImpl;", "Lcom/example/weatherapp/data/network/WeatherNetworkDataSource;", "apiService", "Lcom/example/weatherapp/data/network/ApiService;", "(Lcom/example/weatherapp/data/network/ApiService;)V", "_downloadedCurrentWeather", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/weatherapp/data/db/entity/WeatherApi;", "downloadedCurrentWeather", "Landroidx/lifecycle/LiveData;", "getDownloadedCurrentWeather", "()Landroidx/lifecycle/LiveData;", "fetchCurrentWeather", "", "location", "", "language", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class WeatherNetworkDataSourceImpl implements com.example.weatherapp.data.network.WeatherNetworkDataSource {
    private final com.example.weatherapp.data.network.ApiService apiService = null;
    private final androidx.lifecycle.MutableLiveData<com.example.weatherapp.data.db.entity.WeatherApi> _downloadedCurrentWeather = null;
    
    public WeatherNetworkDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.network.ApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.example.weatherapp.data.db.entity.WeatherApi> getDownloadedCurrentWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchCurrentWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}