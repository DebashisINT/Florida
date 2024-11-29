package com.breezefieldflorida.features.viewAllOrder.orderOptimized

import com.breezefieldflorida.app.domain.ProductOnlineRateTempEntity
import com.breezefieldflorida.base.BaseResponse
import com.breezefieldflorida.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}