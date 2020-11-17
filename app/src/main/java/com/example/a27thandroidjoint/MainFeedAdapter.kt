package com.example.a27thandroidjoint

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MainFeedAdapter(private val context: Context) : RecyclerView.Adapter<MainFeedViewHolder>() {
    var mainFeedDatas = mutableListOf<MainFeedModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainFeedViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_feed, parent, false)
        return MainFeedViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainFeedViewHolder, position: Int) {
        holder.bind(mainFeedDatas[position])
    }

    override fun getItemCount() = mainFeedDatas.size

}