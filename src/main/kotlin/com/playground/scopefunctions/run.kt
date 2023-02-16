package com.playground.scopefunctions


class Person (
    private val name: String,
    private var age: Int
) {
    fun setAge(newValue: Int) {
        age = newValue
    }

    fun getPerson(): Person {
        return this
    }

    override fun toString(): String {
        return "Person is name[$name] and age[$age]"
    }
}


fun main() {
    val person: Person = Person("Richard", 42)

    val testRun = person.run {
        setAge(43)
        this
    }

    val testAlso = person.also {
        it.setAge(43)
    }

    val testIt = person.let {
        it.setAge(43)
        it
    }

    val testWith = with(person) {
        setAge(43)
        this
    }



    println(testRun)
    println(testAlso)
    println(testIt)
    println(testWith)
}