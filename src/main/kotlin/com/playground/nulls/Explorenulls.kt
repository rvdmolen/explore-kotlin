package com.playground.nulls

data class Movie (
    val id: Int?,
    val name: String?
)

fun printName(name: String)  {
    println("Name is: $name")
}

fun printName1(name: String)  {
    println("Name is: $name")
}

fun main() {
    var nameNullable: String? = null
    println("Value is: ${nameNullable?.length}") // safe operator
//    nameNullable = "Alex"

    nameNullable?.run {
        printName(this)
    }

//    printName(nameNullable!!)

    val length = nameNullable?.length?.toLong() ?: 0  // Elvis operator else
    println("Lenght is: $length")





    nameNullable = "Check"
    println(nameNullable)

    var nameNotNullable: String = "Dilipd"
//    nameNotNullable = null NOT ALLOWED

    val movie : Movie = Movie(null, "Shrek")
    println(movie)
    val savedMovie = saveMovie(movie)
    println(savedMovie.id!!) // not null assestions !! non-null
    println(savedMovie)


}

fun saveMovie(movie: Movie) : Movie {
    return movie.copy(id = 1)
}
