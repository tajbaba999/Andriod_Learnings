package com.example.databaseinandriod_2

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.FirebaseApp
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    lateinit var databse : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FirebaseApp.initializeApp(this);
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val Etname = findViewById<TextInputEditText>(R.id.etName)
        val Etmail = findViewById<TextInputEditText>(R.id.etMail)
        val Etpassword = findViewById<TextInputEditText>(R.id.etPassword)
        val Etuserid = findViewById<TextInputEditText>(R.id.etUserid)
        val btnsignup = findViewById<Button>(R.id.btnSignUp)

        btnsignup.setOnClickListener {

            val name = Etname.text.toString()
            val mail = Etmail.text.toString()
            val password = Etpassword.text.toString()
            val userid = Etuserid.text.toString()

            val user = User(name, mail, password, userid)

            databse = FirebaseDatabase.getInstance().getReference("Users")
            databse.child(userid).setValue(user).addOnSuccessListener {

                Toast.makeText(this, "User registerd sucessfully",Toast.LENGTH_LONG).show()
            }.addOnFailureListener {
                Toast.makeText(this, "User not-registerd sucessfully",Toast.LENGTH_LONG).show()

            }
        }

        val signIntent = findViewById<TextView>(R.id.tvSignin)
        signIntent.setOnClickListener {
            val opensinginintent = Intent(this, SigninActivity::class.java)
            startActivity(opensinginintent)
        }
    }
}