package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.databinding.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val binding2 : ActivitySecondBinding = DataBindingUtil.setContentView(this, R.layout.activity_second)
        binding2.button.setOnClickListener {
            binding2.textView.text = "Hii!"
        }
    }
}