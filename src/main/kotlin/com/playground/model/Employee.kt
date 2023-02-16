package com.playground.model

data class Employee(
    var id : Int,
    var name: String
) {

}

fun main() {
    val person: Employee = Employee(1, "John");
    println(person)

    val person2: Employee = Employee(1, "John");
    println(person2)

    println("Check equality ${person == person2}")

    val person3: Employee = person.copy(id = 2)
    println(person3)
}