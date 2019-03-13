package com.linkdev.samplekotlinapp.utils

import android.app.Application
import com.linkdev.samplekotlinapp.di.components.AppComponent
import com.linkdev.samplekotlinapp.di.components.DaggerAppComponent
import com.linkdev.samplekotlinapp.di.modules.AppModule

class SampleKotlinApplication : Application() {


    lateinit var mAppComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        mAppComponent = DaggerAppComponent.builder()
                .appModule(AppModule())
                .build()
    }


}