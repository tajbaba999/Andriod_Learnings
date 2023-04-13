package com.example.implictintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webbutton = findViewById<CardView>(R.id.web)
        val camerabutton = findViewById<CardView>(R.id.camera)

        webbutton.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.alchemy.com/")
            startActivity(intent)
        }
        camerabutton.setOnClickListener{
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
//        webbutton.setOnClickListener{
//            val intent = Intent(Intent.ACTION_VIEW)
//            intent.data = Uri.parse("")
//            startActivity(intent)
//        }
    }
}