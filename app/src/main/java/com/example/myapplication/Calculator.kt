package com.example.myapplication

class Calculator {
    fun plusOp(num1:Int, num2:Int) {
        val result = num1 + num2
        println("덧셈 결과값은 ${result}입니다.")
    }

    fun minusOp(num1:Int, num2:Int) {
        val result = num1 - num2
        println("뺄셈 결과값은 ${result}입니다.")
    }

    fun multiOp(num1:Int, num2: Int) {
        val result = num1 * num2
        println("곱셈 결과값은 ${result}입니다.")
    }

    fun divOp(num1: Int, num2: Int) {
        val result = num1 / num2
        println("나눗셈 결과값은 ${result}입니다.")
    }
}