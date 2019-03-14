package com.linkdev.samplekotlinapp.common.helpers

import android.content.Context
import android.net.ConnectivityManager

object Utilities {
    fun checkConnection(context: Context): Boolean {
        val connectivityManager = (context
                .getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager)
        val activeNetInfo = connectivityManager.activeNetworkInfo
        return activeNetInfo != null && activeNetInfo.isConnected
    }
}