package com.linkdev.samplekotlinapp.di.modules

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.linkdev.samplekotlinapp.base.BaseViewModelFactory
import com.linkdev.samplekotlinapp.di.utils.ViewModelKey
import com.linkdev.samplekotlinapp.ui.news.NewsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.Provides
import java.security.Provider


@Suppress("unused")
@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: BaseViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(NewsViewModel::class)
    abstract fun bindNewsViewModel(newsViewModel: NewsViewModel): ViewModel


}
