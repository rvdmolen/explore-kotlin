package com.playground.designpatterns

import kotlinx.coroutines.*

//val observable: Flow<Int> = flow {
//    while (true) {
//        emit(Random.nextInt(0..1000))
//        delay(100)
//    }
//}

//fun simple(): Flow<Int> = flow { // flow builder
//    for (i in 1..3) {
//        delay(100) // pretend we are doing something useful here
//        emit(i) // emit next value
//    }
//}
//
val observerJob = coroutineScope {
//    observable.collect { value ->
//        println("Received value $value")
//    }
}

fun main() = runBlocking { // this: CoroutineScope
    launch { // launch a new coroutine and continue
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
    }
    println("Hello") // main coroutine continues while a previous one is delayed
}