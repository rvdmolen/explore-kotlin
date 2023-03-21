package com.playground.designpatterns

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.time.LocalDateTime
import kotlin.random.Random
import kotlin.random.nextInt

//import kotlin.random.Random

//val range = (1..50).map { it.toI() }

val test = 0..10

val observable: Flow<Int> = flow {
    while (true) {
        emit(Random.nextInt(test))
        delay(100)
    }
}

//fun simple(): Flow<Int> = flow { // flow builder
//    for (i in 1..3) {
//        delay(100) // pretend we are doing something useful here
//        emit(i) // emit next value
//    }
//}
//

val observerJob = runBlocking {
    observable.collect { value ->
        println("Received value $value")
    }
}

fun main() = runBlocking { // this: CoroutineScope
    launch { // launch a new coroutine and continue
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("${LocalDateTime.now()} World!") // print after delay
    }
    println("${LocalDateTime.now()} Hello!") // main coroutine continues while a previous one is delayed

    observerJob.run {  }

//    val testrange = 1..10
//    println(testrange)
//    println(Random.nextInt (testrange))
}