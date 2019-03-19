package com.linkdev.samplekotlinapp.di.modules

import com.linkdev.samplekotlinapp.ui.news.NewsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {
    @ContributesAndroidInjector
    internal abstract fun provideNewsFragment():NewsFragment
}