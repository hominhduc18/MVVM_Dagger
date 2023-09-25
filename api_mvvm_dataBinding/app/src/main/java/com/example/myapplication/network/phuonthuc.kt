package com.example.myapplication.netWorks



import dataUsers
import retrofit2.Call
import retrofit2.http.*



interface Api{
    @POST("/v1/user/loginUser")
    fun loginUser(@Body email: String, @Body password: String): Call<dataUsers>
}




