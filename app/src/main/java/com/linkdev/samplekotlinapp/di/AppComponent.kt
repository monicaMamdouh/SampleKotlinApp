package com.linkdev.samplekotlinapp.di

import com.linkdev.samplekotlinapp.ui.news.NewsViewModel
import com.linkdev.samplekotlinapp.utils.SampleKotlinApplication
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

     fun inject(viewModel: NewsViewModel)

    fun inject(sampleKotlinApplication: SampleKotlinApplication)
}