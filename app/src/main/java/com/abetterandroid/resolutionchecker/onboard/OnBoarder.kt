package com.abetterandroid.resolutionchecker.onboard

class OnBoarder {
    /*
    object OnBoarder {
        fun startOnBoarding(
            activity: Activity,
            pages: List<OnBoardingPage?>,
            onFinishClick: OnFinishLastPage?
        ) {
            activity.setContentView(R.layout.activity_onbording)
            activity.window.decorView.systemUiVisibility =
                View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
            if (activity is AppCompatActivity) {
                if (activity.supportActionBar != null) activity.supportActionBar!!.hide()
            } else {
                if (activity.actionBar != null) activity.actionBar!!.hide()
            }
            //val next = activity.findViewById<Button>(R.id.next)
           // val pager = activity.findViewById<ViewPager2>(R.id.viewpager)
            val indicator = activity.findViewById<LinearLayout>(R.id.indicator)
            val adapter = ViewPagerAdapter(pages)
            val dots = arrayOfNulls<TextView>(pages.size)
            for (i in dots.indices) {
                dots[i] = TextView(activity)
                dots[i]!!.text = "•"
                dots[i]!!.textSize = 40f
                indicator.addView(dots[i])
            }
            pager.adapter = adapter
            pager.registerOnPageChangeCallback(object : OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    if (position != 0) dots[position - 1]!!.setTextColor(Color.GRAY)
                    if (position < pages.size - 1) dots[position + 1]!!.setTextColor(Color.GRAY)
                    if (position == pages.size - 1) next.text = "Finish" else next.text = "Next"
                    dots[position]!!.setTextColor(Color.BLUE)
                }
            })
            next.setOnClickListener {
                val currentPage = pager.currentItem
                if (currentPage == pages.size - 1) {
                    if (onFinishClick != null) {
                        onFinishClick.onNext()
                    } else {
                        activity.finish()
                    }
                } else pager.currentItem = currentPage + 1
            }
        }
    }

     */

}