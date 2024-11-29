package com.breezefieldflorida.features.nearbyuserlist.api

import com.breezefieldflorida.app.Pref
import com.breezefieldflorida.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefieldflorida.features.newcollection.model.NewCollectionListResponseModel
import com.breezefieldflorida.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}