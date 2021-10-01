package com.example.weatherapp.data.db.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "current_weather")
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B3\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\nH\u00c6\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001f"}, d2 = {"Lcom/example/weatherapp/data/db/entity/WeatherApi;", "", "()V", "id", "", "current", "Lcom/example/weatherapp/data/db/entity/Current;", "location", "Lcom/example/weatherapp/data/db/entity/Location;", "request", "Lcom/example/weatherapp/data/db/entity/Request;", "(ILcom/example/weatherapp/data/db/entity/Current;Lcom/example/weatherapp/data/db/entity/Location;Lcom/example/weatherapp/data/db/entity/Request;)V", "getCurrent", "()Lcom/example/weatherapp/data/db/entity/Current;", "getId", "()I", "getLocation", "()Lcom/example/weatherapp/data/db/entity/Location;", "getRequest", "()Lcom/example/weatherapp/data/db/entity/Request;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class WeatherApi {
    @androidx.room.PrimaryKey(autoGenerate = false)
    private final int id = 0;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded(prefix = "current_")
    private final com.example.weatherapp.data.db.entity.Current current = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded(prefix = "location_")
    private final com.example.weatherapp.data.db.entity.Location location = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded(prefix = "request_")
    private final com.example.weatherapp.data.db.entity.Request request = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.data.db.entity.WeatherApi copy(@androidx.annotation.NonNull()
    int id, @org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.db.entity.Current current, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.NonNull()
    com.example.weatherapp.data.db.entity.Location location, @org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.db.entity.Request request) {
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
    
    public WeatherApi(@androidx.annotation.NonNull()
    int id, @org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.db.entity.Current current, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.NonNull()
    com.example.weatherapp.data.db.entity.Location location, @org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.db.entity.Request request) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.data.db.entity.Current component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.data.db.entity.Current getCurrent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.data.db.entity.Location component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.data.db.entity.Location getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.data.db.entity.Request component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.data.db.entity.Request getRequest() {
        return null;
    }
    
    public WeatherApi() {
        super();
    }
}