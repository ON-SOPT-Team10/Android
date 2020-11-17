package com.example.a27thandroidjoint.mypage.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a27thandroidjoint.R
import com.example.a27thandroidjoint.mainfeed.viewholder.MainFeedViewHolder
import com.example.a27thandroidjoint.mypage.model.MyPageModel
import com.example.a27thandroidjoint.mypage.viewholder.MyPageViewHolder

class MyPageAdapter(private val context: Context) : RecyclerView.Adapter<MyPageViewHolder>() {
    var myPageDatas = mutableListOf<MyPageModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyPageViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_profile, parent, false)
        return MyPageViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyPageViewHolder, position: Int) {
        holder.bind(myPageDatas[position])
    }

    override fun getItemCount() = myPageDatas.size

}