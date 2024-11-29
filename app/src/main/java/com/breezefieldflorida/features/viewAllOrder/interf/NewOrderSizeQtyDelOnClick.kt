package com.breezefieldflorida.features.viewAllOrder.interf

import com.breezefieldflorida.app.domain.NewOrderGenderEntity
import com.breezefieldflorida.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}