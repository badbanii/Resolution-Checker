package com.abetterandroid.resolutionchecker.onboard

import android.graphics.Color

class OnBoard {
    private var image = 0
    private var bgColor = 0
    private var txtColor = 0
    private var title: String? = null
    private var description: String? = null

    fun OnBoardingPage(
        image: Int,
        bgColor: Int,
        txtColor: Int,
        title: String?,
        description: String?
    ) {
        this.title = title
        this.bgColor = bgColor
        this.txtColor = txtColor
        this.image = image
        this.description = description
    }

    fun OnBoardingPage(image: Int, title: String?, description: String?) {
        this.title = title
        this.image = image
        bgColor = Color.WHITE
        this.description = description
    }

    fun getBgColor(): Int {
        return bgColor
    }

    fun setBgColor(bgColor: Int) {
        this.bgColor = bgColor
    }

    fun getTxtColor(): Int {
        return txtColor
    }

    fun setTxtColor(txtColor: Int) {
        this.txtColor = txtColor
    }

    fun getImage(): Int {
        return image
    }

    fun setImage(image: Int) {
        this.image = image
    }

    fun getTitle(): String? {
        return title
    }

    fun setTitle(title: String?) {
        this.title = title
    }

    fun getDescription(): String? {
        return description
    }

    fun setDescription(description: String?) {
        this.description = description
    }
}
