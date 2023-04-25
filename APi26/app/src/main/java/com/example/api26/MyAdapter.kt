package com.example.api26

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.squareup.picasso.Picasso

class MyAdapter(val context: Activity, val productsArrayList: List<Product>?) :
RecyclerView.Adapter<MyAdapter.MyviewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
       val itemView = LayoutInflater.from(context).inflate(R.layout.eachrow, parent, false)
        return MyviewHolder(itemView)
    }

    override fun getItemCount(): Int {
      return productsArrayList.size
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        val currentitem = productsArrayList[position]
        holder.title.text = currentitem.title

        Picasso.get().load(currentitem.thumbnail).into(holder.image);
    }

    class MyviewHolder(itemView : View ) : RecyclerView.ViewHolder(itemView) {
        val title : TextView
        val image : ShapeableImageView


        init {
            title = itemView.findViewById(R.id.productTitle)
            image = itemView.findViewById(R.id.productImage)

        }
    }
}