package com.playground.designpatterns


interface Weapon {
    fun use(): String
}


abstract class WeponFactory {
    abstract fun buildWaepon(): Weapon
}

class Crossbow : Weapon {

    companion object MyDactory : WeponFactory() {
        override fun buildWaepon() = Crossbow()
    }

    override fun use(): String {
        return "Use crossbow"
    }
}

class Katana : Weapon {

    companion object Factory : WeponFactory() {
        override fun buildWaepon() = Katana()

        fun test()="fvdfv"
    }


    override fun use(): String {
        return "Using katana weapon"
    }
}

fun main() {
    val crossbow = Crossbow.buildWaepon();
    val katana = Katana.buildWaepon();


    println(crossbow.use())
    println(katana.use())
    println(Katana.test())
}

