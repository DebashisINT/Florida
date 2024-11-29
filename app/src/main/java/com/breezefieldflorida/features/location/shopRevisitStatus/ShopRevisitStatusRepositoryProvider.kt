package com.breezefieldflorida.features.location.shopRevisitStatus

import com.breezefieldflorida.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldflorida.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}