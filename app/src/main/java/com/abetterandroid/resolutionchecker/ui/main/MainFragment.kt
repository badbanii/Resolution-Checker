package com.abetterandroid.resolutionchecker.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.abetterandroid.resolutionchecker.R
import com.abetterandroid.resolutionchecker.databinding.FragmentMainBinding
import com.abetterandroid.resolutionchecker.databinding.FragmentSettingsBinding

class MainFragment: Fragment(R.layout.fragment_settings)  {
    private var _binding: FragmentSettingsBinding? = null
    private val binding: FragmentSettingsBinding
        get() = _binding!!

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSettingsBinding.bind(view)}
}