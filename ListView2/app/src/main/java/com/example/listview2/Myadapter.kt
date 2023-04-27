package com.example.listview2

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class Myadapter(val context: Activity, val arrayList: ArrayList<User> ) : ArrayAdapter<User>(context, R.layout.eachitem, arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater =LayoutInflater.from(context)
        val view =inflater.inflate(R.layout.eachitem, null)

        val image = view.findViewById<CircleImageView>(R.id.profile_image)
        val name = view.findViewById<TextView>(R.id.textViewname)
        val company = view.findViewById<TextView>(R.id.textViewcompany)
        val lastMsgtime = view.findViewById<TextView>(R.id.textViewtime)


        name.text = arrayList[position].name
        company.text = arrayList[position].company
        lastMsgtime.text = arrayList[position].lastTime
        image.setImageResource(arrayList[position].imageId)

        return view
    }

}
