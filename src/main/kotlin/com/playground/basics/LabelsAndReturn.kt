package com.playground.basics

fun main() {

    for (i in 1..5) {
        println("i: $i");
        if (i == 3) break;
    }

    label()

    println("The End");
}

fun label() {
    loop@ for (i in 1..5) {
        println("i in label: $i");
        // if (i == 3) break@loop;

        innerloop@ for (j in 1..5) {
            println("j: $j");
//            if (j == 3) break@innerloop;
            if (j == 3) continue@loop;
        }
    }
}
