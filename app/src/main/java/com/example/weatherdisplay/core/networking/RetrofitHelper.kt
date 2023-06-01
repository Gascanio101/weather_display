package com.example.weatherdisplay.core.networking

import android.provider.SyncStateContract
import com.example.weatherdisplay.data.networking.WeatherClient
import com.example.weatherdisplay.data.responses.CurrentWeather
import com.example.weatherdisplay.utils.Utils
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    fun getRetrofit(): WeatherClient {
        return Retrofit.Builder().baseUrl(Utils.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(WeatherClient::class.java)
    }
}