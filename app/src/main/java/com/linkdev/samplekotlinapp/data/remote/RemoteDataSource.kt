package com.linkdev.samplekotlinapp.data.remote

import com.linkdev.samplekotlinapp.data.models.repsonses.NewsResponse
import io.reactivex.Observable
import retrofit2.Response

class RemoteDataSource(private val remoteService: IRemoteDataSource) {


    fun getUsersFromApi(): Observable<Response<NewsResponse>> = remoteService.getUsersFromApi()

}