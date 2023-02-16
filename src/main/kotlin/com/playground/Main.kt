package com.playground

import com.playground.functions.COURSE_NAME
import com.playground.functions.topLevelFunction

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val num = topLevelFunction()
    println("num is $num")

    println("Course name is $COURSE_NAME")


}