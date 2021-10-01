package com.example.weatherapp.weather.current;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 V2\u00020\u00012\u00020\u0002:\u0001VB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u00102\u001a\u000203H\u0002J\u0018\u00104\u001a\u0002052\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u000205H\u0002J\u0012\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J&\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010A2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u001a\u0010B\u001a\u0002092\u0006\u0010C\u001a\u00020=2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u0010\u0010D\u001a\u0002092\u0006\u0010E\u001a\u000205H\u0002J\u0010\u0010F\u001a\u0002092\u0006\u0010G\u001a\u000205H\u0002J\u0010\u0010H\u001a\u0002092\u0006\u0010I\u001a\u000205H\u0002J\u0010\u0010J\u001a\u0002092\u0006\u0010K\u001a\u00020LH\u0002J\u0018\u0010M\u001a\u0002092\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020OH\u0002J\u0010\u0010Q\u001a\u0002092\u0006\u0010R\u001a\u00020OH\u0002J\u0018\u0010S\u001a\u0002092\u0006\u0010T\u001a\u0002052\u0006\u0010U\u001a\u000205H\u0002R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR\u001c\u0010%\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b\'\u0010\u001bR\u001c\u0010(\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR\u000e\u0010+\u001a\u00020,X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010-\u001a\u00020.8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b1\u0010\u0015\u001a\u0004\b/\u00100\u00a8\u0006W"}, d2 = {"Lcom/example/weatherapp/weather/current/CurrentWeatherFragment;", "Lcom/example/weatherapp/ui/base/ScopedFragment;", "Lorg/kodein/di/KodeinAware;", "()V", "group_loading", "Landroidx/constraintlayout/widget/Group;", "getGroup_loading", "()Landroidx/constraintlayout/widget/Group;", "setGroup_loading", "(Landroidx/constraintlayout/widget/Group;)V", "img", "Landroid/widget/ImageView;", "getImg", "()Landroid/widget/ImageView;", "setImg", "(Landroid/widget/ImageView;)V", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "kodein$delegate", "Lkotlin/Lazy;", "text_condition", "Landroid/widget/TextView;", "getText_condition", "()Landroid/widget/TextView;", "setText_condition", "(Landroid/widget/TextView;)V", "text_feel", "getText_feel", "setText_feel", "text_percipitation", "getText_percipitation", "setText_percipitation", "text_temp", "getText_temp", "setText_temp", "text_visibility", "getText_visibility", "setText_visibility", "text_wind_dir", "getText_wind_dir", "setText_wind_dir", "viewModel", "Lcom/example/weatherapp/weather/current/CurrentWeatherViewModel;", "viewModelFactory", "Lcom/example/weatherapp/weather/current/CurrentWeatherViewModelFactory;", "getViewModelFactory", "()Lcom/example/weatherapp/weather/current/CurrentWeatherViewModelFactory;", "viewModelFactory$delegate", "binUI", "Lkotlinx/coroutines/Job;", "chooseLocalizedUnitAbbreviation", "", "metric", "imperial", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "updateCondition", "condition", "updateDateToday", "title", "updateLocation", "location", "updatePrecipitation", "percipitationVolume", "", "updateTemp", "temp", "", "feelslike", "updateVisibility", "visi", "updateWind", "windDir", "WindSpeed", "Companion", "app_debug"})
public final class CurrentWeatherFragment extends com.example.weatherapp.ui.base.ScopedFragment implements org.kodein.di.KodeinAware {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy kodein$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.constraintlayout.widget.Group group_loading;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView text_temp;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView text_feel;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView text_condition;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView text_percipitation;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView text_wind_dir;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView text_visibility;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ImageView img;
    private final kotlin.Lazy viewModelFactory$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.weatherapp.weather.current.CurrentWeatherFragment.Companion Companion = null;
    private com.example.weatherapp.weather.current.CurrentWeatherViewModel viewModel;
    
    public CurrentWeatherFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.Kodein getKodein() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.constraintlayout.widget.Group getGroup_loading() {
        return null;
    }
    
    public final void setGroup_loading(@org.jetbrains.annotations.Nullable()
    androidx.constraintlayout.widget.Group p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getText_temp() {
        return null;
    }
    
    public final void setText_temp(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getText_feel() {
        return null;
    }
    
    public final void setText_feel(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getText_condition() {
        return null;
    }
    
    public final void setText_condition(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getText_percipitation() {
        return null;
    }
    
    public final void setText_percipitation(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getText_wind_dir() {
        return null;
    }
    
    public final void setText_wind_dir(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getText_visibility() {
        return null;
    }
    
    public final void setText_visibility(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ImageView getImg() {
        return null;
    }
    
    public final void setImg(@org.jetbrains.annotations.Nullable()
    android.widget.ImageView p0) {
    }
    
    private final com.example.weatherapp.weather.current.CurrentWeatherViewModelFactory getViewModelFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final kotlinx.coroutines.Job binUI() {
        return null;
    }
    
    private final java.lang.String chooseLocalizedUnitAbbreviation(java.lang.String metric, java.lang.String imperial) {
        return null;
    }
    
    private final void updateLocation(java.lang.String location) {
    }
    
    private final void updateDateToday(java.lang.String title) {
    }
    
    private final void updateTemp(int temp, int feelslike) {
    }
    
    private final void updateCondition(java.lang.String condition) {
    }
    
    private final void updatePrecipitation(double percipitationVolume) {
    }
    
    private final void updateWind(java.lang.String windDir, java.lang.String WindSpeed) {
    }
    
    private final void updateVisibility(int visi) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.kodein.di.KodeinContext<?> getKodeinContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.kodein.di.KodeinTrigger getKodeinTrigger() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/weatherapp/weather/current/CurrentWeatherFragment$Companion;", "", "()V", "newInstance", "Lcom/example/weatherapp/weather/current/CurrentWeatherFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.weatherapp.weather.current.CurrentWeatherFragment newInstance() {
            return null;
        }
    }
}