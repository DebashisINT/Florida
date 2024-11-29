package com.breezefieldflorida.features.login.model.opportunitymodel

import com.breezefieldflorida.app.domain.OpportunityStatusEntity
import com.breezefieldflorida.app.domain.ProductListEntity
import com.breezefieldflorida.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}