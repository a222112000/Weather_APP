package com.example.weatherapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\u0014\u001a\u00020\nH\u0083@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0003J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/example/weatherapp/data/repository/ForcastRepositoryImpl;", "Lcom/example/weatherapp/data/repository/ForcastRepository;", "currentWeatherDAO", "Lcom/example/weatherapp/data/db/dao/CurrentWeatherDAO;", "weatherNetworkDataSource", "Lcom/example/weatherapp/data/network/WeatherNetworkDataSource;", "locationProvider", "Lcom/example/weatherapp/data/provider/LocationProvider;", "(Lcom/example/weatherapp/data/db/dao/CurrentWeatherDAO;Lcom/example/weatherapp/data/network/WeatherNetworkDataSource;Lcom/example/weatherapp/data/provider/LocationProvider;)V", "fetchCurrentWeather", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentWeather", "Landroidx/lifecycle/LiveData;", "Lcom/example/weatherapp/data/db/unitLocalized/UnitSpecialCurrentWeather;", "metric", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherLocation", "Lcom/example/weatherapp/data/db/unitLocalized/MetricCurrentWeatherEntry;", "initWeather", "isFetchCurrentNeeded", "lasfetchTime", "Ljava/time/ZonedDateTime;", "persistFetchedCurrentWeather", "fetchedWeather", "Lcom/example/weatherapp/data/db/entity/WeatherApi;", "app_debug"})
public final class ForcastRepositoryImpl implements com.example.weatherapp.data.repository.ForcastRepository {
    private final com.example.weatherapp.data.db.dao.CurrentWeatherDAO currentWeatherDAO = null;
    private final com.example.weatherapp.data.network.WeatherNetworkDataSource weatherNetworkDataSource = null;
    private final com.example.weatherapp.data.provider.LocationProvider locationProvider = null;
    
    public ForcastRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.db.dao.CurrentWeatherDAO currentWeatherDAO, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.network.WeatherNetworkDataSource weatherNetworkDataSource, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.provider.LocationProvider locationProvider) {
        super();
    }
    
    private final void persistFetchedCurrentWeather(com.example.weatherapp.data.db.entity.WeatherApi fetchedWeather) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override()
    public java.lang.Object getCurrentWeather(boolean metric, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<? extends com.example.weatherapp.data.db.unitLocalized.UnitSpecialCurrentWeather>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getWeatherLocation(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.example.weatherapp.data.db.unitLocalized.MetricCurrentWeatherEntry>> continuation) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final java.lang.Object initWeather(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object fetchCurrentWeather(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final boolean isFetchCurrentNeeded(java.time.ZonedDateTime lasfetchTime) {
        return false;
    }
}