package com.linkdev.samplekotlinapp.base

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import com.linkdev.samplekotlinapp.R
import com.linkdev.samplekotlinapp.common.helpers.LocalizationHelper
import com.linkdev.samplekotlinapp.common.wrappers.LocaleContextWrapper
import dagger.android.AndroidInjection
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper
import javax.inject.Inject

@SuppressLint("Registered")
abstract class BaseActivity : AppCompatActivity(), HasSupportFragmentInjector {

    private var toolbar: Toolbar? = null
    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    override fun supportFragmentInjector() = dispatchingAndroidInjector

    protected fun setToolbar(mToolbar: Toolbar, title: String, toolbarBackgroundColor: Int, showUpButton: Boolean, withElevation: Boolean) {
        this.toolbar = mToolbar
        toolbar!!.title = title
        toolbar!!.setBackgroundColor(toolbarBackgroundColor)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            if (withElevation)
                toolbar!!.elevation = 5f
            else
                toolbar!!.elevation = 0f
        }
        setSupportActionBar(toolbar)


        if (showUpButton) {
            val actionBar = supportActionBar
            actionBar?.setDisplayHomeAsUpEnabled(true)
        }
    }

    protected fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
                .replace(R.id.containerFragment, fragment)
                .commit()
    }


    //TODO remove calligraphy
    override fun attachBaseContext(newBase: Context) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            val contextWrapper = LocaleContextWrapper.wrap(newBase, LocalizationHelper.getAppLanguage(newBase))
            super.attachBaseContext(CalligraphyContextWrapper.wrap(contextWrapper))
        } else {
            super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState)
    }


    protected abstract fun initializeViews()

    protected abstract fun setListeners()

}
