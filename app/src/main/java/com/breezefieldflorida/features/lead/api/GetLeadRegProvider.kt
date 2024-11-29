package com.breezefieldflorida.features.lead.api

import com.breezefieldflorida.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefieldflorida.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}