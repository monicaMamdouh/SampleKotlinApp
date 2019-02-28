package com.linkdev.samplekotlinapp.data.remote

import com.linkdev.samplekotlinapp.data.models.News
import com.linkdev.samplekotlinapp.data.models.repsonses.NewsResponse
import com.linkdev.samplekotlinapp.data.repository.NewsRepository
import retrofit2.Response
import retrofit2.http.GET
import rx.Observable

interface IRemoteDataSource {

    @GET("en/api/v01/safe/GetNews")
    fun getUsersFromApi() : Observable<Response<NewsResponse>>
}