package com.breezefieldflorida.features.weather.api

import com.breezefieldflorida.base.BaseResponse
import com.breezefieldflorida.features.task.api.TaskApi
import com.breezefieldflorida.features.task.model.AddTaskInputModel
import com.breezefieldflorida.features.weather.model.ForeCastAPIResponse
import com.breezefieldflorida.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}