package com.playground.designpatterns
// https://blog.logrocket.com/understanding-kotlin-design-patterns/

object Counter {
    var counter: Int = 0

    init {
        println("Singleton class invoked.")
    }

    fun increment() {
        this.counter++
    }
}


// Singleton within class
class Lion {

    companion object {
        var nrOffRoars = 0
            get() = field
    }

    fun roar() {
        Counter.increment()
        nrOffRoars++
    }


}

fun main() {
    //Counter.increment();

    Lion().also {
        it.roar()
    }


    Lion().also {
        it.roar()
    }

    println(Lion.nrOffRoars)
    println(Counter.counter)
    Counter.increment()
    require(Lion.nrOffRoars == Counter.counter) { "Counters are not the same" }
}
