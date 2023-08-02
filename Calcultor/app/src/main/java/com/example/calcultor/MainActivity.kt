package com.example.calcultor

import CalculatorViewModel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      var viewModel  = ViewModelProvider(this).get(CalculatorViewModel::class.java)
        val zero = findViewById<TextView>(R.id.zero)
        val one = findViewById<TextView>(R.id.one)
        val two = findViewById<TextView>(R.id.two)
        val three = findViewById<TextView>(R.id.three)
        val four = findViewById<TextView>(R.id.four)
        val five = findViewById<TextView>(R.id.five)
        val six = findViewById<TextView>(R.id.six)
        val seven = findViewById<TextView>(R.id.seven)
        val eight = findViewById<TextView>(R.id.eight)
        val nine = findViewById<TextView>(R.id.nine)
        val add = findViewById<TextView>(R.id.addition)
        val subt = findViewById<TextView>(R.id.subtraction)
        val multi = findViewById<TextView>(R.id.multiplication)
        val division = findViewById<TextView>(R.id.division)
        val equal = findViewById<TextView>(R.id.equals)
        val dot = findViewById<TextView>(R.id.dot)
        val result = findViewById<TextView>(R.id.result)
        val clear = findViewById<TextView>(R.id.clear)
        val expression = findViewById<TextView>(R.id.expression)

        zero.setOnClickListener {
            viewModel.pressButton("0",true)
        }
        one.setOnClickListener {
            viewModel.pressButton("1",true)
        }
        two.setOnClickListener {
            viewModel.pressButton("2",true)
        }
        three.setOnClickListener {
            viewModel.pressButton("3",true)
        }
        four.setOnClickListener {
            viewModel.pressButton("4",true)
        }
        five.setOnClickListener {
            viewModel.pressButton("5",true)
        }
        six.setOnClickListener {
            viewModel.pressButton("6",true)
        }
        seven.setOnClickListener {
            viewModel.pressButton("7",true)
        }
        eight.setOnClickListener {
            viewModel.pressButton("8",true)
        }
        nine.setOnClickListener {
            viewModel.pressButton("9",true)
        }
        add.setOnClickListener {
            viewModel.pressButton("+",true)
        }
        subt.setOnClickListener {
            viewModel.pressButton("-",true)
        }
        multi.setOnClickListener {
            viewModel.pressButton("*",true)
        }
        clear.setOnClickListener {
            viewModel.clear()
        }

        equal.setOnClickListener {
            result.text = viewModel.evaluateExpression()
        }
        viewModel.getResult().observe(this){
            resultText ->result.text =  resultText
        }
        viewModel.getExpression().observe(this){
            exprssionText -> expression.text  = exprssionText
        }





    }
}