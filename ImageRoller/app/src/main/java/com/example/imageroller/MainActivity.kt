package com.example.imageroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val iv = findViewById<ImageView>(R.id.imageView)
        val btn = findViewById<Button>(R.id.button)

        val roller = DiceRoller()

        btn.setOnClickListener {
            var rollerValue =roller.roll()
            val drawableresorce = when(rollerValue){
                1 -> R.drawable.oneimage
                2 -> R.drawable.twoimage
                3 -> R.drawable.threeimage
                4 -> R.drawable.fourimage
                5-> R.drawable.fiveimage
                6 -> R.drawable.siximage
                else -> {}
            }
            iv.setImageResource(drawableresorce as Int)
        }


    }
}

class DiceRoller(){
    fun roll():Int{
//        return  Random.nextInt(1,7)
        return 5;
    }
}