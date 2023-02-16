package com.playground.codewars

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ExcersiseKtTest {

    fun checkForFactor(base: Int, factor: Int): Boolean {
        return (base % factor) === 0
    }

    fun findShort(s: String): Int = s.split(" ").minOf { x -> x.length }
//    fun findShort(s: String): Int = s.split(" ").minOf { it.length }

    fun findSmallestInt(nums: List<Int>): Int {
        // return nums.minOf { it }
        // return nums.reduce {a: Int, b: Int -> if (a<b) a else b}
        return nums.minOf({a -> a})


//       val test =  nums.stream()
//
//        return nums.minOrNull() ?: 0
    }


    @Test
    fun test() {
        assertEquals(true, checkForFactor(10, 2))
        assertEquals(true, checkForFactor(63, 7))
        assertEquals(true, checkForFactor(2450, 5))
        assertEquals(true, checkForFactor(24612, 3))
        assertEquals(false, checkForFactor(9, 2))
        assertEquals(false, checkForFactor(653, 7))
        assertEquals(false, checkForFactor(2453, 5))
        assertEquals(false, checkForFactor(24617, 3))
    }

    @Test
    fun testFixed() {
        findShort("bitcoin take over the world maybe who knows perhaps")
        assertEquals(3, findShort("bitcoin take over the world maybe who knows perhaps"))
        assertEquals(3, findShort("turns out random test cases are easier than writing out basic ones"))
        assertEquals(2, findShort("Let's travel abroad shall we"))
    }

    @Test
    fun exampleTests() {
//        val sif: SmallestIntegerFinder = SmallestIntegerFinder();
        assertEquals(10, findSmallestInt(listOf(15, 20, 10, 17, 22, 9001)))
//        assertEquals(0, findSmallestInt(listOf()))
    }
}