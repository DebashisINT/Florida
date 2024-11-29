package com.breezefieldflorida.features.viewAllOrder.interf

import com.breezefieldflorida.app.domain.NewOrderColorEntity
import com.breezefieldflorida.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}