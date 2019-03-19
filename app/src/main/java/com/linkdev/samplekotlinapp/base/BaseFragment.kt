package com.linkdev.samplekotlinapp.base


import android.content.Context
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.AndroidSupportInjection


/**
 * A simple [Fragment] subclass.
 *
 */
abstract class BaseFragment : Fragment() {
    protected abstract fun initializeViews(v: View)

    protected abstract fun setListeners()

    protected abstract fun initViewModel()
    //Use extension Functions
    protected fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
        return LayoutInflater.from(context).inflate(layoutId, this, false)
    }

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }


}
