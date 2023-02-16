package com.playground.functions


fun repeatthis(numberOfTimes: Int, action: (Int) -> Unit) {
    for (i in 1..numberOfTimes) {
        action(i)
    }
}

fun counter(x: Int, y: Int) {
    println("sum is: ${x+y}")
}

fun createString(nameOfFunction: StringBuilder.() -> Unit): String {
    val sb = StringBuilder()
    sb.nameOfFunction()
    return sb.toString()
}


fun main() {
    repeatthis(3) { r ->
        println("test : $r")
    }

    counter(1,2)



    val s = createString { // here we're in the context of a StringBuilder
        append(4)
        append("hello")
    }

    println(s)
}