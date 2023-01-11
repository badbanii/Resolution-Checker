package com.abetterandroid.resolutionchecker.ui.settings

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.abetterandroid.resolutionchecker.R
import com.abetterandroid.resolutionchecker.databinding.FragmentSettingsBinding
import com.suddenh4x.ratingdialog.AppRating
import kotlin.system.exitProcess

class SettingsFragment : Fragment(R.layout.fragment_settings) {

    private var _binding: FragmentSettingsBinding? = null

    private val binding: FragmentSettingsBinding
        get() = _binding!!

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSettingsBinding.bind(view)
        buttonFunctions()
    }

    private fun buttonFunctions()
    {
        binding.buttonQuit.setOnClickListener {
            closeApp()
        }
        binding.buttonBack.setOnClickListener {
            findNavController().navigateUp()
        }
        binding.buttonMoreApps.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/dev?id=8049005269403185530")
                )
            )
        }
        binding.buttonRate.setOnClickListener {
            AppRating.Builder(requireActivity()).showNow()
        }
        binding.buttonShare.setOnClickListener {
            showSharingDialog()
        }
    }

    private fun showSharingDialog() {
        val intent = Intent()
        intent.action = Intent.ACTION_SEND
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, "Download Resolution Checker:\nhttps://play.google.com/store/apps/details?id=com.theviciousgames.dpimodifier")
        startActivity(Intent.createChooser(intent, "Share with:"))
    }
    private fun closeApp()
    {
        ActivityCompat.finishAffinity(requireActivity())
        requireActivity().finish()
        exitProcess(0)
    }
}