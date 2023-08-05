package com.example.bottomnavigatation27

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()


        val bottomview = findViewById<BottomNavigationView>(R.id.botttomNagvigatationBar)

        replacewithFragment(Home())

       bottomview.setOnItemSelectedListener {
           when(it.itemId){
               R.id.home -> replacewithFragment(Home())
               R.id.profile -> replacewithFragment(Profile())
               R.id.search -> replacewithFragment(Search())
               else -> {

               }
           }
           true
       }

    }

    private fun replacewithFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.framelayout, fragment)
        fragmentTransaction.commit()
    }
}