package com.linkdev.samplekotlinapp.base

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import com.linkdev.samplekotlinapp.common.helpers.NetworkHelper

open class BaseViewModel : AndroidViewModel(Application()) {
    protected fun checkConnectivity(): Boolean {
        return NetworkHelper.checkConnectivity(this.getApplication())
    }
}