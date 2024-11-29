package com.breezefieldflorida.features.activities.api

import com.breezefieldflorida.features.member.api.TeamApi
import com.breezefieldflorida.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}