package com.breezefieldflorida.features.viewAllOrder.interf

import com.breezefieldflorida.app.domain.NewOrderGenderEntity
import com.breezefieldflorida.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}