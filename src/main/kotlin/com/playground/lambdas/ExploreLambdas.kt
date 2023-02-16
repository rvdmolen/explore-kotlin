package com.playground.lambdas

fun calculate(x: Int, y: Int, inputFunc: (x: Int, y: Int) -> Int ): Int {
    return inputFunc(x, y)
}


fun main() {
    val addLambda = {x: Int -> x+x}
    val multiplyLambda = {x: Int, y: Int ->
        println("x is $x and y is $y")
        x*y
    }

    listOf(1,2,3)
        .map(addLambda)
        .forEach {
            println(it)
        }

    println("----")

    listOf(1,2,3)
        .forEach {
            val result = addLambda(it)
            println(result)
        }

    println("----")

    val multiplyResult = multiplyLambda(2,3)
    println(multiplyResult)

    println("----")
    val result2 = calculate(1,2, multiplyLambda)
    println(result2)
}