package com.breezefieldflorida.features.viewAllOrder.interf

import com.breezefieldflorida.app.domain.NewOrderProductEntity
import com.breezefieldflorida.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}