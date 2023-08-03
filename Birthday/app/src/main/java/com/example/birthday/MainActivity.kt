package com.example.birthday

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
           setContentView(R.layout.activity_main)
        val flotingbtn = findViewById<FloatingActionButton>(R.id.floatingActionButton)

        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)

        val name = intent.getStringExtra("name")
        val group = intent.getStringExtra("dob")
        val bg = intent.getStringExtra("bg")

        val textview1 = findViewById<TextView>(R.id.textView1)
        val textview2 = findViewById<TextView>(R.id.textView2)
        val textview3 = findViewById<TextView>(R.id.textView3)

        textview1.text = name.toString()
        textview2.text = group.toString()
        textview3.text = bg.toString()
    }
}