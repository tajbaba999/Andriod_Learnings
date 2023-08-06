package com.example.calculator

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import net.objecthunter.exp4j.ExpressionBuilder

class CalculatorViewModel:ViewModel() {
    var resultLiveData : MutableLiveData<String> = MutableLiveData()
    var expressionData : MutableLiveData<String> = MutableLiveData()
    var expression : String = ""
    var result : String = ""
    fun pressButton(string: String, clear: Boolean){
        if (clear){
            result = ""
            expression += string
        }else{
            expression += result
            expression += string
            result = ""
        }
        onNumberButton(string)
    }
    fun clear(){
        result = ""
        expression =""
    }
    fun getExpression() : LiveData<String> {
        return expressionData
    }
    fun gerResult() : LiveData<String>{
        return resultLiveData
    }
    fun evaluateexpression() : String{
        val expressionBuilder = ExpressionBuilder(expression)
        val parsedString = expressionBuilder.build()
        val expressionresult = parsedString.evaluate()
        return (if (expressionresult.isNaN()) {
            "Invalid expression"
        }else{
            val longestresut = expressionresult.toLong()
            if(expressionresult == longestresut.toDouble()){
                longestresut.toString()
            }
            else{
                expression.toString()
            }
        })
    }

    private fun onNumberButton(string: String) {
        val currentExpression = expressionData.value ?: ""
        expressionData.value = expression
    }
}