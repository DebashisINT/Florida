package com.breezefieldflorida.features.weather.api

import com.breezefieldflorida.features.task.api.TaskApi
import com.breezefieldflorida.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}