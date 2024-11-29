package com.breezefieldflorida.features.viewAllOrder.model

import com.breezefieldflorida.app.domain.NewOrderColorEntity
import com.breezefieldflorida.app.domain.NewOrderGenderEntity
import com.breezefieldflorida.app.domain.NewOrderProductEntity
import com.breezefieldflorida.app.domain.NewOrderSizeEntity
import com.breezefieldflorida.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

