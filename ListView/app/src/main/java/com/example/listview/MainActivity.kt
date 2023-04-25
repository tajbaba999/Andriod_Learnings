 package com.example.listview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView.Adapter

 class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listview)

        val taskview = arrayListOf<String>()

        taskview.add("Attend Exam")
        taskview.add("Complete app devlopment")
        taskview.add("Buy somthing from market")
        taskview.add("Work on resume")
        taskview.add("Improve internet presence")

        val adapterViewforlistview = ArrayAdapter(this, android.R.layout.simple_list_item_1, taskview)
        listView.adapter  = adapterViewforlistview

        listView.setOnItemClickListener { parent, view, position, id ->
            val text = "Clicked on item : " +(view as TextView).text.toString()
            Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
        }
    }
}