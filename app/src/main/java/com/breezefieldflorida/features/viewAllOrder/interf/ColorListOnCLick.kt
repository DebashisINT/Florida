package com.breezefieldflorida.features.viewAllOrder.interf

import com.breezefieldflorida.app.domain.NewOrderGenderEntity
import com.breezefieldflorida.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}