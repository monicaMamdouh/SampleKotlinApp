package com.linkdev.samplekotlinapp.ui.news

import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.Observer
import com.linkdev.samplekotlinapp.base.BaseViewModel
import com.linkdev.samplekotlinapp.data.models.News
import com.linkdev.samplekotlinapp.data.repository.NewsRepository
import com.linkdev.samplekotlinapp.utils.SampleKotlinApplication
import javax.inject.Inject

class NewsViewModel : BaseViewModel(), LifecycleObserver {

    private val TAG: String? = "NewsViewModel"

    @Inject
    lateinit var mRepositoryDataSource: NewsRepository

    init {

        SampleKotlinApplication.mAppComponent.inject(this)
    }


    /**
     * Get users from database
     */
      fun getNews()= mRepositoryDataSource.getNewsFromApi()

}