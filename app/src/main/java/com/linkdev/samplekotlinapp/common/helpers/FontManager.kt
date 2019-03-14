package com.linkdev.samplekotlinapp.common.helpers

import android.content.Context
import uk.co.chrisjenx.calligraphy.CalligraphyConfig
import uk.co.chrisjenx.calligraphy.R

internal object FontManager {

    fun initAppFonts(context: Context) {

        CalligraphyConfig.initDefault(CalligraphyConfig.Builder()
                .setDefaultFontPath("")
                .setFontAttrId(R.attr.fontPath)
                .build())
    }
}
