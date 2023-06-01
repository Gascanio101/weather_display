package com.example.weatherdisplay.core.viewmodel

import android.app.Application
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherdisplay.core.networking.RetrofitHelper
import com.example.weatherdisplay.data.responses.CurrentWeather
import com.example.weatherdisplay.utils.Utils
import kotlinx.coroutines.launch
import retrofit2.Retrofit

class AppViewModel(app: Application): AndroidViewModel(app) {

    private val _currentWeatherList: MutableState<List<CurrentWeather>> =
        mutableStateOf(listOf())
    val currentWeatherList = _currentWeatherList

    fun fetchCurrentWeather() {
        viewModelScope.launch {
            val response = RetrofitHelper.getRetrofit().getCurrentWeather(api_key = Utils.API_KEY)
            if (response.isSuccessful) {
//                _currentWeatherList.value = response.body()
            }
        }
    }

}