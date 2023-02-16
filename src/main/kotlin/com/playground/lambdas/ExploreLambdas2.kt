package com.playground.lambdas


fun invokeLambda(lambda: (Double) -> Boolean) : Boolean {
    return lambda(4.329)
}

private infix fun String.invokeLambda2(lambda: (Double) -> Boolean) : Boolean {
    return lambda(4.329)
}


fun main() {

    // Call function with lamda as Parameter
    val lambda = { arg: Double ->
        arg == 4.329
    }

    val result = invokeLambda(lambda)
    println(result)


    // Call function with lamda as Parameter
    val result2 = invokeLambda( { arg -> arg == 4.329 })
    println(result2)

    // Call function with lamda outside function call since it is last parameter
    val result3 = invokeLambda() { arg -> arg == 4.329 }
    println(result3)

    // Call function with lamda outside function and no() call since it is last parameter
    // and the only parameter
    val result4 = invokeLambda { arg -> arg == 4.329 }
    println(result4)

    // Call function with lamda outside function and no() call since it is last parameter
    // and the only parameter
    val test = "Test" invokeLambda2 lambda
    println(test)


}