package com.playground.functions

const val COURSE_NAME = "Kotlin PLayground"

fun topLevelFunction(): Int = (0..100).random()

fun main() {
    val num = topLevelFunction()
    println("num is $num")
}

class TestUtil {

}