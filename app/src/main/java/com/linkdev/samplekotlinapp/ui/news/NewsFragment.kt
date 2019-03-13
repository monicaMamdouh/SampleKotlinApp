package com.linkdev.samplekotlinapp.ui.news


import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.linkdev.samplekotlinapp.R
import com.linkdev.samplekotlinapp.base.BaseFragment
import javax.inject.Inject


class NewsFragment : BaseFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    lateinit var newsViewModel: NewsViewModel


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initViewModel()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news, container, false)
    }

    companion object {

        fun newInstance(): NewsFragment = NewsFragment()
    }

    private fun initViewModel() {
        newsViewModel = ViewModelProviders.of(this, viewModelFactory)
                .get(NewsViewModel::class.java)
//        newsViewModel.get/**/


    }


}
