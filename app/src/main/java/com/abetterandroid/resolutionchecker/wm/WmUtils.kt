package com.abetterandroid.resolutionchecker.wm

import android.app.Activity
import android.graphics.Point
import android.util.DisplayMetrics

class WmUtils {
    fun getResolution(activity: Activity): String {
        val displayMetrics = DisplayMetrics()
        activity.windowManager.defaultDisplay.getMetrics(displayMetrics)
        val height = displayMetrics.heightPixels
        val width = displayMetrics.widthPixels

        return height.toString() + "x" + width
    }

    fun getRealResolution(activity: Activity): String {
        val size = Point()
        val display = activity.windowManager.defaultDisplay
        display.getRealSize(size)
        val realWidth = size.x
        val realHeight = size.y

        return realHeight.toString() + "x" + realWidth
    }

    fun getBarsSize(activity: Activity): String {
        val displayMetrics = DisplayMetrics()
        activity.windowManager.defaultDisplay.getMetrics(displayMetrics)
        val height = displayMetrics.heightPixels
        val size = Point()
        val display = activity.windowManager.defaultDisplay
        display.getRealSize(size)
        val realHeight = size.y
        val difference = realHeight - height

        return difference.toString()
    }
}