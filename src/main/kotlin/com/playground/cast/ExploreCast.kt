package com.playground.cast

import com.playground.model.Course

fun checkType(course: Any) {
    when (course) {
        is Course -> println(course)
        is String -> println(course.lowercase())
    }
}

fun checkDouble(course: Any) {
    when (course) {
        course as Double -> println("Value is double")
    }
}

fun castNumber(value: Any) {
    when (value) {
        value as? Int -> println("Value is Int")
    }
}

fun main() {
    val course: Course = Course(1, "Java 17", "Dilip")
    checkType(course)
    checkType("UPPER")
    checkDouble(1.0)

    castNumber(1)
    castNumber("1")
}