package com.example.checkbox

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val c1 = findViewById<CheckBox>(R.id.ck1)
        val c2 = findViewById<CheckBox>(R.id.ck2)
        val c3 = findViewById<CheckBox>(R.id.ck3)
        val tv1 = findViewById<TextView>(R.id.tv1)
        val tv2 = findViewById<TextView>(R.id.tv2)
        val btn = findViewById<Button>(R.id.btn)
        val s = findViewById<Switch>(R.id.switch1)
        val editText = findViewById<EditText>(R.id.editAge)
        val editName = findViewById<EditText>(R.id.editName)
        var new = 0.0
        btn.setOnClickListener() {
            if (c1.isChecked)
                tv1.text = c1.text.toString()
            if (c2.isChecked)
                tv1.text = c2.text.toString()
            if (c3.isChecked)
                tv1.text = c3.text.toString()
            if(s.isChecked){
                new = editText.text.toString().toDoubleOrNull()!!
                tv2.text = new.roundToInt().toString()
            }
        }
    }
}