package com.example.myapplication

fun main() {
    val calculator = Calculator()

    while(true) {
        println("[1]덧셈 [2]뺄셈 [3]곱셈 [4]나눗셈 [5]나머지 [-1]종료")
        val choice = readLine()!!.toInt()

        if(choice == -1) {
            println("계산을 종료합니다.")
            break
        }

        println("첫 번째 숫자를 입력하세요.")
        val num1 = readLine()!!.toInt()
        println("두 번째 숫자를 입력하세요.")
        val num2 = readLine()!!.toInt()

        when(choice) {
            1 -> {
                calculator.plusOp(num1, num2)
            }
            2 -> {
                calculator.minusOp(num1, num2)
            }
            3 -> {
                calculator.multiOp(num1, num2)
            }
            4 -> {
                calculator.divOp(num1, num2)
            }
            5 -> {
                calculator.modOp(num1, num2)
            }
        }
    }
}