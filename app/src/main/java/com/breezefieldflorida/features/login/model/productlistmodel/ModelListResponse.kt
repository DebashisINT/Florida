package com.breezefieldflorida.features.login.model.productlistmodel

import com.breezefieldflorida.app.domain.ModelEntity
import com.breezefieldflorida.app.domain.ProductListEntity
import com.breezefieldflorida.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}