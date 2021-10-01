package com.example.weatherapp.data.provider;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u0004H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/weatherapp/data/provider/LocationProviderImpl;", "Lcom/example/weatherapp/data/provider/LocationProvider;", "()V", "getPreferredLocationString", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasLocationChange", "", "lastWeatherLocation", "Lcom/example/weatherapp/data/db/unitLocalized/MetricCurrentWeatherEntry;", "(Lcom/example/weatherapp/data/db/unitLocalized/MetricCurrentWeatherEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LocationProviderImpl implements com.example.weatherapp.data.provider.LocationProvider {
    
    public LocationProviderImpl() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object hasLocationChange(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.db.unitLocalized.MetricCurrentWeatherEntry lastWeatherLocation, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPreferredLocationString(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
}