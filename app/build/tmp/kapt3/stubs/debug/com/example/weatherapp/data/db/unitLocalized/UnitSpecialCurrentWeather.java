package com.example.weatherapp.data.db.unitLocalized;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0012\u0010\u0012\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0015X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0015X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0012\u0010\u001a\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u000bR\u0012\u0010\u001c\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u000bR\u0012\u0010\u001e\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u000bR\u0012\u0010 \u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u000fR\u0012\u0010\"\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010\u000bR\u0012\u0010$\u001a\u00020%X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010\'R\u0012\u0010(\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b)\u0010\u000fR\u0012\u0010*\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b+\u0010\u000bR\u0012\u0010,\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b-\u0010\u000bR\u0012\u0010.\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b/\u0010\u000bR\u0012\u00100\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b1\u0010\u000bR\u0012\u00102\u001a\u000203X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b4\u00105\u00a8\u00066"}, d2 = {"Lcom/example/weatherapp/data/db/unitLocalized/UnitSpecialCurrentWeather;", "", "currentCloudcover", "", "getCurrentCloudcover", "()I", "currentFeelslike", "getCurrentFeelslike", "currentObservationTime", "", "getCurrentObservationTime", "()Ljava/lang/String;", "currentPrecip", "", "getCurrentPrecip", "()D", "currentTemperature", "getCurrentTemperature", "currentVisibility", "getCurrentVisibility", "currentWeatherIcons", "", "getCurrentWeatherIcons", "()Ljava/util/List;", "currentWeather_descriptions", "getCurrentWeather_descriptions", "currentWind_dir", "getCurrentWind_dir", "currentWind_speed", "getCurrentWind_speed", "locationCountry", "getLocationCountry", "locationLat", "getLocationLat", "locationLocaltime", "getLocationLocaltime", "locationLocaltime_epoch", "", "getLocationLocaltime_epoch", "()J", "locationLon", "getLocationLon", "locationName", "getLocationName", "locationRegion", "getLocationRegion", "locationTimezone_id", "getLocationTimezone_id", "requestLanguage", "getRequestLanguage", "zoneTime", "Ljava/time/ZonedDateTime;", "getZoneTime", "()Ljava/time/ZonedDateTime;", "app_debug"})
public abstract interface UnitSpecialCurrentWeather {
    
    public abstract int getCurrentTemperature();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getCurrentWeatherIcons();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCurrentObservationTime();
    
    public abstract double getCurrentPrecip();
    
    public abstract int getCurrentCloudcover();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCurrentWind_dir();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCurrentWind_speed();
    
    public abstract int getCurrentFeelslike();
    
    public abstract int getCurrentVisibility();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getCurrentWeather_descriptions();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getLocationCountry();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getLocationName();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getLocationRegion();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getLocationLocaltime();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getLocationTimezone_id();
    
    public abstract long getLocationLocaltime_epoch();
    
    public abstract double getLocationLat();
    
    public abstract double getLocationLon();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getRequestLanguage();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.time.ZonedDateTime getZoneTime();
}