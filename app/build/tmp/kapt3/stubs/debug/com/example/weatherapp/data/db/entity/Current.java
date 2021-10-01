package com.example.weatherapp.data.db.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002Bw\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010 \u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010$\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010\'\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010(\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0080\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020\u0004H\u00d6\u0001J\t\u0010/\u001a\u00020\u0007H\u00d6\u0001R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001a\u0010\u0012R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001b\u0010\u0012R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016\u00a8\u00060"}, d2 = {"Lcom/example/weatherapp/data/db/entity/Current;", "", "()V", "temperature", "", "weather_icons", "", "", "observation_time", "precip", "", "cloudcover", "wind_dir", "wind_speed", "feelslike", "visibility", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCloudcover", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFeelslike", "getObservation_time", "()Ljava/lang/String;", "getPrecip", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTemperature", "getVisibility", "getWeather_icons", "()Ljava/util/List;", "getWind_dir", "getWind_speed", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/example/weatherapp/data/db/entity/Current;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Current {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer temperature = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "weather_icons")
    private final java.util.List<java.lang.String> weather_icons = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "observation_time")
    private final java.lang.String observation_time = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "precip")
    private final java.lang.Double precip = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "cloudcover")
    private final java.lang.Integer cloudcover = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "wind_dir")
    private final java.lang.String wind_dir = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "wind_speed")
    private final java.lang.String wind_speed = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "feelslike")
    private final java.lang.Integer feelslike = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "visibility")
    private final java.lang.Integer visibility = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.data.db.entity.Current copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer temperature, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> weather_icons, @org.jetbrains.annotations.Nullable()
    java.lang.String observation_time, @org.jetbrains.annotations.Nullable()
    java.lang.Double precip, @org.jetbrains.annotations.Nullable()
    java.lang.Integer cloudcover, @org.jetbrains.annotations.Nullable()
    java.lang.String wind_dir, @org.jetbrains.annotations.Nullable()
    java.lang.String wind_speed, @org.jetbrains.annotations.Nullable()
    java.lang.Integer feelslike, @org.jetbrains.annotations.Nullable()
    java.lang.Integer visibility) {
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
    
    public Current(@org.jetbrains.annotations.Nullable()
    java.lang.Integer temperature, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> weather_icons, @org.jetbrains.annotations.Nullable()
    java.lang.String observation_time, @org.jetbrains.annotations.Nullable()
    java.lang.Double precip, @org.jetbrains.annotations.Nullable()
    java.lang.Integer cloudcover, @org.jetbrains.annotations.Nullable()
    java.lang.String wind_dir, @org.jetbrains.annotations.Nullable()
    java.lang.String wind_speed, @org.jetbrains.annotations.Nullable()
    java.lang.Integer feelslike, @org.jetbrains.annotations.Nullable()
    java.lang.Integer visibility) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTemperature() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getWeather_icons() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getObservation_time() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPrecip() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCloudcover() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWind_dir() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWind_speed() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFeelslike() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getVisibility() {
        return null;
    }
    
    public Current() {
        super();
    }
}