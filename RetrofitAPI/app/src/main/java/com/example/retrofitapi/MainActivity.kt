package com.example.retrofitapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(){
    var api : String = "https://jsonplaceholder.typicode.com/photos"

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getData()
    }

    private fun getData() {
        RetrofitInstance.apiInterfae.getData().enqueue(t)
    }
}