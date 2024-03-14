package com.example.myapplication

class MinusOp: Calculator() {
    override fun basicOps(num1: Int, num2: Int) {
        val result = num1 - num2
        println("뺄셈 결과값은 ${result}입니다.")
    }
}