package com.example.a27thandroidjoint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setViewPager()
        setBottomNavigation()
        tabAndSlideView()
    }


    fun setViewPager(){
        viewpager_main.adapter = MainViewPagerAdapter(supportFragmentManager)
        viewpager_main.offscreenPageLimit = 2
    }

    fun setBottomNavigation(){
        bottom_navigation_main.setOnNavigationItemSelectedListener {
            var index by Delegates.notNull<Int>()
            when (it.itemId) {
                R.id.home -> index = 0
                R.id.posting -> index = 1
                R.id.mypage -> index = 2
            }
            viewpager_main.currentItem = index
            true
        }
    }

    fun tabAndSlideView() {
        viewpager_main.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
            }

            override fun onPageScrollStateChanged(state: Int) {
            }
        })
    }
}