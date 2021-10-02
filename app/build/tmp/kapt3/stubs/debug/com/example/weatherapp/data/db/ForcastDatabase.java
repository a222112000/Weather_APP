package com.example.weatherapp.data.db;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.example.weatherapp.data.db.StringListConverter.class})
@androidx.room.Database(entities = {com.example.weatherapp.data.db.entity.WeatherApi.class}, version = 4, exportSchema = true)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/example/weatherapp/data/db/ForcastDatabase;", "Landroidx/room/RoomDatabase;", "()V", "currentWeatherDao", "Lcom/example/weatherapp/data/db/dao/CurrentWeatherDAO;", "weatherLocationDao", "Lcom/example/weatherapp/data/db/dao/LocationWeatherDao;", "Companion", "app_debug"})
public abstract class ForcastDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.weatherapp.data.db.ForcastDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile com.example.weatherapp.data.db.ForcastDatabase instance;
    private static final java.lang.Object LOCK = null;
    
    public ForcastDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.weatherapp.data.db.dao.CurrentWeatherDAO currentWeatherDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.weatherapp.data.db.dao.LocationWeatherDao weatherLocationDao();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0011\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/weatherapp/data/db/ForcastDatabase$Companion;", "", "()V", "LOCK", "instance", "Lcom/example/weatherapp/data/db/ForcastDatabase;", "buildDatabase", "context", "Landroid/content/Context;", "invoke", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.weatherapp.data.db.ForcastDatabase invoke(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final com.example.weatherapp.data.db.ForcastDatabase buildDatabase(android.content.Context context) {
            return null;
        }
    }
}