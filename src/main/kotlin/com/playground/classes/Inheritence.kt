package com.playground.classes

open class User(
    val name: String
) {

    var isLoggedIn: Boolean = false;

    open fun login() {
        println("Login")
    }

    private fun secret() {
        println("Secret")
    }

    protected open fun logout() {
        println("Secret")
    }
}

class Student(name: String) : User(name) {

//    override var isLoggedIn: Boolean = false;

    override fun login() {
        println("Login from Student class")
    }

    companion object {
        const val nrOffCourses = 10
        fun country(): String = "USA"
    }

    public override fun logout() {
        super.logout()
        println("logout in student")
    }
}

class Instructor(name: String) : User(name) {

}


fun main() {
    val student: Student = Student("Alex")
    println("student name is: ${student.name}")
    student.login()
    student.isLoggedIn = true
    println(Student.country())
    println(Student.nrOffCourses)

    val user: User = User("John")
    //private => user.secret
    //private ==> student.secret

    //protected => user.secret
    //protected ==> student.secret
    student.logout()

    // Protected can only be used inside the class and allowes inheritence

    val instructor: Instructor = Instructor("Dilip")
    println("instructor name is: ${instructor.name}")
    instructor.login()

}