package com.example.cvrmentorapp

import retrofit2.Call
import retrofit2.http.GET

interface Apiinterface {
    @GET("/students/rollno")
    fun getData(): Call<responceData>
}