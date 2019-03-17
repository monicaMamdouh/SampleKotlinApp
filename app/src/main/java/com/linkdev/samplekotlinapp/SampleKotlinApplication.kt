package com.linkdev.samplekotlinapp

import android.app.Application
import com.linkdev.samplekotlinapp.common.helpers.FontManager
import com.linkdev.samplekotlinapp.di.components.DaggerAppComponent

class SampleKotlinApplication : Application() {


    override fun onCreate() {
        super.onCreate()
        FontManager.initAppFonts(applicationContext)
        DaggerAppComponent.builder()
                .sampleApplicationBind(this)
                .build()
                .inject(this)

    }


}