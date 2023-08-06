package com.example.cvrmentorapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object Studentinstance {
    private val student by lazy {
        Retrofit.Builder().baseUrl("url")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }
    val apiInterface by lazy {
        student.create(Apiinterface::class.java)
    }
}