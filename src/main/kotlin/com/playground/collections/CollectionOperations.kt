package com.playground.collections

import com.playground.dataset.Course
import com.playground.dataset.CourseCategory
import com.playground.dataset.CourseListFactory
import com.playground.dataset.CourseUtil
import java.util.function.Predicate


val DEV_PREDICATE = { course: Course -> course.category == CourseCategory.DEVELOPMENT }
val DESIGN_PREDICATE = { course: Course -> course.category == CourseCategory.DESIGN }

//fun filterCourses(courseList: List<Course>, filterPredicate: (Course) -> Boolean) =
//     courseList
//        .filter { filterPredicate.invoke(it) }

fun filterCourses(courseList: List<Course>, filter: Predicate<Course>) =
    courseList
        .filter { filter.test(it).or(filter.test(it)) }
//        .filter { filterPredicate.invoke(it) }

fun mapCourseToName(courseList: List<Course>, filterPredicate: (Course) -> Boolean): List<String> {
    return courseList
        .filter(filterPredicate)
        .filter { filterPredicate.invoke(it) }
        .map { "${it.name}  - ${it.category}" }
}

private fun exploreFlatMap(developmentCourses: List<Course>, topic: String): List<String> {
    val kafkaCourses = developmentCourses
        .flatMap { course ->
            val courseName = course.name
            course.topicsCovered
                .filter { it == topic }
                .map {
                    courseName
                }
        }

    return kafkaCourses
}

fun exploreFlatMap(developmentCourses: List<Course>): List<String> {
    return developmentCourses
        .flatMap(Course::topicsCovered)

}

fun exploreHashMap() {
    val nameAgeMap = mutableMapOf("Dilip" to 22, "Scooby" to 18)

    nameAgeMap
        .forEach { (name, age) ->
            println("The name value is $name and the age is $age ")
        }


    val firstName = nameAgeMap.getOrElse("Scooby") { 0 }
    println(firstName)

    nameAgeMap
        .filterKeys { it.length > 5 }
        .map(Map.Entry<String, Int>::key)
        .map(String::uppercase)
        .forEach {
            println(it)
        }

    val maxAge = nameAgeMap.maxByOrNull { it.value }

    println("Max age is $maxAge")
}




fun main() {

//    val devPredicate : Predicate<Course> = Predicate { it.category == CourseCategory.DEVELOPMENT }
    val devPredicate: Predicate<Course> = Predicate { it.category == CourseCategory.DEVELOPMENT }

//    val developmentCourses = filterCourses(CourseListFactory.courseList(), devPredicate)
//    CourseUtil.printList(developmentCourses)

    val topics = exploreFlatMap(CourseListFactory.courseList())
    CourseUtil.printList(topics)


    val developmentCourses = filterCourses(CourseListFactory.courseList(), DEV_PREDICATE)
//    val developmentCourses = CourseListFactory.courseList()
//        .filter { it.category == CourseCategory.DEVELOPMENT }


    val mappedCourses = mapCourseToName(CourseListFactory.courseList(), DEV_PREDICATE)
    CourseUtil.printList(mappedCourses)

    exploreHashMap()


}