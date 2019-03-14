package com.linkdev.samplekotlinapp.base


import android.support.v4.app.Fragment
import android.view.View


/**
 * A simple [Fragment] subclass.
 *
 */
abstract class BaseFragment : Fragment() {
    protected abstract fun initializeViews(v: View)

    protected abstract fun setListeners()

    protected abstract fun initViewModel()


}
