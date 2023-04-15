package com.example.viewbinding_18

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.viewbinding_18.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

         binding.textview.setOnClickListener {
             if (binding.checkBox.isChecked){

             }else{
                 binding.checkBox.buttonTintList = ColorStateList.valueOf(Color.RED)
                 Toast.makeText(this,"Please accpet terms & conditions",Toast.LENGTH_SHORT).show()
             }

         }

    }
}