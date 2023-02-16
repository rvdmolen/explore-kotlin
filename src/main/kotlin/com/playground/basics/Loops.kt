package com.playground.basics

fun main() {

    val range = 1..10;

    for (i in range) {
        println("i : $i")
    }


    println("-----")
    val reverseRange = 10 downTo 1;

    for (i in reverseRange) {
        println("i : $i")
    }

    println("-----")
    for (i in reverseRange step 2) {
        println("i : $i")
    }

    exploreWhile()
    exploreDoWhile()

}

fun exploreDoWhile() {
    var x: Int = 0;
    do {
        println("value of x: $x");
        x++;
    } while (x < 5);
}

fun exploreWhile() {
    var x: Int = 0;
    while (x < 5) {
        println("value of x: $x");
        x++;
    }
}
