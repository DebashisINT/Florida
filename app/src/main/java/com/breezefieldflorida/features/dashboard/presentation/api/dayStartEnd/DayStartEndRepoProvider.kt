package com.breezefieldflorida.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldflorida.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefieldflorida.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}