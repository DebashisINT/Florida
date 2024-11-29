package com.breezefieldflorida.features.newcollection.model

import com.breezefieldflorida.app.domain.CollectionDetailsEntity
import com.breezefieldflorida.base.BaseResponse
import com.breezefieldflorida.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}