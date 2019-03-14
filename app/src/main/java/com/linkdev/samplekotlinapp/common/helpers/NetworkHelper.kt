package com.linkdev.samplekotlinapp.common.helpers

import android.content.Context

object NetworkHelper {

    fun checkConnectivity(context: Context): Boolean {
        return Utilities.checkConnection(context)
    }
}