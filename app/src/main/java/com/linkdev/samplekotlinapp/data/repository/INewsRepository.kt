package com.linkdev.samplekotlinapp.data.repository

import com.linkdev.samplekotlinapp.common.models.Status
import com.linkdev.samplekotlinapp.data.models.repsonses.NewsResponse
import io.reactivex.Observable
import retrofit2.Response

interface INewsRepository {
    fun getNewsFromApi()
}