package com.example.api26

//import android.telecom.Call
//import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("products")
    fun getProductData() : retrofit2.Call<MyData>
}