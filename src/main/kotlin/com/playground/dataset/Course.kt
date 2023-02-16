package com.playground.dataset

data class Course(
    val id: Int,
    val name: String,
    val category: CourseCategory,
    val topicsCovered: List<String>
)