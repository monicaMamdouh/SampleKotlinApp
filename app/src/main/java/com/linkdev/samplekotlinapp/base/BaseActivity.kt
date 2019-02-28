package com.linkdev.samplekotlinapp.base

import android.annotation.SuppressLint
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.linkdev.samplekotlinapp.R

@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity() {


    internal fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
                .replace(R.id.containerFragment, fragment)
                .commit()
    }
}
