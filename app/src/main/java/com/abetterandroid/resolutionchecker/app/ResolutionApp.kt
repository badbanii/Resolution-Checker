package com.abetterandroid.resolutionchecker.app

import android.app.Application
import com.fxn.stash.Stash

class ResolutionApp: Application() {

    override fun onCreate() {
        super.onCreate()
        Stash.init(this)
    }
}