package com.linkdev.samplekotlinapp.base

import android.annotation.SuppressLint
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProviders
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.support.v7.app.AppCompatActivity
import com.linkdev.samplekotlinapp.R

@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity() {


    fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
                .replace(R.id.containerFragment, fragment)
                .commit()
    }


}
