package com.linkdev.samplekotlinapp.di.modules

import com.linkdev.samplekotlinapp.data.repository.NewsRepository
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {
    @Provides
    fun provideNewsRepository() = NewsRepository()
}