package com.example.a27thandroidjoint.mainfeed.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a27thandroidjoint.R
import com.example.a27thandroidjoint.mainfeed.model.MainFeedModel
import com.example.a27thandroidjoint.mainfeed.model.UserModel
import com.example.a27thandroidjoint.mainfeed.viewholder.UserViewHolder
import java.util.zip.Inflater

class UserAdapeter (private val context: Context) : RecyclerView.Adapter<UserViewHolder>(){
    var userDatas = mutableListOf<UserModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.item_user, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(userDatas[position])
    }

    override fun getItemCount(): Int = userDatas.size
}