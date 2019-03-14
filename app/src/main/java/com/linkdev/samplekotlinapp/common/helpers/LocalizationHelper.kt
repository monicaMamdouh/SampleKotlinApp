package com.linkdev.samplekotlinapp.common.helpers

import android.content.Context
import android.os.Build
import android.text.TextUtils
import com.linkdev.samplekotlinapp.common.Constants
import java.lang.Exception
import java.util.*

object LocalizationHelper {


    private val DEFAULT_LOCALE = Constants.Languages.ENGLISH_LANGUAGE

    fun getAppLanguage(context: Context): String {
        return if (getLanguage(context).equals(Constants.Languages.ARABIC_LANGUAGE, ignoreCase = true))
            Constants.Languages.ARABIC_LANGUAGE
        else
            Constants.Languages.ENGLISH_LANGUAGE
    }

    fun changeAppLanguage(languageToLoad: String, ctx: Context) {
        val languageToLoad = languageToLoad.toLowerCase()
        try {
            if (!TextUtils.isEmpty(languageToLoad)) {
                val res = ctx.applicationContext.resources
                val config = res.configuration


                val locale = Locale(languageToLoad)
                Locale.setDefault(locale)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                    config.setLocale(locale)
                } else {
                    config.locale = locale
                }


                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
                    ctx.resources.updateConfiguration(config,
                            ctx.resources.displayMetrics)
                }
                AppPreference.setString(Constants.AppPreference.APP_LOCALE_KEY, languageToLoad, ctx)
            }

        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    private fun getLanguage(context: Context): String? {
        // get language from shared preferences
        return AppPreference.getString(Constants.AppPreference.APP_LOCALE_KEY, context, DEFAULT_LOCALE)
    }

    fun getLocale(context: Context): Locale {
        return Locale(getAppLanguage(context))
    }

}
