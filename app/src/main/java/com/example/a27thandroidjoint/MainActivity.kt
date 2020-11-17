package com.example.a27thandroidjoint

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.ViewPager
import com.example.a27thandroidjoint.mypage.MyPageFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_mypage.*
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setViewPager()
        setBottomNavigation()
        tabAndSlideView()

    }


    fun setViewPager() {
        viewpager_main.adapter = MainViewPagerAdapter(supportFragmentManager)
        viewpager_main.offscreenPageLimit = 2
    }

    fun setBottomNavigation() {
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
                bottom_navigation_main.menu.getItem(position).isChecked = true
            }

            override fun onPageScrollStateChanged(state: Int) {
            }
        })
    }

    companion object {
        const val FLAG_REQ_STORAGE = 102
        const val FLAG_PERM_STORAGE = 99
    }

}