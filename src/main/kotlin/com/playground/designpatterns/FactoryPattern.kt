package com.playground.designpatterns

// Java style factory pattern
// =====================================
//
//class Person(private val name: String?, private val age: Int?) {
//    companion object {
//
//        class PersonBuilder() {
//
//            private var name: String = ""
//            private var age: Int = 0
//
//            fun build(): Person {
//                return Person(this.name, 66)
//            }
//
//            fun name(name: String): PersonBuilder {
//                this.name = name
//                return this
//            }
//
//            fun age(age: Int): PersonBuilder {
//                this.age = age
//                return this
//            }
//        }
//
//        fun builder(): PersonBuilder {
//            return PersonBuilder()
//        }
//    }
//
//    override fun toString(): String {
//        return "Person name $name and age is $age"
//    }
//}

// Kotlin style factory pattern
// =====================================
//
data class Person(
     val name: String?,
     val age: Int?
) {
    data class Builder(
        var name: String? = null,
        var age: Int? = null
    ) {
        fun build() = Person(name, age)
        fun name(name: String) = apply { this.name = name }
        fun age(age: Int) = apply { this.age = age }
    }

}


fun main() {
    val tesPerson = Person.Builder()
        .name("Piet")
        .age(35)
        .build()


    println(tesPerson)
}

