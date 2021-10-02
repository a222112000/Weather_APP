package com.example.weatherapp.weather.current

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.Group
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.example.weatherapp.R
import com.example.weatherapp.data.ConnectivityIntercepterImpl
import com.example.weatherapp.data.network.ApiService
import com.example.weatherapp.data.network.WeatherNetworkDataSourceImpl
import com.example.weatherapp.internal.GlideImage
import com.example.weatherapp.ui.base.ScopedFragment
import com.squareup.picasso.Picasso
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import okhttp3.Dispatcher
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.closestKodein
import org.kodein.di.generic.instance

class CurrentWeatherFragment : ScopedFragment(), KodeinAware {
    override val kodein by closestKodein()

    var group_loading: Group?=null
    var text_temp : TextView?=null
    var text_feel: TextView?=null
    var text_condition: TextView?=null
    var text_percipitation: TextView?=null
    var text_wind_dir:TextView?=null
    var text_visibility: TextView?=null
    var img: ImageView?=null
    private val viewModelFactory: CurrentWeatherViewModelFactory by instance()

    companion object {
        fun newInstance() = CurrentWeatherFragment()
    }

    private lateinit var viewModel: CurrentWeatherViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.current_weather_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        text_temp = view.findViewById(R.id.textView_temperature)
        group_loading = view.findViewById(R.id.group_loading)
        text_feel = view.findViewById(R.id.textview_feels_like_temperature)
        text_condition = view.findViewById(R.id.text_condition)
        text_percipitation = view.findViewById(R.id.percipetation)
        text_wind_dir = view.findViewById(R.id.text_wind)
        text_wind_dir = view.findViewById(R.id.text_wind)
        text_visibility = view.findViewById(R.id.text_visibility)
        img = view.findViewById(R.id.weatherImage)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this,viewModelFactory).get(CurrentWeatherViewModel::class.java)

        binUI()
//        val apiService= ApiService(ConnectivityIntercepterImpl(this.requireContext()))
//        val weatherNetworkDataSource = WeatherNetworkDataSourceImpl(apiService)
//        weatherNetworkDataSource.downloadedCurrentWeather.observe(viewLifecycleOwner, Observer {
//            textCurrent?.text = it.request.toString()
//        })
//        CoroutineScope(IO).launch{
//            withContext(Main) {
//              //  val weatherApi = apiService.getCurrentWeather("London").await()
//                //textCurrent?.text = weatherApi.request.toString()
//                weatherNetworkDataSource.fetchCurrentWeather("London","en")
//            }
//        }
    }
    private fun binUI()= launch {
        val currentWeather = viewModel.weather.await()

        currentWeather.observe(viewLifecycleOwner, Observer {
                return@Observer
               // updateLocation(it.locationName)
        })

        currentWeather.observe(viewLifecycleOwner, Observer {
            if(it == null) return@Observer
            group_loading?.visibility = View.GONE

            updateDateToday(it.locationRegion+" "+it.locationName)
            updateTemp(it.currentTemperature,it.currentFeelslike)
            updateCondition(it.currentWeather_descriptions[0].toString())
            updatePrecipitation(it.currentPrecip)
            updateWind(it.currentWind_dir,it.currentWind_speed)
            updateVisibility(it.currentVisibility)

//           Glide.with(this@CurrentWeatherFragment)
//
//               .load("${it.currentWeatherIcons[0].toString()}")
//               .into(img!!)
            Picasso.get()
                .load("${it.currentWeatherIcons[0].toString()}")
                .into(img)

        })
    }
    private fun chooseLocalizedUnitAbbreviation(metric: String, imperial: String): String{
        return if(viewModel.isMetric) "°C" else "°F"
    }
    private fun updateLocation(location: String){
        (activity as? AppCompatActivity)?.supportActionBar?.setTitle(location)
    }
    private fun updateDateToday(title:String){
        (activity as? AppCompatActivity)?.supportActionBar?.setTitle("$title \n Today")
    }
private fun updateTemp(temp:Int,feelslike:Int){
    val unitAbbreviation = chooseLocalizedUnitAbbreviation("°C","°F")
    text_temp?.text = "$temp$unitAbbreviation"
    text_feel?.text = "Feels like $feelslike$unitAbbreviation"

}
   private fun updateCondition(condition: String){
       text_condition?.text = condition.toString()
   }
    private fun updatePrecipitation(percipitationVolume: Double){
        val unitAbbreviation = chooseLocalizedUnitAbbreviation("mm","in")
        text_percipitation?.text = "Percipitation: $percipitationVolume $unitAbbreviation"
    }
    private fun updateWind(windDir: String, WindSpeed: String){
        val unitAbbreviation = chooseLocalizedUnitAbbreviation("kph","mph")
           text_wind_dir?.text = "Wind: $windDir, $WindSpeed $unitAbbreviation"
    }
    private fun updateVisibility(visi:Int){
        val unitAbbre = chooseLocalizedUnitAbbreviation("km","mi")
         text_visibility?.text = "Visibility: $visi $unitAbbre"
    }

}