package com.example.weatherapp.weather.current;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e0\r8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\'\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000e0\r8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0016\u0010\u0011\u00a8\u0006\u0018"}, d2 = {"Lcom/example/weatherapp/weather/current/CurrentWeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "forecastRepository", "Lcom/example/weatherapp/data/repository/ForcastRepository;", "unitProvider", "Lcom/example/weatherapp/data/provider/UnitProvider;", "(Lcom/example/weatherapp/data/repository/ForcastRepository;Lcom/example/weatherapp/data/provider/UnitProvider;)V", "isMetric", "", "()Z", "unitSystem", "Lcom/example/weatherapp/internal/UnitSystem;", "weather", "Lkotlinx/coroutines/Deferred;", "Landroidx/lifecycle/LiveData;", "Lcom/example/weatherapp/data/db/unitLocalized/UnitSpecialCurrentWeather;", "getWeather", "()Lkotlinx/coroutines/Deferred;", "weather$delegate", "Lkotlin/Lazy;", "weatherLocation", "Lcom/example/weatherapp/data/db/unitLocalized/MetricCurrentWeatherEntry;", "getWeatherLocation", "weatherLocation$delegate", "app_debug"})
public final class CurrentWeatherViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.weatherapp.data.repository.ForcastRepository forecastRepository = null;
    private final com.example.weatherapp.internal.UnitSystem unitSystem = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy weather$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy weatherLocation$delegate = null;
    
    public CurrentWeatherViewModel(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.repository.ForcastRepository forecastRepository, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.provider.UnitProvider unitProvider) {
        super();
    }
    
    public final boolean isMetric() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Deferred<androidx.lifecycle.LiveData<? extends com.example.weatherapp.data.db.unitLocalized.UnitSpecialCurrentWeather>> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Deferred<androidx.lifecycle.LiveData<com.example.weatherapp.data.db.unitLocalized.MetricCurrentWeatherEntry>> getWeatherLocation() {
        return null;
    }
}