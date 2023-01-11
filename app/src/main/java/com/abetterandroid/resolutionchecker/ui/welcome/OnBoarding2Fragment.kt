package com.abetterandroid.resolutionchecker.ui.welcome

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.abetterandroid.resolutionchecker.R
import com.abetterandroid.resolutionchecker.databinding.FragmentOnboarding1Binding

class OnBoarding2Fragment : Fragment(R.layout.fragment_onboarding_1) {

    private var _binding: FragmentOnboarding1Binding? = null

    private val binding: FragmentOnboarding1Binding
        get() = _binding!!

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentOnboarding1Binding.bind(view)
        updateUi()
    }

    private fun updateUi()
    {
        with(binding)
        {
            textviewTitle.text="Check our other apps too!"
            textviewDescription.text="Are you looking to change your dpi or resolution? Visit us by pressing on the 'more' button!"
            animationView.setAnimation(R.raw.lottie_more)
            animationView.scaleType=ImageView.ScaleType.CENTER_CROP
            buttonNext.setOnClickListener {
                findNavController().navigate(R.id.action_onBoarding1Fragment_to_onBoarding2Fragment)
            }
            buttonMoreApps.visibility=View.VISIBLE
        }

    }
}