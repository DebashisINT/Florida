package com.breezefieldflorida.features.location.ideallocapi

import com.breezefieldflorida.base.BaseResponse
import com.breezefieldflorida.features.location.model.IdealLocationInputParams
import io.reactivex.Observable

/**
 * Created by Saikat on 05-02-2019.
 */
class IdealLocationRepo(val apiService: IdealLocationApi) {
    fun idealLocation(idealLoc: IdealLocationInputParams?): Observable<BaseResponse> {
        return apiService.submitIdealLocation(idealLoc)
    }
}