package com.example.listview2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var userArraylist : ArrayList<User>
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = arrayOf("Nikhal Kamath","valid buterin","Anatoly ","Sridhar Vembu" )

        val Companyname = arrayOf("Zerodha","Etherum","Solana","Zoho")

        val mesgTime = arrayOf("6:25 AM","9: 30 AM","12:30 PM","5:30 PM")

        val phoneNumber = arrayOf("5464783383","4674537322","6467439014","5363301724","3519710273")

        val imgId = intArrayOf(R.drawable.pic0,R.drawable.pic1,R.drawable.pic2,R.drawable.pic3)

        userArraylist = ArrayList()

        for (eachindex in name.indices){
            val user = User(name[eachindex], Companyname[eachindex],mesgTime[eachindex],phoneNumber[eachindex],imgId[eachindex])

            userArraylist.add(user)
        }

        val listView = findViewById<ListView>(R.id.listview)
        listView.isClickable = true
        listView.adapter = Myadapter(this,userArraylist)

        listView.setOnItemClickListener { parent, view, position, id ->

            val userName = name[position]
            val userPhone = phoneNumber[position]
            val ImgId = imgId[position]

                val i = Intent(this,UserActivity2::class.java)

                i.putExtra("name",userName)
                i.putExtra("phone",userPhone)
                i.putExtra("image",ImgId)
                startActivity(i)
            }

    }
}