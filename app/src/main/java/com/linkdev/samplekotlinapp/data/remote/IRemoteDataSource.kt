package com.linkdev.samplekotlinapp.data.remote

import com.linkdev.samplekotlinapp.data.models.repsonses.NewsResponse
import io.reactivex.Observable
import retrofit2.Response
import retrofit2.http.GET

interface IRemoteDataSource {

    @GET("en/api/v01/safe/GetNews")
    fun getUsersFromApi() : Observable<Response<NewsResponse>>
}