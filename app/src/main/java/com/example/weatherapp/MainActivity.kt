package com.example.weatherapp

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.weatherapp.ui.base.LifeCycleBoundLocationManager
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationResult
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.closestKodein
import org.kodein.di.generic.instance
import java.security.AccessController.getContext

private const val MY_PERMISSION_ACCESS_COARSE_LOCATION = 1
class MainActivity() : AppCompatActivity(), KodeinAware {

    override val kodein by closestKodein()
    private val fusedLocationProviderClient: FusedLocationProviderClient  by instance()

    private val locationCallback = object : LocationCallback(){
        override fun onLocationResult(p0: LocationResult) {
            super.onLocationResult(p0)
        }
    }

    private lateinit var navController: NavController
      lateinit var bottom_nav: BottomNavigationView
         lateinit var toolbar_bar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        toolbar_bar = findViewById(R.id.toolbar_bar)
        bottom_nav = findViewById(R.id.bottom_nav)
        setSupportActionBar(toolbar_bar)
        navController = Navigation.findNavController(this,R.id.nav_host_fragment)

            bottom_nav.setupWithNavController(navController)

        NavigationUI.setupActionBarWithNavController(this,navController)
        requestLoctionPermission()
        if(hasLocationPermission()){
            bindLocationManager()
        }else{
            requestLoctionPermission()
        }
    }

    private fun bindLocationManager() {

        LifeCycleBoundLocationManager(this,fusedLocationProviderClient,locationCallback)
    }

    private fun hasLocationPermission():Boolean{
        return ContextCompat.checkSelfPermission(this,
        android.Manifest.permission.ACCESS_COARSE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED
    }

    private fun requestLoctionPermission() {

        ActivityCompat.requestPermissions(
            this, arrayOf(android.Manifest.permission.ACCESS_COARSE_LOCATION),
            MY_PERMISSION_ACCESS_COARSE_LOCATION
        )
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController,null)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if(requestCode == MY_PERMISSION_ACCESS_COARSE_LOCATION){
           if(grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)
               bindLocationManager()
           else
               Toast.makeText(this,"Please, set location manually in settings",Toast.LENGTH_LONG).show()
       }
    }
}