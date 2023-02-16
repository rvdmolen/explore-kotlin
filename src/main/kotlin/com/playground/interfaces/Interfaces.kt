package com.playground.interfaces

import com.playground.model.Course

interface CourseRepository {
    val isCoursePersisted: Boolean

    fun getById(id: Int): Course

    fun save(course: Course): Int {
        println(course)
        return course.id
    }
}

interface Repository {
    fun getAll(): Any
}

interface A {
    fun doSomething() : Unit {
        println("Do something in A")
    }
}

interface B {
    fun doSomething() : Unit {
        println("Do something in B")
    }
}


class SqlCourseRepository : CourseRepository, Repository, A, B {
    override var isCoursePersisted: Boolean = true

    override fun getById(id: Int): Course =
         Course(id, "Reactive programming", "R vd Molen");

    override fun getAll(): Any {
        return 1
    }

    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
    }

}

class NoSqlCourseRepository : CourseRepository {
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course =
        Course(id, "Reactive programming", "R vd Molen");

    override fun save(course: Course): Int {
        isCoursePersisted = true;
        return 10
    }
}

fun main() {
    val sqlCourseRepository: SqlCourseRepository = SqlCourseRepository()
    val course: Course = sqlCourseRepository.getById(1)
    println(course)
    sqlCourseRepository.doSomething()

    println("Course persisted valie ${ sqlCourseRepository.isCoursePersisted}")

    val courseId = sqlCourseRepository.save(course);
    println(courseId)

    val noSqlCourseRepository: NoSqlCourseRepository = NoSqlCourseRepository()
    val course2: Course = noSqlCourseRepository.getById(2)
    println(course2)

    val courseId2 = noSqlCourseRepository.save(course2);
    println(courseId2)
}