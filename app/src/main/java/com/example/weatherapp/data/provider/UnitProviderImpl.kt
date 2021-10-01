package com.example.weatherapp.data.provider

import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import com.example.weatherapp.internal.UnitSystem

class UnitProviderImpl(context: Context) : UnitProvider {
    private val appContext = context.applicationContext
    val UNIT_SYSTEM = "UNIT_SYSTEM"
    private val preferences: SharedPreferences
        get() = PreferenceManager.getDefaultSharedPreferences(appContext)
    override fun getUnitSystem(): UnitSystem {
        val selectNAme = preferences.getString(UNIT_SYSTEM,UnitSystem.METRIC.name)
        return UnitSystem.valueOf(selectNAme!!)
    }
}