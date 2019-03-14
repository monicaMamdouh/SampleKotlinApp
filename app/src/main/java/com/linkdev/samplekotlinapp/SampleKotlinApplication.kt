package com.linkdev.samplekotlinapp

import android.app.Application
import com.linkdev.samplekotlinapp.common.helpers.FontManager
import com.linkdev.samplekotlinapp.di.components.AppComponent
import com.linkdev.samplekotlinapp.di.components.DaggerAppComponent
import com.linkdev.samplekotlinapp.di.modules.AppModule

class SampleKotlinApplication : Application() {


    lateinit var mAppComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        FontManager.initAppFonts(applicationContext)
        mAppComponent = DaggerAppComponent.builder()
                .appModule(AppModule())
                .build()
    }


}