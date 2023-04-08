package com.example.interactiveapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDark = findViewById<Button>(R.id.btnDark)
        val buttonRead = findViewById<Button>(R.id.btnRead)
        val layout = findViewById<LinearLayout>(R.id.Linearlayout)

        buttonDark.setOnClickListener{
        layout.setBackgroundColor(R.color.black)
        }
        buttonRead.setOnClickListener{
            //change it light theme
        layout.setBackgroundColor(R.color.yellow)
        }

    }
}