package com.linkdev.samplekotlinapp.common.helpers

import android.content.Context
import android.preference.PreferenceManager

object AppPreference {


    fun getString(key: String, ctx: Context, defaultValue: String): String? {
        val appPreferences = PreferenceManager.getDefaultSharedPreferences(ctx)
        return appPreferences.getString(key, defaultValue)
    }


    fun clearString(key: String, ctx: Context) {
        val appPreferences = PreferenceManager.getDefaultSharedPreferences(ctx)
        appPreferences.edit().remove(key).apply()
    }

    fun setString(key: String, value: String, ctx: Context) {
        val appPreferences = PreferenceManager.getDefaultSharedPreferences(ctx)
        appPreferences.edit().putString(key, value).apply()
    }

    fun getInteger(key: String, ctx: Context, defaultValue: Int): Int {
        val appPreferences = PreferenceManager.getDefaultSharedPreferences(ctx)
        return appPreferences.getInt(key, defaultValue)
    }


    fun setInteger(key: String, value: Int, ctx: Context) {
        val appPreferences = PreferenceManager.getDefaultSharedPreferences(ctx)
        appPreferences.edit().putInt(key, value).apply()
    }

    fun getBoolean(key: String, ctx: Context, defaultValue: Boolean): Boolean {
        val appPreferences = PreferenceManager.getDefaultSharedPreferences(ctx)
        return appPreferences.getBoolean(key, defaultValue)
    }

    fun setBoolean(key: String, value: Boolean, ctx: Context) {
        val appPreferences = PreferenceManager.getDefaultSharedPreferences(ctx)
        appPreferences.edit().putBoolean(key, value).apply()
    }
}
