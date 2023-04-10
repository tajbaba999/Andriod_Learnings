package com.example.datapassing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    companion object {
        const val KEY="com.example.datapassing.MainActivity.KEY "
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnOrder = findViewById<Button>(R.id.button)
        val eT1 = findViewById<EditText>(R.id.eT1)
        val eT2 = findViewById<EditText>(R.id.eT2)
        val eT3 = findViewById<EditText>(R.id.eT3)
        val eT4 = findViewById<EditText>(R.id.eT4)

        btnOrder.setOnClickListener{
            val orderPlaced = eT1.text.toString() + " " + eT2.text.toString() + " "
            eT3.text.toString() + " " + eT4.text.toString() + "Hello"

            intent = Intent(this, Order::class.java)
            intent.putExtra(KEY, orderPlaced)
            startActivity(intent)
        }
    }
}