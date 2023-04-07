package com.example.application01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttondownload = findViewById<Button>(R.id.btndownload)
        val buttonupload = findViewById<Button>(R.id.btnupload)

        buttondownload.setOnClickListener{
            Toast.makeText(applicationContext, "Downloading...",Toast.LENGTH_SHORT).show()
        }
        buttonupload.setOnClickListener{
            Toast.makeText(applicationContext, "Uploading...",Toast.LENGTH_LONG).show()
        }
    }
}