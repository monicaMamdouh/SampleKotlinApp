package com.linkdev.samplekotlinapp.di

import android.app.Application
import android.content.Context
import com.linkdev.samplekotlinapp.data.remote.IRemoteDataSource
import com.linkdev.samplekotlinapp.data.remote.RemoteDataSource
import com.linkdev.samplekotlinapp.data.repository.NewsRepository
import com.linkdev.samplekotlinapp.utils.BASE_URL
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
class AppModule {

    var mApplication: Application? = null

    constructor(application: Application) {

        mApplication = application
    }


    @Provides
    fun providesAppContext(): Context {
        return mApplication!!
    }

    @Provides
    @Singleton
    fun providesRemoteService(): IRemoteDataSource {
        return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(IRemoteDataSource::class.java!!)
    }

    @Provides
    @Singleton
    fun providesRemoteDataSource(remoteService: IRemoteDataSource): RemoteDataSource {
        return RemoteDataSource(remoteService)
    }

    @Provides
    @Singleton
    fun providesNewsRepository(remoteDataSource: RemoteDataSource): NewsRepository {

        return NewsRepository(remoteDataSource)
    }
}