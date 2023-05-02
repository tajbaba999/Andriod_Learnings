package com.example.databaseinandriod_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val name = intent.getStringExtra(SigninActivity.KEY1)
        val email = intent.getStringExtra(SigninActivity.KEY2)
        val userid = intent.getStringExtra(SigninActivity.KEY3)

        val Name = findViewById<TextView>(R.id.tvname)
        Name.text = "Welcome, $name"

        val Email = findViewById<TextView>(R.id.tvemail)
        Email.text = "Email: $email"

        val UserId = findViewById<TextView>(R.id.tvid)
        UserId.text = "User-Id : $userid"
    }
}