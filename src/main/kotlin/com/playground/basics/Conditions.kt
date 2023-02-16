package com.playground.basics

fun main() {

    var name: String = "Alex";
//    name = "Richard";

    val result =
        if (name.length == 4) {
            println("name is 4 characters")
            name.length
        } else {
            println("name is NOT 4 characters")
            name.length
        }

    println(result);

    var position = 1;
    position = 2;

    val medal =
        when (position) {
            1 -> "GOLD"
            2 -> "SILVER"
            3 -> "BRONZE"
            else -> "NO MEDAL"
        }

    println(medal)

}