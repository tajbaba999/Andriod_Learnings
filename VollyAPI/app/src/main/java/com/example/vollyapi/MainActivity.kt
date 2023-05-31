package com.example.vollyapi

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.bumptech.glide.Glide
import com.example.vollyapi.databinding.ActivityMainBinding
import org.json.JSONObject
import java.io.StringReader

class MainActivity : AppCompatActivity() {


    lateinit var binding :ActivityMainBinding
    val url : String = "https://meme-api.com/gimme"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
         binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       getMemeData()
        binding.btnnewmeme.setOnClickListener {
            getMemeData()
        }
    }
    fun getMemeData(){

// Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(this)

        val processDialog = ProgressDialog(this)
        processDialog.setCancelMessage("Please wait till data is fetch")
        processDialog.show()
// Request a string response from the provided URL.
        val stringRequest = StringRequest(Request.Method.GET, url,  { response ->
                // Display the first 500 characters of the response string.
            Log.e("Responce","getMemaData"+response.toString())

            var responseObject = JSONObject(response)
            responseObject.get("url")
            responseObject.get("postLink")


            binding.memeTitle.text = responseObject.getString("title")
            binding.memeAuthor.text =responseObject.getString("author")
            Glide.with(this@MainActivity).load(responseObject.getString("url")).into(binding.imageView)

            processDialog.dismiss()
            },
             {
                 processDialog.dismiss()
                 error->
                 Toast.makeText(this@MainActivity,"${error.localizedMessage}",Toast.LENGTH_LONG).show()
             })

// Add the request to the RequestQueue.
        queue.add(stringRequest)
    }
}