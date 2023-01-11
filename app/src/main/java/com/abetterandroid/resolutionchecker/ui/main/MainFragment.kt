package com.abetterandroid.resolutionchecker.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.abetterandroid.resolutionchecker.R
import com.abetterandroid.resolutionchecker.databinding.FragmentMainBinding

class MainFragment: Fragment(R.layout.fragment_main)  {
    private var _binding: FragmentMainBinding? = null
    private val binding: FragmentMainBinding
        get() = _binding!!

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)}
}