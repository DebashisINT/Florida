package com.breezefieldflorida.features.location.shopRevisitStatus

import com.breezefieldflorida.base.BaseResponse
import com.breezefieldflorida.features.location.model.ShopDurationRequest
import com.breezefieldflorida.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}