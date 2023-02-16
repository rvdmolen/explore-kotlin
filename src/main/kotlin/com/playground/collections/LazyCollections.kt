package com.playground.collections

import com.playground.dataset.CourseListFactory
import com.playground.dataset.Course
import com.playground.dataset.CourseCategory


fun testFunction(value: Course) {
    println(value)
}

fun main() {
    val names = listOf("Bob", "Dylan", "Sjakie", "Alex")
        .asSequence()
        .filter { it.length == 4 }
        .map { it.uppercase() }
        .toList()

    println("Names is $names")

    val test = { course: Course -> course.category == CourseCategory.DEVELOPMENT }

    val newNames = exploreFilter(CourseListFactory.courseList(), test);

//    val testFunction = { inputValue: Course -> println(inputValue) }

//    val bla : (Course) -> Boolean = { course: Course -> course.category == CourseCategory.DESIGN  }


    newNames.forEach { testFunction(it) }
    newNames.forEach { name: Course -> testFunction(name) }
//    newNames.forEach(testFunction)

//    println("New names $newNames")


    val range = 1 .. 1000000000

    // Cause memory exception
//    range
//        .map { it.toDouble() }
//        .take(40)
//        .forEach { println("Value is $it") }

    // Cause memory exception
    range
        .asSequence()
        .map { it.toDouble() }
        .take(40)
        .forEach { println("Value is $it") }


}

fun exploreFilter(courseList: MutableList<Course>, predicate: (Course) -> Boolean): List<Course> {
    return courseList
        .asSequence()
        .filter { predicate.invoke(it) }
        .toList()
}