package com.breezefieldflorida.features.location.api

import com.breezefieldflorida.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldflorida.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}