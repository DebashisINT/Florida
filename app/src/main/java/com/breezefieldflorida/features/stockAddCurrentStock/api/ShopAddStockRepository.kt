package com.breezefieldflorida.features.stockAddCurrentStock.api

import com.breezefieldflorida.base.BaseResponse
import com.breezefieldflorida.features.location.model.ShopRevisitStatusRequest
import com.breezefieldflorida.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldflorida.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezefieldflorida.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezefieldflorida.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}