package com.breezefieldflorida.features.newcollectionreport

import com.breezefieldflorida.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}