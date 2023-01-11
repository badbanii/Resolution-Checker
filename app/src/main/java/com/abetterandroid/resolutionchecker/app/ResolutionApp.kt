package com.abetterandroid.resolutionchecker.app

import android.app.Application
import com.fxn.stash.Stash
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ResolutionApp: Application() {

    override fun onCreate() {
        super.onCreate()
        Stash.init(this)
    }
}