package com.playground.functions

import java.time.LocalDate

fun main() {
    printName("Hello")
    val result1 = additionApproach1(1,2)
    println("Result1 is $result1")

    val result2 = additionApproach2(1,2)
    println("Result2 is $result2")

    printPersonDetails("Richard", "richard@test.nl")
    printPersonDetails(name = "Richard", dob = LocalDate.parse("2010-01-01"))
    printPersonDetails("Richard", dob = LocalDate.parse("2010-01-01"))


}

fun additionApproach1(x: Int, y: Int) : Int {
    return x + y
}

fun additionApproach2(x: Int, y: Int)  = x + y

fun printName(name: String): Unit {
    println("Name is $name")
}


fun printPersonDetails(name : String, email : String = "empty", dob: LocalDate = LocalDate.now()): Unit {
    println("Name is $name with email $email and the dob is $dob")

}