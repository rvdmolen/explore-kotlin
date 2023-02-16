package com.playground.dataset

data class Instructor(
    val name: String,
    val age: Int,
    val noOfCourses : Int,
    val coursesTaught : List<Course>
)