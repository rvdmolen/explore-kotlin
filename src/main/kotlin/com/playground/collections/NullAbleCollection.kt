package com.playground.collections


fun collectionsNullability() {
    var list: MutableList<String>? = null

    list = mutableListOf()
    list.add("Richard")

    list.forEach { println(it) }

    val list1 : List<String?> = listOf("Alex", null, "Richard")
    list1.forEach { println(it?.length) }
}

fun main() {
    collectionsNullability()
}