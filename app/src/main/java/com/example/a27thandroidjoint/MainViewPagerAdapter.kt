package com.example.a27thandroidjoint

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import java.lang.IllegalArgumentException
import java.lang.IllegalStateException

class MainViewPagerAdapter(fm: FragmentManager): FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> HomeFragment()
            1 -> PostingFragment()
            2 -> ProfileFragment()
            else -> throw IllegalStateException("Fragment position: $position" )
        }
    }

    override fun getCount() = 3
}