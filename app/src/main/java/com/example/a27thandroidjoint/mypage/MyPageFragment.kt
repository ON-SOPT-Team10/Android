package com.example.a27thandroidjoint.mypage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a27thandroidjoint.R
import com.example.a27thandroidjoint.mainfeed.adapter.MainFeedAdapter
import com.example.a27thandroidjoint.mainfeed.model.MainFeedModel
import com.example.a27thandroidjoint.mypage.adapter.MyPageAdapter
import com.example.a27thandroidjoint.mypage.model.MyPageModel
import com.example.a27thandroidjoint.utils.VerticalItemDivider
import kotlinx.android.synthetic.main.fragment_mypage.*
import kotlinx.android.synthetic.main.fragment_posting.*

class MyPageFragment : Fragment() {
    lateinit var myPageAdapter: MyPageAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mypage, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setMyPageAdapter(view)
        loadMyPageDatas()
    }

    fun setMyPageAdapter(view: View){
        myPageAdapter = MyPageAdapter(view.context)
        recyclerview_mypage.adapter = myPageAdapter
    }

    fun loadMyPageDatas() {
        var myPageDatas = mutableListOf<MyPageModel>()

        myPageDatas.apply {
            add(
                MyPageModel(
                    R.drawable.frame_33,
                    getString(R.string.userName),
                    getString(R.string.userEmail),
                )
            )
        }
        myPageAdapter.myPageDatas = myPageDatas
        myPageAdapter.notifyDataSetChanged()
    }
}