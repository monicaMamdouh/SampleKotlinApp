package com.linkdev.samplekotlinapp.base

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.linkdev.samplekotlinapp.R
import com.linkdev.samplekotlinapp.common.helpers.LocalizationHelper
import com.linkdev.samplekotlinapp.common.wrappers.LocaleContextWrapper
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper

@SuppressLint("Registered")
abstract class BaseActivity : AppCompatActivity() {

    private var toolbar: Toolbar? = null

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

    //Use extension Functions
    protected fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
        return LayoutInflater.from(context).inflate(layoutId, this, false)
    }

    override fun attachBaseContext(newBase: Context) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            val contextWrapper = LocaleContextWrapper.wrap(newBase, LocalizationHelper.getAppLanguage(newBase))
            super.attachBaseContext(CalligraphyContextWrapper.wrap(contextWrapper))
        } else {
            super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase))
        }
    }


    protected abstract fun initializeViews()

    protected abstract fun setListeners()

}
