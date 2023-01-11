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

class OnBoarding3Fragment : Fragment(R.layout.fragment_onboarding_1) {

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

    private fun navigateToMainScreen()
    {
        findNavController().navigate(R.id.action_onBoarding3Fragment_to_mainFragment)
    }

    private fun setUserIsOld()
    {
        viewModel.setUserIsOld()
    }


    private fun updateUi()
    {
        with(binding)
        {
            textviewTitle.text="Our website is waiting for you!"
            textviewDescription.text="www.aBetterAndroid.com\nIf you're curious enough\n\uD83E\uDD14"
            animationView.setAnimation(R.raw.lottie_website)
            animationView.scaleType=ImageView.ScaleType.CENTER_CROP
            buttonNext.setOnClickListener {
                setUserIsOld()
                navigateToMainScreen()
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