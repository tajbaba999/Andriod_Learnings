package com.example.databaseinandriod

import android.os.Build.VERSION_CODES.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.FirebaseApp
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    lateinit var databse : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
           FirebaseApp.initializeApp(this)
            databse = FirebaseDatabase.getInstance().getReference("Users")
            databse.child(userid).setValue(user).addOnSuccessListener {

                Toast.makeText(this, "User registerd sucessfully",Toast.LENGTH_LONG).show()
            }.addOnFailureListener {
                Toast.makeText(this, "User not-registerd sucessfully",Toast.LENGTH_LONG).show()

            }
        }

    }
}