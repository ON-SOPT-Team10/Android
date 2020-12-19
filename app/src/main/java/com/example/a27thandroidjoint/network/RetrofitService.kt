package com.example.a27thandroidjoint.network

import com.example.a27thandroidjoint.network.model.MainResponseData
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitService {

    @GET("/main")
    fun getMain(): Call<MainResponseData>
}