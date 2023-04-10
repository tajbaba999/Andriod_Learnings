package com.example.datapassing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val OrderofCustomer = intent.getStringExtra(MainActivity.KEY)
        val tvorder = findViewById<TextView>(R.id.tVorder)

        tvorder.text = OrderofCustomer
    }
}