package com.example.weatherdisplay.data.networking

import com.example.weatherdisplay.data.responses.CurrentWeather
import com.example.weatherdisplay.data.responses.DailyForecast
import com.example.weatherdisplay.data.responses.HourlyForecast
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherClient {
    @GET("CurrentWeather_ENDPOINT_HERE")
    suspend fun getCurrentWeather(@Query("api_key") api_key: String): Response<CurrentWeather>

    @GET("DailyForecast_ENDPOINT_HERE")
    suspend fun getDailyForecast(@Query("api_key")api_key: String): Response<DailyForecast>

    @GET("HourlyForecast_ENDPOINT_HERE")
    suspend fun getHourlyForecast(@Query("api_key")api_key: String): Response<HourlyForecast>
}