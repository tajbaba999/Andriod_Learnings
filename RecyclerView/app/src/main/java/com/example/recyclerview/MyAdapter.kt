package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val person: ArrayList<Person>) : RecyclerView.Adapter<MyAdapter.MyView>(){
    class MyView(val view: View) : RecyclerView.ViewHolder(view) {
        val name = view.findViewById<TextView>(R.id.name)
        val des = view.findViewById<TextView>(R.id.des)
        val img = view.findViewById<ImageView>(R.id.img)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.list_items, parent, false)
        return  MyView(layout)
    }

    override fun getItemCount(): Int {
        return person.size
    }

    override fun onBindViewHolder(holder: MyView, position: Int) {
        holder.name.text = person[position].name
        holder.des.text =person[position].des
        holder.img.setImageResource(person[position].img)
    }

}