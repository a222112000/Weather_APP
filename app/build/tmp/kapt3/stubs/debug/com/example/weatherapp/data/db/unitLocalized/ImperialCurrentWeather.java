package com.example.weatherapp.data.db.unitLocalized;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0017J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0006H\u00c6\u0003J\t\u00103\u001a\u00020\u0006H\u00c6\u0003J\t\u00104\u001a\u00020\u0006H\u00c6\u0003J\t\u00105\u001a\u00020\u0006H\u00c6\u0003J\t\u00106\u001a\u00020\u0006H\u00c6\u0003J\t\u00107\u001a\u00020\u0015H\u00c6\u0003J\t\u00108\u001a\u00020\u0006H\u00c6\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010:\u001a\u00020\u0006H\u00c6\u0003J\t\u0010;\u001a\u00020\tH\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0006H\u00c6\u0003J\t\u0010>\u001a\u00020\u0006H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\u00af\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010EH\u00d6\u0003J\t\u0010F\u001a\u00020\u0003H\u00d6\u0001J\t\u0010G\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\n\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\r\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\b\u001a\u00020\t8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u000b\u001a\u00020\u00068\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0016\u0010\f\u001a\u00020\u00068\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0016\u0010\u000f\u001a\u00020\u00068\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0016\u0010\u0012\u001a\u00020\u00068\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0016\u0010\u0014\u001a\u00020\u00158\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0016\u0010\u0010\u001a\u00020\u00068\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0016\u0010\u0011\u001a\u00020\u00068\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0016\u0010\u0013\u001a\u00020\u00068\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0016\u0010\u0016\u001a\u00020\u00068\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0014\u0010-\u001a\u00020.8WX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b/\u00100\u00a8\u0006H"}, d2 = {"Lcom/example/weatherapp/data/db/unitLocalized/ImperialCurrentWeather;", "Lcom/example/weatherapp/data/db/unitLocalized/UnitSpecialCurrentWeather;", "currentTemperature", "", "currentWeatherIcons", "", "", "currentObservationTime", "currentPrecip", "", "currentCloudcover", "currentWind_dir", "currentWind_speed", "currentFeelslike", "currentVisibility", "locationCountry", "locationName", "locationRegion", "locationLocaltime", "locationTimezone_id", "locationLocaltime_epoch", "", "requestLanguage", "(ILjava/util/List;Ljava/lang/String;DILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getCurrentCloudcover", "()I", "getCurrentFeelslike", "getCurrentObservationTime", "()Ljava/lang/String;", "getCurrentPrecip", "()D", "getCurrentTemperature", "getCurrentVisibility", "getCurrentWeatherIcons", "()Ljava/util/List;", "getCurrentWind_dir", "getCurrentWind_speed", "getLocationCountry", "getLocationLocaltime", "getLocationLocaltime_epoch", "()J", "getLocationName", "getLocationRegion", "getLocationTimezone_id", "getRequestLanguage", "zoneTime", "Ljava/time/ZonedDateTime;", "getZoneTime", "()Ljava/time/ZonedDateTime;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class ImperialCurrentWeather implements com.example.weatherapp.data.db.unitLocalized.UnitSpecialCurrentWeather {
    @androidx.room.ColumnInfo(name = "current_temperature")
    private final int currentTemperature = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "current_weather_icons")
    private final java.util.List<java.lang.String> currentWeatherIcons = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "current_observation_time")
    private final java.lang.String currentObservationTime = null;
    @androidx.room.ColumnInfo(name = "current_precip")
    private final double currentPrecip = 0.0;
    @androidx.room.ColumnInfo(name = "current_cloudcover")
    private final int currentCloudcover = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "current_wind_dir")
    private final java.lang.String currentWind_dir = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "current_wind_speed")
    private final java.lang.String currentWind_speed = null;
    @androidx.room.ColumnInfo(name = "current_feelslike")
    private final int currentFeelslike = 0;
    @androidx.room.ColumnInfo(name = "current_visibility")
    private final int currentVisibility = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "location_country")
    private final java.lang.String locationCountry = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "location_name")
    private final java.lang.String locationName = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "location_region")
    private final java.lang.String locationRegion = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "location_localtime")
    private final java.lang.String locationLocaltime = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "location_timezone_id")
    private final java.lang.String locationTimezone_id = null;
    @androidx.room.ColumnInfo(name = "location_localtime_epoch")
    private final long locationLocaltime_epoch = 0L;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "request_language")
    private final java.lang.String requestLanguage = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.data.db.unitLocalized.ImperialCurrentWeather copy(int currentTemperature, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> currentWeatherIcons, @org.jetbrains.annotations.NotNull()
    java.lang.String currentObservationTime, double currentPrecip, int currentCloudcover, @org.jetbrains.annotations.NotNull()
    java.lang.String currentWind_dir, @org.jetbrains.annotations.NotNull()
    java.lang.String currentWind_speed, int currentFeelslike, int currentVisibility, @org.jetbrains.annotations.NotNull()
    java.lang.String locationCountry, @org.jetbrains.annotations.NotNull()
    java.lang.String locationName, @org.jetbrains.annotations.NotNull()
    java.lang.String locationRegion, @org.jetbrains.annotations.NotNull()
    java.lang.String locationLocaltime, @org.jetbrains.annotations.NotNull()
    java.lang.String locationTimezone_id, long locationLocaltime_epoch, @org.jetbrains.annotations.NotNull()
    java.lang.String requestLanguage) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ImperialCurrentWeather(int currentTemperature, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> currentWeatherIcons, @org.jetbrains.annotations.NotNull()
    java.lang.String currentObservationTime, double currentPrecip, int currentCloudcover, @org.jetbrains.annotations.NotNull()
    java.lang.String currentWind_dir, @org.jetbrains.annotations.NotNull()
    java.lang.String currentWind_speed, int currentFeelslike, int currentVisibility, @org.jetbrains.annotations.NotNull()
    java.lang.String locationCountry, @org.jetbrains.annotations.NotNull()
    java.lang.String locationName, @org.jetbrains.annotations.NotNull()
    java.lang.String locationRegion, @org.jetbrains.annotations.NotNull()
    java.lang.String locationLocaltime, @org.jetbrains.annotations.NotNull()
    java.lang.String locationTimezone_id, long locationLocaltime_epoch, @org.jetbrains.annotations.NotNull()
    java.lang.String requestLanguage) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @java.lang.Override()
    public int getCurrentTemperature() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> getCurrentWeatherIcons() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCurrentObservationTime() {
        return null;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    @java.lang.Override()
    public double getCurrentPrecip() {
        return 0.0;
    }
    
    public final int component5() {
        return 0;
    }
    
    @java.lang.Override()
    public int getCurrentCloudcover() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCurrentWind_dir() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCurrentWind_speed() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    @java.lang.Override()
    public int getCurrentFeelslike() {
        return 0;
    }
    
    public final int component9() {
        return 0;
    }
    
    @java.lang.Override()
    public int getCurrentVisibility() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getLocationCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getLocationName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getLocationRegion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getLocationLocaltime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getLocationTimezone_id() {
        return null;
    }
    
    public final long component15() {
        return 0L;
    }
    
    @java.lang.Override()
    public long getLocationLocaltime_epoch() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getRequestLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override()
    public java.time.ZonedDateTime getZoneTime() {
        return null;
    }
}