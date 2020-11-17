package com.example.a27thandroidjoint

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MainFeedViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
    val imageViewFeed = itemView.findViewById<ImageView>(R.id.imageview_feed)
    val textViewTitle = itemView.findViewById<TextView>(R.id.textview_title)
    val textViewContent = itemView.findViewById<TextView>(R.id.textview_content)
    val textviewScrapNumber = itemView.findViewById<TextView>(R.id.textview_scrap_number)


    fun bind(mainFeedModel: MainFeedModel){
        Glide.with(itemView).load(mainFeedModel.feedImage).into(imageViewFeed)
        textViewTitle.text = mainFeedModel.title
        textViewContent.text = mainFeedModel.content
        textviewScrapNumber.text = mainFeedModel.numberOfScrap.toString()
    }
}