package com.abetterandroid.resolutionchecker.ui.welcome

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.abetterandroid.resolutionchecker.R
import com.abetterandroid.resolutionchecker.R.layout
import com.abetterandroid.resolutionchecker.databinding.FragmentWelcomeBinding
import com.xcode.onboarding.OnBoardingPage


class WelcomeFragment : Fragment(layout.fragment_welcome) {

    private var _binding: FragmentWelcomeBinding? = null
    private val viewModel: WelcomeFragmentViewModel by viewModels()
    private val pages: MutableList<OnBoardingPage> = ArrayList()

    private val binding: FragmentWelcomeBinding
        get() = _binding!!

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentWelcomeBinding.bind(view)
     //   checkIfUserIsOld()


    }

    private fun checkIfUserIsOld()
    {
        if(!viewModel.getUserIsOld())
        {
            navigateToMainFragment()
        }
    }

    private fun navigateToMainFragment()
    {
        findNavController().navigate(R.id.action_welcomeFragment_to_mainFragment)
    }
}