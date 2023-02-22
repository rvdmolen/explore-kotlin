package com.playground.scopefunctions

import com.playground.model.Course
import com.playground.model.CourseCategory


fun exploreApply() {
    val course = Course(
        4,
        "Modern Java - Learn Java 8 Features By coding it",
        "Alex"
    ).apply {
        this.category = CourseCategory.MARKETING
    }
//
//    println(course)
}

fun exploreAlso() {
    val course = Course(
        4,
        "Modern Java - Learn Java 8 Features By coding it",
        "Alex"
    ).apply {
        this.category = CourseCategory.MARKETING
    }.also {
        println(it)
    }

    println(course)
}


fun handleUser(course: Course?) {
    course ?: return //exit the function if user is null
    //Now the compiler knows user is non-null
}

fun exploreLet() {
    val numbers = mutableListOf(1, 2, 3, 4, 5, 6)
    val result = numbers
        .map { it * 2 }
        .filter { it > 5 }
        .let {
            println(it)
            it.sum()
        }

    println(result)

    var name: String? = null
//    name= "Alex"
    val result1: String = name?.let {
        println(it)
        it.uppercase()
    } ?: "Not set"

    println(result1)
}

fun exploreWith() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)

    val result = with(numbers) {
        println(size)
        val list = plus(7)
        list.sum()
    }

    println(result)
}

fun exploreRun() {
    var numbers: MutableList<Int>? = null

    val result = numbers.run {
        numbers = mutableListOf(1, 2, 3, 4, 5)
        numbers?.sum()
    }

    val resul2 = run {
        "Test"
    }

 

    println(result)
    println(resul2)


}

fun main() {
//    exploreApply()
//    exploreAlso()
//    exploreLet()
//    exploreWith()
    exploreRun()
}


