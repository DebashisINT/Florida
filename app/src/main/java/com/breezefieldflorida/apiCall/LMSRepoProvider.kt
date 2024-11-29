package com.breezefieldflorida.features.mylearning.apiCall

import com.breezefieldflorida.features.login.api.opportunity.OpportunityListApi
import com.breezefieldflorida.features.login.api.opportunity.OpportunityListRepo

object LMSRepoProvider {
    fun getTopicList(): LMSRepo {
        return LMSRepo(LMSApi.create())
    }
}