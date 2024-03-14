package com.example.myapplication

fun main() {
    val plus_calc = PlusOp()
    val minus_calc = MinusOp()
    val multi_calc = MultiOp()
    val div_calc = DivOp()

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
                plus_calc.basicOps(num1, num2)
            }
            2 -> {
                minus_calc.basicOps(num1, num2)
            }
            3 -> {
                multi_calc.basicOps(num1, num2)
            }
            4 -> {
                div_calc.basicOps(num1, num2)
            }
        }
    }
}