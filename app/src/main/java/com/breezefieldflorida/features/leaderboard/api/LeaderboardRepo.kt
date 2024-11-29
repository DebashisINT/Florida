package com.breezefieldflorida.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezefieldflorida.app.FileUtils
import com.breezefieldflorida.app.Pref
import com.breezefieldflorida.base.BaseResponse
import com.breezefieldflorida.features.addshop.model.AddLogReqData
import com.breezefieldflorida.features.addshop.model.AddShopRequestData
import com.breezefieldflorida.features.addshop.model.AddShopResponse
import com.breezefieldflorida.features.addshop.model.LogFileResponse
import com.breezefieldflorida.features.addshop.model.UpdateAddrReq
import com.breezefieldflorida.features.contacts.CallHisDtls
import com.breezefieldflorida.features.contacts.CompanyReqData
import com.breezefieldflorida.features.contacts.ContactMasterRes
import com.breezefieldflorida.features.contacts.SourceMasterRes
import com.breezefieldflorida.features.contacts.StageMasterRes
import com.breezefieldflorida.features.contacts.StatusMasterRes
import com.breezefieldflorida.features.contacts.TypeMasterRes
import com.breezefieldflorida.features.dashboard.presentation.DashboardActivity
import com.breezefieldflorida.features.login.model.WhatsappApiData
import com.breezefieldflorida.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}