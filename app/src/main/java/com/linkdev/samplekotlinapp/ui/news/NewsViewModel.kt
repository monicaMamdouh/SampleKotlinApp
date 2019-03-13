package com.linkdev.samplekotlinapp.ui.news

import com.linkdev.samplekotlinapp.base.BaseViewModel
import com.linkdev.samplekotlinapp.data.repository.INewsRepository
import com.linkdev.samplekotlinapp.utils.SampleKotlinApplication
import javax.inject.Inject

class NewsViewModel : BaseViewModel() {

    private val TAG: String? = "NewsViewModel"

    @Inject
    lateinit var mRepositoryDataSource: INewsRepository

    init {

//        SampleKotlinApplication.ma.inject(this)
    }


    /**
     * Get users from database
     */
//      fun getNews()= mRepositoryDataSource.getNewsFromApi()

}