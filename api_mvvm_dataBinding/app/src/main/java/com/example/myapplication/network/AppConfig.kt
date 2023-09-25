package com.example.myapplication.netWorks

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object AppConfig {
    private const val BASE_URL="https://coe-five.vercel.app"
    private val builder = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())

    val retrofit = builder.build()
    val apiService: Api = retrofit.create(Api::class.java)//gọi qua phương ththuc get Post
}