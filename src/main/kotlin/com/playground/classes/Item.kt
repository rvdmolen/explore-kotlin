package com.playground.classes

class Item() {
    var name: String = ""

    var price: Double = 0.0
        get() {
            println("In getter")
            return field
        }

        set(value) {
            if (value > 0.0)  {
                println("In setter")
                field = value
            } else {
                throw IllegalArgumentException("Invalid value for price")
            }

        }


    constructor(_name: String) : this() {
        name = _name
    }

    init {
        println("Initialized")
    }


}


fun main() {
    val item: Item = Item("iPhone")
    println("Item is ${item.name}")

    val item2: Item = Item()
    item2.name = "Galaxy"


    println("Item is ${item2.name}")

    item2.price = 10.0
    println("Item price is ${item2.price}")
}