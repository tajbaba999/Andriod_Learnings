package com.example.listview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class UserActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user2)

        val name = intent.getStringExtra("name")
        val phoneNumber = intent.getStringExtra("phone")
        val imageId = intent.getIntExtra("image", R.drawable.pic0)


        val nameTv = findViewById<TextView>(R.id.tvName)
        val phoneTv = findViewById<TextView>(R.id.tvPhone)
        val image = findViewById<CircleImageView>(R.id.profile_image)

        nameTv.text = name
        phoneTv.text = phoneNumber
        image.setImageResource(imageId)
    }
}