package com.example.a27thandroidjoint.mainfeed.viewholder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.a27thandroidjoint.R
import com.example.a27thandroidjoint.mainfeed.model.UserModel

class UserViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
    val userImage : ImageView = itemView.findViewById(R.id.imageView_user)
    val userName : TextView = itemView.findViewById(R.id.textView_userName)

    fun bind(userModel : UserModel){
        Glide.with(itemView).load(userModel.userImage).into(userImage)
        userName.text = userModel.userName
    }
}