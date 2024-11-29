package com.breezefieldflorida.features.mylearning.apiCall

import com.breezefieldflorida.base.BaseResponse
import com.breezefieldflorida.features.addshop.presentation.Crash_Report_Save
import io.reactivex.Observable

class LMSRepo(val apiService: LMSApi) {

    fun saveCrashReportToServer(mCrash_Report_Save: Crash_Report_Save): Observable<BaseResponse> {
        return apiService.saveCrashReportToServer(mCrash_Report_Save)
    }
}