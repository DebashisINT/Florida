package com.breezefieldflorida.features.survey.api

import com.breezefieldflorida.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefieldflorida.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}