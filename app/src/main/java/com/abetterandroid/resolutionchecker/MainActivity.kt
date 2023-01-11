package com.abetterandroid.resolutionchecker

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.google.firebase.analytics.FirebaseAnalytics
import com.suddenh4x.ratingdialog.AppRating
import com.suddenh4x.ratingdialog.preferences.RatingThreshold
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private var firebaseAnalytics: FirebaseAnalytics? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFirebase()
        forceDayMode()
        keepScreenAwake()

        if (savedInstanceState == null) {
            rateApp()
        }
    }
    private fun initFirebase()
    {
        firebaseAnalytics = FirebaseAnalytics.getInstance(this);
    }
    private fun forceDayMode() {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }

    private fun keepScreenAwake() {
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
    }

    private fun rateApp() {
        AppRating.Builder(this)
            .setMinimumLaunchTimes(5)
            .setMinimumDays(3)
            .setMinimumLaunchTimesToShowAgain(5)
            .setMinimumDaysToShowAgain(5)
            .setRatingThreshold(RatingThreshold.FOUR)
            .showIfMeetsConditions()
    }
}