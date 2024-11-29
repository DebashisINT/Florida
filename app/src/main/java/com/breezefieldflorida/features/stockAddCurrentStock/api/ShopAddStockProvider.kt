package com.breezefieldflorida.features.stockAddCurrentStock.api

import com.breezefieldflorida.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldflorida.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}