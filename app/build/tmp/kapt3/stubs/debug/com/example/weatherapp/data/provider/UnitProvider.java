package com.example.weatherapp.data.provider;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/example/weatherapp/data/provider/UnitProvider;", "", "getUnitSystem", "Lcom/example/weatherapp/internal/UnitSystem;", "app_debug"})
public abstract interface UnitProvider {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.weatherapp.internal.UnitSystem getUnitSystem();
}