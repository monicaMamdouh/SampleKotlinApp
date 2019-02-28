package com.linkdev.samplekotlinapp.data.remote

import com.linkdev.samplekotlinapp.data.models.News
import com.linkdev.samplekotlinapp.data.models.repsonses.NewsResponse
import com.linkdev.samplekotlinapp.data.repository.NewsRepository
import retrofit2.Response
import rx.Observable

class RemoteDataSource constructor(private val remoteService: IRemoteDataSource) {

    fun getUsersFromApi() : Observable<Response<NewsResponse>> = remoteService.getUsersFromApi()

}