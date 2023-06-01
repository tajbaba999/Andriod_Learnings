package com.example.retrofitapi

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder().baseUrl("https://meme-api.com/gimme")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val apiInterfae by lazy{
        retrofit.create(ApiInterfae::class.java)
    }
}