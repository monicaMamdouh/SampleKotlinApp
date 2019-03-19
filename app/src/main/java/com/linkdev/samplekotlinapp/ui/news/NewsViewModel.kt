package com.linkdev.samplekotlinapp.ui.news

import com.linkdev.samplekotlinapp.base.BaseViewModel
import com.linkdev.samplekotlinapp.data.repository.NewsRepository
import dagger.multibindings.IntKey
import javax.inject.Inject


class NewsViewModel @Inject constructor(val mNewsRepository: NewsRepository) : BaseViewModel() {

    private val TAG: String? = "NewsViewModel"


     fun getNews()=mNewsRepository.getNewsFromApi()

}