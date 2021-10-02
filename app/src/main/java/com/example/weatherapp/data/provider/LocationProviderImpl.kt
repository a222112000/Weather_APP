package com.example.weatherapp.data.provider

import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.content.ContextCompat
import com.example.weatherapp.data.db.entity.Location
import com.example.weatherapp.data.db.unitLocalized.MetricCurrentWeatherEntry
import com.example.weatherapp.data.network.ApiService
import com.example.weatherapp.internal.LocationPermissionNotGrantedException
import com.example.weatherapp.internal.asDeferred
import com.google.android.gms.location.FusedLocationProviderClient
import kotlinx.coroutines.Deferred
import java.util.jar.Manifest

const val USE_DEVICE_LOCATION = "USE_DEVICE_LOCATION"
const val CUSTOM_LOCATION = "CUSTOM_LOCATION"
class LocationProviderImpl(
    private val fusedLocationProviderClient: FusedLocationProviderClient,
    context: Context) : PreferenceProvider(context) ,LocationProvider {
//    override suspend fun hasLocationChange(lastWeatherLocation: ApiService): Boolean {
//        return true
//    }
    private val appContext = context.applicationContext
    override suspend fun hasLocationChange(lastWeatherLocation: MetricCurrentWeatherEntry): Boolean {
        val deviceLocation = try {
            hasDeviceLocationChanged(lastWeatherLocation)
        }catch (e: LocationPermissionNotGrantedException){
            false
        }
        return deviceLocation || hasCustomeLocationChanged(lastWeatherLocation)
    }

    override suspend fun getPreferredLocationString(): String {
        if(isUsingDeviceLocation()){
            try {
                val deviceLocation = getLastDeviceLocation().await()
                    ?: return "${getCustomLocationName()}"
                return "${deviceLocation.latitude},${deviceLocation.longitude}"
            }catch (e:LocationPermissionNotGrantedException){
                return "${getCustomLocationName()}"
            }
        }else
            return "${getCustomLocationName()}"
    }
    private suspend fun hasDeviceLocationChanged(lastWeatherLocation: MetricCurrentWeatherEntry):Boolean
    {
        if(!isUsingDeviceLocation())
            return false
        val deviceLocation = getLastDeviceLocation().await()
            ?: return false
        val comparisonThreshold =  0.03
        return Math.abs(deviceLocation.latitude - lastWeatherLocation.locationLat) > comparisonThreshold &&
                Math.abs(deviceLocation.longitude - lastWeatherLocation.locationLat) > comparisonThreshold

    }

    private fun isUsingDeviceLocation():Boolean{
        return preferences.getBoolean(USE_DEVICE_LOCATION,true)
    }
    private fun hasCustomeLocationChanged(lastWeatherLocation: MetricCurrentWeatherEntry):Boolean{
        val customLocation = getCustomLocationName()
        return customLocation != lastWeatherLocation.locationName
    }
    private fun getCustomLocationName(): String?{
        return preferences.getString(CUSTOM_LOCATION,null)
    }
    @SuppressLint("MissingPermission")
    private fun getLastDeviceLocation(): Deferred<android.location.Location>{
        return if(hasLocationPermission())
            fusedLocationProviderClient.lastLocation.asDeferred()
        else
            throw LocationPermissionNotGrantedException()
    }
    private fun hasLocationPermission(): Boolean{
        return ContextCompat.checkSelfPermission(appContext,android.Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED
    }
}