package com.abetterandroid.resolutionchecker.ui.main

import android.app.Activity
import android.os.Build
import androidx.lifecycle.ViewModel
import com.abetterandroid.resolutionchecker.wm.WmUtils
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainFragmentViewModel @Inject constructor(
    private val wmUtils: WmUtils
): ViewModel() {



    fun getResolution(activity: Activity):String
    {
        return wmUtils.getResolution(activity)
    }

    fun getRealResolution(activity: Activity):String
    {
        return wmUtils.getRealResolution(activity)
    }

    fun getBarsSize(activity: Activity):String
    {
        return wmUtils.getBarsSize(activity)
    }

     fun getModel():String {
        return Build.MODEL
    }

     fun getManufacturer():String{
        return Build.MANUFACTURER
    }
}