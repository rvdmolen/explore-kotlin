package com.playground.classes

class Person (
    val name: String,
    val age: Int
) {

    var email: String = "";
    var nameLength: Int = 0

    constructor(name:String, age: Int, email: String): this(name, age) {
        this.email = email
    }

    constructor(email: String): this("Richard", 42) {
        this.email = email
    }

    init {
        println("Initialized")
        nameLength = name.length
    }

    fun action(): String {
        return "Person walked"
    }

    override fun toString(): String {
        return "Person name $name and age is $age"
    }
}

fun main() {
    val person = Person("Richard", 42)
    println(person.action())
    println(person.toString())
    println("Person ${person.name} and age is ${person.age}")

    val person2 = Person(email = "test@gmail.com")
    println("Person ${person2.name} and age is ${person2.age} and email is ${person2.email}")

    val person3 = Person("John", 24, "test2@gmail.com")
    println("Person ${person3.name} and age is ${person3.age} and email is ${person3.email}")
    println("Person name length ${person3.nameLength}")
}