package com.abetterandroid.resolutionchecker.ui.welcome

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.abetterandroid.resolutionchecker.R
import com.abetterandroid.resolutionchecker.databinding.FragmentOnboarding1Binding

class OnBoarding2Fragment : Fragment(R.layout.fragment_onboarding_1) {

    private var _binding: FragmentOnboarding1Binding? = null
    private val viewModel: OnBoardingViewModel by viewModels()

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

    private fun navigateToThirdOnBoardingScreen()
    {
        findNavController().navigate(R.id.action_onBoarding2Fragment_to_onBoarding3Fragment)
    }

    private fun updateUi()
    {
        with(binding)
        {
            textviewTitle.text="Check out our other apps!"
            textviewDescription.text="Are you looking to change your dpi or resolution? Visit us by pressing on the 'more' button!\naBetterAndroid has everything you need."
            animationView.setAnimation(R.raw.lottie_more)
            animationView.scaleType=ImageView.ScaleType.CENTER_CROP
            buttonNext.setOnClickListener {
                navigateToThirdOnBoardingScreen()
            }
            buttonMoreApps.visibility=View.VISIBLE
            buttonMoreApps.setOnClickListener {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://play.google.com/store/apps/dev?id=8049005269403185530")
                    )
                )
            }
        }
    }
}