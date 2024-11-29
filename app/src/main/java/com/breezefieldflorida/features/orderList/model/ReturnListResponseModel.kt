package com.breezefieldflorida.features.orderList.model

import com.breezefieldflorida.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}