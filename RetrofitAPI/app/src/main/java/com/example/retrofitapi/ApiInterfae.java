package com.example.retrofitapi;

import retrofit2.http.GET;

public interface ApiInterfae {
    @GET("/posts")
    fun getData() : call<responceDataclass>
}
