package com.abetterandroid.resolutionchecker.ui.welcome

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.abetterandroid.resolutionchecker.R
import com.abetterandroid.resolutionchecker.databinding.FragmentOnboarding1Binding

class OnBoarding1Fragment : Fragment(R.layout.fragment_onboarding_1) {

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
        navigateToMainScreenIfUserIsOld()
        updateUi()
    }

    private fun navigateToSecondOnBoardingScreen()
    {
        findNavController().navigate(R.id.action_onBoarding1Fragment_to_onBoarding2Fragment)
    }

    private fun navigateToMainScreen()
    {
        findNavController().navigate(R.id.action_onBoarding1Fragment_to_mainFragment)
    }

    private fun navigateToMainScreenIfUserIsOld()
    {
        if(viewModel.getUserIsOld())
        {
            navigateToMainScreen()
        }
    }

    private fun updateUi()
    {
        with(binding)
        {
            textviewTitle.text="Check your resolution"
            textviewDescription.text="If you're wondering what is your current resolution, then you're lucky.\n Lets us know in a review what you got!"

            buttonNext.setOnClickListener {
               navigateToSecondOnBoardingScreen()
            }
        }
    }
}