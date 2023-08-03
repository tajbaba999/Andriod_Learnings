package com.example.birthday

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.EditText
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.time.ZoneOffset

class SecondActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name = findViewById<EditText>(R.id.name)
        val blood = findViewById<EditText>(R.id.blood)
        val datepicker = findViewById<DatePicker>(R.id.datePicker1)

        datepicker.maxDate = LocalDate.now().atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli()

        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("name",name.text.toString())
        intent.putExtra("groop",blood.text.toString())
        intent.putExtra("dob","${datepicker.dayOfMonth} - ${datepicker.month} - ${datepicker.year}")
        startActivity(intent)
    }
}