package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var vkohil = Person("Kohil", "cricketer",R.drawable.fourimage)
        var rohit = Person("Kohil", "cricketer",R.drawable.oneimage)
        var  msd = Person("Kohil", "cricketer",R.drawable.threeimage)
        var l : ArrayList<Person> = ArrayList()
        l!!.add(vkohil)
        l.add(rohit)
        l.add(msd)
        var rv = findViewById<RecyclerView>(R.id.rv)
        rv.adapter = MyAdapter(l)
        rv.layoutManager = LinearLayoutManager(this)
    }
}