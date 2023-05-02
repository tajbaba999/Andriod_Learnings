package com.example.databaseinandriod_2

import android.content.Intent
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

class SigninActivity : AppCompatActivity() {

    companion object{
        const val KEY1 = "com.example.databaseinandriod_2.name"
        const val KEY2 = "com.example.databaseinandriod_2.email"
        const val KEY3 = "com.example.databaseinandriod_2.userId"
    }

    private lateinit var databaseReference: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FirebaseApp.initializeApp(this);
        setContentView(R.layout.activity_signin)

        val userid = findViewById<TextInputEditText>(R.id.etUserNameEditText)
        val btnsign = findViewById<Button>(R.id.btnSignin)

        btnsign.setOnClickListener{

            val userid = userid.text.toString()

            if (userid.isNotEmpty()){
                readDate(userid)
            }else{
                Toast.makeText(this,"Please Enter your username", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun readDate(userid: String) {
        databaseReference = FirebaseDatabase.getInstance().getReference("Users")
        databaseReference.child(userid).get().addOnSuccessListener {

            // if user exist or not
            if (it.exists()){
                //welcome user in your app to the next intent in pass
                val email = it.child("email").value
                val name = it.child("name").value
                val userId = it.child("userid").value

                val intentwelcome = Intent(this, WelcomeActivity::class.java)
                intentwelcome.putExtra(KEY1, name.toString())
                intentwelcome.putExtra(KEY3, userId.toString())
                intentwelcome.putExtra(KEY2, email.toString())
                startActivity(intentwelcome)
            }else{
                Toast.makeText(this,"User not does not exit please register user", Toast.LENGTH_LONG).show()
            }

        }.addOnFailureListener {
            Toast.makeText(this, "Not worked", Toast.LENGTH_LONG).show()
        }
    }
}