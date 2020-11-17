package com.example.a27thandroidjoint.mypage.viewholder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.a27thandroidjoint.R
import com.example.a27thandroidjoint.mypage.model.MyPageModel

class MyPageViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val imageViewProfile = itemView.findViewById<ImageView>(R.id.imageview_profile)
    val textViewName = itemView.findViewById<TextView>(R.id.textview_mypage_name)
    val textViewEmail = itemView.findViewById<TextView>(R.id.textview_email)


    fun bind(myPageModel: MyPageModel) {
        Glide.with(itemView).load(myPageModel.profileImage).into(imageViewProfile)
        textViewName.text = myPageModel.name
        textViewEmail.text = myPageModel.email
    }
}