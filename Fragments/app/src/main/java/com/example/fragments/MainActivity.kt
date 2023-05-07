package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.fragments.ui.login.LoginFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonclock = findViewById<Button>(R.id.btnTime)
        val buttoncouple = findViewById<Button>(R.id.btncouple)
        val btnvalidate = findViewById<Button>(R.id.btnValiadate)


        buttonclock.setOnClickListener{
            replaceFragmentWithFrament(Fragment_clock())
        }

        buttoncouple.setOnClickListener{
            replaceFragmentWithFrament(couple_image())
        }

        btnvalidate.setOnClickListener{
            replaceFragmentWithFrament(LoginFragment())
        }
    }

    private fun replaceFragmentWithFrament(frag: Fragment) {

        val fragmentmanager = supportFragmentManager
        val fragTransaction = fragmentmanager.beginTransaction()
        fragTransaction.replace(R.id.framelayout, frag)
        fragTransaction.commit()
    }
}