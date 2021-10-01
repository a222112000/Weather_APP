package com.example.weatherapp.data.provider;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/weatherapp/data/provider/LocationProvider;", "", "getPreferredLocationString", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasLocationChange", "", "lastWeatherLocation", "Lcom/example/weatherapp/data/db/unitLocalized/MetricCurrentWeatherEntry;", "(Lcom/example/weatherapp/data/db/unitLocalized/MetricCurrentWeatherEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface LocationProvider {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object hasLocationChange(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.db.unitLocalized.MetricCurrentWeatherEntry lastWeatherLocation, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPreferredLocationString(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> continuation);
}