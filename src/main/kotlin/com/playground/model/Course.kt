package com.playground.model


data class Course(
    val id: Int,
    val name: String,
    val author: String,
    var category: CourseCategory = CourseCategory.DEVELOPMENT
)

enum class CourseCategory {
    BUSINESS,
    DEVELOPMENT,
    DESIGN,
    MARKETING
}

class Item(
    private val name: String
) {

    fun getName2(): String {
        return name;
    }
}


fun main() {
    val course: Course = Course(1, "Reactive programming", "R vd Molen")
    println(course)

    val course2: Course = Course(1, "Reactive programming", "R vd Molen")
    println("Check equality ${course == course2}")

    val marketingCourse: Course = Course(1, "Reactive programming", "R vd Molen", CourseCategory.MARKETING)
    println(marketingCourse)

    val item: Item = Item("iPhone")
    println(item.getName2())

    val item2: Item = Item("iPhone")
    println("Check equality ${item == item2}")

}