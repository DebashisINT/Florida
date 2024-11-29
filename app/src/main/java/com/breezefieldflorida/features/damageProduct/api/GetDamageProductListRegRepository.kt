package com.breezefieldflorida.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezefieldflorida.app.FileUtils
import com.breezefieldflorida.base.BaseResponse
import com.breezefieldflorida.features.NewQuotation.model.*
import com.breezefieldflorida.features.addshop.model.AddShopRequestData
import com.breezefieldflorida.features.addshop.model.AddShopResponse
import com.breezefieldflorida.features.damageProduct.model.DamageProductResponseModel
import com.breezefieldflorida.features.damageProduct.model.delBreakageReq
import com.breezefieldflorida.features.damageProduct.model.viewAllBreakageReq
import com.breezefieldflorida.features.login.model.userconfig.UserConfigResponseModel
import com.breezefieldflorida.features.myjobs.model.WIPImageSubmit
import com.breezefieldflorida.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}