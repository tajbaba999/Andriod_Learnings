package com.example.assigment01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnnextpage = findViewById<Button>(R.id.button)

        btnnextpage.setOnClickListener{

            intent = Intent(applicationContext, MainActivity2::class.java)
            startActivity(intent)
        }
    }




}