package com.playground.classes

object Authenticate {

    fun authenticate(userName: String, passWord: String) {
        println("User authenticated for $userName with pass $passWord")
    }
}


fun main() {
    Authenticate.authenticate("dilip", "abc")
}