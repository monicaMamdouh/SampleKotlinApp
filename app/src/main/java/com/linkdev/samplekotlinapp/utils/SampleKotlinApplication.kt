package com.linkdev.samplekotlinapp.utils

import android.app.Application
import android.content.Context
import com.linkdev.samplekotlinapp.data.repository.NewsRepository
import com.linkdev.samplekotlinapp.di.AppComponent
import com.linkdev.samplekotlinapp.di.AppModule
import com.linkdev.samplekotlinapp.di.DaggerAppComponent
import javax.inject.Inject

class SampleKotlinApplication : Application() {

    @Inject
    lateinit var mRepositoryDataSource: NewsRepository

    companion object {

        lateinit var mAppComponent: AppComponent
    }

    init {

        initializeDagger()
    }

    override fun onCreate() {
        super.onCreate()

        mAppComponent.inject(this)

        //Get users from api
        //mRepositoryDataSource.getNewsFromApi()
    }

    /**
     * Initialize AppComponent
     */
    fun initializeDagger() {

        mAppComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }

}