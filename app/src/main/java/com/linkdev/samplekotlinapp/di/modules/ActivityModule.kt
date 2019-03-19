package com.linkdev.samplekotlinapp.di.modules

import com.linkdev.samplekotlinapp.ui.news.NewsActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityModule {
    @ContributesAndroidInjector
    internal abstract fun provideNewsActivity(): NewsActivity
}