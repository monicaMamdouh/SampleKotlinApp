package com.linkdev.samplekotlinapp

import com.linkdev.samplekotlinapp.common.helpers.FontManager
import com.linkdev.samplekotlinapp.di.components.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication


class SampleKotlinApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().sampleApplicationBind(this).build()

    }


    override fun onCreate() {
        super.onCreate()
        FontManager.initAppFonts(applicationContext)
    }


}