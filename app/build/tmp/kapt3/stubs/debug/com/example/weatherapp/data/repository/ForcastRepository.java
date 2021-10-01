package com.example.weatherapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/weatherapp/data/repository/ForcastRepository;", "", "getCurrentWeather", "Landroidx/lifecycle/LiveData;", "Lcom/example/weatherapp/data/db/unitLocalized/UnitSpecialCurrentWeather;", "metric", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherLocation", "Lcom/example/weatherapp/data/db/unitLocalized/MetricCurrentWeatherEntry;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ForcastRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCurrentWeather(boolean metric, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<? extends com.example.weatherapp.data.db.unitLocalized.UnitSpecialCurrentWeather>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getWeatherLocation(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.example.weatherapp.data.db.unitLocalized.MetricCurrentWeatherEntry>> continuation);
}