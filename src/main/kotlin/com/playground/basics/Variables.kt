package com.playground.basics

fun main() {
    var name: String= "Hi";
    println(name);

    name = "new Hi";
    println(name);


    val salary: Long = 30000L;

    println(salary);

    val course = "Kotlin";

    println("course: $course and the course length is ${course.length}");

    val multiline: String = "ABCD \n EFGH";
    println(multiline);

    val multiline2: String = """
        ABC
        DEF
    """.trimIndent();

    println(multiline2);



}