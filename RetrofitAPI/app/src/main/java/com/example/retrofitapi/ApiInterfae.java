package com.example.retrofitapi;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterfae {
    @GET("/gimme")
    fun getData() : Call<responceDataclass>
}
