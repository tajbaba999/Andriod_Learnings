package com.example.photoframeapp_21

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var currentImage = 0
    lateinit var image : ImageView
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        supportActionBar?.hide()
        val prev = findViewById<ImageButton>(R.id.imagprev)
        val next = findViewById<ImageButton>(R.id.imgnext)

        prev.setOnClickListener{
            val idcurrentImage = "pic$currentImage"
            val idCurrentImage = this.resources.getIdentifier(idcurrentImage,"id",packageName)
            image = findViewById(idCurrentImage)
            image.alpha = 0f


            currentImage = (4+currentImage-1)%4
            val idcurrentImageToshowstring = "pic$currentImage"
            val idImagetoshow = this.resources.getIdentifier(idcurrentImageToshowstring,"id",packageName)
            image = findViewById(idImagetoshow)
            image.alpha = 1f

        }

        next.setOnClickListener{
            val idcurrentImage = "pic$currentImage"
            val idCurrentImage = this.resources.getIdentifier(idcurrentImage,"id",packageName)
            image = findViewById(idCurrentImage)
            image.alpha = 0f


            currentImage = (4+currentImage+1)%4
            val idcurrentImageToshowstring = "pic$currentImage"
            val idImagetoshow = this.resources.getIdentifier(idcurrentImageToshowstring,"id",packageName)
            image = findViewById(idImagetoshow)
            image.alpha = 1f

        }
    }
}