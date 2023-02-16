package com.playground.exceptions

import java.lang.RuntimeException

fun nameLength(name: String?): Int? {
    return try {
        name!!.length
    } catch (ex: Exception) {
        println("Exception is $ex§")
        null
    }
}

fun returnNothing() : Nothing {
    throw RuntimeException("Boom")
}

fun main() {
    println("length is ${nameLength("Richard")}")
    println("length is ${nameLength(null)}")
    returnNothing()
}