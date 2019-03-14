package com.linkdev.samplekotlinapp.ui.news

import android.os.Bundle
import com.linkdev.samplekotlinapp.R
import com.linkdev.samplekotlinapp.base.BaseActivity

class NewsActivity : BaseActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
        replaceFragment(NewsFragment.newInstance())
    }
    override fun initializeViews() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setListeners() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
