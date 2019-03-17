package com.linkdev.samplekotlinapp.ui.news

import com.linkdev.samplekotlinapp.base.BaseViewModel
import com.linkdev.samplekotlinapp.data.repository.INewsRepository
import javax.inject.Inject
import android.media.AudioManager
import com.linkdev.samplekotlinapp.data.repository.NewsRepository


class NewsViewModel: BaseViewModel() {

    private val TAG: String? = "NewsViewModel"

    lateinit var mNewsRepository: NewsRepository

//    @Inject
//    fun NewsViewModel(mNewsRepository: NewsRepository){
//        this.mNewsRepository = mNewsRepository
//
//    }
//



//      fun getNews()= mNewsRepository.getNewsFromApi()

}