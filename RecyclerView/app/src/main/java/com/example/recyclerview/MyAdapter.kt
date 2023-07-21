package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var person: ArrayList<Person>) : RecyclerView.Adapter<MyAdapter.MyView>() {
    class MyView(val view : View) : RecyclerView.ViewHolder(view){
        val name = view.findViewById<TextView>(R.id.textName)
        val age = view.findViewById<TextView>(R.id.textAge)
        val img = view.findViewById<ImageView>(R.id.imageView2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView {
        var layout = LayoutInflater.from(parent.context).inflate(
            R.layout.activity_list_items, parent, false
        )
      return  MyView(layout)
    }

    override fun getItemCount(): Int {
        return person.size
    }

    override fun onBindViewHolder(holder: MyView, position: Int) {
        holder.name.text = person[position].name
        holder.age.text = person[position].age.toString()
        holder.img.setImageResource(person[position].photo)
    }
}