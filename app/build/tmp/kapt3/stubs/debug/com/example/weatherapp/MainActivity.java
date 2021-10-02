package com.example.weatherapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\"H\u0002J\u0012\u0010#\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J-\u0010&\u001a\u00020 2\u0006\u0010\'\u001a\u00020(2\u000e\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0*2\u0006\u0010,\u001a\u00020-H\u0016\u00a2\u0006\u0002\u0010.J\b\u0010/\u001a\u00020\"H\u0016J\b\u00100\u001a\u00020 H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u00061"}, d2 = {"Lcom/example/weatherapp/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lorg/kodein/di/KodeinAware;", "()V", "bottom_nav", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "getBottom_nav", "()Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "setBottom_nav", "(Lcom/google/android/material/bottomnavigation/BottomNavigationView;)V", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getFusedLocationProviderClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "fusedLocationProviderClient$delegate", "Lkotlin/Lazy;", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "kodein$delegate", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "navController", "Landroidx/navigation/NavController;", "toolbar_bar", "Landroidx/appcompat/widget/Toolbar;", "getToolbar_bar", "()Landroidx/appcompat/widget/Toolbar;", "setToolbar_bar", "(Landroidx/appcompat/widget/Toolbar;)V", "bindLocationManager", "", "hasLocationPermission", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onSupportNavigateUp", "requestLoctionPermission", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements org.kodein.di.KodeinAware {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy kodein$delegate = null;
    private final kotlin.Lazy fusedLocationProviderClient$delegate = null;
    private final com.google.android.gms.location.LocationCallback locationCallback = null;
    private androidx.navigation.NavController navController;
    public com.google.android.material.bottomnavigation.BottomNavigationView bottom_nav;
    public androidx.appcompat.widget.Toolbar toolbar_bar;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.Kodein getKodein() {
        return null;
    }
    
    private final com.google.android.gms.location.FusedLocationProviderClient getFusedLocationProviderClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.bottomnavigation.BottomNavigationView getBottom_nav() {
        return null;
    }
    
    public final void setBottom_nav(@org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomnavigation.BottomNavigationView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.Toolbar getToolbar_bar() {
        return null;
    }
    
    public final void setToolbar_bar(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void bindLocationManager() {
    }
    
    private final boolean hasLocationPermission() {
        return false;
    }
    
    private final void requestLoctionPermission() {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.kodein.di.KodeinContext<?> getKodeinContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.kodein.di.KodeinTrigger getKodeinTrigger() {
        return null;
    }
}