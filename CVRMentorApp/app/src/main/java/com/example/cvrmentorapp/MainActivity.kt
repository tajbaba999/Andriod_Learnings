package com.example.cvrmentorapp

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import android.widget.Toast
import com.example.cvrmentorapp.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response



class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getData()
        binding.btn.setOnClickListener {
            getData()
        }

    }
    fun getData() {

        val mProgressDialog = ProgressDialog(this)
        mProgressDialog.setTitle("21B81A0501")
        mProgressDialog.setMessage("please wait...")
        mProgressDialog.show()


        Studentinstance.apiInterface.getData().enqueue(object : Callback<responceData?> {
            override fun onResponse(
                call: Call<responceData?>,
                response: Response<responceData?>)
            {
                binding.textView.text = response.body()?.name.toString()

                mProgressDialog.dismiss()
            }

            override fun onFailure(call: Call<responceData?>, t: Throwable) {
                mProgressDialog.dismiss()
               Toast.makeText(this@MainActivity, "${t.localizedMessage}", Toast.LENGTH_LONG)
            }
        })


    }
}