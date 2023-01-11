package com.abetterandroid.resolutionchecker.ui.welcome

import androidx.lifecycle.ViewModel
import com.abetterandroid.resolutionchecker.ui.utils.Constants
import com.fxn.stash.Stash

class WelcomeFragmentViewModel: ViewModel() {

    fun setUserIsOld()
    {
        Stash.put(Constants.USER_IS_OLD,true)
    }

    fun getUserIsOld():Boolean
    {
        return Stash.getBoolean(Constants.USER_IS_OLD,false)
    }
}