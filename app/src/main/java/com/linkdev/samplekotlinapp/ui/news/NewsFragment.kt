package com.linkdev.samplekotlinapp.ui.news


import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.linkdev.samplekotlinapp.R
import com.linkdev.samplekotlinapp.base.BaseFragment
import dagger.android.AndroidInjection
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment_news.*
import javax.inject.Inject

class NewsFragment : BaseFragment() {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val newsViewModel: NewsViewModel by lazy {
        ViewModelProviders.of(this, viewModelFactory).get(NewsViewModel::class.java)

    }
    /*    With Lazy we are going to create it as a non-nullable
     property and will be executed just when you use
     it and just the first time.*/
    private val newsListRecyclerView: RecyclerView by lazy {
        newsRv
    }

    companion object {

        fun newInstance(): NewsFragment = NewsFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = container?.inflate(R.layout.fragment_news)
        initializeViews(view!!)
        setListeners()

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initViewModel()
        setUpAdapter()


    }

    private fun setUpAdapter() {
        //lazy property will be executed here
        newsListRecyclerView.setHasFixedSize(true) // use this setting to improve performance
        newsListRecyclerView.layoutManager = LinearLayoutManager(context)

    }

    override fun setListeners() {
    }

    override fun initializeViews(v: View) {

    }

    override fun initViewModel() {



         //newsViewModel.getNews()

    }



}
