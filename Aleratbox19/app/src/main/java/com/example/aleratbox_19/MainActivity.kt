package com.example.aleratbox_19

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.aleratbox_19.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btn1.setOnClickListener{
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Are you Sure?")
            builder.setMessage("Do you want to close the app?")
            builder.setIcon(R.drawable.baseline_exit)
            builder.setPositiveButton("YES",DialogInterface.OnClickListener{ dialogInterface, i ->
                //when user click on Yes then exit the app
//                finish()
            })
            builder.setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->
                //The action is performed when No is clicked
            })
            builder.show()
        }

        binding.btn2.setOnClickListener {
            val options = arrayOf("'Gulab jamun","Rasmali","Kaju katli")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which is your favourite sweet?")
            builder2.setSingleChoiceItems(options,0,DialogInterface.OnClickListener{  dialog, which ->
                //What shoulde we have to display in this box
                Toast.makeText(this,"You clicked on ${options[which]}",Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialog, which ->
//                finish()
            })
            builder2.setNegativeButton("Decline",DialogInterface.OnClickListener{dialog, which ->
              //what should show when nagative is cliked ?

            })
            builder2.show()
        }

        binding.btn3.setOnClickListener{
            val options = arrayOf("'Gulab jamun","Rasmali","Kaju katli")
            val builder3 = AlertDialog.Builder(this)
            builder3.setTitle("Which is your favourite sweet?")
            builder3.setTitle("Which is your favourite sweet?")
            builder3.setMultiChoiceItems(options, null, DialogInterface.OnCancelListener {
                //What shoulde we have to display in this box
                Toast.makeText(this,"You clicked on ${options[which]}",Toast.LENGTH_SHORT).show()
            })

            builder3.setPositiveButton("Submit",DialogInterface.OnClickListener { dialog, which ->
//                finish()
            })
            builder3.setNegativeButton("Decline",DialogInterface.OnClickListener{dialog, which ->
                //what should show when nagative is cliked ?

            })
            builder3.show()

        }
    }
}