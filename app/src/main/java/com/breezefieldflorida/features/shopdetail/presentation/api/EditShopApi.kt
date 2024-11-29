package com.breezefieldflorida.features.shopdetail.presentation.api

import com.breezefieldflorida.app.NetworkConstant
import com.breezefieldflorida.base.BaseResponse
import com.breezefieldflorida.features.addshop.model.AddShopRequestData
import com.breezefieldflorida.features.addshop.model.AddShopResponse
import com.breezefieldflorida.features.addshop.model.LogFileResponse
import com.breezefieldflorida.features.addshop.model.UpdateAddrReq
import com.breezefieldflorida.features.addshop.model.UpdateAddressShop
import com.breezefieldflorida.features.contacts.AutoMailDtls
import com.breezefieldflorida.features.contacts.CallHisDtls
import com.breezefieldflorida.features.contacts.CompanyReqData
import com.breezefieldflorida.features.contacts.ContactMasterRes
import com.breezefieldflorida.features.contacts.DateRangeResponse
import com.breezefieldflorida.features.contacts.SourceMasterRes
import com.breezefieldflorida.features.contacts.StageMasterRes
import com.breezefieldflorida.features.contacts.StatusMasterRes
import com.breezefieldflorida.features.contacts.TargetAcvhParam
import com.breezefieldflorida.features.contacts.TargetAcvhResponse
import com.breezefieldflorida.features.contacts.TargetLevelResponse
import com.breezefieldflorida.features.contacts.TargetTypeResponse
import com.breezefieldflorida.features.contacts.TypeMasterRes
import com.breezefieldflorida.features.login.model.WhatsappApiData
import com.breezefieldflorida.features.login.model.WhatsappApiFetchData
import io.reactivex.Observable
import okhttp3.MultipartBody
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

/**
 * Created by Saikat on 10-10-2018.
 */
interface EditShopApi {

    @POST("Shoplist/EditShop")
    fun editShop(@Body addShop: AddShopRequestData?): Observable<AddShopResponse>

    @POST("WhatsAppMessageInfo/WhatsAppMsgSave")
    fun whatsAppStatusSyncApi(@Body addShop: WhatsappApiData?): Observable<BaseResponse>

    @FormUrlEncoded
    @POST("WhatsAppMessageInfo/WhatsAppMsgList")
    fun whatsAppStatusFetchApi(@Field("user_id") user_id: String): Observable<WhatsappApiFetchData>

    @Multipart
    @POST("ShopRegistration/NewShopEdit")
    fun editShopWithDegImage(@Query("data") addShop: String, @Part deg_img_data: MultipartBody.Part?): Observable<AddShopResponse>


    @Multipart
    @POST("ShopRegistration/EditShop")
    fun editShopWithImage(@Query("data") addShop: String, @Part logo_img_data: MultipartBody.Part?): Observable<AddShopResponse>

    @Multipart
    @POST("APPLogFilesDetection/APPLogFilesSave")
    fun logshareFile(@Query("data") userId: String, @Part attachments: MultipartBody.Part?): Observable<LogFileResponse>

    @FormUrlEncoded
    @POST("CRMContactInfo/CRMCompanyList")
    fun callCompanyMasterApi(@Field("session_token") session_token: String): Observable<ContactMasterRes>

    @FormUrlEncoded
    @POST("CRMContactInfo/CRMCompanySave")
    fun saveCompanyMasterApi(@Field("session_token") session_token: String,@Field("created_by") created_by: String,@Field("company_name") company_name: String): Observable<BaseResponse>

    @POST("CRMContactInfo/CRMCompanySave")
    fun saveCompanyMasterApiNw(@Body addShop: CompanyReqData?): Observable<BaseResponse>

    @FormUrlEncoded
    @POST("CRMContactInfo/CRMTypeList")
    fun callTypeMasterApi(@Field("session_token") session_token: String): Observable<TypeMasterRes>


    @FormUrlEncoded
    @POST("CRMContactInfo/CRMStatusList")
    fun callStatusMasterApi(@Field("session_token") session_token: String): Observable<StatusMasterRes>


    @FormUrlEncoded
    @POST("CRMContactInfo/CRMSourceList")
    fun callSourceMasterApi(@Field("session_token") session_token: String): Observable<SourceMasterRes>

    @FormUrlEncoded
    @POST("CRMContactInfo/CRMStageList")
    fun callStageMasterApi(@Field("session_token") session_token: String): Observable<StageMasterRes>


    @POST("CallLogInformations/CallLogListSave")
    fun callLogListSaveApi(@Body callLogHisSave: CallHisDtls?): Observable<BaseResponse>

    @POST("Shoplist/ITCShopAddressEdit")
    fun callUpdateAddressSaveApi(@Body updateAddrReq: UpdateAddrReq?): Observable<BaseResponse>

    @FormUrlEncoded
    @POST("CallLogInformations/CallLogList")
    fun callCallListHisAPI(@Field("user_id") user_id: String): Observable<CallHisDtls>

    @FormUrlEncoded
    @POST("SendAutoMail/SendAutoMailInfo")
    fun autoMailDtlsAPI(@Field("user_id") user_id: String): Observable<AutoMailDtls>

    @FormUrlEncoded
    @POST("TAInfoDetails/TargetTypeLists")
    fun targetTypeAPI(@Field("user_id") user_id: String): Observable<TargetTypeResponse>

    @FormUrlEncoded
    @POST("TAInfoDetails/TargetLevelLists")
    fun targetLevelAPI(@Field("user_id") user_id: String): Observable<TargetLevelResponse>

    @FormUrlEncoded
    @POST("TAInfoDetails/TargetTimeFrameLists")
    fun dateRangeAPI(@Field("user_id") user_id: String): Observable<DateRangeResponse>

    @POST("TAInfoDetails/FetchTargetAchievementDetails")
    fun targetAchvDtlsAPI(@Body obj: TargetAcvhParam): Observable<TargetAcvhResponse>

    /**
     * Companion object to create the GithubApiService
     */
    companion object Factory {
        fun create(): EditShopApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOut())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.ADD_SHOP_BASE_URL)
                    .build()

            return retrofit.create(EditShopApi::class.java)
        }

        fun createWithoutMultipart(): EditShopApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOut())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.BASE_URL)
                    .build()

            return retrofit.create(EditShopApi::class.java)
        }
    }
}