package com.example.api26

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory
class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var myAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerview)

        val retrofitBuilder = Retrofit.Builder()
            .baseUrl("https://dummyjson.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiInterface::class.java)

       val retrofitData = retrofitBuilder.getProductData()

       retrofitData.enqueue(object : Callback<MyData?> {
           override fun onResponse(call: Call<MyData?>, response: Response<MyData?>) {
              //if api call is sucess, then use the data of API and show in your app
               var responseBody = response.body()
               val productList = responseBody?.products

               val collectDataStringBuilder = StringBuilder()


               if (productList != null) {
                   for (myData in productList){
                        collectDataStringBuilder.append(myData.title+" ")
                   }

                   val  tv = findViewById<TextView>(R.id.textView)
                   tv.text = collectDataStringBuilder
               }

               myAdapter = MyAdapter(this@MainActivity, productList!!)
               recyclerView.adapter = myAdapter
               recyclerView.layoutManager =LinearLayoutManager(this@MainActivity)


           }

           override fun onFailure(call: Call<MyData?>, t: Throwable) {
               //if API call is not sucess
               Log.d("Main Actvity", "On not sucess"+t.message)
           }
       })

    }
}