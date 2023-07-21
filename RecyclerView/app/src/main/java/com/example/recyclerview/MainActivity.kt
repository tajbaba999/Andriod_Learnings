package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var vrkhoil = Person("Virat Kohil","34",R.drawable.oneimage)
        var anushka = Person("Anushka","33",R.drawable.twoimage)
        var vamika = Person("Vamika","2",R.drawable.threeimage)

        val l : ArrayList<Person>? = ArrayList()
        l!!.add(vrkhoil)
        l.add(anushka)
        l.add(vamika)

        var rv = findViewById<RecyclerView>(R.id.recyclerview)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = MyAdapter(l)

    }
}