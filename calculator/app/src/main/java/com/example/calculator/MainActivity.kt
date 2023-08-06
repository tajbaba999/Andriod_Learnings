package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: CalculatorViewModel
    private lateinit var zero: TextView
    private lateinit var one: TextView
    private lateinit var two: TextView
    private lateinit var three: TextView
    private lateinit var four: TextView
    private lateinit var five: TextView
    private lateinit var six: TextView
    private lateinit var seven: TextView
    private lateinit var eight: TextView
    private lateinit var nine: TextView
    private lateinit var addition: TextView
    private lateinit var subtraction: TextView
    private lateinit var multiplication: TextView
    private lateinit var division: TextView
    private lateinit var equals: TextView
    private lateinit var clear: TextView
    private lateinit var result: TextView
    private lateinit var expression: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(CalculatorViewModel::class.java)
        zero = findViewById(R.id.zero)
        one = findViewById(R.id.one)
        two = findViewById(R.id.two)
        three = findViewById(R.id.three)
        four = findViewById(R.id.four)
        five = findViewById(R.id.five)
        six = findViewById(R.id.six)
        seven = findViewById(R.id.seven)
        eight = findViewById(R.id.eight)
        nine = findViewById(R.id.nine)
        addition = findViewById(R.id.addition)
        subtraction = findViewById(R.id.subtraction)
        multiplication = findViewById(R.id.multiplication)
        equals = findViewById(R.id.equals)
        result = findViewById(R.id.result)
        expression = findViewById(R.id.expression)
        clear = findViewById(R.id.clear)


        zero.setOnClickListener { viewModel.pressButton("0", true) }
        one.setOnClickListener { viewModel.pressButton("1", true) }
        two.setOnClickListener { viewModel.pressButton("2", true) }
        three.setOnClickListener { viewModel.pressButton("3", true) }
        four.setOnClickListener { viewModel.pressButton("4", true) }
        five.setOnClickListener { viewModel.pressButton("5", true) }
        six.setOnClickListener { viewModel.pressButton("6", true) }
        seven.setOnClickListener { viewModel.pressButton("7", true) }
        eight.setOnClickListener { viewModel.pressButton("8", true) }
        nine.setOnClickListener { viewModel.pressButton("9", true) }
        addition.setOnClickListener { viewModel.pressButton("+", true) }
        subtraction.setOnClickListener { viewModel.pressButton("-", true) }
        multiplication.setOnClickListener { viewModel.pressButton("*", true) }


        equals.setOnClickListener {
            result.text = viewModel.evaluateexpression()
        }
        viewModel.gerResult().observe(this){
            resultText -> result.text = resultText
        }
        viewModel.getExpression().observe(this){
            expressionText -> expression.text = expressionText
        }
        clear.setOnClickListener {
            viewModel.clear()
        }
    }
}