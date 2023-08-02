//package com.example.calcultor
//
//import androidx.lifecycle.MutableLiveData
//import androidx.lifecycle.ViewModel
//import net.objecthunter.exp4j.Expression
//import net.objecthunter.exp4j.ExpressionBuilder
//
//class CalculatorViewModel : ViewModel() {
//     val resultLiveData : MutableLiveData<String> = MutableLiveData()
//    val expressionData : MutableLiveData<String> = MutableLiveData()
//    var result : String = ""
//    var expression : String = ""
//
//    fun pressButton(string: String, clear : Boolean){
//        if (clear){
//            result = ""
//            expression  += String
//        }
//        else{
//            expression += result
//            expression += String
//            result = ""
//        }
//        onNumberButtonClicked(string)
//    }
//    fun clear(){
//        result = ""
//        expression = ""
//    }
//    fun evaluateExpression(expression: String) : String{
//        val expressionBuilder : ExpressionBuilder(expression)
//        val parsedExpression : expressionBuilder.build()
//    }
//
//    private fun onNumberButtonClicked(string: String) {
//
//    }
//
//}
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import net.objecthunter.exp4j.ExpressionBuilder
import androidx.lifecycle.ViewModel
class CalculatorViewModel: ViewModel() {
    private val resultLiveData: MutableLiveData<String> = MutableLiveData()
    private val expressionLiveData: MutableLiveData<String> = MutableLiveData()
    private var result: String = ""
    private var expression: String = ""
    fun pressButton(string: String, clear: Boolean) {
        if (clear) { result = ""
            expression += string }
        else {
            expression += result
            expression += string
            result = ""
        }
        onNumberButtonClick(string)
    }
    fun clear() {
        result = ""
        expression = ""
    }
    fun evaluateExpression(): String {
        val expressionBuilder = ExpressionBuilder(expression)
       val parsedExpression = expressionBuilder.build()
        val expressionResult = parsedExpression.evaluate()
        return if (expressionResult.isNaN()){  "Invalied Expression"}
        else{
            val longestResult = expressionResult.toLong()
            if (longestResult.toDouble() == expressionResult){
                longestResult.toString()
            }else{
                expression.toString()
            }
        }
    }
    fun getResult(): LiveData<String> {
        return resultLiveData
    }
    fun getExpression(): LiveData<String> {
        return expressionLiveData
    }
    fun onNumberButtonClick(number: String) {
        val currentExpression = expressionLiveData.value ?: ""
        expressionLiveData.value = expression
    }
}