package com.breezefieldflorida.features.login.api.productlistapi

import com.breezefieldflorida.app.NetworkConstant
import com.breezefieldflorida.app.domain.ProductListEntity
import com.breezefieldflorida.base.BaseResponse
import com.breezefieldflorida.features.login.model.productlistmodel.ProductListOfflineResponseModel
import com.breezefieldflorida.features.login.model.productlistmodel.ProductListOfflineResponseModelNew
import com.breezefieldflorida.features.login.model.productlistmodel.ProductListResponseModel
import com.breezefieldflorida.features.login.model.productlistmodel.ProductRateListResponseModel
import com.breezefieldflorida.features.orderITC.GetOrderHistory
import com.breezefieldflorida.features.orderITC.GetProductRateReq
import com.breezefieldflorida.features.orderITC.GetProductReq
import com.breezefieldflorida.features.orderITC.SyncOrd
import com.breezefieldflorida.features.viewAllOrder.orderOptimized.ProductRateOnlineListResponseModel
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * Created by Saikat on 20-11-2018.
 */
interface ProductListApi {
    @FormUrlEncoded
    @POST("ProductList/List")
    fun getProductList(@Field("session_token") session_token: String, @Field("user_id") user_id: String, @Field("last_update_date") last_update_date: String): Observable<ProductListResponseModel>


    @FormUrlEncoded
    @POST("ProductList/ProductRate")
    fun getProductRateList(@Field("session_token") session_token: String, @Field("user_id") user_id: String, @Field("shop_id") shop_id: String): Observable<ProductRateListResponseModel>

    @FormUrlEncoded
    @POST("ProductList/ProductRate")
    fun getProductRateOnlineList(@Field("session_token") session_token: String, @Field("user_id") user_id: String, @Field("shop_id") shop_id: String): Observable<ProductRateOnlineListResponseModel>


    @FormUrlEncoded
    @POST("ProductList/OfflineProductRate")
    fun getOfflineProductRateList(@Field("session_token") session_token: String, @Field("user_id") user_id: String): Observable<ProductListOfflineResponseModel>

    @FormUrlEncoded
    @POST("ProductList/OfflineProductRate")
    fun getOfflineProductRateListNew(@Field("session_token") session_token: String, @Field("user_id") user_id: String): Observable<ProductListOfflineResponseModelNew>

    @POST("ITCOrderWithProductDetail/ITCOrderWithProductDetailSave")
    fun syncProductListITC(@Body addOrder: SyncOrd): Observable<BaseResponse>

    @FormUrlEncoded
    @POST("ProductList/ITCProdMastList")
    fun getProductListITC(@Field("session_token") session_token: String, @Field("user_id") user_id: String): Observable<GetProductReq>

    @FormUrlEncoded
    @POST("ProductList/ITCProdRateList")
    fun getProductRateListITC(@Field("session_token") session_token: String, @Field("user_id") user_id: String): Observable<GetProductRateReq>

    @FormUrlEncoded
    @POST("ITCOrderWithProductDetail/ITCListForOrderedProduct")
    fun getOrderHistoryApi( @Field("user_id") user_id: String): Observable<GetOrderHistory>


    /**
     * Companion object to create the GithubApiService
     */
    companion object Factory {
        fun create(): ProductListApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOut())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.BASE_URL)
                    .build()

            return retrofit.create(ProductListApi::class.java)
        }
    }
}