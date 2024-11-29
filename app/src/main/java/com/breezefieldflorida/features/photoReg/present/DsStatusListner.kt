package com.breezefieldflorida.features.photoReg.present

import com.breezefieldflorida.app.domain.ProspectEntity
import com.breezefieldflorida.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}