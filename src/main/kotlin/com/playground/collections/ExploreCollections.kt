package com.playground.collections

fun inMutableCollections() {
    val names = listOf("Alex", "Chris", "John")
//    names.add // not allowed
    println(names)
}

fun mutableCollections() {
    val names = mutableListOf("Alex", "Chris", "John")
    names.add("Pieter")
    println(names)
}


fun inMutableSet() {
    val names = setOf("Alex", "Chris", "John", "John")
    println(names)
}


fun mutableSet() {
    val names = mutableSetOf("Alex", "Chris", "John", "John")
    names.add("Hans")
    println(names)
}

fun main() {

    inMutableCollections()
    mutableCollections()

    inMutableSet()
    mutableSet()

}