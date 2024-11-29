package com.breezefieldflorida.features.document.api

import com.breezefieldflorida.features.dymanicSection.api.DynamicApi
import com.breezefieldflorida.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}