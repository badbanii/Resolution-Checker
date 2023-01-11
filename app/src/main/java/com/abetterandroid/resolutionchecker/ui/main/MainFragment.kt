package com.abetterandroid.resolutionchecker.ui.main

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.abetterandroid.resolutionchecker.R
import com.abetterandroid.resolutionchecker.databinding.FragmentMainBinding
import com.abetterandroid.resolutionchecker.utils.Type
import dagger.hilt.android.AndroidEntryPoint
import es.dmoral.toasty.Toasty

@AndroidEntryPoint
class MainFragment: Fragment(R.layout.fragment_main)  {
    private var _binding: FragmentMainBinding? = null
    private val viewModel: MainFragmentViewModel by viewModels()
    private val binding: FragmentMainBinding
        get() = _binding!!

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)
        setDeviceSpecs()
        updateUi()
        buttonFunctions()
    }

    private fun buttonFunctions() {
        with(binding){
            buttonRefresh.setOnClickListener {
                updateUi()
                Toasty.info(requireActivity(), "Updated.", Toast.LENGTH_SHORT, true).show();
            }
            buttonRealResolution.setOnClickListener {
                setType(Type.RealResolution)
                updateUi()
            }
            buttonResolution.setOnClickListener {
                setType(Type.Resolution)
                updateUi()
            }
            buttonBars.setOnClickListener {
                setType(Type.Bars)
                updateUi()
            }
        }
    }

    private fun setType(type: Type)
    {
        viewModel.setTypeOfResolution(type)
    }
    private fun setDeviceSpecs()
    {
        with(binding){
            textviewManufacturer.text=viewModel.getManufacturer()
            textviewModel.text=viewModel.getModel()
        }
    }
    private fun updateUi()
    {
        with(binding)
        {
            textviewManufacturer.text=viewModel.getManufacturer()
            textviewModel.text=viewModel.getModel()

            when(viewModel.type)
            {
                Type.RealResolution->
                {
                    textviewCurrentResolution.text=viewModel.getRealResolution(requireActivity())
                    textviewCurrentResolutionType.text="Real Resolution"
                    textviewTypeInformation.text="Size of the display without subtracting any window decor (status bar,navigation bar) or applying any compatibility scale factors."
                }
                Type.Resolution->
                {
                    textviewCurrentResolution.text=viewModel.getResolution(requireActivity())
                    textviewCurrentResolutionType.text="Resolution"
                    textviewTypeInformation.text="Size of the display subtracting window decors (status bar,navigation bar)."
                }
                Type.Bars->
                {
                    textviewCurrentResolution.text=viewModel.getBarsSize(requireActivity())
                    textviewCurrentResolutionType.text="Bars Vertical Pixels"
                    textviewTypeInformation.text="Size of the window decors displayed in vertical pixels (status bar,navigation bar)."
                }
            }
        }
    }
}